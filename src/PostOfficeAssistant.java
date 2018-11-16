/*
The PostOfficeAssistant has no attributes.
It has the stamp method that receives a letter and uses its stamp method.
It also has the send method that receives a letter,
 if it is stamped it says they will send it to the address it
  says in the letter; if it is not stamped it says they need to stamp it first.

 */

public class postOfficeAssistant{
    private Letter letter;

    public void setLetter(Letter letter) {this.letter = letter;}
    public boolean stamp(){
        public Boolean isStamped = true;
        return isStamped = true;
    }
    public void send(letter){
        boolean isStamped = isStamped();
        if (isStamped == true){
            System.out.println("We will send it to the indicated address.");
        }
        else
        {
            System.out.println("Stamp it first!");
        }
    }

}
