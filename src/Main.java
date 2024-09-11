/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int a, int b){
        return a+b;
    }
    
    // 2. add
    public static int add (int a, int b, int c, int d){
        return add( add(a,b), add(c,d));
    }


    // 3. morningGreeting


    public static String morningGreeting(String name) {
        return "早上好, " + name +"!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name +"!";
    }

    // 5. triple
    public static String triple (String m) {
        return m +m+m;
    }

    // 6. half
    public static double half(int a) {
        return (a/2.0);
    }

    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double a){
        return (int)(a + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double a){
        return (int)(a-0.5);
}
}
