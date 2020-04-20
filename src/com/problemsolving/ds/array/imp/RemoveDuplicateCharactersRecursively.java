package com.problemsolving.ds.array.imp;

public class RemoveDuplicateCharactersRecursively {
    static boolean flag=true;
    static boolean changeflag=false;

    public static String traverse(String str){
        int i=0;
        int j=i+1;
        if(str.length()==0 || str.length()==1) {
            flag=false;
            return str;
        }
        StringBuilder stringBuilder=new StringBuilder(str);
        changeflag=false;
        for(;j<stringBuilder.length();){
            if(stringBuilder.charAt(i)==stringBuilder.charAt(j)){
                stringBuilder=stringBuilder.deleteCharAt(i);
                stringBuilder=stringBuilder.deleteCharAt(i);
                changeflag=true;
            }
            else{
                i++;
                j++;
            }
        }
        if(!changeflag)
            flag=false;

        return stringBuilder.toString();
    }


    public static String removeDuplicateCharacters(String str){
        if(!flag) return str;
        if(str==null || str.length()==0)
            return null;
        if(str.length()==1)
            return str;
        String newString=traverse(str);
        return removeDuplicateCharacters(newString);


    }

    public static void main(String[] args) {

        String str="caaabbbaacdddd";

        System.out.println(removeDuplicateCharacters(str));

    }
}
