using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class tag : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        //capturar la posicion del jugador
        player = GameObject.FIndGameObjectWithTag("Pesonaje").Transform;
    }

    // Update is called once per frame
    void Update()
    {
        //selecciona un numero aleatorio de la lista de partes que yo 
        int rnd = Random.range (0, levelParts.Legth);
        GameObject = level = Instantiate(levelParts[rdn],finalPoint.posicion,Quaterion.identiny);
        finalPoint = SearchFinalpoint;
    }
    public transform SearchFinalPoint (GameObject levelPart, string tag{
        Transform point = null;
        foreach(Transform location in levelPart.transforms){
            if(location.tag == tag){
                point = location;
                break;
            }
        }
        return point;
    }
}