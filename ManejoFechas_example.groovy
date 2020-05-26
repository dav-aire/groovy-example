String oldDate = '2020-05-27T00:00:00.000Z'
Date date = Date.parse( 'yyyy-MM-dd', oldDate)
String newDate = date.format( 'dd/MM/yyyy' )

println newDate