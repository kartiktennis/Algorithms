
public class QuickUnion {

		private int[] id; //takes in array where indidces represent the different componenets being tested
		
		public QuickUnion(int N) {
			for (int i = 0; i < N; i++) {
				
				/*initialized values of indices, which in QF represent the "root"
				 * of a tree where all indices that have the same root are in the
				 * same connected component
				 * */ 

				id[i] = i; 
				
			}
		}
		
		//parameter represents the root value	
		private int root (int i) { 
			
			//while i is not the root of the ith component
			//chase the pointer up to root of a tree
			while (i != id[i]) i = id[i];
			
			return i; 
		}
		
		public boolean connected (int p, int q) {
			if (id[p]==id[q]) {
				return true;  
			}
			
			return false; 
		}
		
		public void union (int p , int q) {
			
			//store current roots of passed in parameters
			int i = root(p); 
			int j = root(q); 
			
			
			//value of id[index] represents the 
			//set root of p to root of q - they have same root == union
			id[i] = j; //(i.e "set root of root...")
			
		}
 }
