import patmat.Huffman._

val a = Leaf('a', 1)
val b = Leaf('b', 2)
val c = Leaf('c', 3)
val d = Leaf('d', 4)

val e = Fork(a, b, List(a.char, b.char), a.weight + b.weight)
val f = Fork(c, d, List(c.char, d.char), c.weight + d.weight)

val g = makeCodeTree(e, f)
val h = makeCodeTree(d, e)
val i = makeCodeTree(c, f)
g.chars
val t = times(string2Chars("aafffba ccdddgggg"))

makeOrderedLeafList(t)
val z: List[(Char, Int)] = List(('g',4), ('d',3), ('c',2))
makeOrderedLeafList(List(('g',2), ('d',1), ('c',3)))
combine(List(d, a, c))
makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3)))


