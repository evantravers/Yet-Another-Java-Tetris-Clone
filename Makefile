JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Piece.java \
	Board.java \
	Game.java \
	Tetris.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
