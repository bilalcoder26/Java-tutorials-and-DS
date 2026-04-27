package leetcodequestion.arrayquestion;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println("prefix ---> " + Arrays.toString(prefix));
    }


}

/*
Prefix Sum ek simple but powerful concept hai jo arrays me use hota hai —
especially jab tumhe range queries ya repeated sum calculations fast karni ho.

🔹 Simple definition

Prefix sum ka matlab hai:

👉 Kisi index tak ke saare elements ka cumulative sum

🔹 Example se samajh

Agar array hai:

arr = [2, 4, 6, 8]

Toh prefix sum array banega:

prefix = [2, 6, 12, 20]

Kaise bana?

prefix[0] = 2
prefix[1] = 2 + 4 = 6
prefix[2] = 2 + 4 + 6 = 12
prefix[3] = 2 + 4 + 6 + 8 = 20
🔹 Formula
prefix[i] = prefix[i-1] + arr[i]

🔹 Use kyu karte hain?

Maan lo tumhe poocha:

👉 index 1 se 3 tak ka sum kya hai?

Without prefix sum:

4 + 6 + 8 = 18  → O(n)

With prefix sum:

prefix[3] - prefix[0] = 20 - 2 = 18  → O(1) 🚀
🔹 General Formula (Range Sum)
sum(l to r) = prefix[r] - prefix[l-1]

 */
