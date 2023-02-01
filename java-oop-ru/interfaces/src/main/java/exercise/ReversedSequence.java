package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    String newSeq;

    public ReversedSequence(String sequence) {
        StringBuilder reversedSeq = new StringBuilder();
        char adChar;

        for (int i = 0; i < sequence.length(); i++) {
            adChar = sequence.charAt(i);
            reversedSeq.insert(0, adChar);
        }

        this.newSeq = reversedSeq.toString();
    }

    @Override
    public String toString() {
        return this.newSeq;
    }

    @Override
    public int length() {
        return newSeq.length();
    }

    @Override
    public char charAt(int i) throws IndexOutOfBoundsException {
        return newSeq.charAt(i);
    }

    @Override
    public CharSequence subSequence(int s, int e) throws IndexOutOfBoundsException {
        CharSequence subSeq = new String(this.toString().substring(s, e));
        return subSeq;
    }
}
// END
