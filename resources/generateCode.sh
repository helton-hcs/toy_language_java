#!/bin/bash

rm -f ./../src/toyLanguage/gen/*
java -jar /usr/local/lib/antlr/antlr-4.4-complete.jar -o ./../src/toyLanguage/gen -no-listener -visitor ToyLanguage.g4