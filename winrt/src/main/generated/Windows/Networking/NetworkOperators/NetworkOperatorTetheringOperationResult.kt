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

@ABIMarker(NetworkOperatorTetheringOperationResult.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.NetworkOperatorTetheringOperationResult;{ebd203a1-01ba-476d-b4b3-bf3d12c8f80c})")
@WinRTByReference(brClass = NetworkOperatorTetheringOperationResult.ByReference::class)
public class NetworkOperatorTetheringOperationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INetworkOperatorTetheringOperationResult.WithDefault, IWinRTObject {
  private val __1336649043_Interface: INetworkOperatorTetheringOperationResult.WithDefault by lazy {
    as_1336649043()
  }


  public override val __1336649043_Ptr: JNAPointer? by lazy {
    __1336649043_Interface.__1336649043_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1336649043_Interface)

  private fun as_1336649043(): INetworkOperatorTetheringOperationResult.WithDefault {
    if(pointer == NULL) {
      return(INetworkOperatorTetheringOperationResult.ABI.makeINetworkOperatorTetheringOperationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INetworkOperatorTetheringOperationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INetworkOperatorTetheringOperationResult.ABI.makeINetworkOperatorTetheringOperationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NetworkOperatorTetheringOperationResult> {
    public override fun getValue() = NetworkOperatorTetheringOperationResult(pointer.getPointer(0))

    public fun setValue(value: NetworkOperatorTetheringOperationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NetworkOperatorTetheringOperationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        NetworkOperatorTetheringOperationResult {
      val address = segment.toRawLongValue()
      return NetworkOperatorTetheringOperationResult(Pointer(address))
    }

    public override fun toNative(obj: NetworkOperatorTetheringOperationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
