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

@ABIMarker(ESimOperationResult.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ESimOperationResult;{a67b63b1-309b-4e77-9e7e-cd93f1ddc7b9})")
@WinRTByReference(brClass = ESimOperationResult.ByReference::class)
public class ESimOperationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IESimOperationResult.WithDefault, IWinRTObject {
  private val __496152889_Interface: IESimOperationResult.WithDefault by lazy {
    as_496152889()
  }


  public override val __496152889_Ptr: JNAPointer? by lazy {
    __496152889_Interface.__496152889_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__496152889_Interface)

  private fun as_496152889(): IESimOperationResult.WithDefault {
    if(pointer == NULL) {
      return(IESimOperationResult.ABI.makeIESimOperationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESimOperationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESimOperationResult.ABI.makeIESimOperationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ESimOperationResult> {
    public override fun getValue() = ESimOperationResult(pointer.getPointer(0))

    public fun setValue(value: ESimOperationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESimOperationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ESimOperationResult {
      val address = segment.toRawLongValue()
      return ESimOperationResult(Pointer(address))
    }

    public override fun toNative(obj: ESimOperationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
