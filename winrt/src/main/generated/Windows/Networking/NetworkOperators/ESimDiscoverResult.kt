package Windows.Networking.NetworkOperators

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

@ABIMarker(ESimDiscoverResult.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ESimDiscoverResult;{56b4bb5e-ab2f-5ac6-b359-dd5a8e237926})")
@WinRTByReference(brClass = ESimDiscoverResult.ByReference::class)
public class ESimDiscoverResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IESimDiscoverResult.WithDefault, IWinRTObject {
  private val __2082809359_Interface: IESimDiscoverResult.WithDefault by lazy {
    as_2082809359()
  }


  public override val __2082809359_Ptr: JNAPointer? by lazy {
    __2082809359_Interface.__2082809359_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2082809359_Interface)

  private fun as_2082809359(): IESimDiscoverResult.WithDefault {
    if(pointer == NULL) {
      return(IESimDiscoverResult.ABI.makeIESimDiscoverResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESimDiscoverResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESimDiscoverResult.ABI.makeIESimDiscoverResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ESimDiscoverResult> {
    public override fun getValue() = ESimDiscoverResult(pointer.getPointer(0))

    public fun setValue(value: ESimDiscoverResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESimDiscoverResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ESimDiscoverResult {
      val address = segment.toRawLongValue()
      return ESimDiscoverResult(Pointer(address))
    }

    public override fun toNative(obj: ESimDiscoverResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
