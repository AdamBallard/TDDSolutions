public class Demo {

    public int[] replaceZerosWithOneArray(int[] myArray){

        if(myArray.length < 10 && myArray.length > 0){
            for (int i : myArray) {
                if( myArray[i] == 0){
                    myArray[i] = 1;
                }
            }
            return myArray;
        } else {
            System.out.println("You array needs to be within range (1-10)");
        }
        return myArray;
        }
}
