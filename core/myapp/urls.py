from django.urls import path
from ninja import NinjaAPI
from .views import product_list, search_product


from . import views

api = NinjaAPI()


api.add_router("/product", views.router)


urlpatterns = [
    path("api/", api.urls),
    path("search/", search_product, name="product-search"),

]
