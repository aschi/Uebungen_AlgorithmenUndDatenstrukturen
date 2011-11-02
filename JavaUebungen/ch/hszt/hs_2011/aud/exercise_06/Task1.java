package ch.hszt.hs_2011.aud.exercise_06;

public interface Task1 {

	/**
	 * Interface einer Singly Linked List. Implementieren Sie die
	 * definierten Methoden in Ihrer Klasse.
	 * 
	 * Für die Aufgabe 1.2 können Sie ebenfalls dieses Interface benutzen.
	 * Die zu benutzende Methode ist bereits definiert. Sie müssen Sie nur
	 * noch implementieren. :-)
	 */


	/**
	 * @param data, Wert des neuen Eintrags als String.
	 *            
	 * @return neuer Node.
	 * @throws NullPointerException, falls data null.
	 */
	public ListNode newListNode(String data)
			throws NullPointerException;

	/**
	 * @param node, der Node welcher vorangestellt wird.
	 * @throws NullPointerException, falls Node null.
	 */
	public void prepend(ListNode node) throws NullPointerException;

	/**
	 * @param node, der Node, welcher hinzugefügt wird.
	 * @throws NullPointerException, falls Node null.
	 */
	public void append(ListNode node) throws NullPointerException;

	/**
	 * @param node, der Node, welcher sortiert eingefügt wird.
	 * @throws NullPointerException, falls node null.
	 */
	public void sortedInsert(ListNode node)
			throws NullPointerException;

	/**
	 * @param data, wert des Nodes als String.
	 * @return, erster Node, welcher den Wert data enthält.
	 * @throws NullPointerException, falls data null.
	 */
	public ListNode firstNodeWith(String data)
			throws NullPointerException;

	/**
	 * @param data, Wert des Nodes als String.
	 * @throws NullPointerException, falls data null.
	 */
	public   void deleteNodeWith(String data)
			throws NullPointerException;

	/**
	 * Löscht alle Nodes.
	 */
	public void deleteAllNodes();

	/**
	 * Schreibt alle enthaltenen Werte der Liste in umgekehrter Reihenfolge auf.
	 * Beispiel, falls Liste = a, b, c, d.
	 * WriteNodesInReverseOrder() ergibt:
	 * d, c, b, a.
	 */
	public String WriteNodesInReverseOrder();

	/**
	 * @return, eine lesbare Liste der Werte der Nodes.
	 */
	public String toString();

	/**
	 * Innere Klasse für die einzelnen Nodes.
	 */
	public interface ListNode {

		/**
		 * @return nächster Node.
		 */
		public ListNode getNext();

		/**
		 * @param next, Node, welcher als nächster hinzugefügt wird.
		 */
		public void setNext(ListNode next);

		/**
		 * @return den Wert des aktuellen Nodes.
		 */
		public String getData();

		/**
		 * @param data, Wert des aktuellen Nodes.
		 *            
		 * @throws NullPointerException, falls data null.
		 */
		public void setData(String data) throws NullPointerException;

	}
}
