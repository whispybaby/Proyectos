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
    else:
        print("Porfavor ingrese un valor para que debe se ser valido")
    return render(request, 'personas/create.html', {
        'form': formulario
    })