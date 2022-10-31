from django.db import models

class Marca(models.Model):
    nombre = models.CharField(max_length=40)
