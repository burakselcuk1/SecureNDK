#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_base_securendk_MainActivity_getApi(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "kdskşfkjş32434şfjkasdjfşsd");
}
