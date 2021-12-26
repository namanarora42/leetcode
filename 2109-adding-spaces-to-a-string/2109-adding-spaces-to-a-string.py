class Solution(object):
    def addSpaces(self, s, spaces):
        """
        :type s: str
        :type spaces: List[int]
        :rtype: str
        """
        out = []
        spaceCount = 0;
        for i,letter in enumerate(list(s)):
            if spaceCount < len(spaces) and i == spaces[spaceCount]:
                out.append(" ")
                out.append(letter)
                spaceCount+=1
            else:
                out.append(letter)
        return ''.join(out);
        