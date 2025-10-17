import java.util.Scanner;

/**
 * Portfolio Project: Proof of Concept - Binary Conversion.
 *
 * @author Deepen Chhetri
 *
 *         Description: Displays a working project, where base 10 numbers get
 *         converted to binary. The user can enter a base 10 integer, and the
 *         program converts it into its binary representation. This is intended
 *         Network Adminstrators who need to use subnetting and Anding which
 *         require binary numbers. Thus, this will be useful.
 */
public final class ProofofConcept {

    /**
     * Current value stored in decimal form.
     */
    private int value;

    // Constructors

    /**
     * sets this to zero.
     */
    public ProofofConcept() {
        this.value = 0;
    }

    // Kernel Methods

    /**
     * Multiplies the current value by 2 and adds the given bit.
     *
     * @param bit
     *            either 0 or 1
     */
    public void multiplyBy2(int bit) {
        this.value = this.value * 2 + bit;
    }

    /**
     * Divides the current value by 2 and returns the remainder bit.
     *
     * @return the remainder (0 or 1)
     */
    public int divideBy2() {
        int remainder = this.value % 2;
        this.value = this.value / 2;
        return remainder;
    }

    /**
     * Checks whether the value is zero.
     *
     * @return true if value is 0 or false if not 0
     */
    public boolean isZero() {
        return this.value == 0;
    }

    /**
     * Clears the current value (sets to 0).
     */
    public void clear() {
        this.value = 0;
    }

    // Secondary Methods

    /** Sets the current decimal value. */
    public void setValue(int decimalValue) {
        this.value = decimalValue;
    }

    /**
     * @return returns the binary representation of this value.
     */
    public String toBinary() {

        String Binary = Integer.toBinaryString(this.value);

        return Binary;
    }

    /**
     * @return returns the decimal value.
     */
    public int toDecimal() {

        int decimalValue = this.value;
        return decimalValue;
    }

    // Main Method: Allows the user to input base 10 number

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProofofConcept num = new ProofofConcept();

        //Asking user to input number
        System.out.print("Enter a base 10 number to convert to binary bits: ");
        int number = input.nextInt();

        num.setValue(number);

        //Calls Method
        String binary = num.toBinary();

        //Output Display
        System.out.println("Decimal (Base 10): " + number);
        System.out.println("Converted to Binary:  " + binary);

        input.close();
    }
}
