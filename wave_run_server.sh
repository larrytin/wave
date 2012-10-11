#!/bin/bash

WAVEINBOX_VERSION="0.0.1-SNAPSHOT"
ALL_IN_ONE_JAR="target/moon-wave-$WAVEINBOX_VERSION-jar-with-dependencies.jar"

if [ ! -e $ALL_IN_ONE_JAR ]; then
    echo "Need to run 'mvn assembly:single' for creating the package."
    exit 1
fi

. process-script-args.sh

mvn \
    -Dorg.eclipse.jetty.LEVEL=INFO \
    -Djava.security.auth.login.config=jaas.config \
    -Dwave.server.config=$SERVER_CONFIG \
    exec:java \
    -Dexec.mainClass="org.waveprotocol.box.server.ServerMain"
