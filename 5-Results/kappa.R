#### 60 questions, likert 1 to 5 #####
library(tidyverse)
library(irr)

leonardo <-c(5,4,5,4,5,5,5,5,4,5,4,3,4,5,4,5,5,3,4,5,5,4,5,5,3,5,4,3,4,5,5,5,3,3,4,5,5,4,4,5,4,5,5,4,2,3,4,2,4,3,4,3,4,5,3,5,4,5,5,4)
joaoPedro<-c(5,1,5,4,4,5,5,3,5,4,5,4,5,4,1,4,5,4,4,5,4,5,5,4,3,4,5,3,4,5,5,4,3,5,4,5,5,4,5,4,3,5,4,5,4,3,5,4,5,3,5,4,5,4,3,4,5,4,5,3)
vinicius <-c(5,1,1,5,5,3,5,1,3,4,5,1,2,1,1,2,5,1,5,5,5,4,5,4,3,5,4,5,4,5,5,3,1,1,4,5,5,2,5,5,1,5,5,5,3,3,5,1,5,4,5,4,2,5,2,5,2,5,5,3)
lucas   <- c(5,2,5,2,3,3,5,1,4,2,4,2,2,4,2,5,5,1,4,5,5,4,2,4,2,2,4,1,5,4,5,5,2,4,4,4,5,4,5,5,3,5,5,4,2,5,5,2,5,3,4,2,3,5,5,1,3,5,5,2)
rafael  <- c(1,5,5,5,5,3,5,2,5,3,5,2,5,5,3,5,4,2,2,5,5,5,5,2,5,5,5,1,4,5,5,3,4,3,4,5,5,1,5,4,1,5,5,5,4,5,3,1,5,2,5,1,4,4,2,3,4,5,5,3)

matrixtotal = c()

matrixindex = 1;
for (i in 1:length(rafael)) {
    matrixtotal[matrixindex] = leonardo[i]
    matrixindex = matrixindex+1
    matrixtotal[matrixindex] = joaoPedro[i]
    matrixindex = matrixindex+1
    matrixtotal[matrixindex] = vinicius[i]
    matrixindex = matrixindex+1
    matrixtotal[matrixindex] = lucas[i]
    matrixindex = matrixindex+1
    matrixtotal[matrixindex] = rafael[i]
    matrixindex = matrixindex+1
}

kripp.alpha(matrix(matrixtotal,nrow=5))
kripp.alpha(matrix(matrixtotal,nrow=5),"ordinal")
kripp.alpha(matrix(matrixtotal,nrow=5),"interval")
kripp.alpha(matrix(matrixtotal,nrow=5),"ratio") 
