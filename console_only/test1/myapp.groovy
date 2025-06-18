// create new instance of developer 
Developer d = new Developer()

// call the setter method (one just shorter)
d.first = "Eve" 
d.setLast("Zeyl")

// execute the method to print the developer's name
// d

// assign languages
// step 1: check the class (2 equivalent ways)
//d.languages.getClass().getName() // returns "java.lang.String"
// d.languages.class

// step 2: assign items - operator overloading
// works on lists eg. appends and builders ... not on simple objects
// left shift operator 
d.languages << "groovy" 
d.languages << "Python" 

// call some methods
d.work()
