package codewars.kyu5;

public class BrainLuck {

    private final byte[] tape;
    private final String code;
    private final StringBuilder output;
    private int dataPointer;
    private int inputPointer;
    private String input;

    public BrainLuck(String code) {
        this.tape = new byte[3000];
        this.dataPointer = 0;
        this.inputPointer = 0;
        this.code = code;
        this.input = "";
        this.output = new StringBuilder();
    }

    public String process(String input) {
        this.input = input;
        interpretCode();
        return output.toString();
    }

    private void interpretCode() {
        int codeLength = code.length();
        int codePointer = 0;

        while (codePointer < codeLength) {
            char instruction = code.charAt(codePointer);
            switch (instruction) {
                case '>' -> dataPointer++;
                case '<' -> dataPointer--;
                case '+' -> tape[dataPointer]++;
                case '-' -> tape[dataPointer]--;
                case '.' -> output.append((char) tape[dataPointer]);
                case ',' -> tape[dataPointer] = (byte) input.charAt(inputPointer++);
                case '[' -> {
                    if (tape[dataPointer] == 0) {
                        int loopDepth = 1;
                        while (loopDepth > 0) {
                            codePointer++;
                            char c = code.charAt(codePointer);
                            if (c == '[')
                                loopDepth++;
                            else if (c == ']')
                                loopDepth--;
                        }
                    }
                }
                case ']' -> {
                    if (tape[dataPointer] != 0) {
                        int loopDepth = 1;
                        while (loopDepth > 0) {
                            codePointer--;
                            char c = code.charAt(codePointer);
                            if (c == '[')
                                loopDepth--;
                            else if (c == ']')
                                loopDepth++;
                        }
                        codePointer--;
                    }
                }
                default -> {
                }
            }

            codePointer++;
        }
    }
}
