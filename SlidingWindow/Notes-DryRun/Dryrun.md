## Problem3 - Longest substring without repeating characters

s = abcabcbb
- sliding window approach
- Keep on adding chars to hashmap along with their indices as key value pairs, once we get a character that is already presnet in the map, meaning we have to slide the window. 
- abcabcbb
- at right = 3 position, a character is already present so slide the window, but we cannot slide the window directly by 1 position as ** we are not sure where the repeating character is present **, so we will slide the window by the index where the repeating char is there.
-  left = Math.max(hm.get(s.charAt(right)) + 1, left);
