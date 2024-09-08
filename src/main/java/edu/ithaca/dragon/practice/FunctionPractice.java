package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0 || second < 0 || third < 0){
            throw new IllegalArgumentException("Values must be greater than 0");
        }
        else{
            int largestValue = first;
            if (second > largestValue){
                largestValue = second;
            }
            if (third > largestValue){
                largestValue = third;
            }
            return largestValue;
        }

    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        if (originalPrice < 0 || discountPercent < 0 || salesTax < 0){
            throw new IllegalArgumentException("All values should be greater than 0");
        }
        else{
        if (salesTax > 1){
            salesTax = salesTax / 100;
        }
        if (discountPercent > 1 ){
            discountPercent = discountPercent / 100;
        }
        double discountPrice = originalPrice - (originalPrice * discountPercent);
        return (discountPrice + (discountPrice * salesTax));
    }
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (yearsOld < 0 || daysSinceShoesChewed < 0){
            throw new IllegalArgumentException("Values must be greater or equal to 0");
        }
        else{
            if (fetchedThePaperToday){
                return true;
            }
            if (daysSinceShoesChewed != 0){
                return true;
            }
            return false;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.size() == 0){
            return -1;
        }
        else{
            int largestNumber = 0;
            for (int i = 1; i< numbers.size(); i++){
                if (numbers.get(i) > numbers.get(largestNumber)){
                    largestNumber = i;
                }
            }
        return largestNumber;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.size() == 0){
            return -1;
        }
        else{
            int largestNumber = 0;
            for (int i = 1; i< numbers.size(); i++){
                if (numbers.get(i) >= numbers.get(largestNumber)){
                    largestNumber = i;
                }
            }
        return largestNumber;
        }
    }

    public static int countCharacterOccurences(String word, char letter){
        int count = 0;
        for (char character = 0; character < word.length(); character++){
            if (word.charAt(character) == letter){
                count++;
            } 
        }
        return count;
    }
    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        if (words.size() == 0){
            String stringToReturn = "None";
            return stringToReturn;
        }
        String stringToReturn = words.get(0);
        int maxOccurrences = 0;
        for (int word = 0; word < words.size(); word++){
            int occurrences = countCharacterOccurences(words.get(word), letter);
            if (occurrences > maxOccurrences) {
                maxOccurrences = occurrences;
                stringToReturn = words.get(word);
        }
        if (maxOccurrences == 0) {
            return "None";
        }

    }
    return stringToReturn;
}
}



