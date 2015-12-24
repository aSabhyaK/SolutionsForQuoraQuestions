    def doesTheDesignatedChracterExist(number, character):
        length = len(number);
        
        for i in range(0, length, 1):
            if(number[i] == character):
                return True;
                
        return False;
        
    two_count = 0;
     
    for i in range(9999, 1000, -1):
        if(doesTheDesignatedChracterExist(str(i), '2')):
            two_count += 1;
        
    print(two_count);
