public class StudentEntry {

   int age;
 String name;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "StudentEntry{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentEntry(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
