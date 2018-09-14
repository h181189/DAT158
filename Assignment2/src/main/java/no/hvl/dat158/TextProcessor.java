package no.hvl.dat158;

public class TextProcessor {

    public int lcs(String a, String b) {
        var lengths = new int[a.length() + 1][];
        for (var i = 0; i < a.length() + 1; i++) {
            lengths[i] = new int[b.length() + 1];
        }

        for (var i = 1; i < a.length() + 1; i++) {
            for (var j = 1; j < b.length() + 1; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    lengths[i][j] = lengths[i - 1][j - 1] + 1;
                } else {
                    lengths[i][j] = Math.max(lengths[i - 1][j], lengths[i][j - 1]);
                }
            }
        }

        return lengths[lengths.length - 1][lengths[0].length - 1];
    }

    public int lcsRecursive(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return 0;
        }

        if (a.charAt(0) == b.charAt(0)) {
            return lcsRecursive(a.substring(1), b.substring(1)) + 1;
        } else {
            var i = lcsRecursive(a, b.substring(1));
            var j = lcsRecursive(a.substring(1), b);
            return Math.max(i, j);
        }
    }
}
