> ### All data structures implementations
>
> For a list of all the data structures I have implemented, click [here](https://gist.github.com/contactsunny/4a97886c7da57461efa8cd2538a49dbc).

---

# Single Dimension Array Implementation POC in Java

This is a simple example of a single dimension array implementation in Java. We create a ```SingleDimensoinArray``` class
 which can take values of generic type ```T```, so that we can create arrays of different types using the same 
 implementation class. 

# Use of the generic class ```T```

If you check the ```SingleDimensoinArray``` class, I'm taking the generic class ```T``` as the type of the value field. 
This is so that during runtime, we can have a string array or integer array, or an array of a custom class as well. 
```T``` is a generic class in Java, the type of which can be decided in runtime.

# Running the project

Once you clone this repo, ```cd``` into the project root directory and run the following command to compile and build this maven project:

```shell script
mvn clean install
```

Once you run this command, Maven will build the project and keep it in the ```/target``` directory in the project root directory.
You can run the program using the command below:

```shell script
java -jar target/single_dimension_array_data_structure_poc-1.0-SNAPSHOT.jar
```
