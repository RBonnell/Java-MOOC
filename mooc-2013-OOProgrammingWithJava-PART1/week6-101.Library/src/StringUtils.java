/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class StringUtils {
    public static boolean included(String word, String searched){
        if (word == null || searched == null){
            return false;
        }
        if (word.trim().toUpperCase().contains(searched.trim().toUpperCase())){
            return true;
        }
        return false;
    }
}
