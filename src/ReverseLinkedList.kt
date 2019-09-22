class Node(val value: Number, val next: Node?)

fun main() {
    val head = Node(1, Node(2, Node(3, Node(4, Node(5, null)))))
    val newHead = reverseList(head)

    printList(head)
    println("---")
    printList(newHead)
}

fun reverseList(head: Node?): Node {
    var anterior: Node? = null
    var atual = head
    var proximo: Node?

    while(atual != null) {
        proximo = atual.next

        atual = Node(atual.value, anterior)

        anterior = atual
        atual = proximo
    }

    return anterior!!
}

fun printList(head: Node?){
    var current= head

    while(current != null) {
        println(current.value)
        current = current.next
    }
}