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

@ABIMarker(InkUnprocessedInput.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkUnprocessedInput;{db4445e0-8398-4921-ac3b-ab978c5ba256})")
@WinRTByReference(brClass = InkUnprocessedInput.ByReference::class)
public class InkUnprocessedInput(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkUnprocessedInput.WithDefault, IWinRTObject {
  private val __1694220255_Interface: IInkUnprocessedInput.WithDefault by lazy {
    as_1694220255()
  }


  public override val __1694220255_Ptr: JNAPointer? by lazy {
    __1694220255_Interface.__1694220255_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1694220255_Interface)

  private fun as_1694220255(): IInkUnprocessedInput.WithDefault {
    if(pointer == NULL) {
      return(IInkUnprocessedInput.ABI.makeIInkUnprocessedInput(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkUnprocessedInput>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkUnprocessedInput.ABI.makeIInkUnprocessedInput(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkUnprocessedInput> {
    public override fun getValue() = InkUnprocessedInput(pointer.getPointer(0))

    public fun setValue(value: InkUnprocessedInput): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkUnprocessedInput, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkUnprocessedInput {
      val address = segment.toRawLongValue()
      return InkUnprocessedInput(Pointer(address))
    }

    public override fun toNative(obj: InkUnprocessedInput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
