public class A { //Example of public access modifier
    int num;
    String name;
    int[] arr;

    // Constructor (must be outside any method)
    A(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = arr;  // or new int[0] if you want to initialize as empty
    }

    public static void main(String[] args) {
        A obj = new A(24, "Ayshu", new int[]{34});
        System.out.println("Num: " + obj.num);
        System.out.println("Name: " + obj.name);
        System.out.println("Array value: " + obj.arr[0]);
    }
}
