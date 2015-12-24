    from math import sqrt;
     
    def isAPerfectSquare(number):
        root = int(sqrt(number));
        return number == root ** 2;
     
    max = 99999;
     
    for i in range(1, max, 1):
        sum = 6 * i + 15;
        if isAPerfectSquare(sum):
            print(sum);
            break;
