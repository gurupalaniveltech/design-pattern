classDiagram
 note "Facade Design pattern"
class SmartPerson { 
    <<Client>>
+ void myMovieSetup()
}

class SmartTV { 
     <<SubSystem>>
+ void on()
+ void off()
+ void playmovie()
}

class SmartAC { 
     <<SubSystem>>
+ void on()
+ void off()
}

class PatternTest { 
+ void main(String[])$
}

class SmartHomeSystem { 
     <<Facade>>
+ void movieNightSetup()
}

class SmartSpeaker { 
     <<SubSystem>>
+ void highVolume()
+ void mediumVolume()
+ void lowVolume()
}

class SmartWindow { 
     <<SubSystem>>
+ void close()
+ void open()
}

class SmartLight { 
     <<SubSystem>>
+ void on()
+ void off()
}

class SmartMovieSystem { 
     <<AdditionalFacade>>
      <<Optional>>
+ void movieTVSetup()
}

SmartHomeSystem --> "1" SmartLight : light
SmartHomeSystem --> "1" SmartWindow : window
SmartHomeSystem --> "1" SmartAC : ac
SmartHomeSystem --> "1" SmartMovieSystem : moviesys
SmartMovieSystem --> "1" SmartTV : tv
SmartMovieSystem --> "1" SmartSpeaker : speaker
SmartPerson --> "1" SmartHomeSystem : homeSystem