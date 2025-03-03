def call(String giturl, String branch, String credentialsId = null){
  echo "This is cloning the code"
  echo "Cloning repository: ${giturl}, branch: ${branch}"
  //git url : giturl , branch : branch
  // or
  git url : "${giturl}" , branch : "${branch}"
  sh '''
            echo "data/" > .dockerignore
            echo "*.tmp" >> .dockerignore
        '''
  echo "code cloning successfull"
}
