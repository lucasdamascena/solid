## ISP (Interface Segregation Principle)

This principle states that no class should be forced to depend on methods it does not use. In other words, an interface should be specific and should not include methods that are not relevant to all of its implementers.

- Small and Cohesive Interfaces: It’s better to have several small, specific interfaces rather than a single large interface that contains many methods. This allows classes to implement only the interfaces they actually need.


- Reduction of Dependencies: When a class depends on a very large interface, it may end up implementing methods it does not use, which can lead to a fragile and confusing design.