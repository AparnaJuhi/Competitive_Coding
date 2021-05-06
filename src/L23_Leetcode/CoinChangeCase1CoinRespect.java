package L23_Leetcode;

public class CoinChangeCase1CoinRespect {

	public static void main(String[] args) {
		int[] denom = {1,2,3};
		coinRespect(denom, 0, 5, "");

	}
	
	public static void coinRespect(int[] denom, int vidx, int amt, String ans) {

		if (amt == 0) {
			System.out.println(ans);
			return;
		}
		
		if (amt < 0 || vidx==denom.length) {
			return;
		}
		
		coinRespect(denom, vidx, amt-denom[vidx], ans+denom[vidx]);
		coinRespect(denom, vidx+1, amt, ans);
		

		
	}

}
