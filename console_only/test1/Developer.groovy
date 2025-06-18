@groovy.transform.ToString()
class Developer {

    // properties - private by default
    String first
    String last
    def languages = []

    // methods - public by default
    void work() {
        println "$first $last is working on their Groovy app!"
        if (languages) {
            println "They know: ${languages.join(', ')}"
        }
    }
}