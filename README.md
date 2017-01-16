Code Cleanup for ExtendJ
======================

This project is an extension to the Java compiler ExtendJ, providing the compiler with
code cleanup functionality.

Cloning this Project
--------------------

To clone this project you will need Git installed.

Use this command to clone the project using Git:

    git clone --recursive git@bitbucket.org:extendj/extension-base.git

The `--recursive` flag makes Git also clone the ExtendJ submodule while cloning
the `extension-base` repository.

If you forgot the `--recursive` flag you can manually clone the ExtendJ
submodule using these commands:

    cd extension-base
    git submodule init
    git submodule update

This should download the ExtendJ Git repository into a local directory named
`extendj`.

Build and Run
-------------

If you have Gradle installed you can issue the following commands to
build and test the extension

    ./gradlew

    ./testscript

testscript runs the compiler with the code cleanup extension on a number of test files
and checks for differences against files containing the expected output. These files can
be found in the testfiles folder. The output files are saved as filename.java.cleaned, while
the expected output is stored as filename.java.expected. The original files are kept under the original
names.



File Overview
-------------

Here is a short explanation of the purpose of each file in the project:

* `build.gradle` - the main Gradle build script. There is more info about this below.
*  `jastadd_modules` - this file contains module definitions for the JastAdd build tool. This
  defines things such as which ExtendJ modules to include in the build, and where
additional JastAdd source files are located.
* `README.md` - this file.
* `gradlew.bat` - Windows Gradle wrapper script (explained above)
* `gradlew` - Unix Gradle wrapper script
* `src/java/org/extendj/CodeCleanUpExtension.java` - main class for the base extension. Parses
  Java files supplied on the command-line and runs the `process()` method on each parsed AST.
* `src/jastadd/ExtensionBase.jrag` - simple aspect containing a single inter-type declaration:
  the `CompilationUnit.process()` method.
* `testfiles/` - folder containing test files
