pipeline {
   agent {
    node {
      label " "
    }
   }
    stages {
        stage('build') {
            steps {
               script {
                def workspace = "/var/lib/jenkins/workspace/JavaProject_Pipeline/initial"
                sh "chmod ugo+rwx $workspace/*"
               }
                sh 'mvn compile -f /var/lib/jenkins/workspace/JavaProject_Pipeline/initial'
            }
        }
    }
}
