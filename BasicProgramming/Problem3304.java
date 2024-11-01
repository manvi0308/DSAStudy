package BasicProgramming;
import javax.crypto.AEADBadTagException;

public class Problem3304 {
    public char kthCharacter(int k) {
        // initial word is "a"
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        System.out.println(sb.toString());
        while (sb.length() < k) {
            System.out.println("inside while");
            StringBuffer temp = new StringBuffer();
            // one by one loop through each character of sb and append the next char of sb
            // to sb
            for (int i = 0; i < sb.length(); i++) {
                char ch = sb.charAt(i);
                if ((int) ch + 1 < 122) {
                    char nextChar = (char) ((int) ch + 1);
                    temp.append(nextChar);
                } else
                    temp.append("a");

            }
            sb.append(temp);
            System.out.println(sb);
        }

        return sb.charAt(k - 1);
    }

    public static void main(String[] args) {
        int k = 10;
        Problem3304 p = new Problem3304();
        System.out.println(p.kthCharacter(k));
    }
}
