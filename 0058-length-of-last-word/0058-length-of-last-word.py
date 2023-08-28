class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        stringList = s.split()
        print(stringList)
        print(stringList[len(stringList)-1])
        return len(stringList[len(stringList)-1])