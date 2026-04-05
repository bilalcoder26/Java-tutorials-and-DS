package interveiwQuestion;

//asked in global logic
// input ---> aabcccccaaaa
//output ---> a2b1c5a4


public class Int2 {

    static String countString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        return sb.length() < str.length() ? sb.toString() : str;
    }

    public static void main(String[] args) {
        System.out.println(countString("aabcccccaaaa"));
    }
}
