def permutation(string1, ans):
    if len(string1) == 0:
        return print(ans)

    for i in range(len(string1)):
        ch = string1[i]
        lprt = string1[:i]
        rprt = string1[i + 1:]
        res = lprt + rprt
        permutation(res, ans + ch)


permutation("abc", "")