import React, { useState } from 'react';
import { View, Text, StyleSheet, Image, TextInput, SafeAreaView, ScrollView, Modal } from 'react-native';
import logo from './assets/caminhao.png';
import CustomButton from './components/CustomButton';


export default function App() {

   const [showModal, setShowModal] = useState(false);

  const handleButtonClick = () => {
    setShowModal(true);
  };

  const handleCloseModal = () => {
    setShowModal(false);
  };

  
  return (
    <SafeAreaView style={styles.container}>

    <View style={styles.header}> 
      <Image style={styles.logo} source={logo}/>
    </View>

    <ScrollView>
      <Text style={styles.titulo}>O.S N°: </Text>
      <TextInput style={styles.inputOS} />

      <Text>ID CLiente:</Text>
      <TextInput style={styles.input} />

      <Text style={styles.txt}>Cliente:</Text>
      <TextInput style={styles.input} />

      <Text style={styles.txt}>Serviços:</Text>
      <TextInput style={styles.input} />

      <Text style={styles.txt}>Endereço de retirada:</Text>
      <TextInput style={styles.input} />

      <Text style={styles.txt}>Endereço de entrega:</Text>
      <TextInput style={styles.input} />

      <Text style={styles.txt}>Data da retirada:</Text>
      <TextInput style={styles.input} placeholder='dd/MM/YYYY' placeholderTextColor="grey"/>

      <Text style={styles.txt}>Hora da retirada:</Text>
      <TextInput style={styles.input}/>
      
    </ScrollView>

      <View>
        <CustomButton  title="Salvar" onPress={handleButtonClick} />
      </View>

      <Modal visible={showModal} animationType="slide" onRequestClose={handleCloseModal}>
        <View style={styles.modalContainer}>
        
          <Text style={styles.modalText}>Cliente salvo com sucesso!</Text>
          
          <CustomButton title="Fechar" onPress={handleCloseModal} />
        </View>
      </Modal>

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

  input: {
    borderColor: '#ccc',
    marginTop: 5,
    width: 350,
    height: 50,
    borderRadius: 40,
    borderWidth: 1,
    padding: 5,
    paddingHorizontal: 20,
  },

  inputOS: {
    borderColor: '#ccc',
    marginTop: 5,
    width: 100,
    height: 45,
    borderRadius: 40,
    borderWidth: 1,
    padding: 5,
    paddingHorizontal: 20,
  },

  txt: {
    marginTop: 20,
  },

  modalContainer: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: '#fff',
    margin: 20,
    borderRadius: 8,
    padding: 20,
  },
  modalText: {
    fontSize: 18,
    marginBottom: 20,
    textAlign: 'center',
  },
});
