#include "HelloJNI.h"
#include <stdio.h>
JNIEXPORT void JNICALL Java_HelloJNI_printHello(JNIEnv *env, jobject object){
  printf("Hello World!\n");
  return;
}
JNIEXPORT void JNICALL Java_HelloJNI_printString(JNIEnv *env, jobject object, jstring string)
{
 const char *str = (*env)->GetStringUTFChars(env,string,0);
 printf("%s!\n", str);
 return;
}
