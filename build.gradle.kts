plugins {
	id("dev.frozenmilk.teamcode") version "10.2.0-0.1.3"
	id("dev.frozenmilk.sinister.sloth.load") version "0.2.1"
}

repositories {
	maven("https://repo.dairy.foundation/releases")
}

dependencies {
	implementation("dev.frozenmilk.sinister:Sloth:0.2.1")
}

ftc {
	// use this to easily add more FTC libraries
}
