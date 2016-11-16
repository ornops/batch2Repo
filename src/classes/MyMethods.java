package classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by JPMPC-B204 on 11/12/2016.
 */
public class MyMethods {

    /*public static int getNumbSubjects(boolean regular, boolean working){
        int numbSubjects;
        if(working){
            numbSubjects = 6;
        }
        else if(!regular && !working){
            numbSubjects = 5;
        }
        else{
            numbSubjects = 7;

        }
        return numbSubjects;
    }*/

    /*public static int getNum() {
        int student = 2;

        //int numbSubjects;

        switch (student) {
            case 1:
                System.out.println("Regular student");
                break;
         default:
                System.out.println("not regular");
                break;
        }
        return student;

    }*/



       /* public static void looper(int counter) {
            int num = 1;

            while (num <= counter) {

                System.out.print("[" + num + "]");
                 num++;

            }


        }*/

    //--------------------------------------


    /*public int getInt(int userinput){
       {
            int num = 1;
            int sum = 0;
            int userinput2 = userinput;
            while(num <=userinput) {

                sum += num;
                num++;

            }
            return sum;

        }
    }*/

    // --------WHILE LOOP (adds consecutive integers) ----------------------------

       /*public static void sumInt(int userinput){
           int num = 1;
            int sum = 0;
           int userinput2 = userinput;
        while(num <=userinput2) {

            sum += num;
            num++;

        }
           System.out.print("The sum of first " + userinput2 + " consecutive integers is: "+ sum);

    }*/

    //----------- DO WHILE LOOP ---------------------

   /*    public static void printIntegers(int counter){
           int counter2 = counter;
           int printThisNum = 1;
           do{
               System.out.print("[" + printThisNum + "]");
               printThisNum++;

           }
           while(printThisNum <= counter2);

       }
*/

    //----------- FOR LOOP ---------------------

    public static String getMyFriend() {

        List<String> myList = new ArrayList<String>();

        Random rand = new Random();
        int index = rand.nextInt(5);

        myList.add("Boneski");
        myList.add("Goyski");
        myList.add("Dogski");
        myList.add("Okoyski");
        myList.add("Itskie");

        return myList.get(index);
    }


    public static String getGirlFriend() {

        List<String> myGList = new ArrayList<String>();

        Random rand = new Random();
        int index = rand.nextInt(5);

        myGList.add("Anna");
        myGList.add("Girly");
        myGList.add("Marie");
        myGList.add("Zara");
        myGList.add("Jesse");

        return myGList.get(index);
    }

    // ----Relationship method-----

    public static String getRelationship() {

        List<String> myRelation = new ArrayList<String>();

        Random rand = new Random();
        int index = rand.nextInt(5);

        myRelation.add("hates");
        myRelation.add("loves");
        myRelation.add("admires");
        myRelation.add("stalks");
        myRelation.add("envy's");

        return myRelation.get(index);
    }






}
