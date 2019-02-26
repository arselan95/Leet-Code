import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * SHORTEST PATH BFS GRAPH
 */

//undirected graph more like cyclic graph

//Use BFS-> always queue which has nodes that we have to visit

//to track path we keep track of what is the parent of each node

//hashmap that maps node to its parent

//O(n) time and space both bc we r not visiting node more than once

public class Graph_ShortestPath {

	public List<GraphNode> shortestPath(GraphNode a, GraphNode b) {

		// check for null
		if (a == null || b == null)
			return null;

		// create a queue for BFS to check the nodes that we have to visit
		Queue<GraphNode> toVisit = new LinkedList<GraphNode>();

		// hashmap to hold parents which will help us trace shortest path
		HashMap<GraphNode, GraphNode> parents = new HashMap<GraphNode, GraphNode>();

		// add 'a' to queue and hashmap
		toVisit.add(a);

		parents.put(a, null); // since parent of a is null

		// add node a to queue and add all children of a to the queue
		while (!toVisit.isEmpty()) {
			GraphNode curr = toVisit.remove();
			// if curr == b then we have got our path so we gotta break
			if (curr == b) {
				break;
			}
			// add parents to map which will help us traverse back
			for (GraphNode n : curr.next) {
				if (!parents.containsKey(n)) // check so we dont visit same node again n again
				{
					toVisit.add(n);
					parents.put(n, curr);
				}
			}
		}
		// if b dont exist
		if (parents.get(b) == null)
			return null;

		// list for result
		List<GraphNode> out = new LinkedList<GraphNode>();
		GraphNode curr = b;

		// traverse back from b because there is only one path backwards
		while (curr != null) {
			out.add(0, curr);
			curr = parents.get(curr);
		}
		return out;

	}

}
