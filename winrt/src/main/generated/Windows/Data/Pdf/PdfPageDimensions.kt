package Windows.Data.Pdf

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

@ABIMarker(PdfPageDimensions.ABI::class)
@Signature("rc(Windows.Data.Pdf.PdfPageDimensions;{22170471-313e-44e8-835d-63a3e7624a10})")
@WinRTByReference(brClass = PdfPageDimensions.ByReference::class)
public class PdfPageDimensions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPdfPageDimensions.WithDefault, IWinRTObject {
  private val __14490722_Interface: IPdfPageDimensions.WithDefault by lazy {
    as_14490722()
  }


  public override val __14490722_Ptr: JNAPointer? by lazy {
    __14490722_Interface.__14490722_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__14490722_Interface)

  private fun as_14490722(): IPdfPageDimensions.WithDefault {
    if(pointer == NULL) {
      return(IPdfPageDimensions.ABI.makeIPdfPageDimensions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPdfPageDimensions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPdfPageDimensions.ABI.makeIPdfPageDimensions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PdfPageDimensions> {
    public override fun getValue() = PdfPageDimensions(pointer.getPointer(0))

    public fun setValue(value: PdfPageDimensions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PdfPageDimensions, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PdfPageDimensions {
      val address = segment.toRawLongValue()
      return PdfPageDimensions(Pointer(address))
    }

    public override fun toNative(obj: PdfPageDimensions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
