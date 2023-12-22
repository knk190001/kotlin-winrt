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

@ABIMarker(NumberBoxValueChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.NumberBoxValueChangedEventArgs;{c66cf16e-7c8a-532e-9d23-058c1c98dd50})")
@WinRTByReference(brClass = NumberBoxValueChangedEventArgs.ByReference::class)
public class NumberBoxValueChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INumberBoxValueChangedEventArgs.WithDefault, IWinRTObject {
  private val __1082577081_Interface: INumberBoxValueChangedEventArgs.WithDefault by lazy {
    as_1082577081()
  }


  public override val __1082577081_Ptr: JNAPointer? by lazy {
    __1082577081_Interface.__1082577081_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1082577081_Interface)

  private fun as_1082577081(): INumberBoxValueChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INumberBoxValueChangedEventArgs.ABI.makeINumberBoxValueChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INumberBoxValueChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INumberBoxValueChangedEventArgs.ABI.makeINumberBoxValueChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NumberBoxValueChangedEventArgs> {
    public override fun getValue() = NumberBoxValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: NumberBoxValueChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NumberBoxValueChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NumberBoxValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return NumberBoxValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NumberBoxValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
