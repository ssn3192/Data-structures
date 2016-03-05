#-------------------------------STACK FUNCTIONS-------------------------------------------
class Stack:
    def __init__(self):
        self.items = []
     
    def isEmpty(self):
        return self.items == []
    
    def push(self,item):
        self.items.append(item)
        
    def sizeofstack(self):
        return len(self.items)
    
    def pop(self):
        if len(self.items)== 0:
            print("Stack is Empty and results Underflow")
            return None
        else:
            return self.items.pop()
    
    def peek(self):
        return self.items[len(self.items)-1]
    
    def getElements(self):
        return self.items


s= Stack()
s.push("True")
s.push(2)
s.push(88)
s.push("yes")
print(s.getElements)
s.pop()
s.pop()
s.push("narang")
# print(s.pop())
print (s.peek())
print (s.sizeofstack())
print (s.isEmpty())
print(s.getElements())















 
  
