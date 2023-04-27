from django.urls import path
from ninja import NinjaAPI

from . import views

api = NinjaAPI()


api.add_router("/product", views.router)


urlpatterns = [
    path("api/", api.urls),
]
