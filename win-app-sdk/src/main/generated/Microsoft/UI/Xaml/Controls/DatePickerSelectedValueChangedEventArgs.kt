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

@ABIMarker(DatePickerSelectedValueChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.DatePickerSelectedValueChangedEventArgs;{305ed436-370f-5e82-acf2-f1413e8f9ec4})")
@WinRTByReference(brClass = DatePickerSelectedValueChangedEventArgs.ByReference::class)
public class DatePickerSelectedValueChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDatePickerSelectedValueChangedEventArgs.WithDefault, IWinRTObject {
  private val __1121928662_Interface: IDatePickerSelectedValueChangedEventArgs.WithDefault by lazy {
    as_1121928662()
  }


  public override val __1121928662_Ptr: JNAPointer? by lazy {
    __1121928662_Interface.__1121928662_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1121928662_Interface)

  private fun as_1121928662(): IDatePickerSelectedValueChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDatePickerSelectedValueChangedEventArgs.ABI.makeIDatePickerSelectedValueChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatePickerSelectedValueChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatePickerSelectedValueChangedEventArgs.ABI.makeIDatePickerSelectedValueChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DatePickerSelectedValueChangedEventArgs> {
    public override fun getValue() = DatePickerSelectedValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DatePickerSelectedValueChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatePickerSelectedValueChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        DatePickerSelectedValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return DatePickerSelectedValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DatePickerSelectedValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
