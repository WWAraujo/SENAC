import React from 'react';
import { Text, View, Image, StyleSheet } from 'react-native';

import { createNativeStackNavigator } from '@react-navigation/native-stack';
import CustomButton from './components/CustomButton';

import Site from './Site';
import Clientes from './Clientes';
import Servicos from './Servicos';
import Gerenciamento from './Gerenciamento';

const Stack = createNativeStackNavigator();

let array = [];

const ClientesAccess = (navigation) => {
  navigation.navigate('Clientes', { items: array })
};

const ServicosAccess = (navigation) => {
  navigation.navigate('Servicos', { items: array })
};

const GerenciamentoAccess = (navigation) => {
  navigation.navigate('Gerenciamento', { items: array })
};

const SiteAccess = (navigation) => {
  navigation.navigate('Site', { items: array })
};


function TelaInicial({ navigation }) {
  return (
    <View style={Estilos.container}>

      <Text style={Estilos.titulo}>Zé Mudança </Text>
      
      <Image style={Estilos.logo} source={require('./assets/caminhao.png')} />

      <View>
        <CustomButton title="Cliente" onPress={() => ClientesAccess(navigation)} />
      </View>

      <View>
        <CustomButton title="Serviço" onPress={() => ServicosAccess(navigation)} />
      </View>

      <View>
        <CustomButton title="Gerenciamento" onPress={() => GerenciamentoAccess(navigation)} />
      </View>

      <View>
        <CustomButton title="Site" onPress={() => SiteAccess(navigation)} />
      </View>

    </View>
  );
}

export default TelaInicial;

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
    fontSize: 20,
  },

  logo: {
    width: 200,
    height: 200,
    marginBottom: 20,
    borderRadius: 200,
    backgroundColor: '#FFF',
    padding: 15,
  },
});