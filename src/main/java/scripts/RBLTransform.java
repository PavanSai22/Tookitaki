package scripts;

import java.io.IOException;


import commonMethods.Config;
import commonMethods.Keywords;
import commonMethods.Testcases;
import commonMethods.Utils;

public class RBLTransform extends Keywords {
	/**
	 * Name : Pavan
	 * Created Date: 28/July/2017
	 * Modified Date:28/July/2017
	 * Description:
	 * 
	 */
	public static void rblTransform() throws IOException {
		//SLIDE
		String dataFileName = Utils.getDataFromTestData("rblTransformationSlide", "Input File Location");
		String groupBy = Utils.getDataFromTestData("rblTransformationSlide", "Group By Columns");
		String orderBy = Utils.getDataFromTestData("rblTransformationSlide", "Order By Columns");
		String index1 = Utils.getDataFromTestData("rblTransformationSlide", "Index 1");
		String index2 = Utils.getDataFromTestData("rblTransformationSlide", "Index 2");
		String aggregationcolumn = Utils.getDataFromTestData("rblTransformationSlide", "Aggregation Columns");
		String aggregationColumnName = Utils.getDataFromTestData("rblTransformationSlide", "Aggregation Column Name");
		waitForElement(dashboard);
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataRestructuring);
		click(dataRestructuring);
		waitForElement(slide);
		click(slide);
		waitForElement(inputFile);
		sendKeys(inputFile, dataFileName);
		defaultWait();
		waitForElement(inputLocation);
		click(inputLocation);
		tab();
		click(slideGroupByColumns);
		sendKeys(selectGroupByColumns, groupBy);
		tab();
		click(slideOrderByColumns);
		sendKeys(selectOrderByColumns, orderBy);
		tab();
		waitForElement(afterGrouping);
		click(afterGrouping);
		waitForElement(selectAllRows);
		click(selectAllRows);
		waitForElement(windowRangeIndex1);
		sendKeys(windowRangeIndex1, index1);
		click(windowRangeIndex1True);
		waitForElement(windowRangeIndex2);
		sendKeys(windowRangeIndex2, index2);
		click(windowRangeIndex2True);
		waitForElement(aggregationFunction);
		click(aggregationFunction);
		waitForElement(aggregationFunctionSum);
		click(aggregationFunctionSum);
		click(aggregationcolumns);
		waitForElement(selectAggregationcolumns);
		click(selectAggregationcolumns);
		waitForElement(runFunction);
		click(runFunction);
		wait("60");
		//waitUntilVisibilityOfElement(Config.driver, runningStatus);
		waitForElement(slideOutputFile);
		click(slideOutputFile);
		scrollBottom();
		click(close);
	
		//JOIN
		
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataJoining);
		click(dataJoining);
		waitForElement(join);
		click(join);
		String leftInputFile = Utils.getDataFromTestData("rblTransformationJoin", "Left Input File");
		String rightInputFile = Utils.getDataFromTestData("rblTransformationJoin", "Right Input File");
		String leftMapping = Utils.getDataFromTestData("rblTransformationJoin", "Left Mapping");
		String rightMapping = Utils.getDataFromTestData("rblTransformationJoin", "Right Mapping");
		waitForElement(leftFile);
		sendKeys(leftFile, leftInputFile);
		defaultWait();
		tab();
		waitForElement(rightFile);
		sendKeys(rightFile, rightInputFile);
		defaultWait();
		tab();
		click(leftColumnMapping);
		wait("2");
		waitForElement(leftColumnMappinginput);
		sendKeys(leftColumnMappinginput, leftMapping);
		tab();
		click(rightColumnMapping);
		waitForElement(rightColumnMappinginput);
		sendKeys(rightColumnMappinginput, rightMapping);
		tab();
		click(typeofJoin);
		click(fullJoin);
		click(columnstoLeft);
		waitForElement(columnstoRight);
		click(columnstoRight);
		keyboardArrowDown();
		tab();
		waitForElement(runFunction);
		click(runFunction);
		loadElement();
		waitForElement(joinOutputFile);
		click(joinOutputFile);
		scrollBottom();
		click(close);
		

		/*String projectInputFile = Utils.getDataFromTestData("rblTransformationProject", "Input File");
		String columnname1 = Utils.getDataFromTestData("rblTransformationProject", "Column Name1");
		String columnname2 = Utils.getDataFromTestData("rblTransformationProject", "Column Name2");
		String columnname3 = Utils.getDataFromTestData("rblTransformationProject", "Column Name3");
		String columnname4 = Utils.getDataFromTestData("rblTransformationProject", "Column Name4");
		String value1 = Utils.getDataFromTestData("rblTransformationProject", "Value1");
		String value2 = Utils.getDataFromTestData("rblTransformationProject", "Value2");
		String value3 = Utils.getDataFromTestData("rblTransformationProject", "Value3");
		String value4 = Utils.getDataFromTestData("rblTransformationProject", "Value4");
		String value5 = Utils.getDataFromTestData("rblTransformationProject", "Value5");
		String date = Utils.getDataFromTestData("rblTransformationProject", "last_paymt_dt");
		String dateFormat = Utils.getDataFromTestData("rblTransformationProject", "submitteddate");
		refreshPage();
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataRestructuring);
		click(dataRestructuring);
		waitForElement(project);
		click(project);
		waitForElement(inputFile);
		sendKeys(inputFile, projectInputFile);
		defaultWait();
		tab();
		waitForElement(addProjection);
		click(addProjection);
		click(selectType);
		click(typeFunction);
		waitForElement(columnName);
		sendKeys(columnName, columnname1);
		waitForElement(columnType);
		click(columnType);
		click(columnTypeFunction);
		waitForElement(functionValue);
		actionClick(Config.driver, functionValue);
		waitForElement(datediffFunction);
		click(datediffFunction);
		waitForElement(summaryType);
		click(summaryType);
		keyboardArrowDown();
		tab();
		click(summaryvalue);
		waitForElement(enterSummaryvalue);
		click(enterSummaryvalue);
		waitForElement(summaryType1);
		click(summaryType1);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue1);
		click(summaryvalue1);
		waitForElement(enterSummaryvalue1);
		click(enterSummaryvalue1);
		waitForElement(addProjection1);
		click(addProjection1);
		click(projectionType);
		click(functionType);
		waitForElement(columnName1);
		sendKeys(columnName1, columnname2);
		waitForElement(columnType1);
		click(columnType1);
		click(columnTypeFunction1);
		waitForElement(functionValue1);
		actionClick(Config.driver, functionValue1);
		waitForElement(datediffFunction1);
		click(datediffFunction1);
		waitForElement(summaryType2);
		click(summaryType2);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue2);
		click(summaryvalue2);
		waitForElement(enterSummaryvalue2);
		click(enterSummaryvalue2);
		tab();
		click(summaryType02);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue02);
		click(summaryvalue02);
		waitForElement(enterSummaryvalue02);
		click(enterSummaryvalue02);
		
		waitForElement(addProjection2);
		click(addProjection2);
		click(projectionType2);
		click(functionType2);
		waitForElement(columnName2);
		sendKeys(columnName2, columnname3);
		waitForElement(columnType2);
		click(columnType2);
		click(columnTypeFunction2);
		waitForElement(functionValue2);
		actionClick(Config.driver, functionValue2);
		waitForElement(datediffFunction2);
		click(datediffFunction2);
		waitForElement(summaryType3);
		click(summaryType3);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue3);
		click(summaryvalue3);
		waitForElement(enterSummaryvalue3);
		click(enterSummaryvalue3);
		tab();
		click(summaryType03);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue03);
		click(summaryvalue03);
		waitForElement(enterSummaryvalue03);
		click(enterSummaryvalue03);
		
		waitForElement(addProjection3);
		click(addProjection3);
		click(projectionType3);
		click(functionType3);
		waitForElement(columnName3);
		sendKeys(columnName3, columnname4);
		waitForElement(columnType3);
		click(columnType3);
		click(columnTypeFunction3);
		waitForElement(functionValue3);
		actionClick(Config.driver, functionValue3);
		waitForElement(datediffFunction3);
		click(datediffFunction3);
		waitForElement(summaryType4);
		click(summaryType4);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue4);
		click(summaryvalue4);
		waitForElement(enterSummaryvalue4);
		click(enterSummaryvalue4);
		tab();
		click(summaryType04);
		keyboardArrowDown();
		tab();
		waitForElement(summaryvalue04);
		click(summaryvalue04);
		waitForElement(enterSummaryvalue04);
		click(enterSummaryvalue04);
		
		waitForElement(addProjection4);
		click(addProjection4);
		click(projectionType4);
		click(functionType4);
		waitForElement(columnsListProject);
		click(columnsListProject);
		waitForElement(dateFormatColumns);
		click(dateFormatColumns);
		waitForElement(formatColumns);
		sendKeys(formatColumns, value4);
		tab();
		waitForElement(dateFormatValues);
		sendKeys(dateFormatValues, date);
		click(addNewColumn);
		waitForElement(dateFormatColumns1);
		click(dateFormatColumns1);
		waitForElement(formatColumns1);
		sendKeys(formatColumns1, value2);
		tab();
		waitForElement(dateFormatValues1);
		sendKeys(dateFormatValues1, date);
		click(addNewColumn);
		waitForElement(dateFormatColumns2);
		click(dateFormatColumns2);
		waitForElement(formatColumns2);
		sendKeys(formatColumns2, value1);
		tab();
		waitForElement(dateFormatValues2);
		sendKeys(dateFormatValues2, dateFormat);
		click(addNewColumn);
		waitForElement(dateFormatColumns3);
		click(dateFormatColumns3);
		waitForElement(formatColumns3);
		sendKeys(formatColumns3, value5);
		tab();
		waitForElement(dateFormatValues3);
		sendKeys(dateFormatValues3, date);
		click(addNewColumn);
		waitForElement(dateFormatColumns4);
		click(dateFormatColumns4);
		waitForElement(formatColumns4);
		sendKeys(formatColumns4, value3);
		tab();
		waitForElement(dateFormatValues4);
		sendKeys(dateFormatValues4, date);
		waitForElement(runFunction);
		click(runFunction);
		wait("60");
		waitForElement(projectOutputFile);
		click(projectOutputFile);
		scrollBottom();
		click(close);
		
		//AGGREGATE
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataRestructuring);
		click(dataRestructuring);
		waitForElement(aggregate);
		click(aggregate);
		String aggregateInputFile = Utils.getDataFromTestData("rblTransformationAggregate", "Input File");
		String columnValue1 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value1");
		String columnValue2 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value2");
		String columnValue3 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value3");
		String columnValue4 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value4");
		String columnValue5 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value5");
		String columnValue6 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value6");
		String columnValue7 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value7");
		String columnValue8 = Utils.getDataFromTestData("rblTransformationAggregate", "Column Value8");
		String avgColumnValue1 = Utils.getDataFromTestData("rblTransformationAggregate", "AVG Column Value1");
		String avgColumnValue2 = Utils.getDataFromTestData("rblTransformationAggregate", "AVG Column Value2");
		String avgColumnValue3 = Utils.getDataFromTestData("rblTransformationAggregate", "AVG Column Value3");
		String avgColumnValue4 = Utils.getDataFromTestData("rblTransformationAggregate", "AVG Column Value4");
		String avgColumnValue5 = Utils.getDataFromTestData("rblTransformationAggregate", "AVG Column Value5");
		waitForElement(inputFile);
		sendKeys(inputFile, aggregateInputFile);
		defaultWait();
		tab();
		click(aggregateGroupByColumns);
		waitForElement(selectgroupColumn);
		click(selectgroupColumn);
		click(aggregateFunction);
		waitForElement(aggregateFunctionSum);
		click(aggregateFunctionSum);
		click(columnsList);
		waitForElement(entercolumnsList);
		sendKeys(entercolumnsList,columnValue1 );
		tab();
		click(columnsList);
		waitForElement(entercolumnsList);
		sendKeys(entercolumnsList,columnValue2 );
		tab();
		click(columnsList);
		waitForElement(entercolumnsList);
		sendKeys(entercolumnsList,columnValue3 );
		tab();
		click(columnsList);
		waitForElement(entercolumnsList);
		sendKeys(entercolumnsList,columnValue4 );
		tab();
		click(columnsList);
		waitForElement(entercolumnsList);
		sendKeys(entercolumnsList,columnValue5 );
		tab();
		click(columnsList);
		waitForElement(entercolumnsList);
		sendKeys(entercolumnsList,columnValue6 );
		tab();
		click(columnsList);
		waitForElement(entercolumnsList);
		sendKeys(entercolumnsList,columnValue7 );
		tab();
		click(columnsList);
		waitForElement(entercolumnsList);
		sendKeys(entercolumnsList,columnValue8 );
		tab();
		waitForElement(addanAggregation);
		click(addanAggregation);
		waitForElement(aggregateFunctionAvg);
		click(aggregateFunctionAvg);
		waitForElement(aggregateFunAvg);
		click(aggregateFunAvg);
		click(columnsList1);
		waitForElement(entercolumnsListAvg);
		sendKeys(entercolumnsListAvg, avgColumnValue1);
		tab();
		click(columnsList1);
		waitForElement(entercolumnsListAvg);
		sendKeys(entercolumnsListAvg, avgColumnValue2);
		tab();
		click(columnsList1);
		waitForElement(entercolumnsListAvg);
		sendKeys(entercolumnsListAvg, avgColumnValue3);
		tab();
		click(columnsList1);
		waitForElement(entercolumnsListAvg);
		sendKeys(entercolumnsListAvg, avgColumnValue4);
		tab();
		click(columnsList1);
		waitForElement(entercolumnsListAvg);
		sendKeys(entercolumnsListAvg, avgColumnValue5);
		tab();
		waitForElement(runFunction);
		click(runFunction);
		loadElement();
		waitForElement(aggregateOutputFile);
		click(aggregateOutputFile);
		defaultWait();
		scrollBottom();
		click(close);
		
		//SLIDE
		String inputFileLocation = Utils.getDataFromTestData("rblTransformationSlide1", "Input File");
		waitForElement(dashboard);
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataRestructuring);
		click(dataRestructuring);
		waitForElement(slide);
		click(slide);
		waitForElement(inputFile);
		sendKeys(inputFile, inputFileLocation);
		defaultWait();
		waitForElement(inputLocation);
		click(inputLocation);
		tab();
		click(slideGroupByColumns);
		waitForElement(selectGroupByColumns1);
		click(selectGroupByColumns1);
		click(slideOrderByColumns);
		waitForElement(selectOrderByColumns1);
		click(selectOrderByColumns1);
		waitForElement(afterGrouping);
		click(afterGrouping);
		waitForElement(selectAllRows);
		click(selectAllRows);
		waitForElement(windowRangeIndex1);
		sendKeys(windowRangeIndex1, index1);
		click(windowRangeIndex1True);
		waitForElement(windowRangeIndex2);
		sendKeys(windowRangeIndex2, index2);
		click(windowRangeIndex2True);
		waitForElement(aggregationFunction);
		click(aggregationFunction);
		click(aggregationFunctionAvg);
		click(aggregationcolumns);
		waitForElement(selectAggregationcolumnsAvg);
		click(selectAggregationcolumnsAvg);
		waitForElement(addOne);
		click(addOne);
		waitForElement(windowRangeIndex3);
		sendKeys(windowRangeIndex3, index1);
		click(windowRangeIndex3True);
		waitForElement(windowRangeIndex4);
		sendKeys(windowRangeIndex4, index2);
		click(windowRangeIndex4True);
		waitForElement(aggregationFunction1);
		click(aggregationFunction1);
		click(aggregationFunctionSum1);
		click(aggregationFunctionColumns);
		waitForElement(aggregationFunColumns);
		click(aggregationFunColumns);
		waitForElement(runFunction);
		click(runFunction);
		loadElement();
		waitForElement(slideOutputFile1);
		click(slideOutputFile1);
		defaultWait();
		scrollBottom();
		click(close);
		
		//AGGREGATE
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataRestructuring);
		click(dataRestructuring);
		waitForElement(aggregate);
		click(aggregate);
		String aggregateInputFileLoc = Utils.getDataFromTestData("rblTransformationAggregate1", "Input File");
		String aggregatecolumnValue1 = Utils.getDataFromTestData("rblTransformationAggregate1", "Aggregation Columns Sum");
		String aggregatecolumnValue2 = Utils.getDataFromTestData("rblTransformationAggregate1", "Aggregation Columns Avg");
		waitForElement(inputFile);
		sendKeys(inputFile, aggregateInputFileLoc);
		defaultWait();
		tab();
		click(aggregateGroupByColumns);
		waitForElement(selectgroupColumn);
		click(selectgroupColumn);
		click(aggregateFunction);
		waitForElement(aggregateFunctionSum);
		click(aggregateFunctionSum);
		click(columnsList);
		waitForElement(entercolumnsList);
		sendKeys(entercolumnsList,aggregatecolumnValue1 );
		tab();
		waitForElement(addanAggregation);
		click(addanAggregation);
		waitForElement(aggregateFunctionAvg);
		click(aggregateFunctionAvg);
		waitForElement(aggregateFunAvg);
		click(aggregateFunAvg);
		click(columnsList1);
		waitForElement(entercolumnsListAvg);
		sendKeys(entercolumnsListAvg, aggregatecolumnValue2);
		tab();
		waitForElement(runFunction);
		click(runFunction);
		loadElement();
		waitForElement(aggregateOutputFile);
		click(aggregateOutputFile);
		defaultWait();
		scrollBottom();
		click(close);
		
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataRestructuring);
		click(dataRestructuring);
		waitForElement(transpose);
		click(transpose);
		String transposeInputFile = Utils.getDataFromTestData("rblTransformationTranspose", "Input File");
		String transposecolumn = Utils.getDataFromTestData("rblTransformationTranspose", "Transpose Column");
		waitForElement(inputFile);
		sendKeys(inputFile, transposeInputFile);
		defaultWait();
		tab();
		waitForElement(selectTransposeColumn);
		click(selectTransposeColumn);
		waitForElement(columnsTransposed);
		sendKeys(columnsTransposed, transposecolumn);
		tab();
		waitForElement(columnsCarriedOver);
		click(columnsCarriedOver);
		waitForElement(runFunction);
		click(runFunction);
		loadElement();
		waitForElement(transposeOutputFile);
		click(transposeOutputFile);
		defaultWait();
		scrollBottom();
		click(close);
		
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataJoining);
		click(dataJoining);
		waitForElement(join);
		click(join);
		String joinleftInputFile = Utils.getDataFromTestData("rblTransformationJoin1", "Left Input File");
		String joinrightInputFile = Utils.getDataFromTestData("rblTransformationJoin1", "Right Input File");
		String joinleftMapping = Utils.getDataFromTestData("rblTransformationJoin1", "Left Mapping");
		String joinrightMapping = Utils.getDataFromTestData("rblTransformationJoin1", "Right Mapping");
		waitForElement(leftFile);
		sendKeys(leftFile, joinleftInputFile);
		defaultWait();
		tab();
		waitForElement(rightFile);
		sendKeys(rightFile, joinrightInputFile);
		defaultWait();
		tab();
		click(leftColumnMapping);
		wait("2");
		waitForElement(leftColumnMappinginput);
		sendKeys(leftColumnMappinginput, joinleftMapping);
		tab();
		click(rightColumnMapping);
		waitForElement(rightColumnMappinginput);
		sendKeys(rightColumnMappinginput, joinrightMapping);
		tab();
		click(typeofJoin);
		click(fullJoin);
		waitForElement(joinleft);
		click(joinleft);
		waitForElement(joinright);
		click(joinright);
		click(joincancel);
		waitForElement(runFunction);
		click(runFunction);
		loadElement();
		waitForElement(joinOutputFile1);
		click(joinOutputFile1);
		defaultWait();
		scrollBottom();
		click(close);
		
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataJoining);
		click(dataJoining);
		waitForElement(join);
		click(join);
		String joinleftInputFile1 = Utils.getDataFromTestData("rblTransformationJoin2", "Left Input File");
		String joinrightInputFile1 = Utils.getDataFromTestData("rblTransformationJoin2", "Right Input File");
		waitForElement(leftFile);
		sendKeys(leftFile, joinleftInputFile1);
		defaultWait();
		tab();
		waitForElement(rightFile);
		sendKeys(rightFile, joinrightInputFile1);
		defaultWait();
		tab();
		click(leftColumnMapping);
		wait("2");
		waitForElement(leftColumnMappinginput);
		sendKeys(leftColumnMappinginput, joinleftMapping);
		tab();
		click(rightColumnMapping);
		waitForElement(rightColumnMappinginput);
		sendKeys(rightColumnMappinginput, joinrightMapping);
		tab();
		click(typeofJoin);
		click(fullJoin);
		waitForElement(joinleft);
		click(joinleft);
		waitForElement(joinright);
		click(joinright);
		waitForElement(runFunction);
		click(runFunction);
		loadElement();
		waitForElement(joinOutputFile2);
		click(joinOutputFile2);
		defaultWait();
		scrollBottom();
		click(close);
		
		
		//SPLIT
		click(dashboard);
		waitForElement(transform);
		click(transform);
		waitForElement(dataRestructuring);
		click(dataRestructuring);
		waitForElement(split);
		click(split);
		String splitInputFile = Utils.getDataFromTestData("rblTransformationSplit", "Input File");
		String percentage = Utils.getDataFromTestData("rblTransformationSplit", "Split Percentage");
		waitForElement(inputFile);
		sendKeys(inputFile, splitInputFile);
		defaultWait();
		tab();
		waitForElement(enterFraction);
		sendKeys(enterFraction, percentage);
		click(splitType);
		waitForElement(splitTypeSequential);
		click(splitTypeSequential);
		waitForElement(runFunction);
		click(runFunction);
		loadElement();
		waitForElement(splitOutputFile);
		click(splitOutputFile);
		defaultWait();
		scrollBottom();
		click(close);*/
		
		
		
		
		
		
	}

}
