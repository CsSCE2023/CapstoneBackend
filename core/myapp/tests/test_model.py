from django.test import SimpleTestCase

# from myapp.models import Product


class ProductTest(SimpleTestCase):
    def setup(self):
        ...
        # Product.objects.create(name="potato", category="vegies", price=1.85)
        # Product.objects.create(name="fish", category="meat", price=3.00)

    def test_product_created(self):
        ...
        # potato = Product.objects.get(name="potato")
        # fish = Product.objects.get(name="fish")
        # print(potato)
