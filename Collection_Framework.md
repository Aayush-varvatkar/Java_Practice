The Java Collection Framework is a unified architecture for storing and manipulating groups of objects.

> Operations of ArrayList
      add, remove, contain, set, clear

> Operations on Stack
      Push, pop, peek

> Operations on Queue
      Offer, poll, peak         => this operations dose'nt throw's exceptions
      add, remove, elament      => This operations does same work, but throws exception if the operation fail

> Priority Queue
      Smallest or the largest elements holds the higher priority

> Array Deque
      offer, OfferFirst, OfferLast, Same with peek and Poll


> Hash Set
      - Hast set does not allow duplicate elements
      - Does not have an order of storing
      add, remove, contain, isEmpty, size, clear

> LinkedHashSet
      - inheriet the propertices of LinkedList As well As HashSet
      - Stored in order in which it has been entered
      add, remove, contain, isEmpty, size, clear

> TreeSet
      - Stores data in Sorted Form
      add, remove, contain, isEmpty, size, clear


> equals() in HashSet
      - Used to compare the Logical Equlity of two objects
       it checks if two objects reference point to the same memory location.

       - Syntax:     { public boolean equals(Object obj) }


> Hash Map
      - Stores the values in "KEY - VALUE" pairs
      - Does not allow duplicate (Key) values  - but overrides or update the present value 
      - It stores Key-Value in random order
      put, remove, contain, get, IfAbsent 

> Tree Map
      - Same as HashMap
      - It stores Key-Value in ordered manner
        put, remove, contain, get, IfAbsent


> Arrays class        