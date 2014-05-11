EventGenerator
==============

Event Generator and Listener in Java

This project contains Event Generator and Listener for Telephone as an entity.

It provides two events

1. Telephone Rang
2. Telephone Answered

It has two types of Listeners

1. Blocking Listeners: These listeners block the execution till all blocking listeners have finished implementation.
2. Non Blocking Listeners: For these listeners, a thread is swapned for each listener and execution returns to the main flow.

Type of listener can be specified while registering listener with the handler.

Note: Since it uses threading for non-blocking listener output may vary for each run.

P.S. : This work is referred from http://www.javaworld.com/article/2076771/core-java/the--event-generator--idiom.html, but it has all the additional stuff like blocking/non-blocking listeners, it is all my work.
