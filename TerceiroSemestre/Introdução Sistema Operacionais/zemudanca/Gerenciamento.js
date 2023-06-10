import React, { useState } from 'react';
import { View, Text, StyleSheet, Image, TextInput ,SafeAreaView, ScrollView } from 'react-native';
import logo from './assets/caminhao.png';
import CustomButton from './components/CustomButton';

let array = [];

export default function Gerenciamento() {
  return (
    <SafeAreaView style={styles.container}>

    <View style={styles.header}> 
      <Image style={styles.logo} source={logo}/>
    </View>

    <ScrollView>
      <Text style={styles.titulo}>Gerenciamento aqui....</Text>
    </ScrollView>

    </SafeAreaView>
    );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
  },

  header: {
    backgroundColor: 'blue',
    alignItems: 'center',
    width: '100%',
    paddingTop: 25,
  },  

  logo: {
    alignItems: 'center',
    width: 50,
    height: 50,
    marginBottom: 20,
    borderRadius: 200,
    backgroundColor: '#FFF',
    marginTop: 10,
  },

  titulo: { 
    fontSize: 25,
    alignItems: 'center',
    padding: 10,
  },

});
