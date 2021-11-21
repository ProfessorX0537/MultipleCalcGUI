/**
 * Interface extends {@link ToBigInteger} and adds toBinary string
 */
public interface BinaryBigIntConversion extends ToBigInteger{
    /**
     * takes a string and converts it to a binary string
     * @param s a numeric string
     * @return a binary representation of that string
     */
    String toBinary(String s);
}
