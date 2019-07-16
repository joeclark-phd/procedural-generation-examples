# procedural-generation-examples

This repo contains a simple Java program to run some examples of procedural generation from my `net.joeclark.proceduralgeneration` package.

- Random text generation from [joeclark-phd/random-text-generators](https://github.com/joeclark-phd/random-text-generators).  

  - MarkovTextGenerator
    - MarkovCasePreservingTextGenerator
  - RandomDrawGenerator
  - DoubleTextGenerator


## To run
The **random-text-generators** package is now available from [Maven Central](https://search.maven.org/search?q=g:%22net.joeclark.proceduralgeneration%22%20AND%20a:%22randomtextgenerators%22).  Maven users, for example, import the dependency like so:

    <dependency>
      <groupId>net.joeclark.proceduralgeneration</groupId>
      <artifactId>randomtextgenerators</artifactId>
      <version>1.0</version>
    </dependency>

Next, clone or download this repo to your system, open and run it in an IDE (I use IntelliJ).  Run the Main class.

If you insist on running it from the command line, add the dependency to your classpath like so:

    mvn compile
    java -cp ".\target\classes\;C:\Users\<you>\.m2\repository\net\joeclark\proceduralgeneration\randomtextgenerators\1.0-SNAPSHOT\randomtextgenerators-1.0-SNAPSHOT.jar" Main

## Training data
Training data files are stored in the `src/main/resources` directory if you'd like to add some of your own.  Contributions of data are welcome, as long as you're not violating someone's intellectual property.  Just fork and open a pull request.

## Example output

    Examples of random text using MarkovTextGenerator
    
    ROMAN NAMES:
    ligula
    ancus
    filius
    colus
    cotepos
    inguonegorix
    papullico
    fasticens
    sollicjan
    verus
    
    ROMAN NAMES ENDING IN -ia:
    enrruscia
    lucia
    lucia
    narcia
    maria
    maximia
    ankrystia
    maelinicia
    tercia
    mauquiria
    
    VIKING MALE NAMES:
    asgauthor
    eyvinxi
    varthrin
    than
    iarli
    trœdipday
    blæng
    æråsmbi
    saxfn
    hemingimundi
    
    VIKING FEMALE NAMES:
    blæik
    astvild
    hild
    hrodny
    ragnfwhite
    jarnurid
    gudrun
    jorunnhild
    astvi
    hildis
    
    Examples of random text using MarkovTextCasePreservingGenerator
    
    UK SURNAMES (case preserved):
    Farham
    Trevory
    Daly
    Ackarson
    Dunfarlan
    Cawlings
    Eanswort
    Gascott
    Farr
    Shied

    Examples of random text using RandomDrawGenerator
    
    RANDOM DRAW UK SURNAMES
    forshaw
    trickett
    ventura
    gunning
    sparkes
    yeldon
    whitehead
    walpole
    cumming
    holt
    
    Examples of random text using DoubleTextGenerator
    
    VIKING MALE MARKOV TEXT + ROMAN MARKOV TEXT:
    bjorn nelis
    thidrnjojorn pastor
    øpi  merus
    hallvni sirilius
    æskil commodus
    gärdun ligula
    thorar catus
    hard titilis
    thorodgæira elisauncus
    autyrmivafni taenus
    
    VIKING FEMALE MARKOV TEXT + RANDOM DRAW UK SURNAME:
    doæikstylve pomphrey
    skuerd bostock
    gulfhruda gillett
    blesi ropple
    thkatla lennon
    oddis bush
    freøvinunn ballantyne
    asgerdis stoddart
    herkja legge
    ingrlaug thornley
