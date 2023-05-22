package EJERCICIOS_POO;

public class mainhoras {

    public static void main(String[] args) {
        Hora reloj = new Hora(2, 40, 50);
        System.out.println(reloj.getHoras());
        reloj.setHoras(20);
        System.out.println(reloj.getHoras());

    }

}
