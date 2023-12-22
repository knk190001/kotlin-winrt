package Windows.System.Update

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SystemUpdateManager.ABI::class)
@WinRTByReference(brClass = SystemUpdateManager.ByReference::class)
public class SystemUpdateManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemUpdateManager> {
    public override fun getValue() = SystemUpdateManager(pointer.getPointer(0))

    public fun setValue(value: SystemUpdateManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemUpdateManager, MemoryAddress> {
    public val ISystemUpdateManagerStatics_Instance: ISystemUpdateManagerStatics by lazy {
      createISystemUpdateManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemUpdateManagerStatics(): ISystemUpdateManagerStatics {
      val refiid = Guid.REFIID(ISystemUpdateManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Update.SystemUpdateManager".toHandle(),refiid,interfacePtr)
      val result =
          ISystemUpdateManagerStatics.ABI.makeISystemUpdateManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SystemUpdateManager {
      val address = segment.toRawLongValue()
      return SystemUpdateManager(Pointer(address))
    }

    public override fun toNative(obj: SystemUpdateManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.ISystemUpdateManagerStatics_Instance.IsSupported()

    public fun get_State() = ABI.ISystemUpdateManagerStatics_Instance.get_State()

    public fun add_StateChanged(handler: EventHandler<IUnknown?>) =
        ABI.ISystemUpdateManagerStatics_Instance.add_StateChanged(handler)

    public fun remove_StateChanged(token: EventRegistrationToken) =
        ABI.ISystemUpdateManagerStatics_Instance.remove_StateChanged(token)

    public fun get_DownloadProgress() =
        ABI.ISystemUpdateManagerStatics_Instance.get_DownloadProgress()

    public fun get_InstallProgress() =
        ABI.ISystemUpdateManagerStatics_Instance.get_InstallProgress()

    public fun get_UserActiveHoursStart() =
        ABI.ISystemUpdateManagerStatics_Instance.get_UserActiveHoursStart()

    public fun get_UserActiveHoursEnd() =
        ABI.ISystemUpdateManagerStatics_Instance.get_UserActiveHoursEnd()

    public fun get_UserActiveHoursMax() =
        ABI.ISystemUpdateManagerStatics_Instance.get_UserActiveHoursMax()

    public fun TrySetUserActiveHours(start: TimeSpan, end: TimeSpan) =
        ABI.ISystemUpdateManagerStatics_Instance.TrySetUserActiveHours(start, end)

    public fun get_LastUpdateCheckTime() =
        ABI.ISystemUpdateManagerStatics_Instance.get_LastUpdateCheckTime()

    public fun get_LastUpdateInstallTime() =
        ABI.ISystemUpdateManagerStatics_Instance.get_LastUpdateInstallTime()

    public fun get_LastErrorInfo() = ABI.ISystemUpdateManagerStatics_Instance.get_LastErrorInfo()

    public fun GetAutomaticRebootBlockIds() =
        ABI.ISystemUpdateManagerStatics_Instance.GetAutomaticRebootBlockIds()

    public fun BlockAutomaticRebootAsync(lockId: String) =
        ABI.ISystemUpdateManagerStatics_Instance.BlockAutomaticRebootAsync(lockId)

    public fun UnblockAutomaticRebootAsync(lockId: String) =
        ABI.ISystemUpdateManagerStatics_Instance.UnblockAutomaticRebootAsync(lockId)

    public fun get_ExtendedError() = ABI.ISystemUpdateManagerStatics_Instance.get_ExtendedError()

    public fun GetUpdateItems() = ABI.ISystemUpdateManagerStatics_Instance.GetUpdateItems()

    public fun get_AttentionRequiredReason() =
        ABI.ISystemUpdateManagerStatics_Instance.get_AttentionRequiredReason()

    public fun SetFlightRing(flightRing: String) =
        ABI.ISystemUpdateManagerStatics_Instance.SetFlightRing(flightRing)

    public fun GetFlightRing() = ABI.ISystemUpdateManagerStatics_Instance.GetFlightRing()

    public fun StartInstall(action: SystemUpdateStartInstallAction) =
        ABI.ISystemUpdateManagerStatics_Instance.StartInstall(action)

    public fun RebootToCompleteInstall() =
        ABI.ISystemUpdateManagerStatics_Instance.RebootToCompleteInstall()

    public fun StartCancelUpdates() = ABI.ISystemUpdateManagerStatics_Instance.StartCancelUpdates()
  }
}
