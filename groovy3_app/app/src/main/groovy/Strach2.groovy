class Scratch2 {
    static void main(String[] args) {
        println "✅ Hello from the Groovy scratchpad!"
        println "Groovy version: ${GroovySystem.version}"
        
        // --- Your interactive test code goes here ---
        
        def myList = [1, 2, 3, 4, 5]
        def squaredList = myList.collect { it * it }
        
        println "Original list: $myList"
        println "Squared list: $squaredList"
    }
}