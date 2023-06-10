import React, {useState} from 'react';
import { Text, StyleSheet, Image, TextInput,View} from 'react-native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import { createStackNavigator } from '@react-navigation/stack';
import { NavigationContainer } from '@react-navigation/native';
import CustomButton from './components/CustomButton';
import TelaInicial from './TelaInicial';

const MENSAGEM_EMAIL = "Digite o seu e-mail"
const MENSAGEM_SENHA = "Digite sua senha..."

const onPress = () => setCount(prevCount => prevCount + 1);

const Stack = createNativeStackNavigator();

function Login({ navigation }) {

  const goTelaInicial = () => {
    // Lógica de autenticação...

    // Navegar para a próxima página após o login bem-sucedido
    navigation.navigate('TelaInicial'); 
  };


    return (
    <View style={Estilos.container}>
    
      <Text style={Estilos.titulo}>Zé Mudança</Text>
      
      <Image style={Estilos.logo} source={require('./assets/caminhao.png')} />
      
      <Text style={Estilos.texto}>Login:</Text>
      <TextInput style={Estilos.input} placeholder={MENSAGEM_EMAIL} placeholderTextColor="grey"/>
     
      <Text  style={Estilos.texto}>Senha: </Text> 
      <TextInput style={Estilos.input} placeholder={MENSAGEM_SENHA} placeholderTextColor="grey"/>
      
      <View>
        <CustomButton  title="Acessar" onPress={goTelaInicial} />
      </View>

    </View>
    )
    
}


const Estilos = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'blue',
    alignItems: 'center',
    justifyContent: 'center',
    
    fontSize: 25,
  },
  titulo: {
    color: '#FFF',
    textShadowColor: '#FFF',
    fontSize: 50,
  },
  logo: {
    width: 200,
    height: 200,
    marginBottom: 20,
    borderRadius: 200,
    backgroundColor: '#FFF',
    padding: 15,
  },
  input: {
    backgroundColor: '#FFF',
    width: 350,
    height: 50,
    borderRadius: 25,
    textAlign: 'center',
    borderColor: "black",
    fontSize: 25,
  },
  texto:{
    fontSize: 30,
    padding: 10,
    color: '#fff'
  },

});

export default Login;
