using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class inferiorColider : MonoBehaviour
{
    private void OnTriggerEnter2D(Collider2D other){
        FindObjectOfType<movimiento>().SendMessage("ResetPosition");
    }
}
