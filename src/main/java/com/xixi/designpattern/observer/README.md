# Observer Pattern

## Intent
Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Also Known As
Dependents, Publish-Subscribe

## Applicability
Use the Observer pattern when:
* An abstraction has two aspects, one dependent on the other
* A change to one object requires changing others, and you don't know how many objects need to change
* An object should be able to notify other objects without making assumptions about who these objects are

## Structure
![Observer Pattern UML](https://upload.wikimedia.org/wikipedia/commons/a/a8/Observer_w_update.svg)

## Participants
* Subject - Knows its observers and provides an interface for attaching and detaching observers
* Observer - Defines an updating interface for objects that should be notified of changes
* ConcreteSubject - Stores state of interest to ConcreteObserver and sends notifications
* ConcreteObserver - Maintains a reference to a ConcreteSubject and implements the Observer updating interface

## Real-world examples
* Java's EventListener
* JavaScript event systems
* News agencies and subscribers
* MVC architecture patterns
