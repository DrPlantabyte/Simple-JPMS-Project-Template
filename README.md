# My Java Project

No description

# Developer Notes

## How to Compile and Run

To compile this project, you must have the JDK installed and the `JAVA_HOME` system environment variable set to the filepath of your JDK. 

### Project Structure

```
(project root)
+ dependencies
| |
| + *.jar
| + *.jmod
|
+ sources
| |
| + modulename
|   |
|   + module-info.java
|   + package/name/path
|     |
|     + *.java
|
+ resources
| |
| + modulename
|   |
|   + package/name/path
|     |
|     + files
+ build
| |
| + compile
| + jar
| + jlink
| + jpackage
|
+ run
```

### Compile to Jar File

```bash
javac @javac-args.txt
cp resources/* build/compile
jar @jar-args_core-module.txt
jar @jar-args_test-module.txt
jar @jar-args_app-module.txt
```

### Run

```bash
javac @javac-args.txt
cp resources/* build/compile
java @java-args_run-app.txt
```

### Build Java-Doc Website 

```bash
javadoc @javadoc-args.txt
```

### Create App Image

```bash
rm -rf build/*
javac @javac-args.txt
cp resources/* build/compile
jlink @jlink-args.txt
```

### Create Native Installer

```bash
rm -rf build/*
javac @javac-args.txt
cp resources/* build/compile
jlink @jlink-args.txt
jpackage @jpackage-args.txt
```

### Clean-Up Project Files

```bash
rm -rf build/*
rm -rf run/*
```

## Adding New Modules

Run the following terminal commands to create a new module and modify the build files, creating a new `@jar-args_test-module.txt` file for building the module .jar file.

