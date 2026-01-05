import 'package:flutter/material.dart';

class ContractorDashboard extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Contractor Dashboard")),
      body: Column(
        children: [
          ListTile(
            title: Text("View Available Jobs"),
            trailing: Icon(Icons.work),
          ),
          ListTile(
            title: Text("Applied Work Orders"),
            trailing: Icon(Icons.assignment),
          ),
          ListTile(
            title: Text("Submit Invoice"),
            trailing: Icon(Icons.receipt),
          ),
        ],
      ),
    );
  }
}
