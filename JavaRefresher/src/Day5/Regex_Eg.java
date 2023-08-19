package Day5;

public class Regex_Eg {
    public static void main(String[] args) {
        String trannum = "abc1245%%6xyz";
//        for (int i = 0; i < trannum.length(); i++) {
//            char c = trannum.charAt(i);
//                if(Character.isDigit(c)){
//                    System.out.print(c);
//                }
//            }
//        char[] arr = trannum.toCharArray();
//        for (char a : arr){
//            if(Character.isDigit(a)){
//                System.out.print(a);
//            }
//        }
      //  System.out.println(trannum);

//generate number
        String num = trannum.replaceAll("[^0-9]","");
        String num1 = trannum.replaceAll("\\D","");
        System.out.println(num);
        System.out.println(num1);

        //generate words
        String words = trannum.replaceAll("[^a-zA-Z]","");
        System.out.println(words);



    }
    }

