    number = str(11111111);
    length = len(number);
    sum = 0;
     
    for i in range(0, length, 1):
        sum += (ord(number[i]) - 48) * (2 ** i);
        
    print(sum);
