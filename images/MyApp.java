import 'package:flutter/material.dart';

void main(){
  runApp(const MyApp());
}

class MyApp extends StatelessWidget{
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: MyForm(),
    );
  }

}

class MyForm extends StatefulWidget {

  @override
  State<MyForm> createState() => _MyFormState();

}

class _MyFormState extends State<MyForm> {

  final myController= TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(

      appBar: AppBar(
        title: Text(
          'Retrieve data',
          style: TextStyle(color: Colors.black),
        ),
        backgroundColor: Colors.yellowAccent,
      ),
      body: Column(
        children: [
          Padding(padding: EdgeInsets.all(20),
            child: TextField(
              decoration: InputDecoration(
                border: OutlineInputBorder(),
                labelText: 'Enter Your Name',
              ),
              controller: myController,
            ),
          ),
          Padding(padding: EdgeInsets.all(20),
            child: TextFormField(
              decoration: InputDecoration(
                hintText: 'Enter Your Name',
              ),
              controller: myController,
            ),
          ),
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          showDialog(
              context: context,
              builder: (context) {
                return AlertDialog(
                  content: Text(myController.text),
                );
              }
          );
        },
        child: Icon(Icons.text_fields),
        tooltip: 'show me the value',
      ),


    );
  }

}













