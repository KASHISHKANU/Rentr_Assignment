import 'package:flutter/material.dart';

class JobListScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Available Jobs")),
      body: ListView(
        children: [
          Card(
            child: ListTile(
              title: Text("Plumbing Work"),
              subtitle: Text("Location: Delhi"),
              trailing: ElevatedButton(
                onPressed: () {},
                child: Text("Apply"),
              ),
            ),
          ),
        ],
      ),
    );
  }
}
