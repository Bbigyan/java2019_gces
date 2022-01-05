**Assigned Date: 2021/12/28** &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
**Deu Date:2022/01/04**

# Streams

An I/O Stream represents an input source or an output destination. A stream can represent many different kinds of sources and destinations, including disk files, devices, other programs, and memory arrays.


No matter how they work internally, all streams present the same simple model to programs that use them: A stream is a sequence of data. A program uses an input stream to read data from a source, one item at a time and a program uses an output stream to write data to a destination, one item at time:

![Reading information into a program.](https://docs.oracle.com/javase/tutorial/figures/essential/io-ins.gif)
* Reading information into a program.


![Writing information from a program.](https://docs.oracle.com/javase/tutorial/figures/essential/io-outs.gif)
* Writing information from a program.

### Classification of Stream classes:
* Byte Streams
* Character Streams
* Buffered Streams
# Object Streams
Just as data streams support I/O of primitive data types, object streams support I/O of objects. Most, but not all, standard classes support serialization of their objects. Those that do implement the marker interface Serializable.

The object stream classes are ObjectInputStream and ObjectOutputStream. These classes implement ObjectInput and ObjectOutput, which are subinterfaces of DataInput and DataOutput. That means that all the primitive data I/O methods covered in Data Streams are also implemented in object streams.

![I/O of multiple referred-to objects](https://docs.oracle.com/javase/tutorial/figures/essential/io-trav.gif)
* I/O of multiple referred-to objects

# Zip file stream
Zip files are the archives that store one or more files in compressed form.
The `java.util.zip` contains the classes for working with zip files.
Each zip files has a header which includes information like name of the file and the compression method used like GZIP and ZIP.
`ZipInputStream()` is used to read a Zip file by layering the zipInputSream constructor on to a `FileInputStream()`.
We then need to look at the individual entries in the archive .The `getNextEntry()` methid returns an object of tyoe zipEntry that sescribes the entry.
The read methos of the ZipInputStream is modified to return -1 ta the end of the current entry.
