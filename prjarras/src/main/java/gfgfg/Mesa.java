package gfgfg;

public class Mesa {

    private Jarra jarra1, jarra2;

    public Mesa(Jarra j1, Jarra j2) {

        if (j1 == j2) {

            throw new RuntimeException("Error");

        } else {

            this.jarra1 = j1;

            this.jarra2 = j2;

        }

    }

    public Mesa(int c1, int c2) {

        this.jarra1 = new Jarra(c1);

        this.jarra2 = new Jarra(c2);

    }

    public int capacidad(int i) {

        int ret;

        if (i == 1) {

            ret = jarra1.capacidad();

        } else if (i == 2) {

            ret = jarra2.capacidad();

        } else {

            throw new RuntimeException("Indice erroneo");

        }

        return ret;

    }

    public int contenido(int i) {

        int ret;

        if (i == 1) {

            ret = jarra1.contenido();

        } else if (i == 2) {

            ret = jarra2.contenido();

        } else {

            throw new RuntimeException("Indice erroneo");

        }

        return ret;

    }

    public void llena(int i) {

        if (i == 1) {

            jarra1.llena();

        } else if (i == 2) {

            jarra2.llena();

        } else {

            throw new RuntimeException("Indice erroneo");

        }

    }

    public void vacia(int i) {

        if (i == 1) {

            jarra1.vacia();

        } else if (i == 2) {

            jarra2.vacia();

        } else {

            throw new RuntimeException("Indice erroneo");

        }

    }

    public void llenaDesde(int i) {

        if (i == 1) {

            jarra2.llenaDesde(jarra1);

        } else if (i == 2) {

            jarra1.llenaDesde(jarra2);

        } else {

            throw new RuntimeException("Indice erroneo");

        }

    }

    @Override
    public String toString() {

        return "M( " + jarra1 + ", " + jarra2 + ")";

    }

}
