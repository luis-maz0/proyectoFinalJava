public class Ejemplo {
    public static void main(String[] args){

        Persona persona1 = new Persona("Pepe", 25);
        Persona persona2 = new Persona("Pepe", 25);


        System.out.println( persona1.getNombre().equals(persona2.getNombre()));

        System.out.println( persona1.getNombre() ); //Pepe
        System.out.println( persona2.getNombre() ); //Pepe

        persona2.setNombre("Maria");
        System.out.println( persona2.getNombre() ); //Maria

        System.out.println( persona1.getNombre() ); //Maria

    }
}
