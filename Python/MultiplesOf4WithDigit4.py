    def isThereA4InTheNumber(number):
        length = len(number);
        count = 0;
        
        for i in range(0, length, 1):
            if number[i] == '4':
                count += 1;
                
            if count >= 1:
                return True;
                
        return count >= 1;
     
    for i in range(4, 101, 4):
        if isThereA4InTheNumber(str(i)):
            print(i);
