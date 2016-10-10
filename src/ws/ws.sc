import patmat.Huffman._

val a = Leaf('a', 1)
val b = Leaf('b', 2)
val c = Leaf('c', 3)
val d = Leaf('d', 4)

val e = Fork(a, b, List(a.char, b.char), a.weight + b.weight)
val f = Fork(c, d, List(c.char, d.char), c.weight + d.weight)

val g = makeCodeTree(e, f)
g.chars
val t = times(string2Chars("aafffba ccdddd"))
//makeOrderedLeafList(t)






