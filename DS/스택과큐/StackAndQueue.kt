class MyStack<T : Any> {
    private val list = ArrayList<T>()

    fun push(element: T) {
        list.add(element)
    }

    fun pop(): T? {
        if (list.size == 0) return null

        return list.removeAt(list.size - 1)
    }

    fun top(): T?{
        return list.lastOrNull()
    }
}

class MyQueue<T : Any> {
    private val list = ArrayList<T>()

    fun add(element: T){
        list.add(element)
    }

    fun remove(): T?{
        if(list.size == 0) return null

        return list.removeAt(0)
    }

    fun peek(): T?{
        if(list.size == 0) return null

        return list[0]
    }
}

fun main(args: Array<String>){
    val st = MyStack<Int>()
    st.push(3)
    st.push(5)

    println(st.top())
    println(st.pop())
    println(st.top())

    val queue = MyQueue<Int>()
    queue.add(3)
    queue.add(5)
    println(queue.peek())
    println(queue.remove())
    println(queue.peek())

}