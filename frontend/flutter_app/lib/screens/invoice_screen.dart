import 'package:flutter/material.dart';

class InvoiceScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Submit Invoice")),
      body: Padding(
        padding: EdgeInsets.all(16),
        child: Column(
          children: [
            TextField(decoration: InputDecoration(labelText: "Amount")),
            TextField(decoration: InputDecoration(labelText: "Description")),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {},
              child: Text("Submit Invoice"),
            ),
          ],
        ),
      ),
    );
  }
}
