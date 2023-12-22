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

@ABIMarker(CalendarViewDayItemChangingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.CalendarViewDayItemChangingEventArgs;{e894fe7f-12f6-5b1a-88a2-a96764c1273f})")
@WinRTByReference(brClass = CalendarViewDayItemChangingEventArgs.ByReference::class)
public class CalendarViewDayItemChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICalendarViewDayItemChangingEventArgs.WithDefault, IWinRTObject {
  private val __292581371_Interface: ICalendarViewDayItemChangingEventArgs.WithDefault by lazy {
    as_292581371()
  }


  public override val __292581371_Ptr: JNAPointer? by lazy {
    __292581371_Interface.__292581371_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__292581371_Interface)

  private fun as_292581371(): ICalendarViewDayItemChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICalendarViewDayItemChangingEventArgs.ABI.makeICalendarViewDayItemChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICalendarViewDayItemChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICalendarViewDayItemChangingEventArgs.ABI.makeICalendarViewDayItemChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CalendarViewDayItemChangingEventArgs> {
    public override fun getValue() = CalendarViewDayItemChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: CalendarViewDayItemChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CalendarViewDayItemChangingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CalendarViewDayItemChangingEventArgs {
      val address = segment.toRawLongValue()
      return CalendarViewDayItemChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CalendarViewDayItemChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
