def swapUsingXOR(a, b):
    print("Swapping using XOR");
    print("%d, %d" % (a, b));
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    print("%d, %d" % (a, b));
    
def swapUsingArithmetic(a, b):
    print("Swapping using Arithmetic");
    print("%d, %d" % (a, b));
    a = a + b;
    b = a - b;
    a = a - b;
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
swapUsingArithmetic(4, 5);
swapUsingTempVariable(6, 7);
swapUsingPythonSyntax(8, 9);
