from django.shortcuts import render
from pokeapiuwu.models import Alumno
from serializableApp.serializers import AlumnoSerializer
from rest_framework.response import Response
from rest_framework.decorators import api_view
# Create your views here.
@api_view(['GET'])
def lista_alumnos(request):
    alumno = Alumno.objects.all()
    lista = AlumnoSerializer(alumno, many=True)
    return Response(lista.data)
    return render(request, 'lista_alumnos.html')