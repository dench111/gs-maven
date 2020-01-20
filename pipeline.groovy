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
        }
    }
}
