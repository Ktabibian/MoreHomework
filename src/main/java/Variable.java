public class Variable {
    public static void main(String[] args) {

        //String and Char example
        String firstName = "Kyle ";  //Stores text, String values are surrounded by double quotes
        String lastName = "Tabibian";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        char middleInitial = 'A';  //Stores single characters, Char values are surrounded by single quotes
        System.out.println(firstName + middleInitial + " " + lastName);

        //Integers, Bytes, Shorts, and Longs
        int a = 4;  //Stores whole numbers from -2,147,483,648 to 2,147,483,647
        int b = 8;
        byte c = -15;  //Stores whole numbers from -128 to 127
        short d = 25000;  //Stores whole numbers from -32,768 to 32,767
        long e = 470206872;  //Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println(a + b + c);

        //Floats and Doubles
        float f = 18.52f;  //Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double g = 6.9;  //Stores fractional numbers. Sufficient for storing 15 decimal digits\

        //Boolean
        boolean iFeelLikeAFool = true;  //Stores values with two states: true or false
        boolean iWontNeedThisClass = false;
        System.out.println(iWontNeedThisClass);
        
    }
}
