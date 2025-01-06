public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        byte myByte = (byte) 128;
        //Observe NetBeans' complaint

        
        //Declare and initialize a short with a value of 128
        short myShort = 128;
        //Create a print statement that casts this short to a byte
           byte casted = (byte) myShort;
            System.out.println("Casted btye from short" + casted);
        
        
        //Declare and initialize a byte with a value of 127
        byte myByte1 = (byte) 127;
        //Add 1 to this variable and print it
        myByte1++;
        System.out.println("Adding 1 to byte" + myByte1);

        //Add 1 to this variable again and print it again
         myByte1++;
        System.out.println("Adding 1 again to byte" + myByte1);
        
        
    }    
}
