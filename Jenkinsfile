pipeline {
  agent any
  environment {
    PATH = "C:\Program Files\apache-maven-3.9.8\bin"
  }
  node {
    stage('SCM checkout'){
      git branch: 'main', url:'https://github.com/omkarupa/basic-application'
    }
    stage('Compile-Package'){
      sh 'mvn package'
    }
  }
}
