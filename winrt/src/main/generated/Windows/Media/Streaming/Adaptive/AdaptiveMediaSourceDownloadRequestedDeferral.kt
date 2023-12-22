package Windows.Media.Streaming.Adaptive

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

@ABIMarker(AdaptiveMediaSourceDownloadRequestedDeferral.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedDeferral;{05c68f64-fa20-4dbd-9821-4bf4c9bf77ab})")
@WinRTByReference(brClass = AdaptiveMediaSourceDownloadRequestedDeferral.ByReference::class)
public class AdaptiveMediaSourceDownloadRequestedDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourceDownloadRequestedDeferral.WithDefault, IWinRTObject {
  private val __82089594_Interface: IAdaptiveMediaSourceDownloadRequestedDeferral.WithDefault by
      lazy {
    as_82089594()
  }


  public override val __82089594_Ptr: JNAPointer? by lazy {
    __82089594_Interface.__82089594_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__82089594_Interface)

  private fun as_82089594(): IAdaptiveMediaSourceDownloadRequestedDeferral.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadRequestedDeferral.ABI.makeIAdaptiveMediaSourceDownloadRequestedDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadRequestedDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadRequestedDeferral.ABI.makeIAdaptiveMediaSourceDownloadRequestedDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourceDownloadRequestedDeferral> {
    public override fun getValue() =
        AdaptiveMediaSourceDownloadRequestedDeferral(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourceDownloadRequestedDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourceDownloadRequestedDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AdaptiveMediaSourceDownloadRequestedDeferral {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourceDownloadRequestedDeferral(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourceDownloadRequestedDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
