@groovy.transform.ToString()
class Tweet {

    String user
    Integer age
    String message
    
    void myout() {
        println "$user which is $age.toString() old said $message"
        }

    void myout2() {
        println "$user which is $age old said $message"
          }



}
