# Create your views here.
from typing import Optional

from django.http import HttpRequest
from ninja import ModelSchema, Router

from .models import Product

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
