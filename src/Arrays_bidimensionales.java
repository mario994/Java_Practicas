
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{5,25,38,99,2},
				{66,15,69,152,91},
				{12,95,58,728,32},
				{99,75,34,367,97}
				};
		
		for(int[]fila:matrix) {
			System.out.println();
			for(int z:fila) {
				System.out.print(z + " ");
			}
		}
	}

}
