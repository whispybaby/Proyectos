from django import forms
from .models import Personas


class FormPersona(forms.ModelForm):
    class Meta:
        model = Personas
        fields = ['run', 'nombre', 'fecha_nacimiento',
                     'estado_civil', 'genero', 'direccion', 'cometario', 'fono']
