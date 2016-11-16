package classes;

public abstract class Person {
     String name;
     boolean gender;
     int Age ;
     float weight; // kgs
     float height; //cm
     String email;


    public Person(){

    }

    public String IntroduceYourself(String name, String extrainfo) {
        return name + extrainfo;
    }


    public String IntroduceYourself(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {

       return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;


    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
