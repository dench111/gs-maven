pipeline {
   agent {
    node {
      label " "
    }
   }
    stages {
        stage('build') {
            steps {
                sh 'mvn compile -f /var/lib/jenkins/workspace/JavaProject_Pipeline/initial'
                sh 'mvn package -f /var/lib/jenkins/workspace/JavaProject_Pipeline/initial'
            }
           stage('execute jar') {
              sh 'java -jar target/gs-maven-0.1.0.jar'
           }
        }
    }
}
