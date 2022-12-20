from django.db import models

# Create your models here.
class  Alumno(models.Model):
    matricula = models.CharField(max_length=10)
    nombre = models.CharField(max_length=100)
    email = models.CharField(max_length=100)

    def __str__(self):
        return self.nombre

    class Meta:
        db_table = 'alumno'