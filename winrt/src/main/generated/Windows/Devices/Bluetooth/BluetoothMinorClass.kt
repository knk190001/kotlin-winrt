package Windows.Devices.Bluetooth

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(BluetoothMinorClass.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.BluetoothMinorClass;i4)")
@WinRTByReference(brClass = BluetoothMinorClass.ByReference::class)
public enum class BluetoothMinorClass(
  public val value: Int
) : NativeMapped {
  Uncategorized(0),
  ComputerDesktop(1),
  ComputerServer(2),
  ComputerLaptop(3),
  ComputerHandheld(4),
  ComputerPalmSize(5),
  ComputerWearable(6),
  ComputerTablet(7),
  PhoneCellular(1),
  PhoneCordless(2),
  PhoneSmartPhone(3),
  PhoneWired(4),
  PhoneIsdn(5),
  NetworkFullyAvailable(0),
  NetworkUsed01To17Percent(8),
  NetworkUsed17To33Percent(16),
  NetworkUsed33To50Percent(24),
  NetworkUsed50To67Percent(32),
  NetworkUsed67To83Percent(40),
  NetworkUsed83To99Percent(48),
  NetworkNoServiceAvailable(56),
  AudioVideoWearableHeadset(1),
  AudioVideoHandsFree(2),
  AudioVideoMicrophone(4),
  AudioVideoLoudspeaker(5),
  AudioVideoHeadphones(6),
  AudioVideoPortableAudio(7),
  AudioVideoCarAudio(8),
  AudioVideoSetTopBox(9),
  AudioVideoHifiAudioDevice(10),
  AudioVideoVcr(11),
  AudioVideoVideoCamera(12),
  AudioVideoCamcorder(13),
  AudioVideoVideoMonitor(14),
  AudioVideoVideoDisplayAndLoudspeaker(15),
  AudioVideoVideoConferencing(16),
  AudioVideoGamingOrToy(18),
  PeripheralJoystick(1),
  PeripheralGamepad(2),
  PeripheralRemoteControl(3),
  PeripheralSensing(4),
  PeripheralDigitizerTablet(5),
  PeripheralCardReader(6),
  PeripheralDigitalPen(7),
  PeripheralHandheldScanner(8),
  PeripheralHandheldGesture(9),
  WearableWristwatch(1),
  WearablePager(2),
  WearableJacket(3),
  WearableHelmet(4),
  WearableGlasses(5),
  ToyRobot(1),
  ToyVehicle(2),
  ToyDoll(3),
  ToyController(4),
  ToyGame(5),
  HealthBloodPressureMonitor(1),
  HealthThermometer(2),
  HealthWeighingScale(3),
  HealthGlucoseMeter(4),
  HealthPulseOximeter(5),
  HealthHeartRateMonitor(6),
  HealthHealthDataDisplay(7),
  HealthStepCounter(8),
  HealthBodyCompositionAnalyzer(9),
  HealthPeakFlowMonitor(10),
  HealthMedicationMonitor(11),
  HealthKneeProsthesis(12),
  HealthAnkleProsthesis(13),
  HealthGenericHealthManager(14),
  HealthPersonalMobilityDevice(15),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BluetoothMinorClass {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Uncategorized
      1 -> ComputerDesktop
      2 -> ComputerServer
      3 -> ComputerLaptop
      4 -> ComputerHandheld
      5 -> ComputerPalmSize
      6 -> ComputerWearable
      7 -> ComputerTablet
      1 -> PhoneCellular
      2 -> PhoneCordless
      3 -> PhoneSmartPhone
      4 -> PhoneWired
      5 -> PhoneIsdn
      0 -> NetworkFullyAvailable
      8 -> NetworkUsed01To17Percent
      16 -> NetworkUsed17To33Percent
      24 -> NetworkUsed33To50Percent
      32 -> NetworkUsed50To67Percent
      40 -> NetworkUsed67To83Percent
      48 -> NetworkUsed83To99Percent
      56 -> NetworkNoServiceAvailable
      1 -> AudioVideoWearableHeadset
      2 -> AudioVideoHandsFree
      4 -> AudioVideoMicrophone
      5 -> AudioVideoLoudspeaker
      6 -> AudioVideoHeadphones
      7 -> AudioVideoPortableAudio
      8 -> AudioVideoCarAudio
      9 -> AudioVideoSetTopBox
      10 -> AudioVideoHifiAudioDevice
      11 -> AudioVideoVcr
      12 -> AudioVideoVideoCamera
      13 -> AudioVideoCamcorder
      14 -> AudioVideoVideoMonitor
      15 -> AudioVideoVideoDisplayAndLoudspeaker
      16 -> AudioVideoVideoConferencing
      18 -> AudioVideoGamingOrToy
      1 -> PeripheralJoystick
      2 -> PeripheralGamepad
      3 -> PeripheralRemoteControl
      4 -> PeripheralSensing
      5 -> PeripheralDigitizerTablet
      6 -> PeripheralCardReader
      7 -> PeripheralDigitalPen
      8 -> PeripheralHandheldScanner
      9 -> PeripheralHandheldGesture
      1 -> WearableWristwatch
      2 -> WearablePager
      3 -> WearableJacket
      4 -> WearableHelmet
      5 -> WearableGlasses
      1 -> ToyRobot
      2 -> ToyVehicle
      3 -> ToyDoll
      4 -> ToyController
      5 -> ToyGame
      1 -> HealthBloodPressureMonitor
      2 -> HealthThermometer
      3 -> HealthWeighingScale
      4 -> HealthGlucoseMeter
      5 -> HealthPulseOximeter
      6 -> HealthHeartRateMonitor
      7 -> HealthHealthDataDisplay
      8 -> HealthStepCounter
      9 -> HealthBodyCompositionAnalyzer
      10 -> HealthPeakFlowMonitor
      11 -> HealthMedicationMonitor
      12 -> HealthKneeProsthesis
      13 -> HealthAnkleProsthesis
      14 -> HealthGenericHealthManager
      15 -> HealthPersonalMobilityDevice
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BluetoothMinorClass> {
    public fun setValue(newValue: BluetoothMinorClass): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BluetoothMinorClass =
        BluetoothMinorClass.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BluetoothMinorClass, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BluetoothMinorClass =
        BluetoothMinorClass.values()[0].fromNative(value, null)

    public override fun toNative(obj: BluetoothMinorClass): Int = obj.value
  }
}
