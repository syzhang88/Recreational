/**
 * Created by szhang on 5/6/16.
 */
public class HuffmanDecoder {
    public static void main(String[] args) {
        ObjectReader readHuf = new ObjectReader(args[0]);
        BinaryTrie binTrie = (BinaryTrie) readHuf.readObject();
        int symbNum = (int) readHuf.readObject();
        BitSequence bits = (BitSequence) readHuf.readObject();
        char[] symbs = new char[symbNum];
        for (int i = 0; i < symbNum; i++) {
            Match longestPref = binTrie.longestPrefixMatch(bits);
            symbs[i] = longestPref.getSymbol();
            bits = bits.allButFirstNBits(longestPref.getSequence().length());
        }
        FileUtils.writeCharArray(args[1], symbs);

    }
}
