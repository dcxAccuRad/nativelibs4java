// test.cpp�: d�finit les fonctions export�es pour l'application DLL.
//

#include "stdafx.h"
#include "test.h"
#include "jni.h"
#include "math.h"

#include <iostream>

// Il s'agit d'un exemple de variable export�e
TEST_API int ntest=0;

// Il s'agit d'un exemple de fonction export�e.
TEST_API void __cdecl voidTest()
{
	//printf("ok\n");
	//std::cout << "Ok\n";
}
TEST_API double __cdecl sinInt(int d)
{
	return sin((double)d);
}

TEST_API double __cdecl testSum(const double *values, size_t n)
{
	double total = 0;
	for (size_t i = 0; i < n; i++) {
		total += values[i];
	}
	return total;
}
TEST_API double __cdecl testSumi(const double *values, int n)
{
	double total = 0;
	for (int i = 0; i < n; i++) {
		total += values[i];
	}
	return total;
}
TEST_API long long __cdecl testSumll(const double *values, int n)
{
	long long value = (long long)testSumi(values, n);
	return value;
}
TEST_API int __cdecl testSumInt(const double *values, int n)
{
	return (int)testSum(values, n);
}
TEST_API void __cdecl testInPlaceSquare(double *values, size_t n)
{
	for (size_t i = 0; i < n; i++) {
		double value = values[i];
		values[i] = value * value;
	}
}

extern "C" {

void otherFunc() {
	//std::cout << "other\n";
}
JNIEXPORT jint JNICALL Java_com_bridj_PerfLib_testAddJNI(JNIEnv *, jclass, jint a, jint b) {
	otherFunc();
	return a + b;
}
TEST_API int __cdecl testAddDyncall(int a, int b)
{
	//if (true)
	//	testAddDyncall(a, b);
	otherFunc();
	return a + b;
}
TEST_API int __cdecl testAddJNA(int a, int b)
{
	otherFunc();
	return a + b;
}
JNIEXPORT jdouble JNICALL Java_com_bridj_PerfLib_testASinB(JNIEnv *, jclass, jint a, jint b)
{
	otherFunc();
	return a * sin((double)b);
}
TEST_API double __cdecl testASinB(int a, int b)
{
	otherFunc();
	return a * sin((double)b);
}

}

Ctest::Ctest()
{
	printf("Ctest::Ctest() (this = %ld, low = %d)\n", (long int)(size_t)this, (int)(0xffffffffLL & (size_t)this));
}
Ctest::~Ctest()
{
}

const std::string& Ctest2::toString() {
	static std::string s = "";
	return s;
}
int Ctest::testAdd(int a, int b) {
	printf("Ctest::testAdd(%d, %d) (this = %ld, low = %d)\n", a, b, (long int)(size_t)this, (int)(0xffffffffLL & (size_t)this));
	return a + b;
}

void Ctest::static_void() {
	
}

Ctest* createTest() {
	Ctest* test = new Ctest();
	return test;
}

Ctest2::Ctest2() : Ctest()
{
	printf("Ctest2::Ctest2() (this = %ld)\n", (long int)(size_t)this);
}
Ctest2::~Ctest2()
{
}

int Ctest2::testAdd(int a, int b) {
	printf("Ctest2::testAdd(%d, %d) (this = %ld)\n", a, b, (long int)(size_t)this);
	return a + b * 2;
}

TEST_API void* test_pvoid() { return NULL; }
TEST_API int* test_pint() { return NULL; }
TEST_API int test_int() { return 0; }
TEST_API void test_void_double() { return; }
TEST_API int test_int_double() { return 0; }
TEST_API int test_int_float(float) { return 0; }
TEST_API void test_void() { }

typedef void (*fun_void)();
typedef void (*fun_void_int)(int);
typedef int (*fun_int)();
typedef int (*fun_int_float)(float);
TEST_API fun_void test_fun_void() { return NULL; }
TEST_API fun_void test_fun_void__double(double) { return NULL; }
TEST_API fun_void_int test_fun_void_int() { return NULL; }
TEST_API fun_int test_fun_int() { return NULL; }
TEST_API fun_int_float test_fun_int_float() { return NULL; }
TEST_API fun_int_float test_fun_int_float__double(double) { return NULL; }


TEST_API int test_int_short(short s) { return 0; }

typedef int (*fun_iii)(int, int);
int add(int a, int b) {
	return a + b;
}
TEST_API fun_iii getAdder() {
	return add;
}
TEST_API int forwardCall(fun_iii f, int a, int b) {
	return f(a, b);
}
