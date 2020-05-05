package codility;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BinaryGap().solution(15));
	}
	
	 public int solution(int N) {
	        int binaryGap = 0;
	        int zeroCount = -1;

	        if (N == 0) {
	            return 0;
	        }

	        while (N > 0) {
	            if ((N & 1) == 1) {
	                if (zeroCount > binaryGap) {
	                    binaryGap = zeroCount;
	                }
	                zeroCount = 0;
	            } else {
	                if (zeroCount >= 0) {
	                    zeroCount++;
	                }
	            }
	            N = N >> 1;
	        }
	        return binaryGap;
	
	 }
}
