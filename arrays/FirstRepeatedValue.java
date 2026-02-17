package arrays;

public class FirstRepeatedValue {

    public static void main(String[] args){

        int[] a = {1,2,3,2,1,0};

        int repeatedValue = -1;
        boolean found = false;

        for(int i = 0 ; i < a.length && !found ; i++){

            for(int j = i+1; j < a.length ; j++){

                if(a[i] == a[j]){

                    repeatedValue = a[i];
                    found = true;
                    break;
                }
            }
        }

        System.out.println(repeatedValue);
    }
}

