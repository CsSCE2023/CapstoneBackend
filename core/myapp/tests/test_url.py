from django.test import SimpleTestCase
from django.urls import resolve, reverse
from myapp.views import product_list


class TestUrls(SimpleTestCase):
    def test_home_url_resolves(self):
        url = reverse("product_list")
        self.assertEqual(resolve(url).func, product_list)
