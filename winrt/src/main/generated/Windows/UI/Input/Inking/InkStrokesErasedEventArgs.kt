package Windows.UI.Input.Inking

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

@ABIMarker(InkStrokesErasedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkStrokesErasedEventArgs;{a4216a22-1503-4ebf-8ff5-2de84584a8aa})")
@WinRTByReference(brClass = InkStrokesErasedEventArgs.ByReference::class)
public class InkStrokesErasedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkStrokesErasedEventArgs.WithDefault, IWinRTObject {
  private val __878054870_Interface: IInkStrokesErasedEventArgs.WithDefault by lazy {
    as_878054870()
  }


  public override val __878054870_Ptr: JNAPointer? by lazy {
    __878054870_Interface.__878054870_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__878054870_Interface)

  private fun as_878054870(): IInkStrokesErasedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IInkStrokesErasedEventArgs.ABI.makeIInkStrokesErasedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStrokesErasedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStrokesErasedEventArgs.ABI.makeIInkStrokesErasedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkStrokesErasedEventArgs> {
    public override fun getValue() = InkStrokesErasedEventArgs(pointer.getPointer(0))

    public fun setValue(value: InkStrokesErasedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkStrokesErasedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkStrokesErasedEventArgs {
      val address = segment.toRawLongValue()
      return InkStrokesErasedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: InkStrokesErasedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
