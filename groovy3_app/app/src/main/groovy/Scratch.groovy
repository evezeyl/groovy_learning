// This is your interactive test file.
// You can write any code here and run it with './gradlew runScratch'

import org.example.App // Use your project's main App class

println "--- Starting Scratchpad ---"
println ""

// --- WRITE YOUR TEST CODE BELOW ---

// Example 1: Test a class from your project
def app = new App()
println "Testing a project class:"
println "  -> App message: ${app.getGreeting()}"
println ""


// Example 2: Test a dependency like Guava
import com.google.common.collect.ImmutableList

def names = ImmutableList.of("Alice", "Bob", "Charlie")
println "Testing a dependency (Google Guava):"
println "  -> List: ${names}"
println "  -> First name: ${names.get(0)}"
println ""


println "--- End of Scratchpad ---"