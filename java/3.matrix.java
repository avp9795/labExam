class matrix{
public static void main(String args[]){
int mat1[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
int mat2[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
int mat3[][] = new int[3][3];
System.out.println("Final matrix is ::");
for(int i =0; i<3; i++){
for(int j=0; j<3; j++){
for(int k=0; k<3; k++){
mat3[i][j] += mat1[i][k]*mat2[k][j];
}
System.out.print(mat3[i][j]+"  ");
}
System.out.println();
}}}




