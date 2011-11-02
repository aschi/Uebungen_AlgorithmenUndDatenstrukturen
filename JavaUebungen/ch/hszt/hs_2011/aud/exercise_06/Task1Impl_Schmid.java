package ch.hszt.hs_2011.aud.exercise_06;

public class Task1Impl_Schmid implements Task1 {
	private ListNode firstNode = null;
	
	public ListNode getFirstNode() {
		return firstNode;
	}

	@Override
	public ListNode newListNode(String data) throws NullPointerException {
		return new ListNodeImpl(data);
	}

	@Override
	public void prepend(ListNode node) throws NullPointerException {
		node.setNext(firstNode);
		firstNode = node;
		
	}

	@Override
	public void append(ListNode node) throws NullPointerException {
		if(firstNode == null){
			firstNode = node;
		}
		ListNode last = firstNode;
		while(last.getNext() != null){
			last = last.getNext();
		}
		last.setNext(node);
	}

	@Override
	public void sortedInsert(ListNode node) throws NullPointerException {
		ListNode pred = null;
		ListNode succ = firstNode;
		
		while(succ != null && node.getData().compareTo(succ.getData()) > 0) {
			pred = succ;
			succ = succ.getNext();
		}
		
		if(pred == null){
			firstNode = node;
		}else{
			pred.setNext(node);
		}
		node.setNext(succ);
	}

	@Override
	public ListNode firstNodeWith(String data) throws NullPointerException {
		ListNode n = firstNode;
		while(n != null && !n.getClass().equals(data)){
			n = n.getNext();
		}
		return n;
	}

	@Override
	public void deleteNodeWith(String data) throws NullPointerException {
		ListNode pred = null;
		ListNode n = firstNode;
		while(n != null && n.getData() != data){
			pred = n;
			n = n.getNext();
		}
		
		if(n != null){
			if(pred == null){
				firstNode = n.getNext();
			}else{
				pred.setNext(n.getNext());
			}
		}
		
	}

	@Override
	public void deleteAllNodes() {
		firstNode = null;
	}

	@Override
	public String WriteNodesInReverseOrder() {
		Task1Impl_Schmid reverseList = new Task1Impl_Schmid();
		ListNode n = firstNode;
		while(n != null){
			reverseList.prepend(newListNode(n.getData()));
			n = n.getNext();
		}
		return reverseList.toString();
	}
	
	public String toString(){
		ListNode n = firstNode;
		String s = "";
		while(n != null){
			if(!s.equals("")){ s+=";";}
			s += n.getData();
			n = n.getNext();
		}
		
		return s;
	}
	
	public class ListNodeImpl implements ListNode{
		private String data;
		private ListNode next = null;
		
		ListNodeImpl(String data){
			this.data = data;
		}
		
		@Override
		public ListNode getNext() {
			return next;
		}

		@Override
		public void setNext(ListNode next) {
			this.next = next;
		}

		@Override
		public String getData() {
			return data;
		}

		@Override
		public void setData(String data) throws NullPointerException {
			this.data = data;
		}
		
	}

}
