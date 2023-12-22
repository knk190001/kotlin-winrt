package Windows.System

import Windows.Foundation.DateTime
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DateTimeSettings.ABI::class)
@WinRTByReference(brClass = DateTimeSettings.ByReference::class)
public class DateTimeSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DateTimeSettings> {
    public override fun getValue() = DateTimeSettings(pointer.getPointer(0))

    public fun setValue(value: DateTimeSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DateTimeSettings, MemoryAddress> {
    public val IDateTimeSettingsStatics_Instance: IDateTimeSettingsStatics by lazy {
      createIDateTimeSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDateTimeSettingsStatics(): IDateTimeSettingsStatics {
      val refiid = Guid.REFIID(IDateTimeSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.DateTimeSettings".toHandle(),refiid,interfacePtr)
      val result = IDateTimeSettingsStatics.ABI.makeIDateTimeSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DateTimeSettings {
      val address = segment.toRawLongValue()
      return DateTimeSettings(Pointer(address))
    }

    public override fun toNative(obj: DateTimeSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SetSystemDateTime(utcDateTime: DateTime) =
        ABI.IDateTimeSettingsStatics_Instance.SetSystemDateTime(utcDateTime)
  }
}
