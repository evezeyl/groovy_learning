
## App structure
cd /home/evezeyl/Documents/Insync/gdrive/WORK/GITS/PERSO/groovy_learning/first_app

first_app/
├── src/
│   └── main/
│       └── groovy/ // location source files
│           └── com // replace with own package structure 
│               └── example/
│                   └── MyApp.groovy
├── lib/ // for external libraries .jar
├── README.md
└── build.gradle (or build.gradle.kts for Kotlin DSL)

// recommended to use gradle for build automation


## Making groovy run simply 

cd console_only

1. option
```
# create a file with instructions to do stuff 
touch myapp.groovy
# compile 
groovyc myapp.groovy
# run 
groovy myapp
```

2. groovy console
```
# create a file with instructions to do stuff and open in console
groovyConsole myapp.groovy 
# run the file ctrl + R
```

3. IDE project (eg. intelliJ)
```
# new directory for the project
# create file with groovy script
``` 

Run [groovy on vscode](https://www.youtube.com/watch?v=bh2zQkJFPmE)

- use `code-groovy` extension for language support
- use `Code Runner` to allow running the code -> run (ctrl+alt+N)


!! if app script is not compile before using the console, it wont work !! 
because it appear the console is looking for a main method, which it does not find (so does not fit the criteria as runable script)


4. Easeyoursel with gradle
- init on a new repository ... 
- run ... compile for you