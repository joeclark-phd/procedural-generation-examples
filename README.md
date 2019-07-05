# procedural-generation-examples

This repo contains a simple Java program to run some examples of procedural generation from my `net.joeclark.proceduralgeneration` package:

- Currently there's only one artifact, **MarkovTextGenerator**, found in [joeclark-phd/random-text-generators](https://github.com/joeclark-phd/random-text-generators).  This reads text strings from a training data set (i.e. a file of real-world names) and generates original random text that should be similar-sounding to the training data. 


## To run
First, clone or download the **random-text-generators** project, `cd` into that directory, and use Maven to install it to your local Maven repository: 

    mvn install

Next, clone or download this repo to your system, open and run it in IntelliJ or something.

If you insist on running it from the command line, add the dependency to your classpath like so:

    mvn compile
    java -cp ".\target\classes\;C:\Users\<you>\.m2\repository\net\joeclark\proceduralgeneration\randomtextgenerators\1.0-SNAPSHOT\randomtextgenerators-1.0-SNAPSHOT.jar" Main

## Training data
Training data files are stored in the `src/main/resources` directory if you'd like to add some of your own.

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
