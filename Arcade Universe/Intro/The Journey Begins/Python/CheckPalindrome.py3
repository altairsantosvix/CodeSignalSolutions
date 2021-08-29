def checkPalindrome(inputString):
    reverse = inputString[::-1]
    if (reverse == inputString):
        return True
    else:
        return False
