def swapUsingXOR(a, b):
    print("Swapping using XOR");
    print("%d, %d" % (a, b));
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    print("%d, %d" % (a, b));
    
def swapUsingAdditionAndSubtraction(a, b):
    print("Swapping using Addition and Subtraction");
    print("%d, %d" % (a, b));
    a = a + b;
    b = a - b;
    a = a - b;
    print("%d, %d" % (a, b));
    
def swapUsingMultiplicationAndDivision(a, b):
    print("Swapping using Multiplication and Division");
    print("%d, %d" % (a, b));
    a = a * b;
    b = a / b;
    a = a / b;
    print("%d, %d" % (a, b));
    
def swapUsingTempVariable(a, b):
    print("Swapping using a temporary variable");
    print("%d, %d" % (a, b));
    t = b;
    b = a;
    a = t;
    print("%d, %d" % (a, b));
    
def swapUsingPythonSyntax(a, b):
    print("Swapping using Python Syntax");
    print("%d, %d" % (a, b));
    a, b = b, a;
    print("%d, %d" % (a, b));
    
swapUsingXOR(3, 2);
swapUsingAdditionAndSubtraction(4, 5);
swapUsingMultiplicationAndDivision(6, 7)
swapUsingTempVariable(8, 9);
swapUsingPythonSyntax(10, 11);
