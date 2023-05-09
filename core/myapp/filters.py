import django_filters
from myapp.models import Product


class ProductFilter(django_filters.FilterSet):
    name = django_filters.CharFilter(lookup_expr="icontains")
    category = django_filters.CharFilter(lookup_expr="icontains")
    price = django_filters.RangeFilter()

    class Meta:
        model = Product
        fields = ["name", "category", "price"]
