from django.urls import path
from . import views
app_name="personas"
urlpatterns = [
    path('', views.index, name='index'),
    path('registrar', views.registrar, name='registro'),
    path('editar/<str:run>', views.editarPersona, name='editar'),
    path('eliminar/<str:run>', views.borrarPersona, name="eliminar"),
]
