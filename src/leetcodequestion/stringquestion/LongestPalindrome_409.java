package leetcodequestion.stringquestion;

/*
Given a string s which consists of lowercase or uppercase letters, return the length of the
longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.
Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.


Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.
 */

import java.util.HashMap;
import java.util.HashSet;

public class LongestPalindrome_409 {
    static int longestPalindrome(String strs){
        HashMap<Character,Integer> freqMap = new HashMap<>();
        int res =0;
        int oddCount =0;
        for(Character ch : strs.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) +1);
            int currentFreq = freqMap.get(ch);
            if(currentFreq % 2 == 0){
                res += 2;
                oddCount--;
            }else {
                oddCount++;
            }
        }
        if(oddCount > 0){
            res +=1;
        }
        System.out.println(freqMap);
        return res;
    }

    // more optimized using set
    static  int longestPalindromeOptimized(String strs){
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        for(Character ch: strs.toCharArray()){
            if(set.contains(ch)){
                res += 2;
                set.remove(ch);
            }else{
                set.add(ch);

            }

        }
        if(set.size() > 0){
            res += 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int ans = longestPalindrome("abccccdd");
        System.out.println(ans);
        int ans2 = longestPalindromeOptimized("abccccdd");
        System.out.println(ans2);
    }
}

/*
🔑 Core Intuition (MOST IMPORTANT)

Palindrome ke liye:

Even frequency characters → full use
Odd frequency characters → (freq - 1) use + 1 center allowed

👉 Matlab:

Har pair = +2 length
Ek hi odd character center me aa sakta hai
✅ Approach 1: HashMap (Frequency Based)
💡 Idea
Har character ka frequency count karo
Jab frequency even hoti hai → pair mil gaya → +2
Odd count track karo

🔄 Flow Samajh Lo (IMPORTANT)

Example: "abccccdd"

| Step | Char | Freq | Action | res | oddCount |
| ---- | ---- | ---- | ------ | --- | -------- |
| a    | 1    | odd  | odd++  | 0   | 1        |
| b    | 1    | odd  | odd++  | 0   | 2        |
| c    | 1    | odd  | odd++  | 0   | 3        |
| c    | 2    | even | +2     | 2   | 2        |
| c    | 3    | odd  | odd++  | 2   | 3        |
| c    | 4    | even | +2     | 4   | 2        |
| d    | 1    | odd  | odd++  | 4   | 3        |
| d    | 2    | even | +2     | 6   | 2        |

👉 Final:

res = 6
oddCount > 0 → +1

✅ Answer = 7
 */

/*
🚀 Approach 2: HashSet (Optimized & Elegant)
💡 Idea (VERY IMPORTANT)

👉 Pair milte hi remove kar do

Agar character pehle se set me hai → pair mil gaya → remove + res += 2
Agar nahi hai → add kar do
🔄 Flow

Example: "abccccdd"

| Char | Set State | Action | res |
| ---- | --------- | ------ | --- |
| a    | {a}       | add    | 0   |
| b    | {a,b}     | add    | 0   |
| c    | {a,b,c}   | add    | 0   |
| c    | {a,b}     | remove | 2   |
| c    | {a,b,c}   | add    | 2   |
| c    | {a,b}     | remove | 4   |
| d    | {a,b,d}   | add    | 4   |
| d    | {a,b}     | remove | 6   |

 */

/*
| Feature           | HashMap   | HashSet       |
| ----------------- | --------- | ------------- |
| Intuition         | Frequency | Pair matching |
| Code length       | Medium    | Short         |
| Interview clarity | High      | Very high     |
| Optimization      | Good      | Best          |

 */

/*
🧠 Memory Trick (REVISION GOLD)

👉 “Pair banao → +2, ek odd center allowed → +1”

OR

👉 “Remove pairs, leftover me se ek use karo”
 */
