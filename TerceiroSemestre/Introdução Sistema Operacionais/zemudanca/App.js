import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

import TelaInicial from './TelaInicial';
import Clientes from './Clientes';
import Gerenciamento from './Gerenciamento';
import Servicos from './Servicos';
import Site from './Site';
import Login from './Login';

const Stack = createNativeStackNavigator();

const LoginAccess = (navigation) => {
  navigation.navigate('Login')
};

const App = () => {

  return (
    <NavigationContainer>
      <Stack.Navigator initialRouteName="Home">
        <Stack.Screen name="Login" component={Login} options={{ title: 'Login', headerBackVisible: false }} />
        <Stack.Screen name="TelaInicial" component={TelaInicial} options={{ title: 'TelaInicial', headerBackVisible: false }} />
        <Stack.Screen name="Clientes" component={Clientes} options={{ title: 'Zé Mudança', headerBackVisible: false }} />
        <Stack.Screen name="Servicos" component={Servicos} options={{ title: 'Zé Mudança', headerBackVisible: false}} />
        <Stack.Screen name="Gerenciamento" component={Gerenciamento} options={{ title: 'Gerenciamento das viagens', headerBackVisible: false}} />
        <Stack.Screen name="Site" component={Site} options={{ title: 'Site', headerBackVisible: false}} />
      </Stack.Navigator>
    </NavigationContainer>
  );
};

export default App;






