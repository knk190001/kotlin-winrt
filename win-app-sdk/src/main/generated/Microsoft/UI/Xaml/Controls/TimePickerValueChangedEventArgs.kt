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

@ABIMarker(TimePickerValueChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TimePickerValueChangedEventArgs;{7b98953f-c24a-53c6-8a3a-520558508b08})")
@WinRTByReference(brClass = TimePickerValueChangedEventArgs.ByReference::class)
public class TimePickerValueChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimePickerValueChangedEventArgs.WithDefault, IWinRTObject {
  private val __1412466638_Interface: ITimePickerValueChangedEventArgs.WithDefault by lazy {
    as_1412466638()
  }


  public override val __1412466638_Ptr: JNAPointer? by lazy {
    __1412466638_Interface.__1412466638_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1412466638_Interface)

  private fun as_1412466638(): ITimePickerValueChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITimePickerValueChangedEventArgs.ABI.makeITimePickerValueChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimePickerValueChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimePickerValueChangedEventArgs.ABI.makeITimePickerValueChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimePickerValueChangedEventArgs> {
    public override fun getValue() = TimePickerValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TimePickerValueChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimePickerValueChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TimePickerValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return TimePickerValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TimePickerValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
