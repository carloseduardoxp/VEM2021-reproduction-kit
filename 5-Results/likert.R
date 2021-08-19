#-------------------- 1 readability evaluation -----------------------------------
readability = read.csv(
"/home/carloseduardo/VEM_2021_Replication_Package/output/R_Studio_Readability.csv", header = TRUE,sep = ";")

wilcox.test(likertAvg ~ tool, data = readability, paired = TRUE, conf.int = TRUE, conf.level = 0.95)

library(rcompanion)
wilcoxonPairedR(x = readability$likertAvg, g = readability$tool)

tool.a = readability$likertAvg[readability$tool=='best']
tool.b = readability$likertAvg[readability$tool=='worst']
par(cex.axis=1.5)
par(cex.lab=1.5)
boxplot(tool.a,tool.b,names=c("High Readability","Low Readability"),
        ylab = "Average Likert Scale",ylim = c(1, 5))


#-------------------- 2 understandability evaluation -----------------------------------
understandability = read.csv(
        "/home/carloseduardo/VEM_2021_Replication_Package/output/R_Studio_Understandability.csv", header = TRUE,sep = ";")

wilcox.test(likertAvg ~ tool, data = understandability, paired = TRUE, conf.int = TRUE, conf.level = 0.95)

library(rcompanion)
wilcoxonPairedR(x = understandability$likertAvg, g = understandability$tool)

tool.c = understandability$likertAvg[understandability$tool=='best']
tool.d = understandability$likertAvg[understandability$tool=='worst']

par(cex.axis=1.5)
par(cex.lab=1.5)
boxplot(tool.c,tool.d,names=c("High Understandability","Low Understandability"),
        ylab = "Average Likert Scale",ylim = c(1, 5))

#-------------------- 3 readability and understandability evaluation -----------------------------------
readund = read.csv(
        "/home/carloseduardo/VEM_2021_Replication_Package/output/R_Studio_Readability_Understandability.csv", header = TRUE,sep = ";")

wilcox.test(likertAvg ~ tool, data = readund, paired = TRUE, conf.int = TRUE, conf.level = 0.95)

library(rcompanion)
wilcoxonPairedR(x = readund$likertAvg, g = readund$tool)

tool.e = readund$likertAvg[readund$tool=='best']
tool.f = readund$likertAvg[readund$tool=='worst']
library(ggplot2)
par(cex.axis=1.5)
par(cex.lab=1.5)
boxplot(tool.e,tool.f,names=c("High Readability and \n\n Understandability","Low Readability and \n\n Understandability"),
        ylab = "Average Likert Scale",ylim = c(1, 5))

#-------------------- 4 understandability top evaluation -----------------------------------
undTop = read.csv(
  "/home/carloseduardo/VEM_2021_Replication_Package/output/R_Studio_UnderstandabilityTop.csv", header = TRUE,sep = ";")

wilcox.test(likertAvg ~ tool, data = undTop, paired = TRUE, conf.int = TRUE, conf.level = 0.95)

library(rcompanion)
wilcoxonPairedR(x = undTop$likertAvg, g = undTop$tool)
