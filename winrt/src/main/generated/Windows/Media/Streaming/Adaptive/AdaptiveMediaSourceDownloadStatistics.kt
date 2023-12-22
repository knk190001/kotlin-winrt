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

@ABIMarker(AdaptiveMediaSourceDownloadStatistics.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadStatistics;{a306cefb-e96a-4dff-a9b8-1ae08c01ae98})")
@WinRTByReference(brClass = AdaptiveMediaSourceDownloadStatistics.ByReference::class)
public class AdaptiveMediaSourceDownloadStatistics(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourceDownloadStatistics.WithDefault, IWinRTObject {
  private val __2083917506_Interface: IAdaptiveMediaSourceDownloadStatistics.WithDefault by lazy {
    as_2083917506()
  }


  public override val __2083917506_Ptr: JNAPointer? by lazy {
    __2083917506_Interface.__2083917506_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2083917506_Interface)

  private fun as_2083917506(): IAdaptiveMediaSourceDownloadStatistics.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadStatistics.ABI.makeIAdaptiveMediaSourceDownloadStatistics(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadStatistics>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadStatistics.ABI.makeIAdaptiveMediaSourceDownloadStatistics(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourceDownloadStatistics> {
    public override fun getValue() = AdaptiveMediaSourceDownloadStatistics(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourceDownloadStatistics): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourceDownloadStatistics, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AdaptiveMediaSourceDownloadStatistics {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourceDownloadStatistics(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourceDownloadStatistics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
