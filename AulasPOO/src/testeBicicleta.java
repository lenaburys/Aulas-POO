
public class testeBicicleta {
     public static void main(String[] args) {
         bicicleta caloi = new bicicleta();
         caloi.nome="Caloi";
         caloi.marcha= 5;
         caloi.modelo="ABC-123";

         bicicleta k=new bicicleta();
         k.nome="Fast Caloi";
         k.modelo="Fast";

         caloi.imprimir();
         k.imprimir();
     }
    
}
