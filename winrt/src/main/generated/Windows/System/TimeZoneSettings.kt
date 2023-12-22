package Windows.System

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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TimeZoneSettings.ABI::class)
@WinRTByReference(brClass = TimeZoneSettings.ByReference::class)
public class TimeZoneSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimeZoneSettings> {
    public override fun getValue() = TimeZoneSettings(pointer.getPointer(0))

    public fun setValue(value: TimeZoneSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimeZoneSettings, MemoryAddress> {
    public val ITimeZoneSettingsStatics2_Instance: ITimeZoneSettingsStatics2 by lazy {
      createITimeZoneSettingsStatics2()
    }


    public val ITimeZoneSettingsStatics_Instance: ITimeZoneSettingsStatics by lazy {
      createITimeZoneSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITimeZoneSettingsStatics2(): ITimeZoneSettingsStatics2 {
      val refiid = Guid.REFIID(ITimeZoneSettingsStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.TimeZoneSettings".toHandle(),refiid,interfacePtr)
      val result = ITimeZoneSettingsStatics2.ABI.makeITimeZoneSettingsStatics2(interfacePtr.value)
      return result
    }

    public fun createITimeZoneSettingsStatics(): ITimeZoneSettingsStatics {
      val refiid = Guid.REFIID(ITimeZoneSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.TimeZoneSettings".toHandle(),refiid,interfacePtr)
      val result = ITimeZoneSettingsStatics.ABI.makeITimeZoneSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TimeZoneSettings {
      val address = segment.toRawLongValue()
      return TimeZoneSettings(Pointer(address))
    }

    public override fun toNative(obj: TimeZoneSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun AutoUpdateTimeZoneAsync(timeout: TimeSpan) =
        ABI.ITimeZoneSettingsStatics2_Instance.AutoUpdateTimeZoneAsync(timeout)

    public fun get_CurrentTimeZoneDisplayName() =
        ABI.ITimeZoneSettingsStatics_Instance.get_CurrentTimeZoneDisplayName()

    public fun get_SupportedTimeZoneDisplayNames() =
        ABI.ITimeZoneSettingsStatics_Instance.get_SupportedTimeZoneDisplayNames()

    public fun get_CanChangeTimeZone() =
        ABI.ITimeZoneSettingsStatics_Instance.get_CanChangeTimeZone()

    public fun ChangeTimeZoneByDisplayName(timeZoneDisplayName: String) =
        ABI.ITimeZoneSettingsStatics_Instance.ChangeTimeZoneByDisplayName(timeZoneDisplayName)
  }
}
