public class NumJewelsInStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
        /*
            ALTERNATIVE OPTIMIZED SOLUTION:
            public int numJewelsInStones(String J, String S) {
                int res = 0;
                Set setJ = new HashSet();
                for (char j: J.toCharArray())
                    setJ.add(j);
                for (char s: S.toCharArray())
                    if (setJ.contains(s)) res++;
                return res;
            }
        */
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}
