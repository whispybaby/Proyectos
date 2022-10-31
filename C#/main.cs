{
  public static bool IsOpposite(string s1, string s2)
  {
    if (s1 == "" && s2  == ""){
      return false;
    }
    //el bucle recorrera todo uwu y con i se accede a la posicion que se recorre de una estring
    for (int i = 0; i <s1.Length; i++){
     //para declarar que busque el caracter i en la logica 
    if ((s1[i]).ToLowerInvariant() ==  (s2[i]).ToLowerInvariant()){
    if(s1[i] == s2[i]) {
         return false;
       }
     }
     else { 
       return false;
     }
       return true;
    }
  }
}