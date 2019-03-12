public class SubClass extends InheritancePrinciple{
    public static void main(String[] args) {
        Integer sal = new Integer(5);
        for(int i = 2; i< 13; i+=2){
            sal+=i;
        }
        System.out.println(sal);

    }
}
