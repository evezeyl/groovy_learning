# Setup 

-Gemini chat for help


## VSCode extensions
- [groovy linting](https://marketplace.visualstudio.com/items?itemName=NicolasVuillamy.vscode-groovy-lint)
- [code runner](https://marketplace.visualstudio.com/items?itemName=formulahendry.code-runner)

Recommendation added to work environment


## package manager

- installation [SDKMAN](https://sdkman.io/)

```bash
curl -s "https://get.sdkman.io" | bash
# was already installed
sdk selfupdate force
# SDKMAN 5.19.0
```

- installation java jdk (see gemini notes for info on versions)
```bash
sdk list java
sdk install java 21.0.7-tem  
# setting as default
sdk use java 21.0.7-tem  
```

- installing groovy 
    - [groovy language](https://groovy-lang.org/)

```bash
sdk list groovy
# latest stable is 4
sdk install groovy 4.0.27
sdk use groovy 4.0.27
```

- installing [Gradle](https://gradle.org/) - build automation tool (to ensure reproducibility)
> gradle wrapper gradlew - automatically uses specific version of gradle after

```bash
sdk list gradle
sdk install gradle 8.14.2
sdk use gradle 8.14.2
```

control 
```bash
java -version
# openjdk version "21.0.7" 2025-04-15
# OpenJDK Runtime Environment (Red_Hat-21.0.7.0.6-2) (build 21.0.7+6)
# OpenJDK 64-Bit Server VM (Red_Hat-21.0.7.0.6-2) (build 21.0.7+6, mixed mode, sharing)

```

going to the app directory
```bash
cd test_groovy_app
```

Initialize a Groovy application project (development will be done there)
```bash
gradle init --type groovy-application
# choose single application project for a starter
# default api choice (stable)
```

the `build.gradle` file in the app directory handles the libraries that are declared.
only need to add them to dependencies block.

To make the import and build , and make gradle automatically download the libraries: 

```bash
./gradlew build
# OR
./gradlew run
```

Then library need to be imported in the code.
eg. 

```groovy
import org.json.JSONObject
```

## helpers for learning

- groovy shell `groovysh` -> but wont know about gradle - good for experimenting
- groovy compiler `groovyc`

- integration : gradle task -> launch groowy shell for the whole project - allows to run interactively tests for own lcasses and libraries
Adding to the app/build.gradle file. Also adding shell integration


```bash
# Launching groovy console
./gradlew runConsole
#./gradlew runShell # never manage to make this work even with debugging
# ./gradlew runShell --debug
./gradlew --stop
./gradlew clean runConsole --refresh-dependencies
```

```bash

```

gradle lib version `.lib.version.toml` -> edited to use correct groovy
Need some preliminary debugging 

> Ok - I see that the appache version of groovy is 3 ... with gradle so will start with that
**shift to groovy3_app**LINK 


- added tasks - examples commands to run gradle 

```bash
./gradlew runConsole
./gradlew clean runConsole --refresh-dependencies

# scratch pads examples // src/main/groovy/Scratch.groovy, Scratch2.groovy 
 ./gradlew runScratch
 ./gradlew runScratch2 --no-build-cache 
```

- modified gradle properties - so it can run with no cache by default - easier in the beginning to be sure it does what it should do
