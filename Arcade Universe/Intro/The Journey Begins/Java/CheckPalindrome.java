boolean checkPalindrome(String inputString) {
    StringBuilder reverse = new StringBuilder();
        String cleanStr = inputString.replaceAll("\\s+", "").toLowerCase();
        char[] arrStr = cleanStr.toCharArray();
        for (int i = arrStr.length - 1; i >= 0; i--) {
            reverse.append(arrStr[i]);
        }
        return (reverse.toString()).equals(cleanStr);
        
    }