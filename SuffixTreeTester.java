package suffixTree;
import java.util.*;
public class SuffixTreeTester {

	public static void main(String[] args) {
		String s = "banana";
		String[] sList = {"ana", "nana", "na","anana"};
		SuffixTree tree = new SuffixTree(s);
		for(String str : sList){
			List<Integer> list = tree.getIndexes(str);
			if(list != null)
				System.out.println(str + ": " + list.toString());
			else
				System.out.println(str + ": Empty list");
		}
	}

}
