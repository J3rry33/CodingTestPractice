#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<vector<int>> score) {
    vector<int> answer;

    vector<int> sum;

    for (int i = 0; i < score.size(); i++)
        sum.push_back(score[i][0] + score[i][1]);

    for (int i = 0; i < score.size(); i++)
    {
        answer.push_back(1);
        for (int j = 0; j < score.size(); j++)
            if (sum[i] < sum[j]) answer[i]++;
    }

    return answer;
}