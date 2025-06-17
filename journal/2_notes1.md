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


Making groovy run 

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

