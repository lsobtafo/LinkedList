# LinkedList
The game of Assassin is played as follows. You start out with a group of people who want to play the game.  For example, let's say that we have five people playing whose names are Joe, Sally, Jim, Carol and Chris. A circular chain of assassination targets is established (what is called the “kill ring” in the sample log of execution). For example, we might decide Joe should stalk Sally, Sally should stalk Jim, Jim should stalk Carol, Carol should stalk Chris and Chris should stalk Joe.

Joe --> Sally --> Jim --> Carol --> Chris
^                                                                       |
|                                                                       V
+--------<--------<---------<---------+

When someone is assassinated, the chain needs to be re-linked by “skipping” that person. For example, suppose that Jim is assassinated first (obviously this would have been by Sally). Sally needs a new target, so we give her Jim's target: Carol. Thus, the chain becomes:

                   +-------->--------+
                   ^                                |
                   |                                V
Joe --> Sally     Jim     Carol --> Chris
^                                                                       |
|                                                                       V
+--------<--------<---------<---------+

The main program has been written for you and is called AssassinMain. It reads a file of names, shuffles the names, and constructs an object of type AssassinManager. You are writing the AssassinManager class. The main program then asks the user for the names of the victims in order until the game is over (until there is just one player left alive), calling methods of the AssassinManager class to carry out the tasks involved in administering the game.

Your class will keep track of two different lists: the list of those currently alive and the list of those who are dead. Each is to be stored in a linked list (connected nodes). You must use a nested node class inside AssassinManager which is called AssassinNode. The AssassinNode class has three data fields: one for the name of the person, one for the name of the killer and a “next” field (which is an AssassinNode reference) to keep track of the next value/node in the list.  This is a little different than typical Node represenation which has a single data field, but it is a Node nonethless.

The constructor for the AssassinManager class will be passed an object of type List<String>. You can manipulate this object the same way you would manipulate an ArrayList<String>.  So you can call methods like size and get and you can write a for-each loop using this object, but you are not allowed to modify it.  See the Java API as necessary for more information on ArrayList. You will need to include the following line at the beginning of your class to have access to List:

import java.util.*;
