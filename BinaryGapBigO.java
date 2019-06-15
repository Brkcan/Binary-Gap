
public class BinaryGapBigO {
	public int solution(int N) {
		int max = 0;
		boolean found = false;
		while(N > 0) {
			int count = 0;
			while(N % 2 == 0 && found == true) {
				count++;
				N /= 2;
			}
			if(N % 2 == 1 ) {
				found = true;
				if(count > max) {
					max = count;
				}
				count = 0;
			}
			N /= 2;
		}
		return max;
	}
	public static void main(String[] args) {
		BinaryGapBigO gapBigO = new BinaryGapBigO();
		System.out.println(gapBigO.solution(9));
	}
}
