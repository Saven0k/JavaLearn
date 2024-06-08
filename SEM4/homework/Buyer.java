

public class Buyer {
    enum Gender {MALE, FEMALE};
    private String Name;
    private int Age;
    private String PhoneNumber;
    private Gender Sex;


    public Buyer(String name, int age, String phoneNumber, Gender sex) {
        this.Name = name;
        this.Age = age;
        this.PhoneNumber = phoneNumber;
        this.Sex = sex;
    }

    public Gender getSex() {
        return Sex;
    }
    public void setSex(Gender sex) {
        this.Sex = sex;
    }

    public String getName() {
        return Name;  
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }
}
