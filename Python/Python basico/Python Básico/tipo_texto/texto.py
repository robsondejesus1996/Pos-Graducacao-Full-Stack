nome_completo = "Robson de Jesus"

nome_com_aspas = """Robson
de
Jesus
"""


nome = "Robson"
sobrenome = "De Jesus"

print("Nome completo (1a forma): ", nome_completo)
print("Nome completo (2a forma): "+ nome_completo)
print("Nome completo (3a forma): " + "Robson" + " de Jesus")
print("Nome completo (4a forma): " + "Robson", "de Jesus")
print("Nome completo (5a forma): ", nome_com_aspas)
print("Nome completo (6a forma): ", nome_completo)
print("Nome completo (7a forma): %s" % nome_completo)
print(f"Nome completo (8a forma): {nome_completo}")
print(f"Nome completo (9a forma): {nome} {sobrenome}")
print("Nome completo (8a forma): {} {}".format(nome, sobrenome))
