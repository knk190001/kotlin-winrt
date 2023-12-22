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

@ABIMarker(RichEditBoxSelectionChangingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.RichEditBoxSelectionChangingEventArgs;{5dbadbe1-0515-5045-9a6f-6859237301ac})")
@WinRTByReference(brClass = RichEditBoxSelectionChangingEventArgs.ByReference::class)
public class RichEditBoxSelectionChangingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRichEditBoxSelectionChangingEventArgs.WithDefault, IWinRTObject {
  private val __342063652_Interface: IRichEditBoxSelectionChangingEventArgs.WithDefault by lazy {
    as_342063652()
  }


  public override val __342063652_Ptr: JNAPointer? by lazy {
    __342063652_Interface.__342063652_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__342063652_Interface)

  private fun as_342063652(): IRichEditBoxSelectionChangingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRichEditBoxSelectionChangingEventArgs.ABI.makeIRichEditBoxSelectionChangingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRichEditBoxSelectionChangingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRichEditBoxSelectionChangingEventArgs.ABI.makeIRichEditBoxSelectionChangingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RichEditBoxSelectionChangingEventArgs> {
    public override fun getValue() = RichEditBoxSelectionChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: RichEditBoxSelectionChangingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichEditBoxSelectionChangingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RichEditBoxSelectionChangingEventArgs {
      val address = segment.toRawLongValue()
      return RichEditBoxSelectionChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RichEditBoxSelectionChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
