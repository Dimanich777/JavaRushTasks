public class Test {
    public static void main(String[] args) {
        int [] m = {1,6,2,5,3,1};


        for (int i =0; i<m.length; i++){
             int num = m[i];
             for (int j=i-1; j>=0; j--){
                 int leftnum = m[j];


                 if (num<leftnum){
                     m[j+1]= leftnum;
                     m[j]=num;
                 }
                 else {break;}
             }




         }
        for(Integer t: m){
            System.out.println(t+"");}
    }
}