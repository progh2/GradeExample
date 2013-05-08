
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
			System.out.println("������ ������ ���� �ʽ��ϴ�.");
			return;
		}

		try{
			for(int i = 0; i < args.length; i++){
				solve[i] = Integer.parseInt(args[i]);
			}
		}catch(Exception e){
			System.out.println("���� �߻�! ���ڸ� ��������");
			return;
		}
		
		for(int i = 0; i < students.length; i ++){
			System.out.print("�л� " + (i + 1) + "�� ����ǥ: ");
			for(int j = 0; j < solve.length; j++){
				if(students[i][j] == solve[j] ){
				   scores[i] +=  score;
				   System.out.print("O");
				}else{
					System.out.print("X");
				}
			}
			System.out.println("");
			System.out.println("�л� " + (i+1) + "�� ���� : " + scores[i]);
			
		}
		
	}

}
