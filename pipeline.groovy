pipeline {
   agent {
    node {
      label " "
    }
   }
    stages {
        stage('build') {
            steps {
                sh 'mvn install -f /var/lib/jenkins/workspace/JavaProject_Pipeline/complete'
            }
        }
           stage('execute jar') {
              steps {
              sh 'chmod ugo+rwx /var/lib/jenkins/workspace/JavaProject_Pipeline/complete/target/gs-maven-0.1.0.jar'
              sh 'java -jar /var/lib/jenkins/workspace/JavaProject_Pipeline/complete/target/gs-maven-0.1.0.jar'
           }
        }
    }
}
