class ConstructorDemo {
    String name;
    int age;
    ConstructorDemo(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
   public static void main(String[] args) {
        ConstructorDemo obj =
            new ConstructorDemo("Yogi", 19);
       obj.display();
    }
}
OUTPUT:
Name: Yogi
Age: 19
