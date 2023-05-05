# Create your views here.
from typing import Optional
from django.shortcuts import render

from django.http import HttpRequest
from ninja import ModelSchema, Router

from .models import Product

from django.views.generic import ListView
from django.db.models import Q

router = Router()


class ProductSchema(ModelSchema):
    class Config:
        model = Product
        model_fields = ["name", "category", "price"]


@router.get("/", response=list[ProductSchema])
def product_read(
    _: HttpRequest,
    name: Optional[str] = None,
    category: Optional[str] = None,
    price: Optional[int] = None,
):
    products = Product.objects.all()

    if name:
        products = products.filter(name=name)
    if category:
        products = products.filter(category=category)
    if price:
        products = products.filter(price__lte=price)

    return products



def search_product(request):
    """ search function  """
    if request.method == "POST":
        query_name = request.POST.get('name', None)
        if query_name:
            results = Product.objects.filter(name__contains=query_name)
            return render(request, 'product-search.html', {"results":results})

    return render(request, 'product-search.html')

