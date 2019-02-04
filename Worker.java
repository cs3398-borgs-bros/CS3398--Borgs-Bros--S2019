{\rtf1\ansi\ansicpg1252\deff0\nouicompat\deflang1033{\fonttbl{\f0\fnil Consolas;}{\f1\fnil\fcharset0 Calibri;}}
{\colortbl ;\red63\green127\blue95;\red127\green0\blue85;\red0\green0\blue0;}
{\*\generator Riched20 10.0.15063}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\cf1\f0\fs20\lang9 /*The Open Close Principle applies to the Worker class becuase \cf0\par
\cf1 the existing code is "Closed" for modification. The existing \cf0\par
\cf1 methods are not modified. "Open" for modification is shown by \cf0\par
\cf1 adding new functionality by implementing the new interfaces \cf0\par
\cf1 rather than modifying the existing code.\cf0\par
\cf1 The Single Responsibility Principle applies to the Worker class \cf0\par
\cf1 because only the Worker role is responsible for each of the \cf0\par
\cf1 methods in the Worker class. This means only the Worker object \cf0\par
\cf1 will invoke the methods in the Worker class\cf0\par
\cf1 The Interface Segregation Principle is shown in the Worker \cf0\par
\cf1 class because rather than implementing a big multi purposed \cf0\par
\cf1 interface that offers more functionality than needed, it implements \cf0\par
\cf1 2 focused interfaces that provide only what is needed by the Worker \cf0\par
\cf1 class. IWorkable and IFeedable were seperated into seperate interfaces \cf0\par
\cf1 due to the introduction of the Robot class. //Having the work and eat \cf0\par
\cf1 methods in one interface would violate //the Interface Segregation \cf0\par
\cf1 Principle because robots don't eat. //Providing an inteface to the Robot \cf0\par
\cf1 class with an eat method //would be the perfect example of a fat interface \cf0\par
\cf1 that provides //more functionlity than needed.\cf0\par
\cf1 */\cf0\par
\par
\cf2\b package\cf3\b0  threesolid;\cf0\par
\par
\cf2\b class\cf3\b0  Worker \cf2\b implements\cf3\b0  IWorkable, IFeedable\{\cf0\par
\cf3\tab\cf2\b public\cf3\b0  \cf2\b void\cf3\b0  work() \{\cf0\par
\cf3\tab\tab\cf1 // ....working\cf0\par
\cf3\tab\}\cf0\par
\par
\cf3\tab\cf2\b public\cf3\b0  \cf2\b void\cf3\b0  eat() \{\cf0\par
\cf3\tab\tab\cf1 //.... eating in launch break\cf0\par
\cf3\tab\}\cf0\par
\cf3\}\cf0\f1\fs22\par
}
 