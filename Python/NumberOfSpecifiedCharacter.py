    def numberOfSpecifiedCharacter(string, character):
        length = len(string);
        count = 0;
        
        for i in range(0, length, 1):
            if string[i] == character:
                count += 1;
                
        return count;
        
    number_of_twos = 0;
    for i in range(1002, 9993, 1):
        number_of_twos += numberOfSpecifiedCharacter(str(i), '2');
        
    print(number_of_twos);
