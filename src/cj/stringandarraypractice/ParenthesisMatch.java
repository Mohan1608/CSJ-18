package cj.stringandarraypractice;

import java.util.Stack;


public class ParenthesisMatch{
    public static void main(String[] args) {


        String expression = "3x+(fjkl){floe}fe[efef]";
        System.out.println((isParenthesisMatch(expression)) ?
                "parenthesis match" : "parenthesis are not matching");
        //char[] exp = expression.toCharArray();

    }

        static boolean isParenthesisMatch(String exp) {
        if (exp.isEmpty()) return true;
            Stack<Character> st = new Stack<>();
          //  char pop;
            for (int i = 0; i < exp.length(); i++) {
                //   pop = exp.charAt(i);
                if (exp.charAt(i) == '('
                        || exp.charAt(i) == '['
                        || exp.charAt(i) == '{'
                        || exp.charAt(i) == '<') {
                    st.push(exp.charAt(i));
                } else if (exp.charAt(i) == ')'
                        || exp.charAt(i) == ']'
                        || exp.charAt(i) == '}'
                        || exp.charAt(i) == '>') {
                    if (st.isEmpty()) {
                    }
                    char last = st.peek();
                    if (exp.charAt(i) == ')' && last == '('
                            || exp.charAt(i) == ']' && last == '['
                            || exp.charAt(i) == '}' && last == '{'
                            || exp.charAt(i) == '>' && last == '<') {
                        st.pop();
                    } else return false;
                }
            }
            return st.isEmpty();
        }
}

