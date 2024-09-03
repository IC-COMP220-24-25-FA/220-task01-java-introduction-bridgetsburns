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
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
