package Windows.Globalization

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CalendarIdentifiers.ABI::class)
@WinRTByReference(brClass = CalendarIdentifiers.ByReference::class)
public class CalendarIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CalendarIdentifiers> {
    public override fun getValue() = CalendarIdentifiers(pointer.getPointer(0))

    public fun setValue(value: CalendarIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CalendarIdentifiers, MemoryAddress> {
    public val ICalendarIdentifiersStatics_Instance: ICalendarIdentifiersStatics by lazy {
      createICalendarIdentifiersStatics()
    }


    public val ICalendarIdentifiersStatics3_Instance: ICalendarIdentifiersStatics3 by lazy {
      createICalendarIdentifiersStatics3()
    }


    public val ICalendarIdentifiersStatics2_Instance: ICalendarIdentifiersStatics2 by lazy {
      createICalendarIdentifiersStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICalendarIdentifiersStatics(): ICalendarIdentifiersStatics {
      val refiid = Guid.REFIID(ICalendarIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.CalendarIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ICalendarIdentifiersStatics.ABI.makeICalendarIdentifiersStatics(interfacePtr.value)
      return result
    }

    public fun createICalendarIdentifiersStatics3(): ICalendarIdentifiersStatics3 {
      val refiid = Guid.REFIID(ICalendarIdentifiersStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.CalendarIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ICalendarIdentifiersStatics3.ABI.makeICalendarIdentifiersStatics3(interfacePtr.value)
      return result
    }

    public fun createICalendarIdentifiersStatics2(): ICalendarIdentifiersStatics2 {
      val refiid = Guid.REFIID(ICalendarIdentifiersStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.CalendarIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ICalendarIdentifiersStatics2.ABI.makeICalendarIdentifiersStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CalendarIdentifiers {
      val address = segment.toRawLongValue()
      return CalendarIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: CalendarIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Gregorian() = ABI.ICalendarIdentifiersStatics_Instance.get_Gregorian()

    public fun get_Hebrew() = ABI.ICalendarIdentifiersStatics_Instance.get_Hebrew()

    public fun get_Hijri() = ABI.ICalendarIdentifiersStatics_Instance.get_Hijri()

    public fun get_Japanese() = ABI.ICalendarIdentifiersStatics_Instance.get_Japanese()

    public fun get_Julian() = ABI.ICalendarIdentifiersStatics_Instance.get_Julian()

    public fun get_Korean() = ABI.ICalendarIdentifiersStatics_Instance.get_Korean()

    public fun get_Taiwan() = ABI.ICalendarIdentifiersStatics_Instance.get_Taiwan()

    public fun get_Thai() = ABI.ICalendarIdentifiersStatics_Instance.get_Thai()

    public fun get_UmAlQura() = ABI.ICalendarIdentifiersStatics_Instance.get_UmAlQura()

    public fun get_ChineseLunar() = ABI.ICalendarIdentifiersStatics3_Instance.get_ChineseLunar()

    public fun get_JapaneseLunar() = ABI.ICalendarIdentifiersStatics3_Instance.get_JapaneseLunar()

    public fun get_KoreanLunar() = ABI.ICalendarIdentifiersStatics3_Instance.get_KoreanLunar()

    public fun get_TaiwanLunar() = ABI.ICalendarIdentifiersStatics3_Instance.get_TaiwanLunar()

    public fun get_VietnameseLunar() =
        ABI.ICalendarIdentifiersStatics3_Instance.get_VietnameseLunar()

    public fun get_Persian() = ABI.ICalendarIdentifiersStatics2_Instance.get_Persian()
  }
}
