import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws IOException {

        Animales perro = new Animales();
        perro.setNombre("Duncan");;
        perro.setRaza("Golden Retriver");
        perro.setEdad(12);
        perro.setSexo("Macho");
        perro.setColor("Dorado");
        perro.setAltura(0.6);
        perro.caracteristicas_1();
        System.out.println(perro.caracteristicas_2());

        Animales caballo = new Animales();
        caballo.setNombre("Spirit");
        caballo.setRaza("Mustang");
        caballo.setEdad(3);
        caballo.setSexo("Hembra");
        caballo.setColor(" Blanco");
        caballo.setAltura(1.4);
        caballo.caracteristicas_1();
        System.out.println(caballo.caracteristicas_2());*/

        Animales gato = new Animales("Tom","Negro", 0.2,"macho",20,"poodle");
        /*gato.setNombre("Tom");
        gato.setRaza("Persa");
        gato.setEdad(7);
        gato.setSexo("Macho");
        gato.setColor(" Negro");
        gato.setAltura(0.2);*/
        gato.caracteristicas_1();
        System.out.println(gato.caracteristicas_2());
        Hijos_Animales gatojr = new Hijos_Animales("pepe","rojo",2,"hembra",21,"naranja");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


//  perro gato serpiente y caballo
    }
}