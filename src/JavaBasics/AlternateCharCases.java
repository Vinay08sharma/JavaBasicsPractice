package JavaBasics;

public class AlternateCharCases {

    public static void main(String[] args) {

        String s = "hasdjhajsdh asdjdasjd dbfhgGSAYUSAYSUIY JHHsjdbsdhhsd HJDHHDSHDxcbnfbdb sdbsh sdhhsjkdh dsd";

       char[] arr =  s.toCharArray();

        for(int i =0; i<arr.length;i=i+2) // to print odd positions characters in uppercase
        {
            arr[i] = Character.toUpperCase(arr[i]);
        }
        System.out.println(new String(arr));


    }
}
