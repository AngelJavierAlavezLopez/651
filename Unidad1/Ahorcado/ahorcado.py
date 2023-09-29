class Ahorcado:
	def __init__(self,palabra="",intentos=5):
		self.palabra_secreta =self.quitar_acentos(palabra)
		self.palabra_usuario="?" * len(palabra)
		self.intentos=intentos

	def imprimir_estado(self):
		print(self.palabra_usuario)
		print(self.palabra_secreta)
		print("Le quedan ", self.intentos, "intentos")
	def quitar_acentos(self, palabra):
		acento =   ["á","é","í","ó","ú","ú"]
		remplazo=["a","e","i","o","u","u"]

		for i in range (len(acentos)):
			palabra=palabra.replace(acento[i],remplazo[i])
		return palabra

	def pedir_letra(self):
		letra= input("Digite una letra:")
		return self.quitar_acento(letra)

	def buscar_letra(self,letra):
		veces=0
		for i in range (len(self,palabra_secreta)):
			if(self.palabra_secreta[i]==letra):
				veces+=1
				self.palabra_usuario=self.palabra_usuario[:i] + letra + self.palabra.usuario[i+1:]
		return veces
	def deternimar_si_gano(self):
		return self.palabra_usuario.find("?") ==-1

	def jugar(self):
		while(not self.determinar_si_gano()and self.intentos >0):
			self.imprimir_estado()
			letra=self.pedir_letra()
			veces=self.buscar_letra(letra)
			if (veces==0):
				self.intentos -=1
		if(self.intentos==0):
			print("perdio );")
		else:
			print("gano")
		


		
def main():
	ahorcado = Ahorcado("paralilepípedo")
	ahorcado.jugar()
if __name__ =="__main__":
	main()