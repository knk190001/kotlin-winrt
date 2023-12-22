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

@ABIMarker(AdaptiveMediaSourceDownloadBitrateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadBitrateChangedEventArgs;{670c0a44-e04e-4eff-816a-17399f78f4ba})")
@WinRTByReference(brClass = AdaptiveMediaSourceDownloadBitrateChangedEventArgs.ByReference::class)
public class AdaptiveMediaSourceDownloadBitrateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourceDownloadBitrateChangedEventArgs.WithDefault,
    IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2.WithDefault, IWinRTObject {
  private val __2080285841_Interface:
      IAdaptiveMediaSourceDownloadBitrateChangedEventArgs.WithDefault by lazy {
    as_2080285841()
  }


  private val __64351681_Interface: IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2.WithDefault
      by lazy {
    as_64351681()
  }


  public override val __2080285841_Ptr: JNAPointer? by lazy {
    __2080285841_Interface.__2080285841_Ptr
  }


  public override val __64351681_Ptr: JNAPointer? by lazy {
    __64351681_Interface.__64351681_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2080285841_Interface, __64351681_Interface)

  private fun as_2080285841(): IAdaptiveMediaSourceDownloadBitrateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadBitrateChangedEventArgs.ABI.makeIAdaptiveMediaSourceDownloadBitrateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadBitrateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadBitrateChangedEventArgs.ABI.makeIAdaptiveMediaSourceDownloadBitrateChangedEventArgs(ref.value))
  }

  private fun as_64351681(): IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2.ABI.makeIAdaptiveMediaSourceDownloadBitrateChangedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadBitrateChangedEventArgs2.ABI.makeIAdaptiveMediaSourceDownloadBitrateChangedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourceDownloadBitrateChangedEventArgs> {
    public override fun getValue() =
        AdaptiveMediaSourceDownloadBitrateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourceDownloadBitrateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourceDownloadBitrateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AdaptiveMediaSourceDownloadBitrateChangedEventArgs {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourceDownloadBitrateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourceDownloadBitrateChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
