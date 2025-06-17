class Developer {

    // properties
    String first
    String last
    def languages = []

    // methods
    void work() {
        println "$first $last is working on their Groovy app!"
        if (languages) {
            println "They know: ${languages.join(', ')}"
        }
    }
}
