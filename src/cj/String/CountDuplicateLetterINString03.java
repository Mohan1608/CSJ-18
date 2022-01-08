package cj.String;

class CountDuplicateLetterINString {


    //1.method


/*    public static void main(String[] args) {
        String str="Success cyber cyber success";
        char[] str1=str.toCharArray();

        StringBuilder s1=new StringBuilder();

        for (int i =0;i<str1.length;i++) {
            String str2 = new String(s1);
            int count = 0;
            boolean flag = false;
            for (int j = 0; j < str1.length; j++) {
                if (str2.contains(String.valueOf(str1[i]))) {
                     continue;
                }else if(str1[i]==str1[j]){
                    flag=true;
                    count++;
                }
            }
            if (flag){
                System.out.println(str1[i] +"="+count);
                s1.append(str1[i]);
            }


        }
    }
}*/

    //2 method

    public static void main(String[] args) {
        String s="success cyber cyber success";

        for (char i='a'; i <'z';i++) {
            int count=0;
            for (int j =0;j<s.length();j++) {
                if(i==s.charAt(j)){
                    count++;
                }
            }
            if (count>0){
                System.out.println(i+" = "+count);
            }
        }

    }
}


