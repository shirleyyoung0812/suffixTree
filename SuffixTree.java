package suffixTree;
import java.util.*;
public class SuffixTree {
	TreeNode root = new TreeNode();
	public SuffixTree(String s){
		for(int i = 0; i < s.length(); i++)
			root.insert(s.substring(i), i);
	}
	public List<Integer> getIndexes(String s){
		return root.getIndexes(s);
	}

}
