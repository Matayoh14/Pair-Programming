public class Goldilocks {



    public String findChairs(String input){
       /* "100\t100\n" +
                "30\t30\n" +
                "130\t130\n" +
                "90\t90\n" +
                "150\t150\n" +
                "120\t120\n" +
                "200\t200\n" +
                "110\t110" */

        String output = "";
        int GoldW = 0;
        int GoldT = 0;
        int count = 1;

        String[] lines = input.split("\n");
        for(int i = 0; i < lines.length; i++){
            String[] weightTemp = lines[i].split("\t");
            if(i == 0){
                GoldW = Integer.parseInt(weightTemp[0]);
                GoldT = Integer.parseInt(weightTemp[1]);
            }
            else{
                if(GoldW <= Integer.parseInt(weightTemp[0]) && GoldT >= Integer.parseInt(weightTemp[1])){
                    output += i;
                    if(count%2 == 0){
                        output += "\n";
                    } else{
                        output += "\t";
                    }
                    count++;
                }
            }
        }
        return output;
    }
}
