package Microsoft.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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

@ABIMarker(CalendarViewSelectedDatesChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.CalendarViewSelectedDatesChangedEventArgs;{675f688f-bc30-59f6-83c4-140bd053a09a})")
@WinRTByReference(brClass = CalendarViewSelectedDatesChangedEventArgs.ByReference::class)
public class CalendarViewSelectedDatesChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICalendarViewSelectedDatesChangedEventArgs.WithDefault, IWinRTObject {
  private val __2057030429_Interface: ICalendarViewSelectedDatesChangedEventArgs.WithDefault by
      lazy {
    as_2057030429()
  }


  public override val __2057030429_Ptr: JNAPointer? by lazy {
    __2057030429_Interface.__2057030429_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2057030429_Interface)

  private fun as_2057030429(): ICalendarViewSelectedDatesChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICalendarViewSelectedDatesChangedEventArgs.ABI.makeICalendarViewSelectedDatesChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICalendarViewSelectedDatesChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICalendarViewSelectedDatesChangedEventArgs.ABI.makeICalendarViewSelectedDatesChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CalendarViewSelectedDatesChangedEventArgs> {
    public override fun getValue() =
        CalendarViewSelectedDatesChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CalendarViewSelectedDatesChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CalendarViewSelectedDatesChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CalendarViewSelectedDatesChangedEventArgs {
      val address = segment.toRawLongValue()
      return CalendarViewSelectedDatesChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CalendarViewSelectedDatesChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
