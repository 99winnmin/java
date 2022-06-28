package ch02;

public class Person {
    String name;
    int age;
    //생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로
    // this() statement 이전에 다른 statement를 쓸 수 없음
    //즉 this()위에는 무슨 코드 쓸 생각 x
    public Person(){//생성자에서 다른 생성자를 호출 하는 this
        this("noname",1);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person getPerson(){
        return this;//자신의 주소를 반환하는 this
    }
    public void showPerson(){
        System.out.println(name + " , " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
//        p.showPerson();
        p.name = "james";
        p.age  = 37;

        Person p2 = p.getPerson();
        System.out.println(p);
        System.out.println(p2);
        //p, p2는 같은 주소값을 출력
    }
}
