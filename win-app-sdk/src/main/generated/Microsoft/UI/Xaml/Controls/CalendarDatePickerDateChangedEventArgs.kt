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

@ABIMarker(CalendarDatePickerDateChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.CalendarDatePickerDateChangedEventArgs;{57c212d7-c2f2-54a0-9d41-f263b1e5106e})")
@WinRTByReference(brClass = CalendarDatePickerDateChangedEventArgs.ByReference::class)
public class CalendarDatePickerDateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICalendarDatePickerDateChangedEventArgs.WithDefault, IWinRTObject {
  private val __1373628046_Interface: ICalendarDatePickerDateChangedEventArgs.WithDefault by lazy {
    as_1373628046()
  }


  public override val __1373628046_Ptr: JNAPointer? by lazy {
    __1373628046_Interface.__1373628046_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1373628046_Interface)

  private fun as_1373628046(): ICalendarDatePickerDateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICalendarDatePickerDateChangedEventArgs.ABI.makeICalendarDatePickerDateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICalendarDatePickerDateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICalendarDatePickerDateChangedEventArgs.ABI.makeICalendarDatePickerDateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CalendarDatePickerDateChangedEventArgs> {
    public override fun getValue() = CalendarDatePickerDateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CalendarDatePickerDateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CalendarDatePickerDateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CalendarDatePickerDateChangedEventArgs {
      val address = segment.toRawLongValue()
      return CalendarDatePickerDateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CalendarDatePickerDateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
