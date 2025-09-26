public class saltos {
    public static void main(String[] args) {
        double a = 0;
        double b = 100;
        double c = 87.5;
        int salto = 0;
        System.out.println("entro");
        while ( a != c ){
            b = b / 2;
            a = a + b;
            System.out.println(a);
            salto++;
        }
        System.out.println(String.format("··numero total de saltos: %d", salto));
    }

   /*  public void metodo(){
        int b = 100;
        double c = 12.5;
        int salto = 0;
        while ( b > c ){
            b = b / 2;
            salto++;
        }
        System.out.println(String.format("numero total de saltos: %d", salto));
        
    } */
}
   