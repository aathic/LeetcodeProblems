package leetcode;
/*
 * String s="paypalishiring" row=3
 * p	a	h	 n
 * a p  l s	i  i g
 * y	i	r
 * 
 * ouput: pahnaplsiigyir
 * */
public class ZigzagConversionOfString {
	public static void main(String[] args) {
		String s="paypalishiring";
		int row=3;
		System.out.println(solve(s,row));
	}
	public static String solve(String s,int row) {
		if(row==1 || s.length()<row)
			return s;
		StringBuilder[] sb=new StringBuilder[row];
		for(int i=0;i<sb.length;i++) {
			sb[i]=new StringBuilder();
		}
		int curRow=0;
		boolean down=true;
		for(char c:s.toCharArray()) {
			sb[curRow].append(c);
			if(curRow==0)
				down=true;
			else if(curRow==row-1)
				down=false;
			curRow=down?curRow+1:curRow-1;
		}
		StringBuilder res=new StringBuilder();
		for(StringBuilder sc:sb) {
			res.append(sc);
		}
		return res.toString();
	}
}
