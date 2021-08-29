
func checkPalindrome(inputString string) bool {
	var lastI = len(inputString) - 1
	for i := range inputString {
		if inputString[i] != inputString[lastI] {
			return false
		}
		lastI--
	}
	return true
}
