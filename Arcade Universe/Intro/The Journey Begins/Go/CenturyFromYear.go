import (
	"math"
)

 func centuryFromYear(year int) int {
    return int(math.Floor(float64(year-1)/100) + 1)

 }
