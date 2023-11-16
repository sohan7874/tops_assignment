//Quesstion 16 class
class printnumber{

    static float value(float a,float b){
        float c = a+b;
        return c;
    }
    static int  value(int a,int b){
        int c = a+b;

        return c;
    }


    static boolean value(int a,float b){
        float c = a+b;
        int d=10;
        if(c==d){
            return true;
        }

        return false;
    }


}




// QUESTION 18 CLASS
class print{

    public void printvalue(int n,char c){

        System.out.println(c);
        System.out.println(n);
    }


    public void printvalue( char c,int n){
        System.out.println(c);
        System.out.println(n);
    }

}

//quesrtion 19 class
class findarea{


    public static  void area( int length,int breadth){

        int area=0;
        area = 2*length*breadth;
        System.out.println(area);
    }

    public static  void area( int length){
        int area = length*length;
        System.out.println(area);

    }


}


//  Question 20 class
class parentclass{
    parentclass(){
        System.out.println(" i am parentclass of subclass");
    }
 void print(){
        System.out.println("superclass runnig complete");
    }
}
class subclass extends parentclass{
    subclass(){
        System.out.println("i am subclass of parentclass");
    }
   void print(){
        System.out.println("subclass runnig complete");
        super.print();
    }


}

//Question 21   class
class member{

 int  Datamembers=4;
String [] Name={"sohan","rahul","nirmal","vishal"};
 int Age[]={21,20,25,52};
 double Phonenumber[]={9496,94074,56258,68505};
String Address[]={"rajlot","junagath","porbandar","junagath"};
 int Salary[]={45000,52000,65000,90000};

 public void salery(){


     for (int i=0;i<Name.length;i++){
         System.out.print(Name[i] +" ");
         System.out.println(Salary[i]);
     }

 }




}

//Questionn 22  class
class rectangle{
 static int length ;
static int breadth;
rectangle(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
}
public  void area(){

    int areaofrecctangle= (length*breadth);
    System.out.println("the area of rectangle is"+areaofrecctangle);
}
    public  void parameter(){
    int parameterrectangle= 2*(length+breadth);
        System.out.println("the parameter of rectangle is"+parameterrectangle);
    }

}
class squere extends rectangle {

    squere (int length,int breadth){
        super(length,breadth);
        this.length=length;

    }
    public void area(){

        int areaofsquere= (length*length);
        System.out.println("the arrea of squere is"+areaofsquere);
        
//super.area();

    }

    public  void parameter(){
        int parametersquere= 4*(length);
        System.out.println("the parameter of squere is"+parametersquere);
super.area();
    }






}


//Question 23 class

class tringle1{

    int a = 3;
    int b=4;
    int c=5;

    tringle1(){

           int s = (a+b+c)/2;
       float  area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println(area);

    }
}


//Question 24 class

class complex{

    int real;
    int image;
    complex( int real ,int image){
        this.real=real;
        this.image=image;
    }

   public  static  complex sumofcomplexnumber(complex c1, complex c2)
   {
        complex c= new complex(0,0);
       c.real = c1.real + c2.real;
      c.image = c1.image + c2.image;

      return c;
    }
    public void showC()
    {
        System.out.print(this.real + " +i" + this.image);
    }

public static complex diffrencecompplexnumber(complex c1,complex c2)
{

    complex c11  = new complex(0,0);
    c11.real=c1.real-c2.real;
    c11.image= c2.image+c2.image;

    return c11;
}




}


// QUESTION 25  Class

abstract  class parent{
   abstract void massage();
}

class child1 extends parent{

    @Override
    void massage() {
        System.out.println("this is first child class");
    }
    }

    class child2 extends parent{

        @Override
        void massage() {
            System.out.println("this is second child class ");
        }
    }




    // QUESTION 26 Class

abstract class  bank1 {
    int deposit ;
    abstract void getbalance();
}

class a extends bank1 {

    @Override
    void getbalance() {
           deposit+=100;
        System.out.println(deposit);
    }
}

class  b extends bank1 {

    @Override
    void getbalance() {
        deposit+=150;
        System.out.println(deposit);
    }
}

class  c extends bank1 {

    @Override
    void getbalance() {
        deposit+=200;
        System.out.println(deposit);
    }
}




// QUESTION 27 class
 abstract  class mark{
      abstract  void  getpercentage();
}
class  studnetA extends mark {

    int physics,maths,chemistry;
    studnetA(int physics, int maths, int chemistry){
     this.physics=physics;
     this.chemistry=chemistry;
     this.maths=maths;
    }

    @Override
     void  getpercentage() {

        int percentage = (physics+maths+chemistry)/3;
        System.out.println(percentage);
    }

}
class  studnetB extends mark {

    int physics, maths, chemistry, computer;

    studnetB(int physics, int maths, int chemistry, int computer) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.maths = maths;
        this.computer = computer;
    }

    @Override
    void getpercentage() {

        int percentage = 0;
        percentage =(physics + maths + chemistry + computer) / 4;
        System.out.println(percentage);

    }
}




//QUESTION 28 classs
class  factorial {

  int findfactorial(int n) {

        int resultt =1;
        if (n == 0) {
            return resultt;
        }
        if (n == 1) {
            return resultt;
        }

        for (int i = n; i > 0; i--) {
         //   int multi= i*resultt;
            resultt *=i;

        }
      System.out.println(resultt);

           return 0;
    }
}


//QUESTION  29 class

  abstract class shape {

   abstract void rectanglearea(int leangth,int breadh);
    abstract  void squerearea(int length);
    abstract void circlearea(int radius);
 }
  class area extends  shape{

      @Override
      void rectanglearea(int leangth, int breadh) {
          int area = leangth*breadh;
          System.out.println(area);
      }

      @Override
      void squerearea(int length) {
int area = length*length;
          System.out.println(area);
      }

      @Override
      void circlearea(int radius) {
         float area = (float) (3.14*radius*radius);
          System.out.println(area);
      }
  }

  // QUEStion 30 class
//create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
  //having a method to print "This is rectangular shape" and "This is circular shape"
  //respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
  //"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
  //object of 'Square' class
class zo{
    int mark;
    zo(int marks){
        this.mark=marks;
        grade(mark);
    }
    static  void grade (int  marks){
        if (marks>=91&&marks<=100){
            System.out.println(" The Grade is AA");
        } else if (marks<91&&marks>=80) {
            System.out.println(" The Grade is AB");
        }
        else if (marks<80&&marks>=71) {
            System.out.println(" The Grade is BB");
        }
        else if (marks<=70&&marks>=61) {
            System.out.println(" The Grade is BC");
        }
        else if (marks<61&&marks>=51) {
            System.out.println(" The Grade is CD");
        }
        else if (marks<51&&marks>=41) {
            System.out.println(" The Grade is DD");
        }
        else {
            System.out.println("you are fail");
        }
    }
  }

  // QUESTION 31 classs
  class shapes {
      void   shapemass() {
          System.out.println("this is a shape ");
      }
  }
  class rectangle1 extends  shapes {
      void rectangleshapemass(){
          System.out.println("this is a  rectangle  shape ");
      }
  }
class circle1  extends shapes {
     void circleshapemass() {
        System.out.println("this is a circle shape ");
    }
}
    class squere2 extends rectangle1{
         void squereshappmass(){
            System.out.println(" squere is ractangle");
        }
    }


    // Question 32 classs


public class assignent16to30 {
    public static void main(String[] args) {


        //  QUESTION 16--  W.A.J.P to find the second most frequent character in a given string. The given string
        //is: successes The second most frequent char in the string is: c

/*







*/







/*
        //     Quetion -17 ----Create a class named 'Print Number' to print various numbers of different data types
        //by creating different methods with the same name 'printn' having a parameter for
        //each data type.




         /*printnumber pn= new printnumber();

        System.out.println(pn.value(1,2));
        System.out.println(pn.value(1.f,2.f));
        System.out.println(pn.value(1,9.0f));



*/




    // QUESTION 18 ---------Create a class to print an integer and a character with two methods having the same
        //name but different sequence of the integer and the character parameters.


/*

        print p1=new print();
        p1.printvalue('s',10);
        p1.printvalue(10,'f');


*/


// QUESTION 19 Create a class to print the area of a square and a rectangle. The class has two methods
//with the same name but different number of parameters. The method for printing
//area of a rectangle has two parameters which are length and breadth respectively
//while the other method for printing area of square has one parameter which is side
//of square.



/*
    findarea fa=new findarea();
     fa.area(4,5);
     fa.area(4);

 */


//QUESTION 20------- • Create a class with a method that prints "This is a parent class" and its subclass with
//another method that prints "This is child class". Now, create an object for each of
//the class and call 1 - method of parent class by object of parent class 2 - method of
//child class by object of child class 3 - method of parent class by object of child class

      /*  subclass sb=new subclass();
         sb.print();


      */


//Question 21-------------• Create a class named 'Member' having the following members:
//1. Data members
//2. Name
//3. Age
//4. Phone number
//5. Address
//6. Salary
//It also has a method named 'printSalary' which prints the salary of the members.


/*
     member m1= new member();
     m1.salery();
*/




//Question 22 -----------Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
//two methods to print the area and perimeter of the rectangle respectively. Its
//constructor having parameters for length and breadth is used to initialize the length
//and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
//constructor having a parameter for its side (suppose s) calling the constructor of its
//parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.


/*


      squere sq=new squere(10,15);

         sq.area();
         sq.parameter();

*/




// QUESTION 23---Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
//5 units by creating a class named 'Triangle' without any parameter in its constructor.
//s = (a+b+c)/2
//area = √(s(s-a)*(s-b)*(s-c))

/*
        tringle1 t1=new tringle1();

*/


// QUESTION 24--Print the sum, difference and product of two complex numbers by creating a class
//named 'Complex' with separate methods for each operation whose real and
//imaginary parts are entered by user.

/*
        complex co=new complex(51,51);
        complex co1=new complex(6,6);
         complex c11  = complex.diffrencecompplexnumber(co,co1);

        System.out.println("\nAddition is :");
        c11.showC();

*/


        //QUESTION 25 ----• Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
        //having a method with the same name 'message' that prints "This is first subclass"
        //and "This is second subclass" respectively. Call the methods 'message' by creating
        //an object for each subclass.

        /*
          parent p = new child1();
          parent p1 =  new child2();

          p.massage();
          p1.massage();


*/



  // QUESTION 26----Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
        //$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
        //are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
        //method by creating an object of each of the three classes.
/*
 bank b= new a();
 bank b1= new b();
 bank b2= new c();

 b.getbalance();
 b1.getbalance();
 b2.getbalance();



*/




        //QUESTION 27-----
        // We have to calculate the percentage of marks obtained in three subjects (each out of
        //100) by student A and in four subjects (each out of 100) by student B. Create an
        //abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
        //other classes 'A' and 'B' each having a method with the same name which returns the
        //percentage of the students. The constructor of student A takes the marks in three
        //subjects as its parameters and the marks in four subjects as its parameters for student
        //B. Create an object for each of the two classes and print the percentage of marks for
        //both the students.



        /*
studnetA s1=new studnetA(100,100,100);
studnetB s2=new studnetB(50,50,50, 50);
s1.getpercentage();
s2.getpercentage();

*/



        // QUESTION 28----------Write a program to print the factorial of a number by defining a method named
        //'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
        //*(n-1) *n. E.g.-
        //4! = 1*2*3*4 = 24
        //3! = 3*2*1 = 6
        //2! = 2*1 = 2
        //Also, 1! = 1
        //0! = 0


    /*factorial f1= new factorial();
    f1.findfactorial(4);

*/



// QUEstion  29 ----------We have to calculate the area of a rectangle, a square and a circle. Create an abstract
//class 'Shape' with three abstract methods namely 'RectangleArea' taking two
//parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
//parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
//side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
//all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
//area of rectangle, square and circle respectively. Create an object of class 'Area' and
//call all the three methods. I3.



/*

        area a1=  new area();
        a1.circlearea(5);
        a1.rectanglearea(6,5);
        a1.squerearea(5);

*/



// QUESTION 30 ---------- Write a program which will ask the user to enter his/her
//marks (out of 100). Define a method that will display grades according to the marks
//entered as below:
//Marks Grade
//91-100 AA
//81-90 AB
//71-80 BB
//61-70 BC
//51-60 CD
//41-50 DD
//40 Fail


        /*
        Scanner sc = new Scanner(System.in);
        int mark= sc. nextInt();
        zo z= new zo(mark);
*/


        // QUESTION 31 ------ Create a class named 'Shape' with a method to print "This is this is shape". Then
        //create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
        //having a method to print "This is rectangular shape" and "This is circular shape"
        //respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
        //"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
        //object of 'Square' class

 /*
        squere2 sq= new squere2();
        sq.rectangleshapemass();
        sq.shapemass();


  */


    // QUESTION 32-------  W.A.J.P to demonstrate try catch block


















































































































































































































































































































































    }
}
