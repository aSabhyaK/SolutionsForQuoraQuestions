    from math import sqrt;
     
    def formTheNumber(n):
    	string = '';
    	for i in range(0, n, 1):
    		string += '9';
    		
    	return long(string);
     
    root = long(sqrt(formTheNumber(5)));
    print(root * root);
