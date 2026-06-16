pipeline {
  agent 'any'
  
  tools {
   mvn 'Maven'
  }
  
  stages {
   stage('Checkout') {
    steps {
     git brach:'master', url:'https://github.com/mithun2311/mavenselenium'
    }
   }
   
   stage('Build') {
    steps {
     sh 'mvn clean package'
    }
   }
   
   stage('Test') {
    steps {
     sh 'mvn test'
    }
   }
   
   stage('Run Application') {
    steps {
     sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
    }
   }
  }
  
  post {
  success {
  echo 'Build and Deployment Successful'
  }
  failure {
  echo 'Build failed'
 }
}
}
