# Boolean Algebra Identities
### DeMorgan's Theorem:
```
not(A and B) == (not A    or    not B)
```
### Additive Identities:
```
(A    or    false) == A
(A    or    true) == true
(A    or    A) == A
(A    or    not A) == true
```
### Multiplicative Identities:
```
(A and false) == false
(A and true) == A
(A and A) == A
(A and not A) == false
```

# Java symbols
```java
// DeMorgan's Theorem:
!(A && B) == !A || !B

// Additive Identities:
(A || false) == A
(A || true) == true
(A || A) == A
(A || !A) == true

// Multiplicative Identities:
(A && false) == false
(A && true) == A
(A && A) == A
(A && !A) == false
```

# Simplification Example (Words)
```
not( not( A    or    B and C )    or    not( A and not B) )
=> 
=> 
=> 
=> 
=> 
=> A and not B
```

# Simplification Example (Java Symbols)
```javac
!( !( A || B && C ) || !( A && !B) )
=> 
=> 
=> 
=> 
=> 
=> A && !B
```
