package Windows.Graphics.Printing3D

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

@ABIMarker(Printing3DMeshVerificationResult.ABI::class)
@Signature("rc(Windows.Graphics.Printing3D.Printing3DMeshVerificationResult;{195671ba-e93a-4e8a-a46f-dea8e852197e})")
@WinRTByReference(brClass = Printing3DMeshVerificationResult.ByReference::class)
public class Printing3DMeshVerificationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrinting3DMeshVerificationResult.WithDefault, IWinRTObject {
  private val __1915305098_Interface: IPrinting3DMeshVerificationResult.WithDefault by lazy {
    as_1915305098()
  }


  public override val __1915305098_Ptr: JNAPointer? by lazy {
    __1915305098_Interface.__1915305098_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1915305098_Interface)

  private fun as_1915305098(): IPrinting3DMeshVerificationResult.WithDefault {
    if(pointer == NULL) {
      return(IPrinting3DMeshVerificationResult.ABI.makeIPrinting3DMeshVerificationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrinting3DMeshVerificationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrinting3DMeshVerificationResult.ABI.makeIPrinting3DMeshVerificationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Printing3DMeshVerificationResult> {
    public override fun getValue() = Printing3DMeshVerificationResult(pointer.getPointer(0))

    public fun setValue(value: Printing3DMeshVerificationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Printing3DMeshVerificationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Printing3DMeshVerificationResult {
      val address = segment.toRawLongValue()
      return Printing3DMeshVerificationResult(Pointer(address))
    }

    public override fun toNative(obj: Printing3DMeshVerificationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
