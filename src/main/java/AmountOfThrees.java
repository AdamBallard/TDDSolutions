public class AmountOfThrees {

    public int returnAmountOfThrees(int[] arr){

        int amount = 0;
        for(int i : arr){
            if(i == 3){
              amount++;
            }
        }
        return amount;
    }

    public int [] createArrayWithThrees(int length){
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3;
        }
        return arr;
    }
}
