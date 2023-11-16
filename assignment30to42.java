

import java.util.*;



// QUESTION  31 class   not a requeried

//QUESTION  32 class
class handleexce{

     static void exce(int a[]) {
         Scanner sc = new Scanner(System.in);
         try {
             for (int i = 0; i <= a.length; i++) {
                 int a1 = sc.nextInt();
                 a[i] = a1;
             }
         } catch (ArithmeticException e){
             System.out.println(e);
         }
         catch (ArrayIndexOutOfBoundsException e){
             System.out.println(e);
         }


     }
}

//QUESTION 34 class not required

// QUEstion 35 class
class  voting{

    voting(int a){

        vote(a);
    }
    void vote(int age) throws ArithmeticException{
       try{
        if (age < 18) {
            throw new ArithmeticException("note valid");
        }
        else {
            System.out.println("welcome to vote");
        }
       }

       catch (Exception e){
           System.out.println(e);

       }
    }
        }




        // Question 36 class
class exception extends Exception{

            @Override
            public String toString() {
                return "insufficent fund";
            }

            @Override
            public String getMessage() {
                return "insufficent fund";            }
        }

        class bank2 {
    bank2(int amount) throws exception
    {
      withdrawl(amount);
    }
        int balance = 2000;
        void withdrawl(int amount) throws exception {

            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("withdrawl amount is" + amount);
                System.out.println("remaining balance is " + balance);
            }
            else {
              int remainnig =  amount-balance;
                System.out.println("requried more "+ remainnig +" after the withdrawl  this ammount "+ amount);
                throw new exception();
            }

        }
         }


         // QUESTION 37 class


         class age extends exception{
             @Override
             public String toString() {
                 return "Age not within RangeExcepton";
             }

             @Override
             public String getMessage() {
                 return "Age NotWithin RangeExcepton";
             }
         }

class  name extends exception{
    @Override
    public String toString() {
        return "NameNotValidException";
    }

    @Override
    public String getMessage() {
        return "NameNotValidException";
    }
}

class student{
    int rollnum;
    int age;
    String name;
    String course;

    student(int rollnum,int age, String name , String course){
   this.age=age;
   this.name=name;
   this.course=  course;
   this.rollnum= rollnum;

    }
 public void  checking() throws age,name {

     try{
        if(age>21||age<15){

        throw new age();
        }
     }
     catch (age n1){
         System.out.println(n1);
     }
     try {
         for (int i=0;i<name.length();i++){
             if(name.charAt(i)<'A' || name.charAt(i)>'Z' && name.charAt(i)<'a' || name.charAt(i)>'z') {
                 throw new name();
             }
         }
     }
     catch (name a1){
         System.out.println(a1);
     }

    }




}




// QUESTION 38 class
class  xyz implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<50){
            System.out.println("thread 1  start ");
            i++;
        }


    }
}

class wxyz  implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<50){
            System.out.println("thread 2  start ");
            i++;
        }
    }
}




// Question 39 class
class Root extends Thread
{
    public void run()
    {
        for(int i=65; i<=90; ++i)
            System.out.println((char)i);
    }
}

// Quesrtion 40  class

class r1 extends Thread
{
    public void run(String msg)
    {
        System.out.println("sending"+ msg);



        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("send"+msg);

    }
}
class r2 extends Thread
{
    public void run(String msg)
    {

        System.out.println("sending"+ msg);

        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("send"+msg);

    }
}


// QUESTION --41 class
public class assignment30to42  {
    public static void main(String[] args) throws exception {


        //QUESTION 31 ----- Take two numbers from the user and perform the division operation and handle
        //Arithmetic Exception. O/P- Enter two numbers: 10 0
        //Exception in thread main java.lang.ArithmeticException:/ by zero



     /*
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b= sc.nextInt();


        try{
            int c= a/b;
            System.out.println(c);

        }
        catch (Exception e){
            System.out.println(e);
        }

*/



//  Question 32 -------W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero
//exception and another one is to handle
//ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;


        /*
        int a []= new int[5];
handleexce h1= new handleexce();
 h1.exce(a);

*/


//  Question 33-----------W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch
//block. try {
//try
//{//code}
//catch (Exception e)
//{//code}
//catch (Exception e)
//{//code}




        // QUEStion 34 ---------- W.A.J. P to demonstrate try catch block, take two numbers from the user by
        //Command line argument and perform the division operation and handle Arithmetic
        //O/PException in thread main java. Lang. Arithmetic Exception:/ by zero




         /*
          question  31 simmiler to 34 i will builed this question in 31
          */



        // QUESTION 35-------W.A.J.P to create the validate method that takes integer value as a parameter. If the
        //age is less than 18, then throw an Arithmetic Exception otherwise print a message
        //welcome to vote.
        //O/P- Enter your age: 16
        //Exception in thread main java. Lang. Arithmetic Exception: not valid

        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        voting vo = new voting(sc.nextInt() );


*/



         // Question 36 ---------W.A.J.P to create a custom exception if Customer withdraw amount which is greater
        //than account balance then program will show custom exception otherwise amount
        //will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
        //2500


        /*
       Scanner sc = new Scanner(System.in);
        try
        {
            bank2 b2 = new bank2(sc.nextInt());

        } catch (exception e) {
            throw new exception();

        }

*/




        // Question 37----------• W.A.J.P to create a class Student with attributes roll no, name, age and course.
        //Initialize values through parameterized constructor. If age of student is not in
        //between 15 and 21 then generate user defined exception
        //"AgeNotWithinRangeException". If name contains numbers or special symbols
        //raise exception "NameNotValidException". Define the two exception classes





  /*
        student s1= new student(101,24,"@ohan","be");
        s1.checking();

*/




        // QUESTION 38----W.A.J. P to create one thread by implementing Runnable interface in
        //Class


        /*

         xyz x1 = new xyz();
         wxyz w1 = new wxyz();
         Thread t2= new Thread(w1);
         Thread t1 = new Thread(x1);

         t1.start();
t2.start();


*/




        // QUESTION 39 ----W.A.J. P to create one thread by extending Thread class in another Class.


/*
                Root a=new Root();
                a.start();
                for(int i=1; i<=20; ++i)
                    System.out.println(i);

*/





                //QUESTIOn 40 ----- W.A.J.P to create 2 threads and execute that threads by providing sleep time as
        //2000ms and check the execution.


        /*
            r1 r= new r1();
            r2 rr = new r2();
            r.run("hii");
            rr.run("byy");
            r.start();
            rr.start();


         */


        //QUESTIOn 41 -------W.A.J.P to start the same Thread twice by calling start () method twice.
        // Test.ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();

        /*

         //NO same thread to twice time calling start method


         */



        //QUESTIOn 42--W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
        //Daemon () method of Thread class and check whether the thread is set daemon or
        //not by using is Daemon () method.
        //TestDaemonThread2 t1=new TestDaemonThread2();
        //TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
        //t1.setDaemon(true);//will throw exception here t2.start();


    }
}
