public class person {
    public String name;
    public int age;
    
    public void sayHello(){
        System.out.println("Hello, saya " + this.name);
    }


    public static void main(String[] args) {

        person person1 = new person();

        person1.name = "John";
        person1.age = 24;

        System.out.println("Name: " + person1.name + " Age: " + person1.age);
        person1.sayHello();
    }

}
