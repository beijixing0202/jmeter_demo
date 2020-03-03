public static void RecordIdTxn(String location){
	FileWriter fstream =  new FileWriter(location,true);
	BufferedWriter out = new BufferedWriter(fstream);
	out.write(vars.get("idTxn")+"\n");
	out.close();
	fstream.close();
}
