from pokeapiuwu.models import  Alumno
from rest_framework import serializers

class AlumnoSerializer(serializers.ModelSerializer):
    class Meta():
        model = Alumno
        fields = ('matricula', 'nombre', 'email')