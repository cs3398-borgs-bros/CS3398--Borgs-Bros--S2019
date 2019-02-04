{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033{\fonttbl{\f0\fnil\fcharset0 Courier New;}{\f1\fnil\fcharset0 Calibri;}}
{\colortbl ;\red0\green0\blue0;}
{\*\generator Riched20 10.0.15063}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22 //The Open Close Principle applies to the Worker class becuase the //existing code is "Closed" for modification. The existing //methods are not modified. "Open" for modification is shown by //adding new functionality by implementing the new interfaces //rather than modifying the existing code.\par
//The Single Responsibility Principle applies to the Worker class //because only the Worker role is responsible for each of the //methods in the Worker class. This means only the Worker object //will invoke the methods in the Worker class\par
//The Interface Segregation Principle is shown in the Worker class //because rather than implementing a big multi purposed interface //that offers more functionality than needed, it implements 2 //focused interfaces that provide only what is needed by the //Worker class. IWorkable and IFeedable were seperated into //seperate interfaces due to the introduction of the Robot class. //Having the work and eat methods in one interface would violate //the Interface Segregation Principle because robots don't eat. //Providing an inteface to the Robot class with an eat method //would be the perfect example of a fat interface that provides //more functionlity than needed.\par
\par

\pard\cf1\kerning24\f1\fs36\par

\pard\sa200\sl276\slmult1\cf0\kerning0\f0\fs22\par
\par
class Worker implements IWorkable, IFeedable\{\par
\tab public void work() \{\par
\tab\tab // ....working\par
\tab\}\par
\par
\tab public void eat() \{\par
\tab\tab //.... eating in launch break\par
\tab\}\par
\}\f1\lang9\par
}
 