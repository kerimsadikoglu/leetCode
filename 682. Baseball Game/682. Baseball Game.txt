class Solution(object):
    def calPoints(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        result = []
        lastSum=0
        for op in operations:
            if op[0] == '-' or op.isdigit(): 
                result.append(int(op))  
            elif op == 'C':
                result.pop()
            elif op == 'D':
                double = result[-1] * 2
                result.append(double)
            elif op == '+':
                sum = result[-1] + result[-2]
                result.append(sum)
        for i in result:
            lastSum += i
        return lastSum  
