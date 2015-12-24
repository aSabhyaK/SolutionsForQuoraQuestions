    def numberOfNumbersDivisibleByANumber(start, end, number):
        final_number = -1;
        initial_number = -1;
        
        if(start == 0):
            start += 1;
        
        for i in range(0, number, 1):
            if((start + i) % number == 0):
                initial_number = start + i;
                break;
        
        for i in range(0, number, 1):
            if((end - i) % number == 0):
                final_number = end - i;
                break;
            
        return ((final_number - initial_number) / number) + 1;
        
    print(int(numberOfNumbersDivisibleByANumber(0, 500, 12)));
