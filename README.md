# JAVA IO
 JAVA IO : https://www.geeksforgeeks.org/java-io-packag/
 JAVA NIO :  http://tutorials.jenkov.com/java-nio
 JAVA IO vs NIO : https://www.quora.com/What-is-the-difference-between-buffers-in-Java-io-and-buffers-in-Java-nio

### Streams -
 -  Abstraction between physical device and Java, that either produces or consumes information.
 -  Two types:
    - ### Byte Streams - Data in binary format
      1. InputStream/OutputStream - Abstract class that describes stream I/O.
      2. BufferedInputStream/BufferedOutputStream - Buffered  stream
      3. BufferedArrayInputStream/BufferedArrayOutputStream - I/O byte array.
      4. DataInputStream/DataOutputStream - Contains method to I/O Java Standard types.
      5. FileInputStream/FileOutputStream - I/O file
      6. FilterInputStream/FilterOutputStream
      7. ObjectInputStream/ObjectOutputStream - I/O objects
      8. PipedInputStream/PipedOutputStream
      9.  PrintStream - Output stream that contains print() and println().
      10. PushbackInputStream - Input stream that allows bytes to be returned to input stream.
      11. SequenceInputStream - Input stream that is a combination of two or more input streams that will read sequentially one after other.

  - ### Char Streams - Data in Character format
	  1. Reader/Writer - Abstract base class that describes char stream I/O.
	  2. BufferedReader/BufferedWriter - Input buffered  char stream
	  3. CharArrayReader/ CharArrayWriter - Input  character array
	  4. FileReader/FileWriter - Input file
	  5. FilterReader/FilterWriter
	  6. InputStreamReader/OutputStreamWriter - Bytes <-> Character
	  7. LineNumberReader - Counts number of lines
	  8. PipedReader/PipedWriter - I/O pipe
	  9. PushbackReader - Input stream that allows characters to be returned to input stream.
	  10. StringReader/StringWriter - Reads and writes to a String.
