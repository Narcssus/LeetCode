package q223;

public class Solution {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int left = Math.max(A, E);
		int right = Math.min(G, C);
		int bottom = Math.max(F, B);
		int top = Math.min(D, H);

		int area3 = 0;
		if (right > left && top > bottom)
			area3 = (right - left) * (top - bottom);
		int area1 = (C - A) * (D - B);
		int area2 = (G - E) * (H - F);
		return area1 - area3 + area2;

	}
}
