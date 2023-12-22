package Windows.Phone.Notification.Management

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AccessoryManager.ABI::class)
@WinRTByReference(brClass = AccessoryManager.ByReference::class)
public class AccessoryManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AccessoryManager> {
    public override fun getValue() = AccessoryManager(pointer.getPointer(0))

    public fun setValue(value: AccessoryManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AccessoryManager, MemoryAddress> {
    public val IAccessoryManager3_Instance: IAccessoryManager3 by lazy {
      createIAccessoryManager3()
    }


    public val IAccessoryManager2_Instance: IAccessoryManager2 by lazy {
      createIAccessoryManager2()
    }


    public val IAccessoryManager_Instance: IAccessoryManager by lazy {
      createIAccessoryManager()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAccessoryManager3(): IAccessoryManager3 {
      val refiid = Guid.REFIID(IAccessoryManager3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.Notification.Management.AccessoryManager".toHandle(),refiid,interfacePtr)
      val result = IAccessoryManager3.ABI.makeIAccessoryManager3(interfacePtr.value)
      return result
    }

    public fun createIAccessoryManager2(): IAccessoryManager2 {
      val refiid = Guid.REFIID(IAccessoryManager2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.Notification.Management.AccessoryManager".toHandle(),refiid,interfacePtr)
      val result = IAccessoryManager2.ABI.makeIAccessoryManager2(interfacePtr.value)
      return result
    }

    public fun createIAccessoryManager(): IAccessoryManager {
      val refiid = Guid.REFIID(IAccessoryManager.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.Notification.Management.AccessoryManager".toHandle(),refiid,interfacePtr)
      val result = IAccessoryManager.ABI.makeIAccessoryManager(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AccessoryManager {
      val address = segment.toRawLongValue()
      return AccessoryManager(Pointer(address))
    }

    public override fun toNative(obj: AccessoryManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SnoozeAlarmByInstanceId(instanceId: String) =
        ABI.IAccessoryManager3_Instance.SnoozeAlarmByInstanceId(instanceId)

    public fun DismissAlarmByInstanceId(instanceId: String) =
        ABI.IAccessoryManager3_Instance.DismissAlarmByInstanceId(instanceId)

    public fun SnoozeReminderByInstanceId(instanceId: String) =
        ABI.IAccessoryManager3_Instance.SnoozeReminderByInstanceId(instanceId)

    public fun DismissReminderByInstanceId(instanceId: String) =
        ABI.IAccessoryManager3_Instance.DismissReminderByInstanceId(instanceId)

    public fun RingDevice() = ABI.IAccessoryManager2_Instance.RingDevice()

    public fun get_SpeedDialList() = ABI.IAccessoryManager2_Instance.get_SpeedDialList()

    public fun ClearToast(instanceId: String) =
        ABI.IAccessoryManager2_Instance.ClearToast(instanceId)

    public fun get_IsPhonePinLocked() = ABI.IAccessoryManager2_Instance.get_IsPhonePinLocked()

    public fun IncreaseVolume(step: Int) = ABI.IAccessoryManager2_Instance.IncreaseVolume(step)

    public fun DecreaseVolume(step: Int) = ABI.IAccessoryManager2_Instance.DecreaseVolume(step)

    public fun SetMute(mute: Boolean) = ABI.IAccessoryManager2_Instance.SetMute(mute)

    public fun SetRingerVibrate(ringer: Boolean, vibrate: Boolean) =
        ABI.IAccessoryManager2_Instance.SetRingerVibrate(ringer, vibrate)

    public fun get_VolumeInfo() = ABI.IAccessoryManager2_Instance.get_VolumeInfo()

    public fun GetAllEmailAccounts() = ABI.IAccessoryManager2_Instance.GetAllEmailAccounts()

    public fun GetFolders(emailAccount: String) =
        ABI.IAccessoryManager2_Instance.GetFolders(emailAccount)

    public fun EnableEmailNotificationEmailAccount(emailAccount: String) =
        ABI.IAccessoryManager2_Instance.EnableEmailNotificationEmailAccount(emailAccount)

    public fun DisableEmailNotificationEmailAccount(emailAccount: String) =
        ABI.IAccessoryManager2_Instance.DisableEmailNotificationEmailAccount(emailAccount)

    public fun EnableEmailNotificationFolderFilter(emailAccount: String,
        folders: IVectorView<String?>) =
        ABI.IAccessoryManager2_Instance.EnableEmailNotificationFolderFilter(emailAccount, folders)

    public fun UpdateEmailReadStatus(messageEntryId: BinaryId, isRead: Boolean) =
        ABI.IAccessoryManager2_Instance.UpdateEmailReadStatus(messageEntryId, isRead)

    public fun RegisterAccessoryApp() = ABI.IAccessoryManager_Instance.RegisterAccessoryApp()

    public fun GetNextTriggerDetails() = ABI.IAccessoryManager_Instance.GetNextTriggerDetails()

    public fun ProcessTriggerDetails(pDetails: IAccessoryNotificationTriggerDetails) =
        ABI.IAccessoryManager_Instance.ProcessTriggerDetails(pDetails)

    public fun get_PhoneLineDetails() = ABI.IAccessoryManager_Instance.get_PhoneLineDetails()

    public fun GetPhoneLineDetails(phoneLine: Guid.GUID) =
        ABI.IAccessoryManager_Instance.GetPhoneLineDetails(phoneLine)

    public fun AcceptPhoneCall(phoneCallId: WinDef.UINT) =
        ABI.IAccessoryManager_Instance.AcceptPhoneCall(phoneCallId)

    public fun AcceptPhoneCall(phoneCallId: WinDef.UINT, endPoint: PhoneCallAudioEndpoint) =
        ABI.IAccessoryManager_Instance.AcceptPhoneCall(phoneCallId, endPoint)

    public fun AcceptPhoneCallWithVideo(phoneCallId: WinDef.UINT) =
        ABI.IAccessoryManager_Instance.AcceptPhoneCallWithVideo(phoneCallId)

    public fun AcceptPhoneCallWithVideo(phoneCallId: WinDef.UINT, endPoint: PhoneCallAudioEndpoint)
        = ABI.IAccessoryManager_Instance.AcceptPhoneCallWithVideo(phoneCallId, endPoint)

    public fun RejectPhoneCall(phoneCallId: WinDef.UINT) =
        ABI.IAccessoryManager_Instance.RejectPhoneCall(phoneCallId)

    public fun RejectPhoneCall(phoneCallId: WinDef.UINT, textResponseID: WinDef.UINT) =
        ABI.IAccessoryManager_Instance.RejectPhoneCall(phoneCallId, textResponseID)

    public fun MakePhoneCall(phoneLine: Guid.GUID, phoneNumber: String) =
        ABI.IAccessoryManager_Instance.MakePhoneCall(phoneLine, phoneNumber)

    public fun MakePhoneCall(
      phoneLine: Guid.GUID,
      phoneNumber: String,
      endPoint: PhoneCallAudioEndpoint
    ) = ABI.IAccessoryManager_Instance.MakePhoneCall(phoneLine, phoneNumber, endPoint)

    public fun MakePhoneCallWithVideo(phoneLine: Guid.GUID, phoneNumber: String) =
        ABI.IAccessoryManager_Instance.MakePhoneCallWithVideo(phoneLine, phoneNumber)

    public fun MakePhoneCallWithVideo(
      phoneLine: Guid.GUID,
      phoneNumber: String,
      endPoint: PhoneCallAudioEndpoint
    ) = ABI.IAccessoryManager_Instance.MakePhoneCallWithVideo(phoneLine, phoneNumber, endPoint)

    public fun SwapPhoneCalls(phoneCallIdToHold: WinDef.UINT, phoneCallIdOnHold: WinDef.UINT) =
        ABI.IAccessoryManager_Instance.SwapPhoneCalls(phoneCallIdToHold, phoneCallIdOnHold)

    public fun HoldPhoneCall(phoneCallId: WinDef.UINT, holdCall: Boolean) =
        ABI.IAccessoryManager_Instance.HoldPhoneCall(phoneCallId, holdCall)

    public fun EndPhoneCall(phoneCallId: WinDef.UINT) =
        ABI.IAccessoryManager_Instance.EndPhoneCall(phoneCallId)

    public fun put_PhoneMute(value: Boolean) = ABI.IAccessoryManager_Instance.put_PhoneMute(value)

    public fun get_PhoneMute() = ABI.IAccessoryManager_Instance.get_PhoneMute()

    public fun put_PhoneCallAudioEndpoint(value: PhoneCallAudioEndpoint) =
        ABI.IAccessoryManager_Instance.put_PhoneCallAudioEndpoint(value)

    public fun get_PhoneCallAudioEndpoint() =
        ABI.IAccessoryManager_Instance.get_PhoneCallAudioEndpoint()

    public fun SnoozeAlarm(alarmId: Guid.GUID) = ABI.IAccessoryManager_Instance.SnoozeAlarm(alarmId)

    public fun SnoozeAlarm(alarmId: Guid.GUID, timeSpan: TimeSpan) =
        ABI.IAccessoryManager_Instance.SnoozeAlarm(alarmId, timeSpan)

    public fun DismissAlarm(alarmId: Guid.GUID) =
        ABI.IAccessoryManager_Instance.DismissAlarm(alarmId)

    public fun SnoozeReminder(reminderId: Guid.GUID) =
        ABI.IAccessoryManager_Instance.SnoozeReminder(reminderId)

    public fun SnoozeReminder(reminderId: Guid.GUID, timeSpan: TimeSpan) =
        ABI.IAccessoryManager_Instance.SnoozeReminder(reminderId, timeSpan)

    public fun DismissReminder(reminderId: Guid.GUID) =
        ABI.IAccessoryManager_Instance.DismissReminder(reminderId)

    public fun GetMediaMetadata() = ABI.IAccessoryManager_Instance.GetMediaMetadata()

    public fun get_MediaPlaybackCapabilities() =
        ABI.IAccessoryManager_Instance.get_MediaPlaybackCapabilities()

    public fun get_MediaPlaybackStatus() = ABI.IAccessoryManager_Instance.get_MediaPlaybackStatus()

    public fun PerformMediaPlaybackCommand(command: PlaybackCommand) =
        ABI.IAccessoryManager_Instance.PerformMediaPlaybackCommand(command)

    public fun get_DoNotDisturbEnabled() = ABI.IAccessoryManager_Instance.get_DoNotDisturbEnabled()

    public fun get_DrivingModeEnabled() = ABI.IAccessoryManager_Instance.get_DrivingModeEnabled()

    public fun get_BatterySaverState() = ABI.IAccessoryManager_Instance.get_BatterySaverState()

    public fun GetApps() = ABI.IAccessoryManager_Instance.GetApps()

    public fun EnableNotificationsForApplication(appId: String) =
        ABI.IAccessoryManager_Instance.EnableNotificationsForApplication(appId)

    public fun DisableNotificationsForApplication(appId: String) =
        ABI.IAccessoryManager_Instance.DisableNotificationsForApplication(appId)

    public fun IsNotificationEnabledForApplication(appId: String) =
        ABI.IAccessoryManager_Instance.IsNotificationEnabledForApplication(appId)

    public fun GetEnabledAccessoryNotificationTypes() =
        ABI.IAccessoryManager_Instance.GetEnabledAccessoryNotificationTypes()

    public fun EnableAccessoryNotificationTypes(accessoryNotificationTypes: Int) =
        ABI.IAccessoryManager_Instance.EnableAccessoryNotificationTypes(accessoryNotificationTypes)

    public fun DisableAllAccessoryNotificationTypes() =
        ABI.IAccessoryManager_Instance.DisableAllAccessoryNotificationTypes()

    public fun GetUserConsent() = ABI.IAccessoryManager_Instance.GetUserConsent()

    public fun GetAppIcon(appId: String) = ABI.IAccessoryManager_Instance.GetAppIcon(appId)
  }
}
