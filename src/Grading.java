
public class Grading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] students = {
					{ 1, 3, 2, 4, 3, 1, 4, 2, 2, 1 },
					{ 3, 2, 4, 2, 2, 1, 1, 3, 4, 1 },
					{ 2, 4, 3, 2, 1, 2, 1, 3, 3, 4 },
					{ 2, 3, 3, 1, 1, 3, 2, 2, 4, 4 },
					{ 3, 1, 1, 2, 4, 1, 2, 3, 1, 3 }, 
				};
		int[] solve = new int[10];
		int[] scores = new int[5];
		int score = 10;
				
		if(args.length != 10){
			System.out.println("정답의 개수가 맞지 않습니다.");
			return;
		}

		try{
			for(int i = 0; i < args.length; i++){
				solve[i] = Integer.parseInt(args[i]);
			}
		}catch(Exception e){
			System.out.println("예외 발생! 숫자만 넣으세여");
			return;
		}
		
		for(int i = 0; i < students.length; i ++){
			System.out.print("학생 " + (i + 1) + "의 정오표: ");
			for(int j = 0; j < solve.length; j++){
				if(students[i][j] == solve[j] ){
				   scores[i] +=  score;
				   System.out.print("O");
				}else{
					System.out.print("X");
				}
			}
			System.out.println("");
			System.out.println("학생 " + (i+1) + "의 점수 : " + scores[i]);
			
		}
		
	}

}
