import classes.Employee;
import classes.MyMethods;
import classes.Person;
import classes.Customer;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

       // System.out.println("Hello  World!");
       /* byte bytevar = 127;
        short shortvar = 32767;
        int intvar =  12;
        long longvar = 1213121;
        float floatvar = 8.2f;
        double doublevar = 123123123.123d;
        boolean boolvar = true;
        char charvar = '\u0041';


        System.out.println("Byte: " + bytevar);
        System.out.println("Short: " + shortvar);
        System.out.println("Integer: " + intvar);
        System.out.println("Long: " + longvar);
        System.out.println("Float: " + floatvar);
        System.out.println("Double: " + doublevar);
        System.out.println("Boolean: " + boolvar);
        System.out.println("Character: " + charvar);*/
       /* String errorMessages[] = new String[3];
        //**********************************************************************************
        errorMessages[0]= "File not found";
        errorMessages[1]= "Invalid Username";
        errorMessages[2]= "Invalid Password";*/

        /*System.out.println("First Message:" + errorMessages[0]);
        System.out.println("Second Message:" + errorMessages[1]);
        System.out.println("Third Message:" + errorMessages[2]);*/
        //****************************************************************************

      /*  Person client = new Person();
        client.setName("Josh");
        client.setGender(false);
        client.setAge(100);
        client.setWeight(65.5f);
        client.setHeight(160.6f);
        client.setEmail("samplemail@gmail.com");*/


     /*   System.out.println("Name: " + client.getName());
        System.out.println("Gender: " + client.isGender());
        System.out.println("Age: " + client.getAge());
        System.out.println("Weight: " + client.getWeight() + " kg.");
        System.out.println("Height: " + client.getHeight() + " cm.");
        System.out.println("Email: " + client.getEmail());*/

     //******************************************************************

       /* Employee employee1 = new Employee();
        Customer customer1 = new Customer();


        employee1.setName("Employee 1");
        employee1.setDepartment("IT Department");
        employee1.setSssId(1234);
        employee1.setPagibigId(4312);

        System.out.println("-----EMPLOYEE'S INFORMATION----------");
        Sysatem.out.println("Employee Name: " + employee1.getName());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("SSS ID: " + employee1.getSssId());
        System.out.println("PAG-IBIG ID: " + employee1.getPagibigId());
        System.out.println("Hi i am " + employee1.IntroduceYourself("Josh", " From IT Department"));*/
// -----------------CUSTOMER---------------------------------
       /* customer1.setName("Customer 1");
        customer1.setCustID(1324);
        customer1.setMembLevel("Premium");
        customer1.setCredNumber(54324234);

        System.out.println("-----CUSTOMER'S INFORMATION----------");
        System.out.println("Customer Name: " + customer1.getName());
        System.out.println("Customer ID: " + customer1.getCustID());
        System.out.println("Membership Level: " + customer1.getMembLevel());
        System.out.println("Credit card number: " + customer1.getCredNumber());
        System.out.println("Hi i am " + customer1.IntroduceYourself("Tsalo"," I am a premium user"));
*/

    //***************************CONDITIONS********************************************
         /*   int number = 5;

        if(number < 3){

                System.out.println(number + " is less than 3");
            }
            else{
                System.out.println(number + " is greater than or equal to 3");
            }
*/

         //*************************FIRST EXERCISE********************************
        /*int totalStudents = 20;
        int presentStudents = 16;
        String day = "Tuesday";

        if(presentStudents <= 15 && day == "Monday"){
            System.out.println("MONDAY:");
            System.out.println("Current subject is MATH and teacher 1 has less than or equal to 15 students");

        }
        else if(presentStudents > 15 && day == "Monday"){
            System.out.println("MONDAY:");
            System.out.println("Current subject is MATH and teacher 1 has greater than 15 students");

        }
        else if(presentStudents == totalStudents && day == "Tuesday"){
            System.out.println("TUESDAY:");
            System.out.println("Current subject is Science and teacher 3 has 20 students");
        }
        else{
                System.out.println("TUESDAY:");
                System.out.println("Current subject is English,OOP and Server Maintenance and teachers 2,4 and 5 has greater or less than 20");

        }*/
        //*************************SECOND EXERCISE********************************
        /*boolean weekday = false;
        boolean weekend = true;
        boolean holiday = false;


        if(weekday == true && weekend == false && holiday == false ){
            System.out.println("today is not a  vacation");
        }
        else if (weekday == true && weekend == false && holiday == true){
            System.out.println("today is vacation");
        }
        else if (weekday== false && weekend == true && holiday == false){
            System.out.println("today is vacation");
        }
        else if (weekday == false && weekend == true && holiday == true){
            System.out.println("today is vacation");
        }
        else{
            System.out.println("(weekday and weekend) OR (weekday, weekend and holiday) can't be true at the same time");
        }*/

        //************THIRD EXERCISE******************

      /*  boolean regular = false; //Regular:True -- Irregular: False
        boolean partTime = true; // Part-time: true -- Full-time: False

        if(partTime){
            System.out.println(" You can only take 6 subjects");
        }
        else if(!regular && !partTime ){
            System.out.println("You can only take 5 subjects");
        }
        else{
            System.out.println("You can take 7 subjects");
        }
*/
       /* MyMethods sum = new MyMethods();


        System.out.print("The sum is " + sum.getInt(6));*/
       /*MyMethods.sumInt(6);*/
      // MyMethods.printIntegers(7);
        /*int i;
        String myFriends[] = new String[5];
        myFriends[0] = "Boneski" ;
        myFriends[1] = "Goyski" ;
        myFriends[2] = "Dogski";
        myFriends[3] = "Bakiki";
        myFriends[4] = "Jaydski";


        for(i=0; i<5; i++){
            System.out.println(myFriends[i]);
        }*/
       // MyMethods meth = new MyMethods();
       // List<String> myList = new meth.getMyFriend();



       /* System.out.print(MyMethods.getMyFriend() + " ");
        System.out.print(MyMethods.getRelationship() + " ");
        System.out.print(MyMethods.getGirlFriend());*/

       String friends = MyMethods.getMyFriend();
        String relations = MyMethods.getRelationship();
        String girls = MyMethods.getGirlFriend();
        //String arr[] = { friends, girls};

        int boyFirst = 0;

        Random rand = new Random();
        int randnum = rand.nextInt();
        int mod = randnum % 2;
        /*int index = rand.nextInt(arr.length);
        int index2 = rand.nextInt(arr.length);
*/
        if(mod == boyFirst) {
            System.out.print(friends + " " + relations + " " + girls);
        }
        else{
            System.out.print(girls + " " + relations + " " + friends);
        }



    }
}

