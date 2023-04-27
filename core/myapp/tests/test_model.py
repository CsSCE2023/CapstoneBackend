from django.test import TestCase
from myapp.models import Product


class ProductTest(TestCase):
    def setup(self):
        print("doing setup")
        Product.objects.create(name="potato", category="vegies", price=1.85)
        Product.objects.create(name="fish", category="meat", price=3.00)

    def test_product_created(self):
        print("rinning test")
        potato = Product.objects.get(name="potato")
        fish = Product.objects.get(name="fish")
        print(potato)
