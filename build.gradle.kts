plugins {
	id("dev.frozenmilk.teamcode") version "10.3.0-0.1.4"
	id("dev.frozenmilk.sinister.sloth.load") version "0.2.4"
}

repositories {
	maven("https://repo.dairy.foundation/releases")
}

dependencies {
	implementation("dev.frozenmilk.sinister:Sloth:0.2.4")
}

ftc {
	// use this to easily add more FTC libraries
}
