package prJarras;

public class TestJarras {

    public static void main(String[] args) {
        jarras jarraA = new jarras(4);
        jarras jarraB = new jarras(7);
        jarraA.llena();
        jarraB.vacia();
        System.out.println("JARRA A " + jarraA.toString());
        System.out.println("JARRA B " + jarraB.toString());
        jarraB.llenaDesde(jarraA);
        jarraA.llena();
        jarraB.llenaDesde(jarraA);
        jarraB.vacia();
        jarraB.llenaDesde(jarraA);
        jarraA.llena();
        jarraB.llenaDesde(jarraA);
        System.out.println("JARRA A " + jarraA.toString());
        System.out.println("JARRA B " + jarraB.toString());
    }
}
