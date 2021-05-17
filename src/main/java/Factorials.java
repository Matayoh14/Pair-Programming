public class Factorials {

    public int reverseFactorial(int input){ //120
        int output = -1;
        for(int i = 2; input > 1; i++ ){
            if(input%i != 0){
                return -1;
            }
            input /= i;
            output = i;
        }
        return output;
    }

}
