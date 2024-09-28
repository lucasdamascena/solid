## LSP (Liskov Substitution Principle)

States that objects of a base class should be replaceable with objects of a derived class without altering the desired properties of the program.

Key Points:

- Contracts: Derived classes must honor the contracts established by the base class. This includes maintaining the preconditions, postconditions, and invariants of state.

- Consistent Behavior: Derived classes should not alter the expected behavior of the base class. If a base class provides a method, the derived class must implement that method in a way that does not cause unexpected side effects.

- Polymorphism: The Liskov Substitution Principle (LSP) is a fundamental part of polymorphism in object-oriented programming, allowing you to write code that works interchangeably with different implementations of a class.