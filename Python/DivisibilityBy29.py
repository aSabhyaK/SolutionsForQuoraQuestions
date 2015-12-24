    def isTheDigitSum29(number):
        sum = 0;
        length = len(number);
        
        for i in range(0, length, 1):
            sum += ord(number[i]) - 48;
            
            if(sum > 29):
                return False;
                
        return sum == 29;
        
    for i in range(9999, 1000, -1):
        if(i % 29 == 0 and isTheDigitSum29(str(i))):
            print(i);
