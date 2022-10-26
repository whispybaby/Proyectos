from django import forms
from .models import Personas


class FormPersona(forms.ModelForm):
    class Meta:
        #Modelo 
        model = Personas
        #inputs que se mostraran en el formulario
        fields = '__all__'
    eCivil = [('Casada/o' ,'Casad@'),('Solter@' ,'Soltera/o'),('Viuda/o' ,'Viud@'),
                    ('Separada/o', 'Separad@')]
    
    direccion = forms.CharField(widget=forms.TextInput(
        attrs={'class':'form-control'}))
    nombre = forms.CharField(widget=forms.TextInput(
        attrs={'class':'form-control'}))
    genero = forms.CharField(widget=forms.TextInput(
        attrs={'class':'form-control'}))
    fono = forms.CharField(widget=forms.TextInput(
        attrs={'class':'form-control'}))
    run = forms.CharField(widget=forms.TextInput(
        attrs={'class':'form-control'}))
    fecha_nacimiento = forms.DateField(
        widget=forms.DateInput(
            attrs={'type':'date','class':'form-control'}
            
    ))
  
    cometario = forms.CharField(widget=forms.TextInput(
        attrs={'class':'form-control'}))

    estado_civil = forms.CharField(widget=forms.Select(choices=eCivil,
    attrs={'class': 'form-control'}))
