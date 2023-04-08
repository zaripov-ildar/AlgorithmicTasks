package LeetCode.CloneGraph_133;

import LeetCode.Node;

class Solution {
    private static final Node[] clone = new Node[101];

    public Node cloneGraph(Node node) {
	if (node == null)
	    return null;
	if (clone[node.val] == null) {
	    clone[node.val] = new Node(node.val);
	    for (Node neighbor : node.neighbors)
		clone[node.val].neighbors.add(cloneGraph(neighbor));
	}
	return clone[node.val];
    }
}