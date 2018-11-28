"# concourse_test" 
cf login -a api.run.pivotal.io -u {e-mail} -p {password}

cf push kantanPro -p target/kantanPro-0.0.1-SNAPSHOT.jar -b https://github.com/cloudfoundry/java-buildpack.git
