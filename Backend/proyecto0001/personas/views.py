from django.shortcuts import render, redirect
from personas import form
from personas.form import FormPersona
from personas.models import Personas
from django.urls import reverse


# Create your views here.
def index(request):
    #instanciar la clase Formpersona
    personas = Personas.objects.all()
    return render(request, 'personas/index.html', {
        'personas':personas
    } )

def registrar (request):
    formulario = FormPersona()

    
    if request.method == "POST":
        print(request.POST)
        formulario = FormPersona(request.POST)
        if formulario.is_valid(): # linea que seleciona la validacion
            formulario.save()
            return redirect(reverse('personas:index'))
    else:
        print("Porfavor ingrese un valor para que debe se ser valido")
    return render(request, 'personas/create.html', {
        'form': formulario

    })

def editarPersona(request, run):
    # variable que guarde el registro con el run solicitado
    p = Personas.objects.get(run = run)
    # los datos del registro se asignan al formulario
    form = FormPersona(instance = p)
    # ingresa al if una vez presionado el btn guardar
    if request.method == 'POST':
        #enviando los datos modificados
        form = FormPersona(request.POST,instance=p)
        #verifica si los datos son validos
        if form.is_valid():
            #guarda
            form.save()
            return redirect(reverse('personas:index'))
    data = {'form':form,'titulo':'Actualizar Persona'}
    return render(request, 'personas/create.html', data)


def borrarPersona(request, run):
    p = Personas.objects.get(run = run)
    p.delete()
    # los datos del registro se asignan al formulario
    return redirect(reverse('personas:index'))
