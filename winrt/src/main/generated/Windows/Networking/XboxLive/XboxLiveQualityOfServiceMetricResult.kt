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

@ABIMarker(XboxLiveQualityOfServiceMetricResult.ABI::class)
@Signature("rc(Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetricResult;{aeec53d1-3561-4782-b0cf-d3ae29d9fa87})")
@WinRTByReference(brClass = XboxLiveQualityOfServiceMetricResult.ByReference::class)
public class XboxLiveQualityOfServiceMetricResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXboxLiveQualityOfServiceMetricResult.WithDefault, IWinRTObject {
  private val __759751482_Interface: IXboxLiveQualityOfServiceMetricResult.WithDefault by lazy {
    as_759751482()
  }


  public override val __759751482_Ptr: JNAPointer? by lazy {
    __759751482_Interface.__759751482_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__759751482_Interface)

  private fun as_759751482(): IXboxLiveQualityOfServiceMetricResult.WithDefault {
    if(pointer == NULL) {
      return(IXboxLiveQualityOfServiceMetricResult.ABI.makeIXboxLiveQualityOfServiceMetricResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXboxLiveQualityOfServiceMetricResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXboxLiveQualityOfServiceMetricResult.ABI.makeIXboxLiveQualityOfServiceMetricResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XboxLiveQualityOfServiceMetricResult> {
    public override fun getValue() = XboxLiveQualityOfServiceMetricResult(pointer.getPointer(0))

    public fun setValue(value: XboxLiveQualityOfServiceMetricResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XboxLiveQualityOfServiceMetricResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): XboxLiveQualityOfServiceMetricResult {
      val address = segment.toRawLongValue()
      return XboxLiveQualityOfServiceMetricResult(Pointer(address))
    }

    public override fun toNative(obj: XboxLiveQualityOfServiceMetricResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
