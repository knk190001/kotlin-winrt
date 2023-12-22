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

@ABIMarker(AdaptiveMediaSourceDownloadResult.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadResult;{f4afdc73-bcee-4a6a-9f0a-fec41e2339b0})")
@WinRTByReference(brClass = AdaptiveMediaSourceDownloadResult.ByReference::class)
public class AdaptiveMediaSourceDownloadResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourceDownloadResult.WithDefault,
    IAdaptiveMediaSourceDownloadResult2.WithDefault, IWinRTObject {
  private val __830262588_Interface: IAdaptiveMediaSourceDownloadResult.WithDefault by lazy {
    as_830262588()
  }


  private val __31663498_Interface: IAdaptiveMediaSourceDownloadResult2.WithDefault by lazy {
    as_31663498()
  }


  public override val __830262588_Ptr: JNAPointer? by lazy {
    __830262588_Interface.__830262588_Ptr
  }


  public override val __31663498_Ptr: JNAPointer? by lazy {
    __31663498_Interface.__31663498_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__830262588_Interface, __31663498_Interface)

  private fun as_830262588(): IAdaptiveMediaSourceDownloadResult.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadResult.ABI.makeIAdaptiveMediaSourceDownloadResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadResult.ABI.makeIAdaptiveMediaSourceDownloadResult(ref.value))
  }

  private fun as_31663498(): IAdaptiveMediaSourceDownloadResult2.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadResult2.ABI.makeIAdaptiveMediaSourceDownloadResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadResult2.ABI.makeIAdaptiveMediaSourceDownloadResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourceDownloadResult> {
    public override fun getValue() = AdaptiveMediaSourceDownloadResult(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourceDownloadResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourceDownloadResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AdaptiveMediaSourceDownloadResult {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourceDownloadResult(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourceDownloadResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
