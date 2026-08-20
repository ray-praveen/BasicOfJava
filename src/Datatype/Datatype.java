

static  void main() {

    // Numeric DT - short, byte, int, long

//    byte num1 = 500;
    byte num1= 127;
    System.out.println(num1);

//    short num2 = 500000;
    short num2 = 32767;
    System.out.println(num2);


    int num3 = 50000;
//
    long num4 = 329421370;
    System.out.println(num3);
    System.out.println(num4);


    //floating DTs
    float num5 = 3.142436f;
    System.out.println(num5);

    double num6 = 3.1424345464777779;
    System.out.println(num6);

    //other - Char, boolean

    boolean eligibleToVote = true;
    System.out.println(eligibleToVote);
//
    char firstCharacter = 'a';
    System.out.println("My first character " + firstCharacter);

    // ASCI Value concept

    char secondCharacter = 'a';
    System.out.println("My first character " + secondCharacter + 2);
    System.out.println("My first character " + (char)(secondCharacter + 2));

    // Implicit Conversions

    byte num7 = 127;
    long newNum = num7;
    System.out.println(newNum);

    // Explicit Conversions (typecasting)

    long value1 = 123456789;
//    long value1 = 12345678999; // data lose occure if range of int is out
    int value2 = (int)value1; // typecasting: forcefully insert
    System.out.println(value2);




}