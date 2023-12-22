package Windows.Phone.Notification.Management

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.TimeSpan
import Windows.Storage.Streams.IRandomAccessStreamReference
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAccessoryManager.ABI::class)
@Signature("{0d04a12c-883d-4aa7-bca7-fa4bb8bffee6}")
@Guid("0d04a12c883d4aa7bca7fa4bb8bffee6")
@WinRTInterface("0d04a12c883d4aa7bca7fa4bb8bffee6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccessoryManager.ByReference::class)
public interface IAccessoryManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RegisterAccessoryApp(): String?

  @InterfaceMethod(1)
  public fun GetNextTriggerDetails(): IAccessoryNotificationTriggerDetails?

  @InterfaceMethod(2)
  public fun ProcessTriggerDetails(pDetails: IAccessoryNotificationTriggerDetails?): Unit

  @InterfaceMethod(3)
  public fun get_PhoneLineDetails(): IVectorView<PhoneLineDetails?>?

  @InterfaceMethod(4)
  public fun GetPhoneLineDetails(phoneLine: com.sun.jna.platform.win32.Guid.GUID?):
      PhoneLineDetails?

  @InterfaceMethod(5)
  public fun AcceptPhoneCall(phoneCallId: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun AcceptPhoneCall(phoneCallId: WinDef.UINT, endPoint: PhoneCallAudioEndpoint?): Unit

  @InterfaceMethod(7)
  public fun AcceptPhoneCallWithVideo(phoneCallId: WinDef.UINT): Unit

  @InterfaceMethod(8)
  public fun AcceptPhoneCallWithVideo(phoneCallId: WinDef.UINT, endPoint: PhoneCallAudioEndpoint?):
      Unit

  @InterfaceMethod(9)
  public fun RejectPhoneCall(phoneCallId: WinDef.UINT): Unit

  @InterfaceMethod(10)
  public fun RejectPhoneCall(phoneCallId: WinDef.UINT, textResponseID: WinDef.UINT): Unit

  @InterfaceMethod(11)
  public fun MakePhoneCall(phoneLine: com.sun.jna.platform.win32.Guid.GUID?, phoneNumber: String?):
      Unit

  @InterfaceMethod(12)
  public fun MakePhoneCall(
    phoneLine: com.sun.jna.platform.win32.Guid.GUID?,
    phoneNumber: String?,
    endPoint: PhoneCallAudioEndpoint?
  ): Unit

  @InterfaceMethod(13)
  public fun MakePhoneCallWithVideo(phoneLine: com.sun.jna.platform.win32.Guid.GUID?,
      phoneNumber: String?): Unit

  @InterfaceMethod(14)
  public fun MakePhoneCallWithVideo(
    phoneLine: com.sun.jna.platform.win32.Guid.GUID?,
    phoneNumber: String?,
    endPoint: PhoneCallAudioEndpoint?
  ): Unit

  @InterfaceMethod(15)
  public fun SwapPhoneCalls(phoneCallIdToHold: WinDef.UINT, phoneCallIdOnHold: WinDef.UINT): Unit

  @InterfaceMethod(16)
  public fun HoldPhoneCall(phoneCallId: WinDef.UINT, holdCall: Boolean): Unit

  @InterfaceMethod(17)
  public fun EndPhoneCall(phoneCallId: WinDef.UINT): Unit

  @InterfaceMethod(18)
  public fun put_PhoneMute(value: Boolean): Unit

  @InterfaceMethod(19)
  public fun get_PhoneMute(): Boolean

  @InterfaceMethod(20)
  public fun put_PhoneCallAudioEndpoint(value: PhoneCallAudioEndpoint?): Unit

  @InterfaceMethod(21)
  public fun get_PhoneCallAudioEndpoint(): PhoneCallAudioEndpoint?

  @InterfaceMethod(22)
  public fun SnoozeAlarm(alarmId: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(23)
  public fun SnoozeAlarm(alarmId: com.sun.jna.platform.win32.Guid.GUID?, timeSpan: TimeSpan?): Unit

  @InterfaceMethod(24)
  public fun DismissAlarm(alarmId: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(25)
  public fun SnoozeReminder(reminderId: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(26)
  public fun SnoozeReminder(reminderId: com.sun.jna.platform.win32.Guid.GUID?, timeSpan: TimeSpan?):
      Unit

  @InterfaceMethod(27)
  public fun DismissReminder(reminderId: com.sun.jna.platform.win32.Guid.GUID?): Unit

  @InterfaceMethod(28)
  public fun GetMediaMetadata(): MediaMetadata?

  @InterfaceMethod(29)
  public fun get_MediaPlaybackCapabilities(): PlaybackCapability?

  @InterfaceMethod(30)
  public fun get_MediaPlaybackStatus(): PlaybackStatus?

  @InterfaceMethod(31)
  public fun PerformMediaPlaybackCommand(command: PlaybackCommand?): Unit

  @InterfaceMethod(32)
  public fun get_DoNotDisturbEnabled(): Boolean

  @InterfaceMethod(33)
  public fun get_DrivingModeEnabled(): Boolean

  @InterfaceMethod(34)
  public fun get_BatterySaverState(): Boolean

  @InterfaceMethod(35)
  public fun GetApps(): IMapView<String?, AppNotificationInfo?>?

  @InterfaceMethod(36)
  public fun EnableNotificationsForApplication(appId: String?): Unit

  @InterfaceMethod(37)
  public fun DisableNotificationsForApplication(appId: String?): Unit

  @InterfaceMethod(38)
  public fun IsNotificationEnabledForApplication(appId: String?): Boolean

  @InterfaceMethod(39)
  public fun GetEnabledAccessoryNotificationTypes(): Int

  @InterfaceMethod(40)
  public fun EnableAccessoryNotificationTypes(accessoryNotificationTypes: Int): Unit

  @InterfaceMethod(41)
  public fun DisableAllAccessoryNotificationTypes(): Unit

  @InterfaceMethod(42)
  public fun GetUserConsent(): Boolean

  @InterfaceMethod(43)
  public fun GetAppIcon(appId: String?): IRandomAccessStreamReference?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccessoryManager> {
    public override fun getValue() = ABI.makeIAccessoryManager(pointer.getPointer(0))

    public fun setValue(value: IAccessoryManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccessoryManager {
    public val __1820029495_Ptr: Pointer?

    public val _1820029495_VtblPtr: Pointer?
      get() = __1820029495_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RegisterAccessoryApp(): String? {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetNextTriggerDetails(): IAccessoryNotificationTriggerDetails? {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAccessoryNotificationTriggerDetails>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAccessoryNotificationTriggerDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ProcessTriggerDetails(pDetails: IAccessoryNotificationTriggerDetails?):
        Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(pDetails),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_PhoneLineDetails(): IVectorView<PhoneLineDetails?>? {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PhoneLineDetails?>>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PhoneLineDetails?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetPhoneLineDetails(phoneLine: com.sun.jna.platform.win32.Guid.GUID?):
        PhoneLineDetails? {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineDetails>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(phoneLine), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun AcceptPhoneCall(phoneCallId: WinDef.UINT): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, phoneCallId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun AcceptPhoneCall(phoneCallId: WinDef.UINT,
        endPoint: PhoneCallAudioEndpoint?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, phoneCallId, marshalToNative(endPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun AcceptPhoneCallWithVideo(phoneCallId: WinDef.UINT): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, phoneCallId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun AcceptPhoneCallWithVideo(phoneCallId: WinDef.UINT,
        endPoint: PhoneCallAudioEndpoint?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, phoneCallId, marshalToNative(endPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun RejectPhoneCall(phoneCallId: WinDef.UINT): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, phoneCallId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun RejectPhoneCall(phoneCallId: WinDef.UINT, textResponseID: WinDef.UINT):
        Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, phoneCallId, textResponseID,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun MakePhoneCall(phoneLine: com.sun.jna.platform.win32.Guid.GUID?,
        phoneNumber: String?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(phoneLine),
          marshalToNative(phoneNumber),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun MakePhoneCall(
      phoneLine: com.sun.jna.platform.win32.Guid.GUID?,
      phoneNumber: String?,
      endPoint: PhoneCallAudioEndpoint?
    ): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(phoneLine),
          marshalToNative(phoneNumber), marshalToNative(endPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun MakePhoneCallWithVideo(phoneLine: com.sun.jna.platform.win32.Guid.GUID?,
        phoneNumber: String?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(phoneLine),
          marshalToNative(phoneNumber),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun MakePhoneCallWithVideo(
      phoneLine: com.sun.jna.platform.win32.Guid.GUID?,
      phoneNumber: String?,
      endPoint: PhoneCallAudioEndpoint?
    ): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(phoneLine),
          marshalToNative(phoneNumber), marshalToNative(endPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun SwapPhoneCalls(phoneCallIdToHold: WinDef.UINT,
        phoneCallIdOnHold: WinDef.UINT): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, phoneCallIdToHold, phoneCallIdOnHold,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun HoldPhoneCall(phoneCallId: WinDef.UINT, holdCall: Boolean): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, phoneCallId, holdCall,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun EndPhoneCall(phoneCallId: WinDef.UINT): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, phoneCallId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun put_PhoneMute(value: Boolean): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_PhoneMute(): Boolean {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun put_PhoneCallAudioEndpoint(value: PhoneCallAudioEndpoint?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_PhoneCallAudioEndpoint(): PhoneCallAudioEndpoint? {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallAudioEndpoint>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallAudioEndpoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun SnoozeAlarm(alarmId: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(alarmId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun SnoozeAlarm(alarmId: com.sun.jna.platform.win32.Guid.GUID?,
        timeSpan: TimeSpan?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(alarmId),
          marshalToNative(timeSpan),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun DismissAlarm(alarmId: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(alarmId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun SnoozeReminder(reminderId: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(reminderId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun SnoozeReminder(reminderId: com.sun.jna.platform.win32.Guid.GUID?,
        timeSpan: TimeSpan?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(reminderId),
          marshalToNative(timeSpan),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun DismissReminder(reminderId: com.sun.jna.platform.win32.Guid.GUID?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(reminderId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun GetMediaMetadata(): MediaMetadata? {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaMetadata>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaMetadata>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun get_MediaPlaybackCapabilities(): PlaybackCapability? {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaybackCapability>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaybackCapability>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun get_MediaPlaybackStatus(): PlaybackStatus? {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaybackStatus>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaybackStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun PerformMediaPlaybackCommand(command: PlaybackCommand?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(command),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_DoNotDisturbEnabled(): Boolean {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun get_DrivingModeEnabled(): Boolean {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(34)
    public override fun get_BatterySaverState(): Boolean {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun GetApps(): IMapView<String?, AppNotificationInfo?>? {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, AppNotificationInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?,
          AppNotificationInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(36)
    public override fun EnableNotificationsForApplication(appId: String?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(appId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun DisableNotificationsForApplication(appId: String?): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(appId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun IsNotificationEnabledForApplication(appId: String?): Boolean {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(appId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(39)
    public override fun GetEnabledAccessoryNotificationTypes(): Int {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(40)
    public override fun EnableAccessoryNotificationTypes(accessoryNotificationTypes: Int): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, accessoryNotificationTypes,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(41)
    public override fun DisableAllAccessoryNotificationTypes(): Unit {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun GetUserConsent(): Boolean {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(43)
    public override fun GetAppIcon(appId: String?): IRandomAccessStreamReference? {
      val fnPtr = _1820029495_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1820029495_Ptr, marshalToNative(appId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }
  }

  public class IAccessoryManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1820029495_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccessoryManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d04a12c883d4aa7bca7fa4bb8bffee6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccessoryManager(ptr: Pointer?): WithDefault = IAccessoryManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccessoryManager {
      val address = segment.toRawLongValue()
      return makeIAccessoryManager(Pointer(address))
    }

    public override fun toNative(obj: IAccessoryManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1820029495_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccessoryManager): Array<IAccessoryManager?> = (elements
        as Array<IAccessoryManager?>).castToImpl<IAccessoryManager,IAccessoryManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccessoryManager?> =
        arrayOfNulls<IAccessoryManager_Impl>(size) as Array<IAccessoryManager?>
  }
}
