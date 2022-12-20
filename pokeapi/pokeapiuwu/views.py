from django.shortcuts import render
from django.http import JsonResponse
# Create your views here.
from pokeapiuwu.models import Alumno

def firstapi(request):
    alumnos = Alumno.objects.all()
    data = {"alumnos": list(alumnos.values("matricula", "nombre", "email"))}
    return JsonResponse(data)