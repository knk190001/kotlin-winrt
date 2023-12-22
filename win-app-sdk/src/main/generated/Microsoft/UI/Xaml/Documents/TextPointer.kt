package Microsoft.UI.Xaml.Documents

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

@ABIMarker(TextPointer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Documents.TextPointer;{842eb385-ee41-5930-979b-438fa7525a51})")
@WinRTByReference(brClass = TextPointer.ByReference::class)
public class TextPointer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextPointer.WithDefault, IWinRTObject {
  private val __1226047059_Interface: ITextPointer.WithDefault by lazy {
    as_1226047059()
  }


  public override val __1226047059_Ptr: JNAPointer? by lazy {
    __1226047059_Interface.__1226047059_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1226047059_Interface)

  private fun as_1226047059(): ITextPointer.WithDefault {
    if(pointer == NULL) {
      return(ITextPointer.ABI.makeITextPointer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextPointer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextPointer.ABI.makeITextPointer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TextPointer> {
    public override fun getValue() = TextPointer(pointer.getPointer(0))

    public fun setValue(value: TextPointer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextPointer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TextPointer {
      val address = segment.toRawLongValue()
      return TextPointer(Pointer(address))
    }

    public override fun toNative(obj: TextPointer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
