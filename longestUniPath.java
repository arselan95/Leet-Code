
public class longestUniPath {
	/*
	 * get path of left
	 * get path of right
	 * if both path are not zero then compare max length with sum of 
	 * these two paths
	 * DFS
	 * 
	 */
	
	//global var to keep track of longest path
	//whatever val overide this min value
	int maxLength= Integer.MIN_VALUE;
	
	public int longestPath(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		
		//has current node and prev node
		//here we put root itsetf , in the end we can void this root.val
		checkNode(root,root.val);
		return maxLength;
	}
	
	
	public int checkNode(TreeNode node, int valPrev)
	{
	if(node==null) return 0;
	
	//we will assign the longest path of left and right 
	int left= checkNode(node.left,node.val);
	int right= checkNode(node.right,node.val);
	//now we have path number
	//check which side is longest
	//compare left+right to maxLength
	maxLength= Math.max(maxLength, left+right);
	//if current node = previous node
	if(node.val==valPrev)
	{
		return Math.max(left, right)+1;
	}
	return 0;
	}

}
