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

@ABIMarker(XboxLiveQualityOfServicePrivatePayloadResult.ABI::class)
@Signature("rc(Windows.Networking.XboxLive.XboxLiveQualityOfServicePrivatePayloadResult;{5a6302ae-6f38-41c0-9fcc-ea6cb978cafc})")
@WinRTByReference(brClass = XboxLiveQualityOfServicePrivatePayloadResult.ByReference::class)
public class XboxLiveQualityOfServicePrivatePayloadResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXboxLiveQualityOfServicePrivatePayloadResult.WithDefault, IWinRTObject {
  private val __417032095_Interface: IXboxLiveQualityOfServicePrivatePayloadResult.WithDefault by
      lazy {
    as_417032095()
  }


  public override val __417032095_Ptr: JNAPointer? by lazy {
    __417032095_Interface.__417032095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__417032095_Interface)

  private fun as_417032095(): IXboxLiveQualityOfServicePrivatePayloadResult.WithDefault {
    if(pointer == NULL) {
      return(IXboxLiveQualityOfServicePrivatePayloadResult.ABI.makeIXboxLiveQualityOfServicePrivatePayloadResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXboxLiveQualityOfServicePrivatePayloadResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXboxLiveQualityOfServicePrivatePayloadResult.ABI.makeIXboxLiveQualityOfServicePrivatePayloadResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XboxLiveQualityOfServicePrivatePayloadResult> {
    public override fun getValue() =
        XboxLiveQualityOfServicePrivatePayloadResult(pointer.getPointer(0))

    public fun setValue(value: XboxLiveQualityOfServicePrivatePayloadResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XboxLiveQualityOfServicePrivatePayloadResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        XboxLiveQualityOfServicePrivatePayloadResult {
      val address = segment.toRawLongValue()
      return XboxLiveQualityOfServicePrivatePayloadResult(Pointer(address))
    }

    public override fun toNative(obj: XboxLiveQualityOfServicePrivatePayloadResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
