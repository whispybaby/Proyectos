using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class movimiento : MonoBehaviour
{
    Rigidbody2D rb_pers;
    public float Radiochecker;
    public LayerMask Capa;

    public Transform checker;
    

    // Start is called before the first frame update
    //rb_pers.AddForce(new Vector2(0, ));  
    void Start()
    {
        rb_pers = GetComponent<Rigidbody2D>();

    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetButtonDown("Jump") && Enelpiso())
        {
            rb_pers.AddForce(new Vector2(0, 400));
        }
    
        float v = Input.GetAxis("Vertical");
        float h = Input.GetAxis("Horizontal") * 15;
        rb_pers.velocity = new Vector2(h, rb_pers.velocity.y);



    }
    private bool Enelpiso(){
        return Physics2D.OverlapCircle(checker.position, Radiochecker, Capa);
    }
    private void OnTriggerEnter2D(Collider2D other)
    {
        if (other.gameObject.CompareTag("fantasma"))
        {
            Debug.Log("Chocaste con un fatasma");
            //SetActive activa , desactiva  el checkbox del objeto  
            //en este caso se desativa
            other.gameObject.SetActive(false);

        }
    }
    //resetea la posicion del personaje cuando cae al vacio
    public void ResetPosition(){
        // transform.position = new Vector2(xInit,yInit);
    }
} 
