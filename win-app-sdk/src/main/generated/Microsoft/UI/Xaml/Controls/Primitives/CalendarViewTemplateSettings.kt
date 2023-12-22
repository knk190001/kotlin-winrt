package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyObject
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CalendarViewTemplateSettings.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.CalendarViewTemplateSettings;{23b0facb-0083-5109-87d3-dbeb13e331a0})")
@WinRTByReference(brClass = CalendarViewTemplateSettings.ByReference::class)
public class CalendarViewTemplateSettings(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ICalendarViewTemplateSettings.WithDefault, IWinRTObject {
  private val __1238038351_Interface: ICalendarViewTemplateSettings.WithDefault by lazy {
    as_1238038351()
  }


  public override val __1238038351_Ptr: JNAPointer? by lazy {
    __1238038351_Interface.__1238038351_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1238038351_Interface)

  private fun as_1238038351(): ICalendarViewTemplateSettings.WithDefault {
    if(pointer == NULL) {
      return(ICalendarViewTemplateSettings.ABI.makeICalendarViewTemplateSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICalendarViewTemplateSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICalendarViewTemplateSettings.ABI.makeICalendarViewTemplateSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CalendarViewTemplateSettings> {
    public override fun getValue() = CalendarViewTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: CalendarViewTemplateSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CalendarViewTemplateSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CalendarViewTemplateSettings {
      val address = segment.toRawLongValue()
      return CalendarViewTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: CalendarViewTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
