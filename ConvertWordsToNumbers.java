// Prblem Statement: you are give a words ( one hundred twenty five) and we need to convert them to integers(125).

// ex;2
// input: hundread
// output: 100

// ex;1
// intput: one thousand two hundread thirty four.
// output: 1234.

import java.util.HashMap;
import java.util.Map;

public class ConvertWordsToNumbers {
    private static final Map<String, Integer> words = new HashMap<>();

        static {
            words.put("zero", 0);
            words.put("one", 1);
            words.put("two", 2);
            words.put("three", 3);
            words.put("four", 4);
            words.put("five", 5);
            words.put("six", 6);
            words.put("seven", 7);
            words.put("eight", 8);
            words.put("nine", 9);
            words.put("ten", 10);
            words.put("eleven", 11);
            words.put("twelve", 12);
            words.put("thirteen", 13);
            words.put("fourteen", 14);
            words.put("fifteen", 15);
            words.put("sixteen", 16);
            words.put("seventeen", 17);
            words.put("eighteen", 18);
            words.put("nineteen", 19);
            words.put("twenty", 20);
            words.put("thirty", 30);
            words.put("forty", 40);
            words.put("fifty", 50);
            words.put("sixty", 60);
            words.put("seventy", 70);
            words.put("eighty", 80);
            words.put("ninety", 90);
            words.put("hundred", 100);
            words.put("thousand", 1000);
            words.put("lakh", 100000);
            words.put("crore", 10000000);


        }

        // ?mehtod to convert wotds to number.
        public static int wordtonum(String input){
            String[] tokens = input.toLowerCase().split("[ -]"); // this will handles th input given by the user.
            int total = 0;
            int current = 0;
            
            for(String token : tokens){  // iterating the entire map and parsing the tokens
                if(!words.containsKey(token)) continue; 
 
                int value = words.get(token); // geting the value of the token from the map.
                if(value == 100){               // check if the value is = 100.
                    if(current == 0) current = 1; // if the condition is true then set surren to 1 to multiply with the 100.
                    current *= 100;
                }else if(value == 1000){         // do the same check for 1000 too.
                    if(current == 0) current = 1; // set current
                    total += current * 1000;    // add the value to the total.
                    current = 0;                  // reset the current to 0.
                }else{
                    current +=value;           // if it is not equalls to both 1k and hunderd add the value to the current
                }
            }
            return total + current;
        }

        // main
        public static void main(String[] args) {
            System.out.println(wordtonum("hundred"));             // 100
            System.out.println(wordtonum("two hundred"));         // 200
            System.out.println(wordtonum("five thousand"));       // 5000
            System.out.println(wordtonum("one thousand two hundred thirty four")); // 1234
            System.out.println(wordtonum("ten thousand one hundred"));             // 10,000
            System.out.println(wordtonum("lakh"));             // 100

            System.out.println(wordtonum("crore"));             


        }
    }
