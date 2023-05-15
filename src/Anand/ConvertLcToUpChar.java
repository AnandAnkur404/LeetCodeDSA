package Anand;

public class ConvertLcToUpChar {
    public static void main(String[] args) {
        String str = "GrEat anKUr";
        StringBuffer newStr = new StringBuffer(str);

        int len = str.length();
        for (int i = 0; i < len; i++) {
            if(Character.isLowerCase(str.charAt(i))){
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(newStr);
    }
}

