public class TestClass {
    public static void main(String[] args) {
        /*Anonymous Class:
            A class that is not declared but is instantiated immediately.
            It is used when we want to create a class used only once.
            Meaning, we don't want to save it in a variable.
            Thus, not being able to reuse it.
            for example,
                TimerTask, Runnable, callbacks and more
        */
        Dog dog = new Dog();
        dog.bark();
        Dog dog2 = new Dog(){
            @Override
            public void bark() {
                System.out.println("Scooby Doo says Ruh Roh");
            }
        };
        dog2.bark();
    }
}