
public class random {
    int lanz=0;
    int cantidad=0;
    int suma=0;        
    int randomNumber=0;
   java.util.Random random= new java.util.Random();  
   
    public void SumaRandos(int cantidad,int rango) {
       suma=0;
         for(int i=0;i<cantidad;i++){
                randomNumber=random.nextInt(rango+1);
                System.out.print(randomNumber);
                    if(i!=cantidad-1){System.out.print(", ");}
                //System.out.println("Numero: "+randomNumber);
                    suma=suma+randomNumber;
                    //System.out.println("Suma= "+suma);
            }
         
        System.out.println("");
        System.out.println("Suma total=" +suma);
        }
 
     public void SumaRandos100(int cantidad) {
         suma=0;
        System.out.println("Estos son sus numeros: ");
            for(int i=0;i<cantidad;i++){
                randomNumber=random.nextInt(201)-100;
                     System.out.print(randomNumber);
                    if(i!=cantidad-1){System.out.print(", ");}
                //System.out.println("Numero: "+randomNumber);
                    suma=suma+randomNumber;
                    //System.out.println("Suma= "+suma);
            }
        System.out.println("");
        System.out.println("Suma total=" +suma);  
     }
    
     public void RandosPares(int cantidad) {

         suma=0;
         
          System.out.println("Estos son sus numeros: ");
            for(int i=0;i<cantidad;i++){
                randomNumber=random.nextInt(cantidad/2)*2;
                    System.out.print(randomNumber);
                    if(i!=cantidad-1){System.out.print(", ");}
                //System.out.println("Numero: "+randomNumber);
                   // suma=suma+randomNumber;
                    //System.out.println("Suma= "+suma);
            }
        //System.out.println("");
      // System.out.println("Suma total=" +suma);
     }
    
      public void Dado(int lanz) {
        int[] conteo=new int[6];
        System.out.println("Estos son sus numeros: ");
            for(int i=0;i<lanz;i++){
                randomNumber=random.nextInt(6)+1;
                   System.out.print(randomNumber);
                    if(i!=lanz-1){System.out.print(", ");}
                    conteo[randomNumber-1]++;
                //System.out.println("Numero: "+randomNumber);
                   // suma=suma+randomNumber;
                    //System.out.println("Suma= "+suma);
            }
        System.out.println("");
        System.out.println("1=" +conteo[0]);
        System.out.println("2=" +conteo[1]);
        System.out.println("3=" +conteo[2]);
        System.out.println("4=" +conteo[3]);
        System.out.println("5=" +conteo[4]);
        System.out.println("6=" +conteo[5]);   
      }
    }
    
    

