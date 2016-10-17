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
val trees = makeOrderedLeafList(List(('t', 2), ('e', 4), ('x', 5), ('r', 11)))

val trees2 = makeOrderedLeafList(List(('t', 1), ('e', 2)))

decode(frenchCode, secret)

val message = List('h', 'a', 'v', 'e', 'a', 'n', 'i', 'c', 'e', 'd', 'a', 'y')
encode(frenchCode)(message)

val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
encode(t1)("ab".toList)
decode(t1, List(0, 1))

type CodeTable = List[(Char, List[Bit])]
val ct1: CodeTable = List(('a', List(0,0,1)), ('b', List(0,1,0)), ('c', List(1,0,0)))
val ct2: CodeTable = List(('a', List(0)))
val ct3: CodeTable = List(('b', List(1)))
val ct4: CodeTable = List(('b', List(0,1,0)), ('c', List(1,0,0)))
val ct5: CodeTable = List()

codeBits(ct1)('a')

//mergeCodeTables(ct1, ct4)
convert(frenchCode)

val cTable = convert(t1)
"ab".toList

//quickEncode(t1)("ab".toList)


