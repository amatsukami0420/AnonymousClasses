# AnonymousClasses (Java)

A minimal Java project demonstrating the use of anonymous classes. The example creates a Dog instance and an anonymous subclass overriding the bark method, and invokes both to illustrate how anonymous classes work in Java.

## Overview

- Topic: Anonymous classes in Java
- Main entry point: `src/TestClass.java` (`public static void main(String[] args)`) 
- Core classes:
  - `Dog` — base class with a `bark()` method
  - `TestClass` — contains `main` and an example of an anonymous class extending `Dog`

## Tech Stack

- Language: Java (no frameworks detected)
- Build tool / package manager: None detected (IntelliJ IDEA project file present: `AnonymousClasses.iml`)
- IDE support: IntelliJ IDEA compatible (based on `.iml` file), but any Java IDE or CLI works

## Requirements

- Java Development Kit (JDK) 8 or newer recommended
  - Exact version not pinned in the repo. If you have issues, try JDK 8, 11, or 17.
- Optional: IntelliJ IDEA (Community or Ultimate) or any Java-capable IDE
- Operating system: Any platform with a JDK; Windows paths are shown below because this project is located on Windows

## Project Structure

```
AnonymousClasses/
├─ src/
│  ├─ Dog.java
│  └─ TestClass.java
├─ out/                      # compiled classes (generated locally; may vary)
│  └─ production/AnonymousClasses/
│     ├─ Dog.class
│     ├─ TestClass.class
│     └─ TestClass$1.class   # anonymous inner class
├─ AnonymousClasses.iml       # IntelliJ IDEA module file
└─ README.md
```

## Setup and Running

You can run this project either via IntelliJ IDEA or via the command line. The commands below assume your current working directory is the project root.

### 1) Run with IntelliJ IDEA

1. Open the project folder in IntelliJ IDEA (File -> Open -> select the `AnonymousClasses` folder).
2. Ensure a suitable JDK is configured (File -> Project Structure -> Project SDK).
3. Open `src/TestClass.java`.
4. Click the Run icon next to `main`, or use Run -> Run 'TestClass'.

### 2) Run from the Command Line (Windows PowerShell examples)

Compile the Java sources into an `out` folder:

```powershell
# From the project root
New-Item -ItemType Directory -Force -Path .\out > $null
javac -d .\out .\src\Dog.java .\src\TestClass.java
```

Run the program using the classpath pointing at the compiled output. Since there is no package declaration, use the simple class name:

```powershell
java -cp .\out TestClass
```

Notes:
- If `java` or `javac` aren’t found, ensure your JDK `bin` directory is on the PATH.
- On macOS/Linux, adapt paths and use `/` separators; the commands are otherwise equivalent.

## Scripts

No project scripts are defined. Use the manual compile/run commands above.

- Build: `javac -d out src/Dog.java src/TestClass.java`
- Run: `java -cp out TestClass`

If you introduce a build tool (e.g., Maven/Gradle) later, document the scripts here.

## Environment Variables

None required.

## Tests

No tests are present.

- TODO: Add unit tests (e.g., using JUnit) to verify behavior of `Dog` and the anonymous override.

## Extending the Example

- Add a package declaration (e.g., `package demo;`) and update compile/run commands accordingly.
- Demonstrate anonymous classes with interfaces (e.g., `Runnable`) and callbacks.
- Contrast with lambdas (for functional interfaces) in newer Java versions.

## Troubleshooting

- Class not found when running: ensure you compiled to `out` and run with `-cp out`.
- Multiple JDKs installed: verify `java -version` and `javac -version` match and are the versions you expect.

## License

- TODO: Add a license file (e.g., MIT, Apache-2.0) and reference it here.
