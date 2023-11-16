import java.util.*;

//QUstion 43 and 44 class
class arrlist1{
    arrlist1(){
        ArrayList<String> al = new ArrayList<>();
        al.add(0,"mr");
        al.add("sohan");
        al.add("gohel");
        al.add("tops");
        al.add("marwadi");
        System.out.println(al);

        Iterator<String> i1= al.iterator();

        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }

}

//QUESTION 45 ,46 , 47 classs
class arrlist2{
    arrlist2(){
        ArrayList<String> al = new ArrayList<>();
        al.add(0,"ram");
        al.add("mahadev");
        al.add("krishna");
        al.add("brahma");
        al.add("ravan");
        System.out.println(al);

        Iterator<String> i1= al.iterator();

        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }

        System.out.println();
        String element = al.get(3);
        System.out.println( "retrive element is " +element);
        al.add(5,"lakshman");
        al.set(4,"arjun");
        System.out.println("after updation or question 44 add  and set element ");
        System.out.println(al);
        System.out.println("ans of question 45 delete 3rd element ");
        al.remove(3);
        System.out.println(al);
    }

}

//QUESTION CLASS 48 , 49 CLASS
class arrlist3{
    arrlist3() {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(100);
        al.add(126);
        al.add(65);
        al.add(10);
        al.add(26);
        al.add(665);
        System.out.println(al);
        Iterator<Integer> i1 = al.iterator();

        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        if (al.contains(10)){
            System.out.println("serch element index is "+al.indexOf(10));
        }
        else {
            System.out.println("not found");
        }

        System.out.println("sort the given arrreylist");
        Collections.sort(al);
        System.out.println(al);
    }}

//QUESRTION 50 ,51 CLASS

class arrlist4{
    arrlist4() {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        System.out.println(al);
        Iterator<Integer> i1 = al.iterator();

        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(7);
        al2.add(8);
        al2.add(9);
        al2.add(10);
        al2.add(11);
        al2.add(12);
        System.out.println(al2);
        Iterator<Integer> i2 = al2.iterator();

        while (i2.hasNext()) {
            System.out.println(i2.next());
        }

         al.addAll(al2);
        System.out.println("QUESTION 50 ans is");
        System.out.println(al);
        System.out.println("QUESTION 51 ans is");
        Collections.shuffle(al);
        Collections.shuffle(al2);
        System.out.println(al);
        System.out.println(al2);

    }}



// QUESTION 52,53,54 CLASS
class hashset {
    hashset() {

        HashSet<String> h1 = new HashSet<>();
        h1.add("sohan");
        h1.add("gohel");
        h1.add("tops");
        h1.add("marwadi");

        Iterator<String>i1 = h1.iterator();

        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }

        System.out.println(h1.size());
    }
}

//QUESTION 55,56 class
class hashmap{

    hashmap(){
        HashMap<Integer,String>hm1 = new HashMap<>();
        hm1.put(1,"sohan");
        hm1.put(2,"kali");
        hm1.put(3,"jagugar");
        hm1.put(4,"gohel");
        hm1.put(5,"rathod");

        for (Map.Entry<Integer,String>m: hm1.entrySet()){

            System.out.println(m.getKey()+" "+m.getValue());

        }
        System.out.println(hm1.size());
    }
}

// QUESTION 57,58,59 class
class arreylist5 {
    arreylist5(){
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        System.out.println(al);
        Iterator<Integer> i1 = al.iterator();

        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

         Collections.reverse(al);
        System.out.println(al);
        List<Integer> subarr = al.subList(2, 4);
        System.out.println(subarr);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(7);
        al2.add(8);
        al2.add(9);
        al2.add(10);
        al2.add(5);
        al2.add(12);
        System.out.println(al2);
        Iterator<Integer> i2 = al2.iterator();

        al.retainAll(al2);
        System.out.println(al);

    }
}


// QUESTION 60,61,62 class
class arreylist6 {
    arreylist6() {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        System.out.println(al);

          Collections.swap(al,1,4);
        System.out.println(al);
    }}


 public class assignment43to60 {
    public static void main(String[] args) {

        // QUESTION 43 ----------Write a Java program to iterate through all elements in an array list.
        // QUESTION 44 -------Write a Java program to insert an element into the array list at the first position.

        // both question in 1 code

        /*
        arrlist1 al1 = new arrlist1();


         */



        // QUESTION 45--- Write a Java program to retrieve an element (at a specified index) from a given arraylist.
       // QUESTION 46---- Write a Java program to update specific array element by given element.
        // QUESTION 47  ----Write a Java program to remove the third element from an array list.

       /*

        arrlist2 al2= new arrlist2();

        */


        //QUESTION 48-------Write a Java program to search an element in an array list.
        //QUESTION 49------- Write a Java program to sort a given array list.


        /*
        arrlist3 al3 = new arrlist3();


         */




        //QUESTION 50------Write a Java program to copy one array list into another.
        //QUESTION 51------Write a Java program to shuffle elements in an array list.
        /*
        arrlist4 al4= new arrlist4();

         */


        // QUESTION 52---------Write a Java program to append the specified element to the end of a hash set.
        // QUESTION 53---------Write a Java program to iterate through all elements in a hash list.
        // QUESTION 54---------Write a Java program to get the number of elements in a hash set.


/*
 hashset h1 = new hashset();
*/

        //QUESTION 55  --------Write a Java program to associate the specified value with the specified key in a
        //Hash Map.
        //QUESTION 56 ---------Write a Java program to count the number of key-value (size) mappings in a map

/*
         hashmap hm= new hashmap();


 */



        // QUESTION 57 ---------Write a Java program to reverse elements in an array list.
        //QUESTION 58 --------- Write a Java program to extract a portion of an array list.
        //QUESTION 59 --------- Write a Java program to compare two array lists.

        /*
        arreylist5 al5 = new arreylist5();


         */


        //QUESTION 60---------Write a Java program of swap two elements in an array list.
        //QUESTION 61--------- Write a Java program to join two array lists.

        //question 61 is  repeted !

        /*
arreylist6 al5 = new arreylist6();
*/




    }
}
