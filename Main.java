
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static String SortBySentences(String s){
        String s1[] = s.split("\n");
        Arrays.sort(s1, Comparator.comparingInt(String::length));
        if (s1 == null)
            return "null";

        int iMax = s1.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();

        for (int i = 0; ; i++) {
            b.append(String.valueOf(s1[i]));
            if (i == iMax)
                return b.append(' ').toString();
            b.append(",\n");
        }
    }
    static String SortByWords(String s){

        String s1[] = s.split("\n");
        for (int i = 0; i <s1.length ; i++) {
            String s2[] =s1[i].split(" ");
            Arrays.sort(s2, Comparator.comparingInt(String::length));
            s1[i]="";
            for (int j = 0; j <s2.length ; j++) {
                s1[i]+=s2[j]+" ";
            }
        }
        if (s1 == null)
            return "null";

        int iMax = s1.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();

        for (int i = 0; ; i++) {
            b.append(String.valueOf(s1[i]));
            if (i == iMax)
                return b.append(' ').toString();
            b.append(",\n");
        }

    }
    static   String SortByTokens(String s,String Token){


        String s1[] = s.split("\n");

        String sort[] = new String[s1.length];
        Integer count[]= new Integer[s1.length];
        Integer countIndex[]= new Integer[s1.length];
        for (int i = 0; i < s1.length; i++) {
            count[i]=0;
            countIndex[i]=0;
            String s2[] =s1[i].split(" ");
            for (int j = 0; j <s2.length ; j++) {
            if (s2[j].contains(Token)) {
                count[i]++;
                countIndex[i]++;
            }
        }
        }

        Arrays.sort(count, Collections.reverseOrder());
        for (int i = 0; i <count.length ; i++) {
            for (int j = 0; j <countIndex.length ; j++) {
                if(countIndex[i]==count[j]) {

                    sort[j] = s1[i];
                }
            }


        }




        if (sort == null)
            return "null";

        int iMax = sort.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();

        for (int i = 0; ; i++) {
            b.append(String.valueOf(sort[i]));
            if (i == iMax)
                return b.append(' ').toString();
            b.append(",\n");
        }
    }

    public static void main(String[] args) {

        //1.1 Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
        /*
        String[] strings = {"SomeString", "CamelCase", "SnakeCase"};
        Pattern p = Pattern.compile("\\B([A-Z])");
        for (int i = 0; i < strings.length; i++) {
            Matcher m = p.matcher(strings[i]);
            StringBuffer strb = new StringBuffer();
            while (m.find()) {
                m.appendReplacement(strb, "_$0");
            }
            m.appendTail(strb);
            strings[i] = strb.toString().toLowerCase();
        }
        System.out.println(Arrays.toString(strings));
         */
        //1.2 Замените в строке все вхождения 'word' на 'letter'.

       /* String s="word and word and word!".replaceAll("word","letter");
        System.out.println("String:");
        System.out.println(s);
        */
        //1.3 В строке найти количество цифр.

       /*
       String my_string = "some 300 mo 500; dasda 350. asdsaq 456 ,";
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(my_string);
       int count = 0;

        while (m.find()) {

            count++;
        }

        System.out.println("count: " + count);
        */
//1.4 В строке найти количество чисел.
/*

        String my_string = "some 300 mo 5; dasda 350. asdsaq 456 ,";
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(my_string);
        int count = 0;

        while (m.find()) {
    if (
            Integer.parseInt(m.group())>0 && Integer.parseInt(m.group()) <9)
            count++;

        }

        System.out.println("count: " + count);

 */
//1.5 Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.
        /*
        String x = "das dasda   das dqwdq asdas  adsa        adsadsa";

        while(x.contains("  ")) {
            String replace = x.replace("  ", " ");
            x=replace;

        }
        System.out.println(x);
*/
        //2.1 Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
        /*
        String x = "das dasda   das dqwdq asdas  adsa        adsadsa";
        int count=0;
        int count1=0;
        for (int i = 0; i < x.length(); i++) {

            if(x.charAt(i)==' ') {
                count++;
                if(count1<count){
                    count1=count;
                }
            }

            else {
                count=0;

            }
        }
        System.out.println(count1);

         */
        //2.2 В строке вставить после каждого символа 'a' символ 'b'.
        /*
        String x = "das dasda   das dqwdq asdas  adsa        adsadsa";
        System.out.println(x.length());
            String replace = x.replace("a", "ab");
            x=replace;

        System.out.println(x);
         */
        //2.3 Проверить, является ли заданное слово палиндромом
        /*
        String x = "dad";
        System.out.println( x.equals((new StringBuilder(x)).reverse().toString()));
*/
        //2.4 С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
/*
        String x = "информатика";
        String x1 = "";

        x1= x.charAt(8)+""+x.charAt(4)+""+x.charAt(5)+""+x.charAt(8)+"";

        System.out.println(x1);


 */
        //2.5 Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
        /*
        String x = "das dasda   das dqwdq asdas  adsa        adsadsa";
        int count=0;

        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)=='a') {
                count++;

            }
        }
        System.out.println(count);
         */
        //2.6 Из заданной строки получить новую, повторив каждый символ дважды.
        /*
        String x = "das dasda   das dqwdq asdas  adsa        adsadsa";

        for (int i = -256; i <=256 ; i++) {

           char c= (char)i;
            String replace = x.replace(c+"", c+""+c);
            x = replace;
        }
        System.out.println(x);
         */
        //2.7 Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef".
        /*
        String x = "das dddaasdaa   das dqwdq asdas  adsa        adsadsa";
        while (x.contains(" ")) {

            String replace = x.replace(" ", "");
            x = replace;

        }
        for (int i = -256; i <= 256; i++) {
            char c = (char) i;
            if(x.contains(c+""+c)) {
                String replace = x.replace(c + "" + c,c + "" );
                x = replace;
                i--;
            }
        }
        System.out.println(x);
         */
        //2.8 Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
        /*
        String x = "das adsads   das dqwdq asdas  adsa        adsadsa";
        int count=0;
        int count1=0;
        int pastMax=0;
        String x1="";
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)==' ') {
                pastMax=count1;
                count=0;
                x1="";
            }
            else {
                count++;
                x1+=x.charAt(i);
                if(count1<count){
                    count1=count;
                }
            }
        }
        if(pastMax==count1){
            System.out.println("we have 2 or more strings of the same length ");
        }
        else {
            System.out.println(x1);
        }
         */
        //2.9 Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.
        /*
        String x = "das dasda   das DDEwdq asdas  adsa        adsadsa";
        int count=0;
        int count1=0;


        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)>='a'&&x.charAt(i)<='z') {
                count++;

            }
            else if(x.charAt(i)>='A'&&x.charAt(i)<='Z')  {
                count1++;

            }
        }
        System.out.println("we have "+count+" low case letters");
        System.out.println("and "+count1+" high case letters");
         */
        //2.10 Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком. Определить количество предложений в строке X.
/*
        String x = "das. dasda?   das! dqwdq asdas  adsa        adsadsa";
        int count=0;

        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)=='.'||x.charAt(i)=='!'||x.charAt(i)=='?') {
                count++;

            }
        }
        System.out.println(count);

 */
        //3.1 Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.

     /*   String s;
        int Case= 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Text");
        s= "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n" +
                "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.\n" +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n";

       System.out.println("Enter operation\n" +
                "1 - sort by number of sentences\n" +
                "2 - sort sentences by word size\n" +
                "3 - sort by tokens");
        Case=sc.nextInt();
        switch (Case){
            case 1:
                System.out.println(SortBySentences(s)); break;
            case 2:
                System.out.println(SortByWords(s)); break;
            case 3 :
                System.out.println("Enter token");
                System.out.println(SortByTokens(s,sc.next()));break;
            default:
                System.out.println("Incorrect input"); break;
        }


      */

        //3.2 Дана строка, содержащая следующий текст (xml-документ):
        /*
        String str = "<notes> \n" +
                "   <note id = \"1\"> \n" +
                "       <to>Вася</to> \n" +
                "       <from>Света</from> \n" +
                "       <heading>Напоминание</heading> \n" +
                "       <body>Позвони мне завтра!</body> \n" +
                "   </note> \n" +
                "   <note id = \"2\"> \n" +
                "       <to>Петя</to> \n" +
                "       <from>Маша</from> \n" +
                "       <heading>Важное напоминание</heading> \n" +
                "       <body/> \n" +
                "   </note> \n" +
                "</notes>";

        String regex = "(<[a-z]+>|<[a-z]+.id.+>)|(</[a-z]+>)|([А-Я].+[а-я][!]?)|(<[a-z]+/)";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                System.out.println(matcher.group(1) + " - OPEN TAG.");
            } else {
                if (matcher.group(2) != null) {
                    System.out.println(matcher.group(2) + " - END TAG.");
                } else {
                    if (matcher.group(3) != null) {
                        System.out.println(matcher.group(3) + " - CONTENT TAG.");
                    } else {
                        if (matcher.group(4) != null) {
                            System.out.println(matcher.group(4) + " - TAG WITHOUT BODY.");
                        }
                    }
                }
            }
        }

         */




    }



}