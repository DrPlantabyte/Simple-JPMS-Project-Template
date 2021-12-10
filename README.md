# Java Project Template

Replace this text with your project description

# Developer Notes

## How to Compile and Run

To compile this project, you must have the JDK installed and the `JAVA_HOME` system environment variable set to the filepath of your JDK. 

### Project Structure

```
(project root)
+ dependencies/
| + *.jar
| + *.jmod
|
+ sources/
| + modulename/
|   + module-info.java
|   + package/name/path/
|     + *.java
|
+ resources/
| + modulename/
|   + package/name/path
|     + files
|
+ build/
  + compile/
  + javadoc/
  + jar/
  + jlink/
  + jpackage/
```

### Compile to Jar File

```bash
javac @javac-args.txt @module-list.txt
cp -r resources/* build/compile
mkdir -p build/jar
jar @jar-args_core-module.txt
jar @jar-args_app-module.txt
jar @jar-args_test-module.txt
```

### Run

First, compile the .jar files as listed above, then run:

```bash
java @java-args_run-app.txt
```

### Build Java-Doc Website 

```bash
javadoc @javadoc-args.txt @module-list.txt
```

### Create App Image

```bash
rm -rf build/*
javac @javac-args.txt @module-list.txt
cp -r resources/* build/compile
jlink @jlink-args.txt @module-list.txt
```

### Create Native Installer

First run the above commands to create an app image, then run the following command:

```bash
jpackage @jpackage-args.txt
```

### Clean-Up Project Files

```bash
rm -rf build/*
rm -rf run/*
```

## Adding New Modules

Run the following terminal commands to create a new module and modify the build files, creating a new `@jar-args_test-module.txt` file for building the module .jar file.

```bash
MODULENAME="mydomain.mymodule.test"; mkdir -p sources/$MODULENAME/${MODULENAME//./\/}; mkdir -p resources/$MODULENAME/${MODULENAME//./\/}; echo "module $MODULENAME {exports $MODULENAME;}" > sources/$MODULENAME/module-info.java; echo "package $MODULENAME; public class Main{public static void main(String[] args){System.out.println(Main.class);}}" > sources/$MODULENAME/${MODULENAME//./\/}/Main.java; echo "--create --file build/jar/$MODULENAME-0.0.0.jar --module-version 0.0.0 -C build/compile/$MODULENAME ." > jar-args_$MODULENAME.txt; echo "$MODULENAME," >> module-list.txt
```

