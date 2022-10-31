using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class LevelGenerator : MonoBehaviour
{
    public float DistanciaMinima;

    public Transform TransformacionJugador;
    public Transform InicioNivel;
    public GameObject[] PartesJuego;
    public Transform final;
    

// La actualización se llama una vez por cuadro
void Update()
    {
        if (Vector2.Distance(TransformacionJugador.position, final.position) < DistanciaMinima)
        {
            AñadirNivel();
        }    
    }
    // Se llama al inicio antes de la primera actualización del cuadro.
    
    void AñadirNivel()
    {   //Obtener siguiente parte del nivel
        
        GameObject siguienteNivel = PartesJuego[Random.Range(0,PartesJuego.Length)];
        
    
        //Crear la parte del nivel en la escena
        Transform nuevaPosicion = Instantiate(siguienteNivel, final.position, Quaternion.identity).transform;

        // Actualizar la posición final
        final.position = nuevaPosicion.Find("final").position;
        

    }

    // La actualización se llama una vez por cuadro
   
}
