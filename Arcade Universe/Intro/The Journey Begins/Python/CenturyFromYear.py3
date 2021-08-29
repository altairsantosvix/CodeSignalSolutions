def centuryFromYear(year):
    rd =  year % 100
    if rd > 0: 
       return int(year/100) + 1
    else:     
       return int(year /100)