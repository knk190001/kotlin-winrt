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

@ABIMarker(AdaptiveMediaSourceDownloadRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadRequestedEventArgs;{c83fdffd-44a9-47a2-bf96-03398b4bfaaf})")
@WinRTByReference(brClass = AdaptiveMediaSourceDownloadRequestedEventArgs.ByReference::class)
public class AdaptiveMediaSourceDownloadRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourceDownloadRequestedEventArgs.WithDefault,
    IAdaptiveMediaSourceDownloadRequestedEventArgs2.WithDefault,
    IAdaptiveMediaSourceDownloadRequestedEventArgs3.WithDefault, IWinRTObject {
  private val __329110168_Interface: IAdaptiveMediaSourceDownloadRequestedEventArgs.WithDefault by
      lazy {
    as_329110168()
  }


  private val __1612480566_Interface: IAdaptiveMediaSourceDownloadRequestedEventArgs2.WithDefault by
      lazy {
    as_1612480566()
  }


  private val __1612480565_Interface: IAdaptiveMediaSourceDownloadRequestedEventArgs3.WithDefault by
      lazy {
    as_1612480565()
  }


  public override val __329110168_Ptr: JNAPointer? by lazy {
    __329110168_Interface.__329110168_Ptr
  }


  public override val __1612480566_Ptr: JNAPointer? by lazy {
    __1612480566_Interface.__1612480566_Ptr
  }


  public override val __1612480565_Ptr: JNAPointer? by lazy {
    __1612480565_Interface.__1612480565_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__329110168_Interface, __1612480566_Interface, __1612480565_Interface)

  private fun as_329110168(): IAdaptiveMediaSourceDownloadRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadRequestedEventArgs.ABI.makeIAdaptiveMediaSourceDownloadRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadRequestedEventArgs.ABI.makeIAdaptiveMediaSourceDownloadRequestedEventArgs(ref.value))
  }

  private fun as_1612480566(): IAdaptiveMediaSourceDownloadRequestedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadRequestedEventArgs2.ABI.makeIAdaptiveMediaSourceDownloadRequestedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadRequestedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadRequestedEventArgs2.ABI.makeIAdaptiveMediaSourceDownloadRequestedEventArgs2(ref.value))
  }

  private fun as_1612480565(): IAdaptiveMediaSourceDownloadRequestedEventArgs3.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadRequestedEventArgs3.ABI.makeIAdaptiveMediaSourceDownloadRequestedEventArgs3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadRequestedEventArgs3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadRequestedEventArgs3.ABI.makeIAdaptiveMediaSourceDownloadRequestedEventArgs3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourceDownloadRequestedEventArgs> {
    public override fun getValue() =
        AdaptiveMediaSourceDownloadRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourceDownloadRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourceDownloadRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AdaptiveMediaSourceDownloadRequestedEventArgs {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourceDownloadRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourceDownloadRequestedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
