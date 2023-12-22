package Windows.ApplicationModel

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

@ABIMarker(LimitedAccessFeatureRequestResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.LimitedAccessFeatureRequestResult;{d45156a6-1e24-5ddd-abb4-6188aba4d5bf})")
@WinRTByReference(brClass = LimitedAccessFeatureRequestResult.ByReference::class)
public class LimitedAccessFeatureRequestResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILimitedAccessFeatureRequestResult.WithDefault, IWinRTObject {
  private val __466948945_Interface: ILimitedAccessFeatureRequestResult.WithDefault by lazy {
    as_466948945()
  }


  public override val __466948945_Ptr: JNAPointer? by lazy {
    __466948945_Interface.__466948945_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__466948945_Interface)

  private fun as_466948945(): ILimitedAccessFeatureRequestResult.WithDefault {
    if(pointer == NULL) {
      return(ILimitedAccessFeatureRequestResult.ABI.makeILimitedAccessFeatureRequestResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILimitedAccessFeatureRequestResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILimitedAccessFeatureRequestResult.ABI.makeILimitedAccessFeatureRequestResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LimitedAccessFeatureRequestResult> {
    public override fun getValue() = LimitedAccessFeatureRequestResult(pointer.getPointer(0))

    public fun setValue(value: LimitedAccessFeatureRequestResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LimitedAccessFeatureRequestResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LimitedAccessFeatureRequestResult {
      val address = segment.toRawLongValue()
      return LimitedAccessFeatureRequestResult(Pointer(address))
    }

    public override fun toNative(obj: LimitedAccessFeatureRequestResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
