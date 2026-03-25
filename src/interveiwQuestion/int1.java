package interveiwQuestion;

//asked in golbal logic
/*
5
54
543
5432
54321
 */

public class int1 {
    static String printPattern(){
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=5;i++){
            for(int j=5;j>=6-i;j--){
                sb.append(j);
            }
            sb.append('\n');
        }
        return sb.toString();
    };

    public static void main(String[] args) {
        String ans = printPattern();
        System.out.println(ans);
    }


}
