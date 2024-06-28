node {
  stage('SCM checkout'){
    git branch: 'main', url:'https://github.com/omkarupa/basic-application'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
