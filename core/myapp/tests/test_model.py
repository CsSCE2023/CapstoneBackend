from decimal import Decimal

from django.test import TestCase
from myapp.models import Product


class ProductTest(TestCase):
    def setUp(self):
        self.potato = {
            "name": "Potato",
            "category": "Vegetable",
            "price": Decimal("1.85"),
        }
        Product.objects.create(**self.potato)
        Product.objects.create(name="fish", category="meat", price=Decimal("3"))

    def test_products_in_db(self):
        get_potato = Product.objects.get(name=self.potato["name"])
        self.assertTrue(isinstance(get_potato, Product))
        self.assertEqual(str(get_potato), self.potato["name"])
        self.assertEqual(get_potato.category, self.potato["category"])
        self.assertEqual(get_potato.price, self.potato["price"])
