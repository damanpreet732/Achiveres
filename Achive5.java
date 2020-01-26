class Achive5 
{
	static int[][] rotate90(int a[][])
	{
		
		int last = a.length-1 ;
	for (int i = 0; i < a.length / 2; i++) 
    { 
        for (int j = i; j < last - i ; j++) 
        { 
            int temp = a[i][j] ;
            a[i][j] = a[last-j][i] ;
            a[last-j][i] = a[last-i][last-j] ;
            a[last-i][last-j] =  a[j][last-i] ;
            a[j][last-i]=temp ;
        } 
    } 
    return a ;
	}
	public static void main(String args [] )
	{

		int matrix[][] = {
			{5, 1, 9,11},
			{2, 4, 8,10}, 
			{13, 3, 6, 7}, 
			{15,14,12,16}
		};
		matrix = rotate90(matrix );
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}