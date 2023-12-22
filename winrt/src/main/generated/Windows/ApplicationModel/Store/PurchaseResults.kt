package Windows.ApplicationModel.Store

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

@ABIMarker(PurchaseResults.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.PurchaseResults;{ed50b37e-8656-4f65-b8c8-ac7e0cb1a1c2})")
@WinRTByReference(brClass = PurchaseResults.ByReference::class)
public class PurchaseResults(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPurchaseResults.WithDefault, IWinRTObject {
  private val __536402813_Interface: IPurchaseResults.WithDefault by lazy {
    as_536402813()
  }


  public override val __536402813_Ptr: JNAPointer? by lazy {
    __536402813_Interface.__536402813_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__536402813_Interface)

  private fun as_536402813(): IPurchaseResults.WithDefault {
    if(pointer == NULL) {
      return(IPurchaseResults.ABI.makeIPurchaseResults(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPurchaseResults>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPurchaseResults.ABI.makeIPurchaseResults(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PurchaseResults> {
    public override fun getValue() = PurchaseResults(pointer.getPointer(0))

    public fun setValue(value: PurchaseResults): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PurchaseResults, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PurchaseResults {
      val address = segment.toRawLongValue()
      return PurchaseResults(Pointer(address))
    }

    public override fun toNative(obj: PurchaseResults): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
