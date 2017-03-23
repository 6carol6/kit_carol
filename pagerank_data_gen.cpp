#include <iostream>
#include <ctime>
#include <cstdlib>
using namespace std;

const int MAXN=10000000;

int main(){
	int cnt = MAXN;
	while(cnt--){
		int a = rand() % MAXN;
		int b = rand() % MAXN;
		cout << a << " " << b <<endl;
	}
	return 0;
}