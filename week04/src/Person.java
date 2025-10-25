public class Person {
    private int age;
    private String name;
    private String[] friends;

    public Person(int age, String name, String[] friends) {
        this.age = age;
        this.name = name;
        this.friends = friends;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return this.name;
    }

    public String[] getFriends() {
        return this.friends;
    }
}
