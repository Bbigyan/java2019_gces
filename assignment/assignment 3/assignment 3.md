# Stream In Java

Introduced in Java 8, the Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.

The features of Java stream are –

1.  A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.

    

2.  Streams don’t change the original data structure, they only provide the result as per the pipelined methods.

    

3.  Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.

    

Here below is a program to describe the functionality of streams in java:

    //a simple program to demonstrate the use of stream in java

    

    import java.util.*;

    

    import java.util.stream.*;

    

    

    

    class Demo

    

    {

    

    public static void main(String args[])

    

    {

    

    

    

    	// create a list of integers

    

    	List<Integer> number = Arrays.asList(2,3,4,5);

    

    

    

    	// demonstration of map method

    

    	List<Integer> square = number.stream().map(x -> x*x).

    

    						collect(Collectors.toList());

    

    	System.out.println(square);

    

    

    

    	// create a list of String

    

    	List<String> names =

    

    				Arrays.asList("Reflection","Collection","Stream");

    

    

    

    	// demonstration of filter method

    

    	List<String> result = names.stream().filter(s->s.startsWith("S")).

    

    						collect(Collectors.toList());

    

    	System.out.println(result);

    

    

    

    	// demonstration of sorted method

    

    	List<String> show =

    

    			names.stream().sorted().collect(Collectors.toList());

    

    	System.out.println(show);

    

    

    

    	// create a list of integers

    

    	List<Integer> numbers = Arrays.asList(2,3,4,5,2);

    

    

    

    	// collect method returns a set

    

    	Set<Integer> squareSet =

    

    		numbers.stream().map(x->x*x).collect(Collectors.toSet());

    

    	System.out.println(squareSet);

    

    

    

    	// demonstration of forEach method

    

    	number.stream().map(x->x*x).forEach(y->System.out.println(y));

    

    

    

    	// demonstration of reduce method

    

    	int even =

    

    	number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

    

    

    

    	System.out.println(even);

    

    }

    

    }

    

Output:

    [4, 9, 16, 25]

    

    [Stream]

    

    [Collection, Reflection, Stream]

    

    [16, 4, 9, 25]

    

    4

    

    9

    

    16

    

    25

    

    6

    

Important Points/Observations:

1.  A stream consists of source followed by zero or more intermediate methods combined together (pipelined) and a terminal method to process the objects obtained from the source as per the methods described.

    

2.  Stream is used to compute elements as per the pipelined methods without altering the original value of the object.

    

# [](https://github.com/sumantiwari723/sumantiwari-java-2019-batch/blob/main/Assignment/Assignment%203/Assignment%203.md#zipfiles-streams-in-java)[](https://github.com/Pramodgrg/Java/blob/main/Assigment/Assignment%203/assignment%203.md#zipfiles-streams-in-java)Zipfiles Streams in Java

ZIP is a file format for compressed files or folders. It enables data compression. Using Java programming language, we can create ZIP files or folders. For this Java provides the classes In Java, ZipFile is a class that belongs to the java.util.zip package. The package provides the java.util.zip package. The package contains the number of classes that deal with the ZIP file or folder. The classes can be to read and write the standard ZIP and GZIP file formats.

ZipInputStream is a Java class that implements an input stream filter for reading files in the ZIP file format. It has support for both compressed and uncompressed entries.

The following example reads the contents of a ZIP file.

JavaReadZip.java

    package com.zetcode;

    

    

    

    import java.io.BufferedInputStream;

    

    import java.io.FileInputStream;

    

    import java.io.IOException;

    

    import java.time.LocalDate;

    

    import java.util.zip.ZipEntry;

    

    import java.util.zip.ZipInputStream;

    

    

    

    public class JavaReadZip {

    

    

    

        private final static Long MILLS_IN_DAY = 86400000L;

    

    

    

        public static void main(String[] args) throws IOException {

    

    

    

            String fileName = "src/resources/myfile.zip";

    

    

    

            try (FileInputStream fis = new FileInputStream(fileName);

    

                    BufferedInputStream bis = new BufferedInputStream(fis);

    

                    ZipInputStream zis = new ZipInputStream(bis)) {

    

                

    

                ZipEntry ze;

    

    

    

                while ((ze = zis.getNextEntry()) != null) {

    

    

    

                    System.out.format("File: %s Size: %d Last Modified %s %n",

    

                            ze.getName(), ze.getSize(),

    

                            LocalDate.ofEpochDay(ze.getTime() / MILLS_IN_DAY));

    

                }

    

            }

    

        }

    

    }

    

In the next example, we decompress a ZIP file in Java.

JavaUnzip.java

    package com.zetcode;

    

    

    

    import java.io.BufferedInputStream;

    

    import java.io.BufferedOutputStream;

    

    import java.io.FileInputStream;

    

    import java.io.FileOutputStream;

    

    import java.nio.file.Path;

    

    import java.nio.file.Paths;

    

    import java.util.zip.ZipEntry;

    

    import java.util.zip.ZipInputStream;

    

    

    

    public class JavaUnzip {

    

    

    

        public static void main(String args[]) throws Exception {

    

    

    

            byte[] buffer = new byte[2048];

    

    

    

            Path outDir = Paths.get("src/resources/output/");

    

            String zipFileName = "src/resources/myfile.zip";

    

    

    

            try (FileInputStream fis = new FileInputStream(zipFileName);

    

                    BufferedInputStream bis = new BufferedInputStream(fis);

    

                    ZipInputStream stream = new ZipInputStream(bis)) {

    

    

    

                ZipEntry entry;

    

                while ((entry = stream.getNextEntry()) != null) {

    

    

    

                    Path filePath = outDir.resolve(entry.getName());

    

    

    

                    try (FileOutputStream fos = new FileOutputStream(filePath.toFile());

    

                            BufferedOutputStream bos = new BufferedOutputStream(fos, buffer.length)) {

    

    

    

                        int len;

    

                        while ((len = stream.read(buffer)) > 0) {

    

                            bos.write(buffer, 0, len);

    

                        }

    

                    }

    

                }

    

            }

    

        }

    

    }

    

# [](https://github.com/sumantiwari723/sumantiwari-java-2019-batch/blob/main/Assignment/Assignment%203/Assignment%203.md#object-streams-in-java)[](https://github.com/Pramodgrg/Java/blob/main/Assigment/Assignment%203/assignment%203.md#object-streams-in-java)Object Streams in Java

Just as data streams support I/O of primitive data types, object streams support I/O of objects. Most, but not all, standard classes support serialization of their objects. Those that do implement the marker interface Serializable.

The object stream classes are ObjectInputStream and ObjectOutputStream. These classes implement ObjectInput and ObjectOutput, which are subinterfaces of DataInput and DataOutput. That means that all the primitive data I/O methods covered in Data Streams are also implemented in object streams. So an object stream can contain a mixture of primitive and object values. The ObjectStreams example illustrates this. ObjectStreams creates the same application as DataStreams, with a couple of changes. First, prices are now BigDecimalobjects, to better represent fractional values. Second, a Calendar object is written to the data file, indicating an invoice date.

If readObject() doesn't return the object type expected, attempting to cast it to the correct type may throw a ClassNotFoundException. In this simple example, that can't happen, so we don't try to catch the exception. Instead, we notify the compiler that we're aware of the issue by adding ClassNotFoundException to the main method's throws clause.
