from django import forms
from marcas.models import Marca

class  MarcaForm(forms.Form):
    class Meta:
        model = Marca
        # Añadir todos los campos del modelo
        fields = '__all__'
        widgets = {
            'nombre': forms.widgets.TextInput(attrs={
                'style': 'font-size: 12; '
            })
        }
