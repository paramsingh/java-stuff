public class Matrix {
	private int row, column;
	private double[][] matrix;

	public Matrix(row, column) {
		this.row=row;
		this.column=column;
		matrix = new double[row][column];
	}

	public Matrix multiplyMatrix(Matrix a, Matrix b) {
		int n=a.rows();
		int m=a.columns();
		int x=b.rows();
		int y=b.columns();
		if(m!=x){
			System.out.println("Matrices cannot be multiplied");
			return null;
		}
		else{
			int i,j,k,c,count=0,sum;
			Matrix product=new Matrix(n,y);
			double temp[]=new double[n*y];
			/*
			 * I've multipled the matrices by using three loops. 
			 * The variable c is used to find individual products while
			 * sum is used to store the final element that'll go into the product matrix
			 */
			for(i=0;i<n;i++)
			{
				for(j=0;j<y;j++)
				{
					sum=0;
					for(k=0;k<m;k++)
					{
						c=m1[i][k]*m2[k][j];
						sum=sum+c;
					}
					temp[count++]=sum;// Using a crappy hack to put the values into product because I can't think of a way to do this in the loop itself.
				}
			}
			count=0;
			for(i=0;i<n;i++)
				for(j=0;j<y;j++)
					product.matrix[i][j]=temp[count++];//This is where the values are actually put into product.
		}
		return product;
	}

	public Matrix divideMatrix(Matrix a, Matrix b) {
	}

	public Matrix transformMatrix(Matrix a) {
	}

	public Matrix determinantOfMatrix(Matrix a) {
		if (a.rows() == a.columns()) {
			int columns = a.columns();
			for (int i=0; i<columns; i++) {
				matrix[i]-
			}
			//do determinant
		} else {
			System.out.println("Determinant is not square.");
		}
	}

	//row echelon form
	public Matrix ref(Matrix a) {

	}

	//reduced row echelon form
	public Matrix rref(Matrix a) {
	}

	private int rows() {
		return row;
	}

	private int columns() {
		return column;
	}

	public String printMatrix(Matrix a) {
		String result = "";
		result += "[";
		for (int i=0; i<a.rows(); i++)
			for (int j=0; j<a.columns()-1; i++)
				result += matrix[i][j];
		return result;
	}
}
