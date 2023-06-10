import React from 'react';
import { TouchableOpacity, Text, StyleSheet } from 'react-native';

function CustomButton({ title, onPress }) {
  return (
    <TouchableOpacity style={styles.button} onPress={onPress}>
      <Text style={styles.buttonText}>{title}</Text>
    </TouchableOpacity>
  );
}

const styles = StyleSheet.create({
  button: {
    backgroundColor: '#DDDDDD',
    width: 250,
    height: 60,
    borderRadius: 50,
    alignItems: 'center',
    textAlign: 'center',
    justifyContent: 'center',
    marginTop: 25,
    fontSize: 0,
  },
  buttonText: {
    color: 'black',
    fontSize: 25,
    textAlign: 'center',
  },
});

export default CustomButton;
