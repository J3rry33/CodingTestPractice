#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> dots) {
    int answer = 0;
    int height, width;

    int max = -256;
    int min = 256;

    for (int i = 0; i < 4; i++)
        if (dots[i][0] > max) max = dots[i][0];

    for (int i = 0; i < 4; i++)
        if (dots[i][0] < min) min = dots[i][0];

    width = max - min;

    max = -256; min = 256;

    for (int i = 0; i < 4; i++)
        if (dots[i][1] > max) max = dots[i][1];

    for (int i = 0; i < 4; i++)
        if (dots[i][1] < min) min = dots[i][1];

    height = max - min;

    answer = height * width;
    return answer;
}