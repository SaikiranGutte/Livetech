package saiLearnsJava;

class Test {

public static void main(String args[]) {

StringBuilder builder1= new StringBuilder("ajay");

StringBuilder builder2 = new StringBuilder("ajay");

System.out.println(builder1==builder2);

System.out.println(builder1.equals(builder2));
}
    
}