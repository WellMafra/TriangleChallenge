# TriangleChallenge
## Architectural Explanation

I have decided to use _**DDD**_ concept, mainly on _Length_ class for some reasons:

No classes inside my application knows that internally I'm using a _BigDecimal_, I could have used anything.
I would be able to exchange the implementation if needed for performance reasons or memory reasons and my code base would not be affected. _**It's encapsulation**_.

I decided to use _factory_ methods in order to produce objects in place of using ```new Length()``` constructor. The problem of  ```new Length()``` that is not a _refactor-friendly_. In my implementation, if I want to create another type of _Length_ I just need to create another factory method because all the logic of object creation will be inside of the factory methods.

_Immutability_
I can check the state of the object on the factory method. I'm reducing the logic validation to only one method on my code, if there is a Length object on my application I know that it is correct, because it's being validated before the object creation, by doing this I can assure that my object will always be valid.
