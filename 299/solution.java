class Solution {
    public String getHint(String secret, String guess) {
       int bulls = 0, cows = 0;
        /* Stores the digits within 'secret' */
        int[] secretDigits = new int[10];
        /* Stores the index where the guess was correct */
        boolean[] correct = new boolean[secret.length()];
        /* If correct, increase bulls count. Otherwise, update 'secretDigits' array */
        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                correct[i] = true;
            }
            else secretDigits[secret.charAt(i) - '0']++;
        }
        /* Traverse 'guess' and find all cows using 'secretDigits' */
        for(int i = 0; i < guess.length(); i++) {
            if(!correct[i] && secretDigits[guess.charAt(i) - '0'] > 0) {
                secretDigits[guess.charAt(i) - '0']--;
                cows++;
            }
        }
        return bulls + "A" + cows + "B"; 
    }
}