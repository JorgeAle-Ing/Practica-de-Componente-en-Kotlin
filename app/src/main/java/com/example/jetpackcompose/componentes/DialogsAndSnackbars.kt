package com.example.jetpackcompose.uicomponents

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DialogsAndSnackbarsGuide() {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    var openDialog by remember { mutableStateOf(false) }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text(
                    text = "Menú principal",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(16.dp)
                )
                Divider()
                NavigationDrawerItem(
                    label = { Text("Inicio") },
                    selected = false,
                    onClick = { scope.launch { drawerState.close() } },
                    modifier = Modifier.padding(8.dp)
                )
                NavigationDrawerItem(
                    label = { Text("Perfil") },
                    selected = false,
                    onClick = { scope.launch { drawerState.close() } },
                    modifier = Modifier.padding(8.dp)
                )
                NavigationDrawerItem(
                    label = { Text("Configuración") },
                    selected = false,
                    onClick = { scope.launch { drawerState.close() } },
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    ) {
        Scaffold(
            snackbarHost = { SnackbarHost(snackbarHostState) },
            topBar = {
                TopAppBar(
                    title = { Text("Ejemplo de Componentes Temporales") },
                    navigationIcon = {
                        IconButton(onClick = { scope.launch { drawerState.open() } }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Abrir menú lateral")
                        }
                    }
                )
            }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(24.dp)
                ) {

                    ElevatedCard(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.elevatedCardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Snackbar",
                                style = MaterialTheme.typography.titleMedium
                            )
                            Spacer(Modifier.height(8.dp))
                            Text(
                                text = "Muestra un mensaje temporal en la parte inferior de la pantalla.",
                                textAlign = TextAlign.Center
                            )
                            Spacer(Modifier.height(12.dp))
                            Button(
                                onClick = {
                                    scope.launch {
                                        snackbarHostState.showSnackbar(
                                            message = "Este es un mensaje tipo Snackbar",
                                            actionLabel = "Cerrar"
                                        )
                                    }
                                }
                            ) {
                                Text("Mostrar Snackbar")
                            }
                        }
                    }

                    ElevatedCard(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.elevatedCardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "AlertDialog",
                                style = MaterialTheme.typography.titleMedium
                            )
                            Spacer(Modifier.height(8.dp))
                            Text(
                                text = "Muestra un cuadro de diálogo que solicita confirmación del usuario.",
                                textAlign = TextAlign.Center
                            )
                            Spacer(Modifier.height(12.dp))
                            Button(onClick = { openDialog = true }) {
                                Text("Mostrar Diálogo")
                            }

                            if (openDialog) {
                                AlertDialog(
                                    onDismissRequest = { openDialog = false },
                                    title = { Text("Confirmar acción") },
                                    text = { Text("¿Deseas continuar con esta operación?") },
                                    confirmButton = {
                                        TextButton(onClick = { openDialog = false }) {
                                            Text("Aceptar")
                                        }
                                    },
                                    dismissButton = {
                                        TextButton(onClick = { openDialog = false }) {
                                            Text("Cancelar")
                                        }
                                    }
                                )
                            }
                        }
                    }

                    ElevatedCard(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.elevatedCardColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Modal Drawer",
                                style = MaterialTheme.typography.titleMedium
                            )
                            Spacer(Modifier.height(8.dp))
                            Text(
                                text = "Desliza desde la izquierda o usa el ícono del menú superior para abrir el panel lateral.",
                                textAlign = TextAlign.Center
                            )
                            Spacer(Modifier.height(12.dp))
                            Button(onClick = { scope.launch { drawerState.open() } }) {
                                Text("Abrir menú lateral")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DialogsAndSnackbarsPreview() {
    DialogsAndSnackbarsGuide()
}

