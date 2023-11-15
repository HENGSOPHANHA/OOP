class VariableExample {
    static int globalVar = 10;

    public void printLocalVariable() {
        int localVar = 20;
        System.out.println("Local variable localVar = " + localVar);
    }

    public void modifyGlobalVariable(int newValue) {
        globalVar = newValue;
        System.out.println("Updated global variable globalVar = " + globalVar);
    }

    public static void main(String[] args) {
        VariableExample variableExample = new VariableExample();

        // Print local variable
        variableExample.printLocalVariable();

        // Modify global variable
        variableExample.modifyGlobalVariable(30);
    }
}

