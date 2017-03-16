javac *.java
echo "Files Compiled";
rmic AdderRemote
echo "rmic AdderRemote";
echo "rmiregistry 5000";
rmiregistry 5000
