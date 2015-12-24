    def areThemDigitsAlsoSquares(string):
    	length = len(string);
     
     	for i in range(0, length):
    		character = string[i];
     
     		if not(character == '0' or character == '1' or character == '4' or character == '9'):
    			return False;
     	return True;
     
    for i in range(99, 31, -1):
    	square = i * i;
     
     	if areThemDigitsAlsoSquares(str(square)):
    		print(square);
    		break;
