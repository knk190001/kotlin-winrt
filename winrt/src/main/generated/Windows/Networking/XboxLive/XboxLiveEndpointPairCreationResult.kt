package Windows.Networking.XboxLive

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

@ABIMarker(XboxLiveEndpointPairCreationResult.ABI::class)
@Signature("rc(Windows.Networking.XboxLive.XboxLiveEndpointPairCreationResult;{d9a8bb95-2aab-4d1e-9794-33ecc0dcf0fe})")
@WinRTByReference(brClass = XboxLiveEndpointPairCreationResult.ByReference::class)
public class XboxLiveEndpointPairCreationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXboxLiveEndpointPairCreationResult.WithDefault, IWinRTObject {
  private val __620334875_Interface: IXboxLiveEndpointPairCreationResult.WithDefault by lazy {
    as_620334875()
  }


  public override val __620334875_Ptr: JNAPointer? by lazy {
    __620334875_Interface.__620334875_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__620334875_Interface)

  private fun as_620334875(): IXboxLiveEndpointPairCreationResult.WithDefault {
    if(pointer == NULL) {
      return(IXboxLiveEndpointPairCreationResult.ABI.makeIXboxLiveEndpointPairCreationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXboxLiveEndpointPairCreationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXboxLiveEndpointPairCreationResult.ABI.makeIXboxLiveEndpointPairCreationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XboxLiveEndpointPairCreationResult> {
    public override fun getValue() = XboxLiveEndpointPairCreationResult(pointer.getPointer(0))

    public fun setValue(value: XboxLiveEndpointPairCreationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XboxLiveEndpointPairCreationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): XboxLiveEndpointPairCreationResult {
      val address = segment.toRawLongValue()
      return XboxLiveEndpointPairCreationResult(Pointer(address))
    }

    public override fun toNative(obj: XboxLiveEndpointPairCreationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
