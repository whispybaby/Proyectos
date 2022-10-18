from ast import If
from django.shortcuts import render

from personas.form import FormPersona

# Create your views here.
def index(request):
    #instanciar la clase Formpersona
    
    return render(request, 'personas/index.html' )

def registrar (request):
    formulario = FormPersona()

    
    if request.method == "POST":
        print(request.POST)
        formulario = FormPersona(request.POST)
        if formulario.is_valid(): # linea que seleciona la validacion
            formulario.save()
            print('Valido')
        else:
            print('No valido')
    else:
        print("Porfavor ingrese un valor para que debe se ser valido")
    return render(request, 'personas/create.html', {
        'form': formulario
    })