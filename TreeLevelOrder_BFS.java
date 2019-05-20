import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 public List<List<Integer>> levelOrder(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        
        if(root == null) return wrapList;
        
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
*/
public class TreeLevelOrder_BFS {

	public void BFS(TreeNode root) {
		if (root == null)
			return;
		// queue is an abstract type in java
		// linkedlist for some implementation
		Queue<TreeNode> lq = new LinkedList<TreeNode>();

		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> intlist = new ArrayList<List<Integer>>();

		lq.add(root);

		// as long as queue still has elements
		while (!lq.isEmpty()) {
			TreeNode temp = lq.remove();
			// add to list here
			list.add(temp.val);
			intlist.add(list);
			list.clear();

			if (temp.left != null)
				lq.add(temp.left);
			if (temp.right != null)
				lq.add(temp.right);
		}
	}

}
