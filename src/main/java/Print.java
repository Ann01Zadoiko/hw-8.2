public class Print {
    public static void print(Shape shape){
        System.out.println(shape.print());
    }

    public static String printA(Shape shape){
        return shape.print();
    }

    public static void main(String[] args) {
        Shape shape = new Arrow();
        print(shape);
        System.out.println(printA(shape));
    }

}

