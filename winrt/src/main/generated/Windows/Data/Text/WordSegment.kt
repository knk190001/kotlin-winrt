package Windows.Data.Text

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

@ABIMarker(WordSegment.ABI::class)
@Signature("rc(Windows.Data.Text.WordSegment;{d2d4ba6d-987c-4cc0-b6bd-d49a11b38f9a})")
@WinRTByReference(brClass = WordSegment.ByReference::class)
public class WordSegment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWordSegment.WithDefault, IWinRTObject {
  private val __53271834_Interface: IWordSegment.WithDefault by lazy {
    as_53271834()
  }


  public override val __53271834_Ptr: JNAPointer? by lazy {
    __53271834_Interface.__53271834_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__53271834_Interface)

  private fun as_53271834(): IWordSegment.WithDefault {
    if(pointer == NULL) {
      return(IWordSegment.ABI.makeIWordSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWordSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWordSegment.ABI.makeIWordSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WordSegment> {
    public override fun getValue() = WordSegment(pointer.getPointer(0))

    public fun setValue(value: WordSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WordSegment, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WordSegment {
      val address = segment.toRawLongValue()
      return WordSegment(Pointer(address))
    }

    public override fun toNative(obj: WordSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
