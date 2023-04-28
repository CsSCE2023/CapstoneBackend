# Create your views here.

from django.shortcuts import render
from myapp.filters import ProductFilter
from myapp.models import Product


def product_list(request):
    queryset = Product.objects.all()
    product_filter = ProductFilter(request.GET, queryset=queryset)
    return render(request, "product_list.html", {"filter": product_filter})
