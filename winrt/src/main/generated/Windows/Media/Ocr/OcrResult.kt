package Windows.Media.Ocr

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

@ABIMarker(OcrResult.ABI::class)
@Signature("rc(Windows.Media.Ocr.OcrResult;{9bd235b2-175b-3d6a-92e2-388c206e2f63})")
@WinRTByReference(brClass = OcrResult.ByReference::class)
public class OcrResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOcrResult.WithDefault, IWinRTObject {
  private val __550700891_Interface: IOcrResult.WithDefault by lazy {
    as_550700891()
  }


  public override val __550700891_Ptr: JNAPointer? by lazy {
    __550700891_Interface.__550700891_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__550700891_Interface)

  private fun as_550700891(): IOcrResult.WithDefault {
    if(pointer == NULL) {
      return(IOcrResult.ABI.makeIOcrResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOcrResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOcrResult.ABI.makeIOcrResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<OcrResult> {
    public override fun getValue() = OcrResult(pointer.getPointer(0))

    public fun setValue(value: OcrResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OcrResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): OcrResult {
      val address = segment.toRawLongValue()
      return OcrResult(Pointer(address))
    }

    public override fun toNative(obj: OcrResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
