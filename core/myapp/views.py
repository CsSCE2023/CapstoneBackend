# Create your views here.

from django.shortcuts import render
from myapp.models import Product

from .models import Product


def product_list(request):
    products = Product.objects.all()
    category = request.GET.get("category")
    price = request.GET.get("price")
    print(f"Category: {category}")
    print(f"Price: {price}")
    if category:
        products = products.filter(category=category)
    if price:
        products = products.filter(price__lte=price)
    context = {
        "products": products,
    }
    return render(request, "product_list.html", {"products": products})
