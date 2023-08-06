package deTelranTitovsGermans.Homework3;

interface Danceable {
    void dance();
}

interface Singable {
    void sing();
}

class Dancer implements Danceable {
    @Override
    public void dance() {
        System.out.println("Dancer is dancing!");
    }
}

class Singer implements Singable {
    @Override
    public void sing() {
        System.out.println("Singer is singing!");
    }
}

class PopSinger implements Singable, Danceable {
    @Override
    public void sing() {
        System.out.println("Pop singer is singing!");
    }

    @Override
    public void dance() {
        System.out.println("Pop singer is dancing!");
    }
}
