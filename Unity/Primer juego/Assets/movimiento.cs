using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class movimiento : MonoBehaviour
{
    Rigidbody2D  rb_pers;

    // Start is called before the first frame update
    //rb_pers.AddForce(new Vector2(0, ));  
    public Transform checker;
    public float radio_checker;
    public LayerMask piso;
    
    private int saltos;
    void Start()
    {
        rb_pers = GetComponent<Rigidbody2D>();
        saltos = 1;
        
    }

    // Update is called once per frame
    void Update()
    {
        if(Physics2D.OverlapCircle(checker.position, radio_checker, piso))
            {
                saltos = 1; 
            }  
        if (Input.GetButtonDown("Jump")&& saltos > 0)
        {   
            saltos = saltos -1;
            rb_pers.AddForce(new Vector2(0 , 400));
        }
        float h = Input.GetAxis("Horizontal")*15;
        rb_pers.velocity= new Vector2(h,rb_pers.velocity.y);

        

    }
    private void OnTriggerEnter2D(Collider2D other) {
        if (other.gameObject.CompareTag("fantasma"))
        {
            Debug.Log("Chocaste con un fatasma");
            //SetActive activa , desactiva  el checkbox del objeto  
            //en este caso se desativa
            other.gameObject.SetActive(false);
            
        }
    }
}
