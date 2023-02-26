#include <string>
#include <vector>

using namespace std;

int solution(int chicken) {
    int answer = 0;
    int coupon = 0;
    int coupon2 = 0;

    while (chicken)
    {
        answer += chicken / 10;
        coupon += chicken % 10;
        chicken /= 10;
    }

    while (coupon)
    {
        answer += coupon / 10;
        coupon2 += coupon % 10;
        coupon /= 10;
    }

    answer += coupon2 / 10;

    return answer;
}