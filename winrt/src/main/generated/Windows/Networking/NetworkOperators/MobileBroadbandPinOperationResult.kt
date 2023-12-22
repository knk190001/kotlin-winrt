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

@ABIMarker(MobileBroadbandPinOperationResult.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandPinOperationResult;{11dddc32-31e7-49f5-b663-123d3bef0362})")
@WinRTByReference(brClass = MobileBroadbandPinOperationResult.ByReference::class)
public class MobileBroadbandPinOperationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandPinOperationResult.WithDefault, IWinRTObject {
  private val __1190849867_Interface: IMobileBroadbandPinOperationResult.WithDefault by lazy {
    as_1190849867()
  }


  public override val __1190849867_Ptr: JNAPointer? by lazy {
    __1190849867_Interface.__1190849867_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1190849867_Interface)

  private fun as_1190849867(): IMobileBroadbandPinOperationResult.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandPinOperationResult.ABI.makeIMobileBroadbandPinOperationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandPinOperationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandPinOperationResult.ABI.makeIMobileBroadbandPinOperationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandPinOperationResult> {
    public override fun getValue() = MobileBroadbandPinOperationResult(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandPinOperationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandPinOperationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandPinOperationResult {
      val address = segment.toRawLongValue()
      return MobileBroadbandPinOperationResult(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandPinOperationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
