lazy val root = (project in file("."))

lazy val execScript = taskKey[Unit]("Execute the shell script")

execScript := {
  "yourshell.sh" !
}


lazy val listdir = taskKey[Unit]("show current dir")

listdir := {
  "ls -l" !
}

lazy val curl = taskKey[Unit]("Execute curl")

curl := {
val r = <x> "curl -u admin:admin http://localhost:4502/crx/packmgr/service.jsp " ! </x>
r
}

// curl -u admin:admin -X POST http://localhost:4502/system/console/jmx/com.adobe. granite:type=Repository/op/startBackup/java.lang.String?target=backup.zip
