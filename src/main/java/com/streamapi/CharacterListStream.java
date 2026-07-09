package com.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;



public class CharacterListStream {

    public static void main(String[] args) {


        String str = "java is a programming language";

        // Convert String to Character Array
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        // Convert Character Array to String
        char[] chars1 = {'J', 'a', 'v', 'a'};
        String str1 = new String(chars1);
        System.out.println(str1);

        // Convert String to List<Character>
        List<Character> characterLists = str.chars().mapToObj(c -> (char) c).toList();
        System.out.println(characterLists);


        // Convert String to Stream<Character>
        str.chars().mapToObj(c -> (char) c).forEach(System.out::println);

        // Reverse a String using Stream
        String reverseString = new StringBuilder(str).reverse().toString();
        System.out.println(reverseString);

        // Count Vowels using Stream
        long vowelCount = str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
        System.out.println(vowelCount);

        List<Character> vowels = str.toLowerCase().chars().mapToObj(c -> (char) c).filter(c -> "aeiou".indexOf(c) != -1).toList();
        System.out.println(vowels);

        // Count Consonants
        long consonantCount = str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) == -1).count();
        System.out.println(consonantCount);

        List<Character> consonants = str.toLowerCase().replace(" ", "").chars().mapToObj(c -> (char) c).filter(x -> "aeiou".indexOf(x) == -1).toList();
        System.out.println(consonants);

        // Remove Duplicate Characters
        String result = str.toLowerCase().chars().distinct()
                .mapToObj(c -> String.valueOf((char)c))
                 .collect(Collectors.joining());

        System.out.println(result);

        // Find Duplicate Characters

        List<Character> duplicateCharacters= str.toLowerCase().replace(" ","").chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(x->x, Collectors.counting()))
                .entrySet()
                .stream().filter(x -> x.getValue()>1)
                .map(Map.Entry::getKey).toList();

        System.out.println(duplicateCharacters);

        // First Non-Repeated Character
        Character nonRepeatingCh = str.toLowerCase().replace(" ","").chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(x->x, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue()==1)
                .map(x->x.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(nonRepeatingCh);

        // First Repeated Character
        Character repeatingCh = str.toLowerCase().replace(" ","").chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(x->x, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue()>1)
                .map(x->x.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(repeatingCh);


        // Count Frequency of Each Character
        Map<Character, Long> characterFrequencyCount= str.toLowerCase().replace(" ","")
                .chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));

        System.out.println(characterFrequencyCount);


        // Check Palindrome
         String pallindromeString="madam";
         boolean checkPallindrome = pallindromeString.toLowerCase().equals(new StringBuilder(pallindromeString).reverse().toString());
          if(checkPallindrome){
              System.out.println("String is pallindrome");
          }
          else{
              System.out.println("String is not pallindrome");
          }

          // Find Longest Word
        String sentence = "Java Spring Boot Microservices";
          String longestWord= Arrays.stream(sentence.split(" ")).max(Comparator.comparing(x->x.length())).orElse("");
        System.out.println(longestWord);

        // Count Words
        long wordCount= Arrays.stream(sentence.split(" ")).count();
        System.out.println(wordCount);


        // Sorted Characters
        String unsortedString="dcab";
        String sorted= unsortedString.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(sorted);

    }
}
