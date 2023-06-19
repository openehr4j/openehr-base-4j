#!/bin/bash

set -e

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

NEW_VERSION=$1

NEW_VERSION_GRADLE="ext['openehrBaseVersion'] = '$NEW_VERSION'"
NEW_VERSION_MAVEN="        <openehr.base.version>$NEW_VERSION<\/openehr.base.version>"

perl -pi -e "s/ext\[.*openehrBaseVersion.*/$NEW_VERSION_GRADLE/g" $SCRIPT_DIR/../../README.md
perl -pi -e "s/.*<openehr\.base\.version>.*/$NEW_VERSION_MAVEN/g" $SCRIPT_DIR/../../README.md
