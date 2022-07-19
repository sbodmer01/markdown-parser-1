all: test

test:
	javac MarkdownParse.java
	java MarkdownParse test-file7.md
