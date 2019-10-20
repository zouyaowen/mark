package top.suiyueran.mark.structure;

import java.util.concurrent.ConcurrentHashMap;

import lombok.Data;
@Data
public class TrieNode {
	//树节点
	ConcurrentHashMap<Character, TrieNode> next;
}
