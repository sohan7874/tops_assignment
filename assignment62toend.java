import java.util.*;

//QUESTION 62 CLASS
class hashset1{
    hashset1(){

        HashSet<String>hs1=new HashSet<>();
        hs1.add("100");
        hs1.add("200");
        hs1.add("300");
        hs1.add("400");
        hs1.add("500");
        Iterator<String>i1= hs1.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
        String [] se1 = new String[hs1.size()];
        hs1.toArray(se1);
        for (String i:se1){
            System.out.println(i);
        }
    }

}

//QUESTIONN 63 CLASS

class hashset2 {
    hashset2(){
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

        ArrayList<String>al1 = new ArrayList<>(h1);
        System.out.println(al1);

    }
}

//QUESTIONN 64 CLASS

 /*class hashmap1{
    hashmap1(){
        HashMap<Integer,String> hm1 = new HashMap<>();
        hm1.put(1,"sohan");
        hm1.put(2,"kali");
        hm1.put("jagugar");       // eroor show
        hm1.put(4,"gohel");
        hm1.put(5,"rathod");

        for (Map.Entry<Integer,String>m: hm1.entrySet()){

            System.out.println(m.getKey()+" "+m.getValue());

        }
        System.out.println(hm1.size());
    }
    }
*/


//QUESTIONN 65, 66 CLASS

class incsize{
    incsize(){
        ArrayList<Integer> al= new ArrayList<>(3);
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        al.ensureCapacity(6);
        al.add(4);

        System.out.println(al);
         int set = al.size();
         for (int i=0;i<set;i++){
             System.out.println(al.get(i));
         }

    }
}

//QUESTIONN 67 class

class set {

    set() {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        Iterator<Integer> i1 = hs1.iterator();
        while (i1.hasNext()) {
            System.out.print(i1.next());
            System.out.print(" ");
        }

        System.out.println();
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(6);
        hs2.add(7);
        hs2.add(8);
        hs2.add(1);
        hs2.add(2);

        Iterator<Integer> i2 = hs2.iterator();
        while (i2.hasNext()) {
            System.out.print(i2.next());
            System.out.print(" ");
        }
        System.out.println();
        hs1.retainAll(hs2);
        System.out.println(hs1);
    }
}


// QUESTION 68
class map {
      map(){
          HashMap<Integer,String>hm1= new HashMap<>();
          hm1.put(1,"a");
          hm1.put(2,"b");
          hm1.put(3,"c");
          hm1.put(4,"d");
          hm1.put(5,"e");

          System.out.println(hm1);
          System.out.println(hm1.values());
      }
}
public class assignment62toend {
    public static void main(String[] args) {


        //QUESTION 62----------- Write a Java program to convert a hash set to an array.

        /*

             hashset1 hs1= new hashset1();


         */



             // QUESTION 63 ---------------Write a Java program to convert a hash set to a List/Array List

        /*
        hashset2 hs2 = new hashset2();

         */

        // QUESTION 64 --------------Write a Java program to check whether a map contains key-value mappings (empty)
        //or not.

                   //no not allowd without key value


        // QUESTION 65 --------------Write a Java program to increase the size of an array list.
        // QUESTION 66 --------------Write a Java program to print all the elements of an Array List using the position of
        //the elements.


/*
incsize is = new incsize();


 */


        // QUESTION 67 -------------  Write a Java program to compare two sets and retain elements which are same on
        //both sets.
/*
set s= new set();
*/


        // QUESTION 68---------Write a Java program to get a collection view of the values contained in this map.
         map m= new map();
    }

}
