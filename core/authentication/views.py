from django.shortcuts import render

from django.contrib.auth import authenticate, login, logout
from django.http import JsonResponse
from django.views.decorators.csrf import csrf_exempt

from rest_framework.views import APIView
from rest_framework.response import Response


@csrf_exempt
def signin(request):
    email = request.POST.get('email')
    password = request.POST.get('password')

    user = authenticate(request, email=email, password=password)
    if user is not None:
        login(request, user)
        return JsonResponse({'success': True})
    else:
        return JsonResponse({'success': False})


def signout(request):
    logout(request)
    return JsonResponse({'success': True})


class MyView(APIView):
    def get(self, request):
        data = {"message": "Foody"}
        return Response(data)