public class HelloWorld {
    static void myMethod(String name, int age) {
        int ageLater = age + 10;
        System.out.println("Nama saya adalah " + name);
        System.out.println("Umur saya " + age);
        System.out.println("Sepuluh tahun lagi saya berumur " + ageLater);
    }

    public static void main(String[] args) {
        myMethod("Naruto", 19);
    }
}