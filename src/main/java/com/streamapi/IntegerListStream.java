package com.streamapi;
import java.util.*;
import java.util.stream.Collectors;


public class IntegerListStream {


        public static void main(String[] args) {

            List<Integer> numbers= Arrays.asList(20,25,5,9,1,2,3,3,4,5,6,6);

            System.out.println("Numbers:"+numbers);


            List<Integer> evenNumbers= numbers.stream().filter(n -> n%2==0)
                    .collect(Collectors.toList());
            // .toList();
            System.out.println("Even Numbers:"+evenNumbers);


            List<Integer> oddNumbers= numbers.stream().filter(n -> n%2!=0).collect(Collectors.toList());
            System.out.println("Odd Numbers:"+oddNumbers);


            List<Integer> squareOfEachNumber= numbers.stream().map( n -> n*n).collect(Collectors.toList());

            System.out.println("Square of each Numbers:"+squareOfEachNumber);

            int sum= numbers.stream().mapToInt(n -> n.intValue()).sum();
            System.out.println("Sum of Numbers:"+sum);

            int maxNum= numbers.stream().mapToInt(n -> n.intValue()).max().orElse(0);
            System.out.println("Maximum Number:"+maxNum);

            int minNum= numbers.stream().mapToInt(n -> n.intValue()).min().orElse(0);
            System.out.println("Minimum Number:"+minNum);

            List<Integer> removeDuplicates= numbers.stream().distinct().collect(Collectors.toList());
            System.out.println("After Removing Duplicates:"+removeDuplicates);

            List<Integer> sortAscending= numbers.stream().sorted().collect(Collectors.toList());
            System.out.println("After Ascending Sort:"+sortAscending);

            List<Integer> sortDesc= numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            System.out.println("After Descending Sort:"+sortDesc);

            Integer firstNumber= numbers.stream().findFirst().orElse(null);
            System.out.println("First Number:"+firstNumber);


            Integer findAnyNumber= numbers.stream().findAny().orElse(null);
            System.out.println("Any Number:"+findAnyNumber);

            // count numbers
            long countNumbers= numbers.stream().count();
            System.out.println("Total Numbers:"+countNumbers);

            // top 3 numbers
            List<Integer> top3Numbers= numbers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
            System.out.println("Top 3 Numbers:"+top3Numbers);

            // skip first 3 numbers
            List<Integer> skip3Numbers= numbers.stream().skip(3).collect(Collectors.toList());
            System.out.println("Skip 3 Numbers:"+skip3Numbers);

            // second highest number
            Integer secondHighestNumber= numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
            System.out.println("Second Highest Number:"+secondHighestNumber);

            // third highest number
            Integer thirdHighestNumber= numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);
            System.out.println("Third Highest Number:"+thirdHighestNumber);

            //second lowest number
            Integer secondLowestnumber = numbers.stream().distinct().sorted().skip(1).findFirst().orElse(null);
            System.out.println("Second Lowest Number:"+secondLowestnumber);

            // third lowest number
            Integer thirdlowestNumber = numbers.stream().distinct().sorted().skip(2).findFirst().orElse(null);
            System.out.println("Third Lowest Number:"+thirdlowestNumber);

            // check if any number greater than 10
            boolean checkNumberGreater10= numbers.stream().anyMatch(n -> n>10);
            System.out.println("Any Number Greater than 10:"+checkNumberGreater10);

            //number to comma separated string
            String commaSerateStringFromIntergerList= numbers.stream().map(n -> String.valueOf(n)).collect(Collectors.joining(","));
            System.out.println("Comma Separated String:"+commaSerateStringFromIntergerList);


        }


}
