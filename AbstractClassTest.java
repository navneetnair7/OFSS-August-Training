public class AbstractClassTest {
    public static void main(String[] args) {
        StringBasedMusicalInstrument stringInstrument= new Violin();
        stringInstrument.tuneStrings();
        stringInstrument.play();
    }
}

abstract class Performance {
    abstract void included();
}

//an abstract class may or may not have abstract methods
abstract class MusicalInstrument // <-- with partial contract
{
    abstract void play(); //partial contract | optional | not mandatory
    //but abstract methods must reside in an abstract class
    //above method is a mandate for its non-abstract immediate children
    void included() {
        System.out.println("Musical Instruments are included in the performance");
    }
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{ //for abstract child its NOT at all a compulsion to implement the contracts of the abstract parent
    abstract void tuneStrings();
}

//The type Guitar "must" implement the inherited abstract method MusicalInstrument.play()
//The type Guitar must implement the inherited abstract method StringBasedMusicalInstrument.tuneStrings()
class Guitar extends StringBasedMusicalInstrument //non-abstract
{
    void play() { //mandate is fulfilled
        System.out.println("Playing Guitar....");
    }
    void tuneStrings() { //mandate is fulfilled
        System.out.println("Tuning the Strings of a Guitar....");
    }
}

class Violin extends StringBasedMusicalInstrument //non-abstract
{
    void play() { //mandate is fulfilled
        System.out.println("Playing Violin....");
    }
    void tuneStrings() { //mandate is fulfilled
        System.out.println("Tuning the Strings of a Violin....");
    }
}

class Sitar extends StringBasedMusicalInstrument //non-abstract
{
    void play() { //mandate is fulfilled
        System.out.println("Playing Sitar....");
    }
    void tuneStrings() { //mandate is fulfilled
        System.out.println("Tuning the Strings of a Sitar....");
    }
}


class ElectronicGuitar extends Guitar //non-abstract
{
    void play() { //not mandatory | it is overridden and that is optional
        System.out.println("Playing ElectronicGuitar..with presets......");
    }
    void tuneStrings() { //not mandatory | it is overridden and that is optional
        System.out.println("Tuning the Strings of a ElectronicGuitar....");
    }
}

abstract class AirBasedInstrument extends MusicalInstrument {
    abstract void clean();
}

class Flute extends AirBasedInstrument {
    void play() {
        System.out.println("Playing Flute...");
    }
    void clean() {
        System.out.println("Cleaning the holes of your flute...");
    }
}

class Trombone extends AirBasedInstrument {
    void play() {
        System.out.println("Playing Trombone...");
    }
    void clean() {
        System.out.println("Cleaning your trombone");
    }
}

class Trumpet extends AirBasedInstrument {
    void play() {
        System.out.println("Playing Trumpet");
    }
    void clean() {
        System.out.println("Cleaning your trumpet");
    }
}

abstract class DrumBasedInstrument extends MusicalInstrument {
    abstract void setup();
}

class Drums extends DrumBasedInstrument {
    void play() {
        System.out.println("Playing Drums tsssssssss");
    }
    void setup() {
        System.out.println("Setting up your drum set");
    }
}

class Tabla extends DrumBasedInstrument {
    void play() {
        System.out.println("Playing Tabla");
    }
    void setup() {
        System.out.println("Tuning and setting your tabla");
    }
}

class Cymbals extends DrumBasedInstrument {
    void play() {
        System.out.println("Playing Cymbals");
    }

    void setup() {
        System.out.println("Setting up your Cymbals");
    }
}

abstract class Singers {
    abstract void sing();
    void include() {
        System.out.println("Singers are included in the performance");
    }
}

class MaleLead extends Singers {
    void sing() {
        System.out.println("Male Singer singing");
    }
}

class FemaleLead extends Singers {
    void sing() {
        System.out.println("Female Singer singing");
    }
}

class AccompanyingSingers extends Singers {
    void sing() {
        System.out.println("Accompanying Singers helping with the background tones");
    }
}