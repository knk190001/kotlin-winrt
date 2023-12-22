package Microsoft.UI.Text

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

@ABIMarker(RichEditTextRange.ABI::class)
@Signature("rc(Microsoft.UI.Text.RichEditTextRange;{06d4abcf-0c06-5d12-a743-85537efd09ea})")
@WinRTByReference(brClass = RichEditTextRange.ByReference::class)
public class RichEditTextRange(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextRange.WithDefault, IWinRTObject {
  private val __1605925810_Interface: ITextRange.WithDefault by lazy {
    as_1605925810()
  }


  public override val __1605925810_Ptr: JNAPointer? by lazy {
    __1605925810_Interface.__1605925810_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1605925810_Interface)

  private fun as_1605925810(): ITextRange.WithDefault {
    if(pointer == NULL) {
      return(ITextRange.ABI.makeITextRange(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextRange>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextRange.ABI.makeITextRange(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RichEditTextRange> {
    public override fun getValue() = RichEditTextRange(pointer.getPointer(0))

    public fun setValue(value: RichEditTextRange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichEditTextRange, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RichEditTextRange {
      val address = segment.toRawLongValue()
      return RichEditTextRange(Pointer(address))
    }

    public override fun toNative(obj: RichEditTextRange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
