public class Main{
    public static void  main(String[] args) {
        System.out.println("BIENVENIDO(a) a SCREEN MATCH");
        System.out.println("PELICULA: Matrix");
        int fechaLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDePelicula = 8.2;


        double media =( 8.2+6.0+9.0 )/3;

        String sinopsis ="""
                Matrix es una paradoja 
                la mejor pelicula del fin del milenio
                fue lanzada en :
                """+ fechaLanzamiento;


        System.out.printf(sinopsis);

        int clasificacion = (int) (media/2);
        System.out.print(clasificacion);

    }

}
