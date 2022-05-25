import java.util.Scanner;

// public class Main{
	// public static void main(String args[]){
		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		// int a = n / 10;
		// int b = n % 10;
		// int result = 0;
		// int count = 0;
		
		// while(true){
			// result = (a + b) % 10 + b * 10;
			// a = result / 10;
			// b = result % 10;
			// count++;
			// if(result == n){
				// System.out.println(count);
				// break;
			// }
		// }
		
	// }
// }

// import java.util.Arrays; 
 // public class Main{
	// public static void main(String args[]){
		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		// int[] arr = new int[n];
		
		// for(int i = 0; i < n;i++){
			// arr[i] = scan.nextInt();
		// }
		
		// Arrays.sort(arr);
		
		// int gcdVal = arr[1] - arr[0];
		
		// for(int i = 2; i < n;i++){
			// gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
		// }
		
		//약수 
		// for(int i = 2; i <= gcdVal; i++){
			
			// if(gcdVal % i == 0){
				// System.out.print(i + " ");
			// }
		// }
		
	// }
	// static int gcd(int a, int b){
		// while(b != 0){
			// int r = a % b;
			// a = b;
			// b = r;
		// }
		// return a;
	// }
 // }
 
// public class Main{
	// public static void main(String args[]){
		// Scanner scan = new Scanner(System.in);
		// int k = scan.nextInt();
		// int xMax = 0;
		// int yMax = 0;
		// int xMin = 500;
		// int yMin = 500;
		
		// for(int i = 0; i < 6;i++){
			// int direction = scan.nextInt();
			// int len = scan.nextInt();
			// switch(direction){
				// case 1:
					// if(len > xMax){
						// xMax = len;
					// }
					// if(len < xMin){
						// xMin = len;
					// }
					// break;
				// case 2:
					// if(len > xMax){
						// xMax = len;
					// }
					// if(len < xMin){
						// xMin = len;
					// }
					// break;
				// case 3:
					// if(len > yMax){
						// yMax = len;
					// }
					// if(len < yMin){
						// yMin = len;
					// }
					// break;
				// case 4:
					// if(len > yMax){
						// yMax = len;
					// }
					// if(len < xMin){
						// yMin = len;
					// }
					// break;
				
			// }
		// }
		// int result = (xMax * yMax) - (xMin * yMin);
		// result *= k;
		// System.out.println(result);
	// }
// } 

 // public class Main{
	 // public static void main(String args[]){
		 // Scanner scan = new Scanner(System.in);
		 
		 // int n = scan.nextInt();
		 // int w = scan.nextInt();
		 // int h = scan.nextInt();
		 
		 // for(int i = 0; i < n;i++){
			 // int l = scan.nextInt();
			 // if(l * l <= w * w + h * h){
				 // System.out.println("DA");
			 // } else{
				 // System.out.println("NE");
			 // }
		 // }
	 // }
 // }
 
// public class Main { 
	
	// static int[][] dp = new int[30][30];
	
	// public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// int t = scan.nextInt();
		
		// StringBuilder sb = new StringBuilder();
		
		// for(int i = 0; i < t;i++){
			// int n = scan.nextInt();
			// int m = scan.nextInt();
			
			// sb.append(combi(m, n)).append('\n');
		// }
		
		// System.out.println(sb);
	// }
	// static int combi(int n, int r){
		
		// if(dp[n][r] > 0){
			// return dp[n][r];
		// }
		
		// if(n == r || r == 0){
			// return dp[n][r] = 1;
		// }
		
		// return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
	// }
// }

// public class Main{
	// public static void main(String args[]){
		// Scanner scan = new Scanner(System.in);
		
		// while(true){
			// int a = scan.nextInt();
			// int b = scan.nextInt();
			// int c = scan.nextInt();
			// if( a == 0 || b == 0 || c == 0){
				// break;
			// } else if( a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b){
				// System.out.println("right");
			// } else{
				// System.out.println("wrong");
			// }
		// }
	// }
// }

// 나머지합
// public class Main{
	// public static void main(String args[]){
		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		// int m = scan.nextInt();
		
		// int[] arr = new int[n + 1];
		// int count = 0;
		// arr[0] = 0;
		// for(int i = 1; i < n + 1;i++){
			// arr[i] = arr[i - 1] + scan.nextInt();
		// } 
		// for(int i = 1; i < n + 1;i++){
			// if(arr[i] % m == 0){
				// count++;
			// }
			// for(int j = 1;j < i;j++){
				// if((arr[i] - arr[j]) % m == 0 && arr[i] > 0){
					// count++;
				// } 
			// }
		// }
		// System.out.println(count);
		
	// }
// }

// 설탕 문제
// public class Main{
	// public static void main(String args[]){
		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		// int count = 0;
		
		// if(n == 4 || n == 7){
			// System.out.println(-1);
		// }
		
		// else if(n % 5 == 0){
			// System.out.println(n / 5);
		// }
		
		// else if(n % 5 == 1 || n % 5 == 3){
			// System.out.println(n / 5 + 1);
		// }
		
		// else if(n % 5 == 2 || n % 5 == 4){
			// System.out.println(n / 5 + 2);
		// }
		
		
	// }
// }

// public class Main{
	// public static void main(String args[]){
		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		// int m = scan.nextInt();
		// int[] arr = new int[n + 1];
		
		// arr[0] = 0;
		
		// for(int i = 1;i < n + 1;i++){
			// arr[i] = arr[i-1] + scan.nextInt();		
		// }
		// for(int k = 0;k < m;k++){
			// int i = scan.nextInt();
			// int j = scan.nextInt();
			
			// System.out.println(arr[j] - arr[i-1]);
		// }		
	// }
// }


// public class Main{
	// public static void main(String args[]){
		// Scanner scan = new Scanner(System.in);
		// int x = scan.nextInt();
		// int y = scan.nextInt();
		// int w = scan.nextInt();
		// int h = scan.nextInt();
		// int min = x;
		
		// if(y < min){
			// min = y;
		// }
		// if(w - x < min){
			// min = w - x;
		// }
		// if(h - y < min){
			// min = h - y;
		// }
		// System.out.println(min);
		
		
	// }
// }

// OX 점수
// public class Main{
	// public static void main(String args[]){
		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		
		// for(int i = 0;i < n;i++){
			// String str = scan.next();
			// char[] ox = new char[str.length()];
			// int score = 0;
			// int count = 0;
			
			// for(int j = 0;j < ox.length;j++){
				// ox[j] = str.charAt(j);
			// }
			
			// for(int j = 0;j < ox.length;j++){
				// if(ox[j] == 'O'){
					// count++;
					// score += count;
				// } else if(ox[j] == 'X'){
					// count = 0;
				// }
			// }
			// System.out.println(score);
		// }
	// }
// }

// 약수
// public class Main{
	// public static void main(String argd[]){
		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		// int[] arr = new int[n];
		// int max = 2;
		// int min = 1000000;
		// for(int i = 0;i < n;i++){
			// arr[i] = scan.nextInt();
			// if(arr[i] >= max){
				// max = arr[i];
			// }
			// if(arr[i] < min){
				// min = arr[i];
			// }
		// }
		
		// if(arr.length == 1){
			// System.out.println(arr[0] * arr[0]);
		// } else{
			// System.out.println(max * min);
		// }		
	// }
// }



// 소인수 분해
// public class Main{
	// public static void main(String args[]){
		// Scanner scan = new Scanner(System.in);
		
		// int n = scan.nextInt();
		
		// while(n > 1){
			// for(int i = 2;i <= n; i++){
				// if(n % i == 0){
					// System.out.println(i);
					// n = n / i;
					// break;
				// }
			// }
		// }
	// }
// }

// 소수 구하기
// public class Main{
	// public static void main(String args[]){		
		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		// int m = scan.nextInt();
		// int sum = 0;
		// int min = 10000;
		// int PrimeCount = 0;
		// if(n == 1){
			// n++;
		// }
		// for(;n <= m;n++){
			// int count = 0;
			// for(int i = 2;i < n;i++){
				// if(n % i == 0){
					// count++;
				// }
			// }
			// if(count == 0){
				// if(n < min){
					// min = n;
				// }
				// sum += n;
				// PrimeCount++;
			// }
		// }
		
		// if(PrimeCount == 0){
			// System.out.println(-1);
		// }
		// else{
			// System.out.println(sum);
			// System.out.println(min);
		// }
		
	// }
// }