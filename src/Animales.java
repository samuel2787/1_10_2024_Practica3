public class Animales {

    private String nombre;
    private String color;
    private double altura;  // Mejor usar tipo numérico
    private String sexo;
    private Integer edad;
    private String raza;
    static String tipo = "mamifero";

    public Animales() {

    }

    public Animales(String nombre) {
        this.nombre = nombre;
    }

    public Animales(String nombre, String color) {
        this(nombre);
        this.color = color;
    }

    public Animales(String nombre, String color, double altura) {
        this(nombre, color);
        this.altura = altura;
    }

    public Animales(String nombre, String color, double altura, String sexo) {
        this(nombre, color, altura);
        this.sexo = sexo;
    }

    public Animales(String nombre, String color, double altura, String sexo, Integer edad) {
        this(nombre, color, altura, sexo);
        this.edad = edad;
    }

    public Animales(String nombre, String color, double altura, String sexo, Integer edad,String raza) {
        this(nombre, color, altura, sexo, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void caracteristicas_1() {
        System.out.println("El nombre del animal es: " + this.nombre);
        System.out.println("La raza del animal es: " + this.raza);
        System.out.println("Sus características son:");
    }

    public String caracteristicas_2() {
        StringBuilder sb = new StringBuilder();
        sb.append("Su altura: " + this.altura + " metros\n");
        sb.append("Su sexo: " + this.sexo + "\n");
        sb.append("Su edad: " + this.edad + " años\n");
        sb.append("El color de su pelaje: " + this.color + "\n");
        sb.append("El tipo de este animal es:" + Animales.tipo);
        return sb.toString();
    }
}



