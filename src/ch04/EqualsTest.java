package ch04;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student std1 = new Student(100,"Lee");
        Student std2 = new Student(100,"Lee");
        Student std3 = std1;

        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        //hash값의 원형을 알려주는 메서드
        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));

        std1.setStudentName("Kim");
        Student copyStudent = std1.clone();
        System.out.println(copyStudent);



        /*String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer i = 100;
        System.out.println(i.hashCode());*/
    }
}
