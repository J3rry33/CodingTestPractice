#include <string>
#include <vector>

using namespace std;

vector<int> Move(string keyinput, vector<int> pos);

vector<int> CheckBound(vector<int> answer, vector<int> board)
{
    if (board[0] / 2 < answer[0])
        answer[0] = board[0] / 2;
    if (board[1] / 2 < answer[1])
        answer[1] = board[1] / 2;

    if (-board[0] / 2 > answer[0])
        answer[0] = -board[0] / 2;
    if (-board[1] / 2 > answer[1])
        answer[1] = -board[1] / 2;

    return answer;
}

vector<int> solution(vector<string> keyinput, vector<int> board) {
    vector<int> answer(2);

    for (int i = 0; i < keyinput.size(); i++)
    {
        answer = Move(keyinput[i], answer);
        answer = CheckBound(answer, board);
    }

    return answer;
}

vector<int> Move(string keyinput, vector<int> pos)
{
    if (keyinput == "right")
        pos[0]++;
    else if (keyinput == "left")
        pos[0]--;
    else if (keyinput == "up")
        pos[1]++;
    else if (keyinput == "down")
        pos[1]--;

    return pos;
}