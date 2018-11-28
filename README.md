"# concourse_test" 
cf login -a api.run.pivotal.io -u tomoyuki-ito@exa-corp.co.jp -p P@ssw0rd

cf push kantanPro -p target/kantanPro-0.0.1-SNAPSHOT.jar -b https://github.com/cloudfoundry/java-buildpack.git