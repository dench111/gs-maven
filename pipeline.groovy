pipeline {
   agent {
    node {
      label " "
    }
   }
    stages {
        stage('build') {
            steps {
                sh 'mvn compile'
            }
        }
    }
}
