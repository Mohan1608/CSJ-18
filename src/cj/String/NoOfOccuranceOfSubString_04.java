package cj.String;

class NoOfOccuranceOfSubString_03 {
    public static void main(String[] args) {
        String s = "mohan is studying mohan is surveying ing";
        String[] str1 = s.split(" ");
        char[] c = s.toCharArray();
        int count = 0;
        String sb1 = "ing";
        char[] d = sb1.toCharArray();
                for (int j = 0; j < 1; j++) {
            for (int i = 0; i < c.length; i++) {
                        if ((d[j] == c[i]) && (d[j + 1] == c[i + 1]) && (d[j + 2] == c[i + 2])) {
                            count++;
                        }
                    }
            }
        System.out.println(sb1 + " = " + count);
    }
}
