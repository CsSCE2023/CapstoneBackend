# Register your models here.
from django.contrib import admin

from .models import Product


class ProductAdmin(admin.ModelAdmin):
    list_display = ["id", "name", "category", "price"]
    search_fields = ["name", "category"]


admin.site.register(Product, ProductAdmin)
