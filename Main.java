// public class Main {
//     public static void main(String[] args) {
//       byte myNum = 100;
//       short myNum2 = 5000;
//       int num = 5;
//       long myNum3 = 15000000000L;
//       float fNum = 5.75f;
//       double dNum = 5.99;
//       boolean isJavaFun = true;
//       char myGrade = 'A';
//       String greeting = "Hello World";

//         System.out.println("List of primitives in Java: byte, short, int, long, float, double, boolean, char");
//         System.out.println("byte: " + myNum + " short: " + myNum2 + " int: " + num + " long: " + myNum3 + " float: " + fNum + " double: " + dNum + " boolean: " + isJavaFun + " char: " + myGrade + " String: " + greeting);
//         // System.out.println("short:" + myNum2);
//         // System.out.println("int:" + num);
//         // System.out.println("long:" + myNum3);
//         // System.out.println("float:" + fNum);
//         // System.out.println("double:" + dNum);
//         // System.out.println("boolean:" + isJavaFun);
//         // System.out.println("char:" + myGrade);
//         // System.out.println("String:" + greeting);
//     }
// }

public class Main {
    public static void main(String[] args) {
        // Student[] students = new Student[] {
        //     new Student("Morgan", "Freeman"),
        //     new Student("Brad", "Pitt"),
        //     new Student("Kevin", "Spacey"),
        // };
        // for (Student s : students) {
        //     s.printFullName();
        // }
        Point p = new Point(32, 32);
        for (int i = 0; i < 5; i++) {
            p.scale();
            p.print();
        }
    }
}
