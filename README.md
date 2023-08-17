
## Simple Example for mutation testing in maven project using Pitest 
#### Following mutants will be introduced
- Conditionals Boundary Mutator (CONDITIONALS_BOUNDARY)
- Increments Mutator (INCREMENTS)
- Invert Negatives Mutator (INVERT_NEGS)
- Negate Conditionals Mutator (NEGATE_CONDITIONALS)
- Void Method Call Mutator (VOID_METHOD_CALLS)
- Math Mutator (MATH)

#### Command
- generate jacoco report
    - `mvn jacoco:report`
- run test and generate pitest report
    - `mvn test org.pitest:pitest-maven:mutationCoverage` 
    - `mvn -DWithHistory org.pitest:pitest-maven:mutationCoverage`
