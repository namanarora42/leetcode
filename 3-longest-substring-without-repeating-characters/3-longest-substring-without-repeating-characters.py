class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if s == "":
            return 0
        l,r = 0, 0
        champ = r-l+1
        d = {}
        chars = list(s)
        d[chars[l]] = l
        r += 1
        while l <= r and r < len(s):
            newChar = chars[r]
            if newChar not in d:
                champ = max(champ, r-l+1)
                d[newChar] = r
            else:
                repeatPos = d[newChar]
                if r-(repeatPos+1)+1 > repeatPos-l+1:
                    champ = max(champ, r-(repeatPos+1)+1)
                else:
                    champ = max(champ, repeatPos-l+1)
                for i in range(l, repeatPos+1):
                    d.pop(chars[i], None)
                d[newChar] = r
                l = repeatPos+1
            r += 1
        return champ
        