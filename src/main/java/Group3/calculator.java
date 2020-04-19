package Group3;

public class calculator {
		public int add(int a, int b) {
			return a+b;
		}
		
		public int sub(int a, int b) {
			return a-b;
		}
		
		public int mul(int a, int b) {
			return a*b;
		}
		
		public int div(int a, int b) {
			if(b==0){
				throw new IllegalArgumentException("Number can not be divided by zero");
			}
			return a/b;
		}
		
		public int square (int x) {
			return x*x;
		}

}
