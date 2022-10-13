from pyexpat import model
from unittest.util import _MAX_LENGTH
from django.db import models


class Personas(models.Model):
    run = models.CharField(primary_key=True,max_length=12)
    nombre = models.CharField(max_length=150)
    fecha_nacimiento = models.DateField()
    estado_civil = models.CharField(max_length=30)
    genero = models.CharField(max_length=30)
    direccion = models.CharField(max_length=150)
    cometario =  models.CharField(null=True,max_length=150)
    fono = models.IntegerField()

# Create your models here.
