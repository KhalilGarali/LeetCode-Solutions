class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        #reverse the strings for easier manipulation
        a = a[::-1]
        b = b[::-1]
        carry = 0
        binarySum = ""
        for i in range(max(len(a), len(b))):
            if i < len(a):
                fDigit = ord(a[i]) - ord("0")
            else:
                fDigit = 0
            if i < len(b):
                sDigit = ord(b[i]) - ord("0")
            else:
                sDigit = 0
            total = fDigit + sDigit + carry
            binTotal = str(total % 2)
            binarySum = binTotal + binarySum
            carry = total / 2
        if carry:
            binarySum = "1" + binarySum
        return binarySum