package Microsoft.Windows.AppLifecycle

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

@ABIMarker(ExtendedActivationKind.ABI::class)
@Signature("enum(Microsoft.Windows.AppLifecycle.ExtendedActivationKind;i4)")
@WinRTByReference(brClass = ExtendedActivationKind.ByReference::class)
public enum class ExtendedActivationKind(
  public val value: Int
) : NativeMapped {
  Launch(0),
  Search(1),
  ShareTarget(2),
  File(3),
  Protocol(4),
  FileOpenPicker(5),
  FileSavePicker(6),
  CachedFileUpdater(7),
  ContactPicker(8),
  Device(9),
  PrintTaskSettings(10),
  CameraSettings(11),
  RestrictedLaunch(12),
  AppointmentsProvider(13),
  Contact(14),
  LockScreenCall(15),
  VoiceCommand(16),
  LockScreen(17),
  PickerReturned(1000),
  WalletAction(1001),
  PickFileContinuation(1002),
  PickSaveFileContinuation(1003),
  PickFolderContinuation(1004),
  WebAuthenticationBrokerContinuation(1005),
  WebAccountProvider(1006),
  ComponentUI(1007),
  ProtocolForResults(1009),
  ToastNotification(1010),
  Print3DWorkflow(1011),
  DialReceiver(1012),
  DevicePairing(1013),
  UserDataAccountsProvider(1014),
  FilePickerExperience(1015),
  LockScreenComponent(1016),
  ContactPanel(1017),
  PrintWorkflowForegroundTask(1018),
  GameUIProvider(1019),
  StartupTask(1020),
  CommandLineLaunch(1021),
  BarcodeScannerProvider(1022),
  PrintSupportJobUI(1023),
  PrintSupportSettingsUI(1024),
  PhoneCallActivation(1025),
  VpnForeground(1026),
  Push(5000),
  AppNotification(5001),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExtendedActivationKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Launch
      1 -> Search
      2 -> ShareTarget
      3 -> File
      4 -> Protocol
      5 -> FileOpenPicker
      6 -> FileSavePicker
      7 -> CachedFileUpdater
      8 -> ContactPicker
      9 -> Device
      10 -> PrintTaskSettings
      11 -> CameraSettings
      12 -> RestrictedLaunch
      13 -> AppointmentsProvider
      14 -> Contact
      15 -> LockScreenCall
      16 -> VoiceCommand
      17 -> LockScreen
      1000 -> PickerReturned
      1001 -> WalletAction
      1002 -> PickFileContinuation
      1003 -> PickSaveFileContinuation
      1004 -> PickFolderContinuation
      1005 -> WebAuthenticationBrokerContinuation
      1006 -> WebAccountProvider
      1007 -> ComponentUI
      1009 -> ProtocolForResults
      1010 -> ToastNotification
      1011 -> Print3DWorkflow
      1012 -> DialReceiver
      1013 -> DevicePairing
      1014 -> UserDataAccountsProvider
      1015 -> FilePickerExperience
      1016 -> LockScreenComponent
      1017 -> ContactPanel
      1018 -> PrintWorkflowForegroundTask
      1019 -> GameUIProvider
      1020 -> StartupTask
      1021 -> CommandLineLaunch
      1022 -> BarcodeScannerProvider
      1023 -> PrintSupportJobUI
      1024 -> PrintSupportSettingsUI
      1025 -> PhoneCallActivation
      1026 -> VpnForeground
      5000 -> Push
      5001 -> AppNotification
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ExtendedActivationKind> {
    public fun setValue(newValue: ExtendedActivationKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExtendedActivationKind =
        ExtendedActivationKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ExtendedActivationKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExtendedActivationKind =
        ExtendedActivationKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExtendedActivationKind): Int = obj.value
  }
}
