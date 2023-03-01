#include <string>
#include <vector>

using namespace std;

int gcd(int a, int b)
{
    int c = a % b;

    while (c != 0) {
        a = b;
        b = c;
        c = a % b;
    }


    return b;
}

int solution(int a, int b) {
    int answer = 0;

    int c, d;
    c = gcd(b, a); // 최대공약수 구하기

    d = b / c; // 분모 기약분수로 나타내기

    while (!(d % 2))
        d /= 2;

    while (!(d % 5))
        d /= 5;

    if (d == 1) answer = 1;
    else answer = 2;

    return answer;
}