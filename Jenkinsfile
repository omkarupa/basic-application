pipeline {
  agent any
  environment {
    PATH = "C:\\Program Files\\apache-maven-3.9.8\\bin"
  }
  stages {
    stage('SCM checkout'){
      steps{
        git branch: 'main', url:'https://github.com/omkarupa/basic-application'
      }
    }
    stage('Compile-Package'){
      steps{
          bat 'mvn clean compile'
      }
    }
  }
}
