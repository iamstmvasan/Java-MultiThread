# Java-MultiThread
    
    Its help to know some idea about Multithreading in java
    
    # Prog1
          It's a simple program to create a thread via extends Thread class
    
    # Prog2
          It's a simple program to create a thread via implements Runnable interface
    
    These two program's also using some Thread method's,they are : 
                 ------>   public void run()
                 ------>   start()
                 ------>   sleep(milliseconds)
                 ------>   join()
    # Prog3
          Concept of this program is , There is one class name is 'Printer',
          Printer class have one print method it's accept String array and print it, this is function of this class.
          Now we create another two Thread class's and pass string array to Printer class
          Then start the Thread,Now we have two thread and these two are interrupted by another and printing random order.
          Because we dont use 'synchronized' keyword.
          It prevent our method by blocking another Thread still the current thread is die.
             
    # Prog4
          In this program we overcome the above problem by using 'synchronized' keyword for print method in Printer class.
    
    # Prog5
          This is Incorrect version of Producer and Consumer program
          
    # Prog6
          This is Correct version of Producer and Consumer program
