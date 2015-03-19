package suffixTree;
import java.util.*;
public class TreeNode {
	Map<Character, TreeNode> children;
	char value;
	List<Integer> indexes;
	public TreeNode(){
		children = new HashMap<Character, TreeNode>();
		//track the start index of the substring
		indexes = new ArrayList<Integer>();
	}
	public void insert(String s, int index){
		indexes.add(index);
		if(s != null && s.length() > 0){
			value = s.charAt(0);
			TreeNode child = null;
			if(children.containsKey(value))
				child = children.get(value);
			else{
				child = new TreeNode();
				children.put(value, child);
			}
			child.insert(s.substring(1), index);
			System.out.println(information());
		}
	}
	public List<Integer> getIndexes(String s){
		if(s == null || s.length() == 0){
			return indexes;
		}
		else{
			char first = s.charAt(0);
			if(children.containsKey(first)){
				return children.get(first).getIndexes(s.substring(1));
			}
		}
		return null;
	}
	public String information(){
		StringBuilder sb = new StringBuilder();
		sb.append("Value: " + value);
		sb.append("\n");
		sb.append("indexes list: \n");
		for(int i : indexes){
			sb.append(i + " ");
		}
		sb.append("\n");
		return sb.toString();
	}

}
