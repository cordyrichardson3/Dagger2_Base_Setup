# Dagger2_Base_Setup
setup for Dagger2 (gradle settings, basic file structure and components). Non-Android

This is a base setup for dagger 2 in Java/Kotlin (non-Android).
Important note for the gradle file: the method 

'annotationProcessor 'com.google.dagger:dagger-compiler:2.13'

does not correctly process the Dagger-related annotations and fails to create the auto-generated Dagger files (i.e DaggerComponent).
Instead, add plugin "net.ltgt.apt" and use gradle method 

apt 'com.google.dagger:dagger-compiler:2.13'

as below:

plugins {
    id 'java'
    id 'idea'
    id "net.ltgt.apt" version "0.10"
}

apt 'com.google.dagger:dagger-compiler:2.13'



