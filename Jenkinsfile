node {
  stage('SCM checkout'){
    git 'https://github.com/omkarupa/basic-application'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
