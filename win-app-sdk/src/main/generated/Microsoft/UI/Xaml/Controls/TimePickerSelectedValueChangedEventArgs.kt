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

@ABIMarker(TimePickerSelectedValueChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TimePickerSelectedValueChangedEventArgs;{6ed7edf1-9b0b-5e7b-9e10-f35660a29fd2})")
@WinRTByReference(brClass = TimePickerSelectedValueChangedEventArgs.ByReference::class)
public class TimePickerSelectedValueChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimePickerSelectedValueChangedEventArgs.WithDefault, IWinRTObject {
  private val __1408030295_Interface: ITimePickerSelectedValueChangedEventArgs.WithDefault by lazy {
    as_1408030295()
  }


  public override val __1408030295_Ptr: JNAPointer? by lazy {
    __1408030295_Interface.__1408030295_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1408030295_Interface)

  private fun as_1408030295(): ITimePickerSelectedValueChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITimePickerSelectedValueChangedEventArgs.ABI.makeITimePickerSelectedValueChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePickerSelectedValueChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePickerSelectedValueChangedEventArgs.ABI.makeITimePickerSelectedValueChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimePickerSelectedValueChangedEventArgs> {
    public override fun getValue() = TimePickerSelectedValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TimePickerSelectedValueChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimePickerSelectedValueChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        TimePickerSelectedValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return TimePickerSelectedValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TimePickerSelectedValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
