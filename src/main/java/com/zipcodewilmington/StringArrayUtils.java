package com.zipcodewilmington;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) { return array[0]; }

    /**
     * @param array array of String objectsas
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        return Arrays.asList(array).contains(value);

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {


        String[] array1;

        List<String> list= Arrays.asList(array);
        Collections.reverse(list);
        array1 = list.toArray(array);

        return array1;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] array1;
        int i=0;
        int j = array.length-1;
        int c=0;

        List<String> list= Arrays.asList(array);
        Collections.reverse(list);
        array1 = list.toArray(array);

        for (i=0; i<array.length-1; i++) {
            if (array[i] == array1[j]) {
                c++;
                j--;

            }
        }

        if (c==array.length-1)
            {
            return true; }
        else
            return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {


        StringBuffer strbfr = new StringBuffer();
        String ab = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        String str = "";

        for (int i = 0; i < array.length; i++) {
            strbfr.append(array[i]);
        }
        str = strbfr.toString().toLowerCase();

        for (int i = 0; i < 26; i++) {

            if (str.contains(String.valueOf(ab.charAt(i)))) {
                count++;
            }

        }

        if (count == 26)
            return true;
        else
            return false;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        List<String> list = new ArrayList<String> (Arrays.asList(array));
        list.remove(valueToRemove);
        array = list.toArray(new String[0]);

        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> list=new ArrayList<String>();

        for(int i=0;i<array.length;i++) {

            if (i + 1 < array.length && (array[i].equals(array[i+1]))) {

            } else {

                list.add(array[i]);
            }
        }
        String array1[]= list.toArray(new String[list.size()]);

        return array1;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        ArrayList< String>  s1 = new ArrayList<String>();

        StringBuffer strbfr = new StringBuffer("");
        boolean flag = false;
        int i=0;

        while (i < array.length-1) {

            if (array[i].equalsIgnoreCase(array[i + 1])) {
                flag = true;
                strbfr.append(array[i]);
            } else {
                if (flag) {
                    strbfr.append(array[i]);
                    s1.add(strbfr.toString());
                    strbfr = new StringBuffer("");
                } else {
                    s1.add(array[i]);
                }
                
                flag = false;
            }
            i++;

        }
        if (flag) {
            strbfr.append(array[i]);
            s1.add(strbfr.toString());
            strbfr = new StringBuffer("");
        } else {
            s1.add(array[i]);

        }

        String array1[]= s1.toArray(new String[s1.size()]);

        return array1;
    }


}
