package Aaron_GarciaSanchez;

public class ejemplojarras {

// Apartado F
    public static void main(String[] args) {
        Jarra JarraA = new Jarra(7);//Creamos jarra A.
        Jarra JarraB = new Jarra(4); //Creamos jarra B
        JarraA.llenar(); //llenamos la jarra A

        System.out.println("Jarra A  --> " + JarraA.capacidad() + " Litros , contenido actual " + JarraA.contenido() + " Litros ");
        System.out.println("Jarra B  --> " + JarraB.capacidad() + " Litros , contenido actual " + JarraB.contenido() + " Litros ");

        JarraB = new Jarra(JarraA); //Hacemos la copia de la Jarra A a la Jarra B

        System.out.println("Jarra A  --> " + JarraA.capacidad() + " Litros , contenido actual " + JarraA.contenido() + " Litros ");
        System.out.println("Jarra B  --> " + JarraB.capacidad() + " Litros , contenido actual " + JarraB.contenido() + " Litros ");

        JarraB.vaciar(); //Vaciamos la jarra B e imprimimos
        System.out.println("Jarra A  --> " + JarraA.capacidad() + " Litros , contenido actual " + JarraA.contenido() + " Litros ");
        System.out.println("Jarra B  --> " + JarraB.capacidad() + " Litros , contenido actual " + JarraB.contenido() + " Litros ");

    }

}
