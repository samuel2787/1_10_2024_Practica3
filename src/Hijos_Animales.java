public class Hijos_Animales {

    private String nombre;
    private String color;
    private double altura;  // Mejor usar tipo numérico
    private String sexo;
    private Integer edad;
    private String raza;
    static String tipo = "mamifero";

    public Hijos_Animales(String nombre, String color, double altura, String sexo, Integer edad, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.altura = altura;
        this.sexo = sexo;
        this.edad = edad;
        this.raza = raza;
    }
}
