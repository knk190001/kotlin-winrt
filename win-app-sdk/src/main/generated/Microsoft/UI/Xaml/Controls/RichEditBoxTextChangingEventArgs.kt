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

@ABIMarker(RichEditBoxTextChangingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.RichEditBoxTextChangingEventArgs;{e887b29a-1551-5868-a5dc-3fcfe7452e6b})")
@WinRTByReference(brClass = RichEditBoxTextChangingEventArgs.ByReference::class)
public class RichEditBoxTextChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRichEditBoxTextChangingEventArgs.WithDefault, IWinRTObject {
  private val __298824993_Interface: IRichEditBoxTextChangingEventArgs.WithDefault by lazy {
    as_298824993()
  }


  public override val __298824993_Ptr: JNAPointer? by lazy {
    __298824993_Interface.__298824993_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__298824993_Interface)

  private fun as_298824993(): IRichEditBoxTextChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBoxTextChangingEventArgs.ABI.makeIRichEditBoxTextChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBoxTextChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBoxTextChangingEventArgs.ABI.makeIRichEditBoxTextChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RichEditBoxTextChangingEventArgs> {
    public override fun getValue() = RichEditBoxTextChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: RichEditBoxTextChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichEditBoxTextChangingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RichEditBoxTextChangingEventArgs {
      val address = segment.toRawLongValue()
      return RichEditBoxTextChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RichEditBoxTextChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
