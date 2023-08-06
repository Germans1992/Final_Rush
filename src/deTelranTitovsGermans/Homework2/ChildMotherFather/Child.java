package deTelranTitovsGermans.Homework2.ChildMotherFather;

public class Child implements Mother, Father{

    @Override
    public void fartherMethod() {
        System.out.println("метод от отца");
    }

    @Override
    public void motherMethod() {
        System.out.println("метод от матери");

    }
}
