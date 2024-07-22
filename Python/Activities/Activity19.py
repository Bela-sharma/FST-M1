# Import pandas
import pandas
from pandas import ExcelWriter

# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Bela", "Neha", "Ankur"],
	'LastName':["Sharma", "Rath", "Samadhiya"],
	'Email':["bs@1234.com", "nr@1234.com", "as@1234.com"],
	'PhoneNumber':["1234567890", "0987654321", "2345678901"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)

# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)

# Commit data to the Excel file
writer.save()