
public class QuickFindUF {
	
	private int[] id; //declare array to hold id values of components
	
	
	//constructor takes an integer representing the number of components
	public QuickFindUF(int N) {
		for (int i = 0; i < N; i++) {
			id[i] = i; //index values of array represent the different components
			//values of each index represent respective connected component id
		}
	}
	
	//checks if components are connected i.e have the same id value from the array
	//p and q represent the different components being tested
	public boolean connected(int p, int q) {
		if (id[p]==id[q]) {
			return true;
		} 
		return false; 
	}
	
	//checks to see if they are connected, if not sets ids to same value
	//
	public void union(int p, int q) {
		
		//store current id values of passed in parameters
		int pid = id[p]; 
		int qid = id[q];
		
		for (int i = 0; i < id.length; i++) {
			
			//here we check if any of the ids in the array match the id of the first argument
			if (id[i] == pid) {
				
				//set any ids that equal the first argument id to the second argument id
				//therefore creating a connected component
				id[i] = qid; 
			}
		}
	}
	
	
}
