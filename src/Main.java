public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i:arr){
            if (i==value)
                return true;
        }
        return false;
    }



    public static void main(String[] args) {

        int[] list={1,3,4,6,7,4,4,8,10,8,8,8,13,14,17,19,20};
        int[] dublicate=new int[list.length];
        int startIndex=0;

        for (int i=0; i<list.length; i++){

                if (list[i]%2==0){
                    for (int j=i; j<list.length; j++) {
                        if (i!=j && list[i]==list[j]) {
                            if (!isFind(dublicate,list[j])) {
                                dublicate[startIndex++] = list[j];

                                break;
                            }
                        }

                    }

                }
            }
       // System.out.println(Arrays.toString(dublicate));
        for (int value: dublicate)
            if (value!=0){
                System.out.println(value);
            }

    }
}