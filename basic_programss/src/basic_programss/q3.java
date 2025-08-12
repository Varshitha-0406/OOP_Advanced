package basic_programss;
public class q3 {
    public static void main(String[] args) {
        int numInt = 123456789;
        long numLong = numInt;           
        float numFloat = numLong;        
        System.out.println("Original int value      : " + numInt);
        System.out.println("After widening to long  : " + numLong);
        System.out.println("After widening to float : " + numFloat);
        if (numInt == (int)numFloat) {
            System.out.println("\n✅ No data loss during widening conversion.");
        } else {
            System.out.println("\n⚠️ Data may be lost in float conversion.");
        }
    }
}
