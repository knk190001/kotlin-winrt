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

@ABIMarker(InkRecognizer.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkRecognizer;{077ccea3-904d-442a-b151-aaca3631c43b})")
@WinRTByReference(brClass = InkRecognizer.ByReference::class)
public class InkRecognizer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkRecognizer.WithDefault, IWinRTObject {
  private val __2044514000_Interface: IInkRecognizer.WithDefault by lazy {
    as_2044514000()
  }


  public override val __2044514000_Ptr: JNAPointer? by lazy {
    __2044514000_Interface.__2044514000_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2044514000_Interface)

  private fun as_2044514000(): IInkRecognizer.WithDefault {
    if(pointer == NULL) {
      return(IInkRecognizer.ABI.makeIInkRecognizer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkRecognizer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkRecognizer.ABI.makeIInkRecognizer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InkRecognizer>
      {
    public override fun getValue() = InkRecognizer(pointer.getPointer(0))

    public fun setValue(value: InkRecognizer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkRecognizer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkRecognizer {
      val address = segment.toRawLongValue()
      return InkRecognizer(Pointer(address))
    }

    public override fun toNative(obj: InkRecognizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
