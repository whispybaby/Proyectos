from django.shortcuts import render, redirect 
from django.urls import reverse

from marcas.models import Marca
from marcas.forms import MarcaForm

# Create your views here.
def mostrar_marcas(request):
    listamarcas = Marca.object.all()
    data = {'marcas':listamarcas}
    return render(request, 'marcas/mostrarmarcas.html')

def editar_marca(request):
   marca = Marca.objects.get(id = id)
   form = MarcaForm(instance=marca)
   if request.method == 'POST':
        form = MarcaForm(request.POST,instance=marca)
        if form.is_valid():
            form.save()
    # return render(request, 'marcas/crearmarca.html', context)

def crear_marca(request):
    form = MarcaForm()

    if request.method  == 'POST':
        form = MarcaForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect(reverse('marcas:mostrar'))

    return render(request, 'marcas/crearmarca.html')

def eliminar_marca(request,id):
   
    mar = Marca.objects.get(id = id)
    mar.delete()
    return lista(request)

    
    
    # return render(request, 'marcas/mostrarmarcas.html', context)