class Node:
    def __init__(node, data):
        node.next = None
        node.prev = None
        node.data = data

    def __str__(node):
        return str(node.data)


class DoublyLinkedList:
    def __init__(list):
        list.first = None

    def isEmpty(list):
        if list.first == None:
            return True
        return False

    def insertFirst(list, data):
        if list.isEmpty():
            list.first = Node(data)
        else:
            restOfList = list.first
            list.first = Node(data)
            list.first.next = restOfList

    def insertLast(list, data):
        if list.isEmpty():
            list.first = Node(data)
            return

        node = list.first
        while(node.next is not None):
            node = node.next

        node.next = Node(data)

    def __str__(list):
        node = list.first

        stringLst = "["
        while(node):
            stringLst += str(node.data) + ", "
            node = node.next
        stringLst += "]"

        return stringLst


def main():
    llist = DoublyLinkedList()
    llist.insertFirst(32)
    llist.insertFirst(15)
    llist.insertFirst(52)
    print(llist)

if __name__ == "__main__":
    main()
