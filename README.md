- command to generate jacoco report
    - `mvn jacoco:report`
- command to run test and generate pitest report
    - `mvn test org.pitest:pitest-maven:mutationCoverage` 
    - `mvn -DWithHistory org.pitest:pitest-maven:mutationCoverage`