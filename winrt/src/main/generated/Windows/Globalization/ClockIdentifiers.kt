package Windows.Globalization

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

@ABIMarker(ClockIdentifiers.ABI::class)
@WinRTByReference(brClass = ClockIdentifiers.ByReference::class)
public class ClockIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClockIdentifiers> {
    public override fun getValue() = ClockIdentifiers(pointer.getPointer(0))

    public fun setValue(value: ClockIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClockIdentifiers, MemoryAddress> {
    public val IClockIdentifiersStatics_Instance: IClockIdentifiersStatics by lazy {
      createIClockIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIClockIdentifiersStatics(): IClockIdentifiersStatics {
      val refiid = Guid.REFIID(IClockIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.ClockIdentifiers".toHandle(),refiid,interfacePtr)
      val result = IClockIdentifiersStatics.ABI.makeIClockIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ClockIdentifiers {
      val address = segment.toRawLongValue()
      return ClockIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: ClockIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TwelveHour() = ABI.IClockIdentifiersStatics_Instance.get_TwelveHour()

    public fun get_TwentyFourHour() = ABI.IClockIdentifiersStatics_Instance.get_TwentyFourHour()
  }
}
