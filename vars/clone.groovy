def call(String giturl, String branch, , String credentialsId = null){
  echo "This is cloning the code"
  echo "Cloning repository: ${giturl}, branch: ${branch}"
  git url : giturl , branch : branch
  // or
  // git url : "${giturl}" , branch : "${branch}"
  echo "code cloning successfull"
}
