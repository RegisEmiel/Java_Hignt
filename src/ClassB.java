public class ClassB extends ClassA {
    public void methodPublicB() {
        System.out.println("Public B");
    }

    private void methodPrivateB() {
        System.out.println("Private B");
    }

    protected void methodProtectedB() {
        System.out.println("Protected B");
    }

    void methodDefaultPackageB() {
        System.out.println("Default-package B");
    }
}
