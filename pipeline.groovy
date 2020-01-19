pipeline {
   agent {
    node {
      label " "
    }
   }
    stages {
        stage('build') {
            steps {
                def workspace = "/var/lib/jenkins/workspace/JavaProject_Pipeline/initial"
                sh 'mvn compile'
            }
        }
    }
}
