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

@ABIMarker(AdaptiveMediaSourceDownloadCompletedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadCompletedEventArgs;{19240dc3-5b37-4a1a-8970-d621cb6ca83b})")
@WinRTByReference(brClass = AdaptiveMediaSourceDownloadCompletedEventArgs.ByReference::class)
public class AdaptiveMediaSourceDownloadCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourceDownloadCompletedEventArgs.WithDefault,
    IAdaptiveMediaSourceDownloadCompletedEventArgs2.WithDefault,
    IAdaptiveMediaSourceDownloadCompletedEventArgs3.WithDefault, IWinRTObject {
  private val __1758345003_Interface: IAdaptiveMediaSourceDownloadCompletedEventArgs.WithDefault by
      lazy {
    as_1758345003()
  }


  private val __1325879705_Interface: IAdaptiveMediaSourceDownloadCompletedEventArgs2.WithDefault by
      lazy {
    as_1325879705()
  }


  private val __1325879704_Interface: IAdaptiveMediaSourceDownloadCompletedEventArgs3.WithDefault by
      lazy {
    as_1325879704()
  }


  public override val __1758345003_Ptr: JNAPointer? by lazy {
    __1758345003_Interface.__1758345003_Ptr
  }


  public override val __1325879705_Ptr: JNAPointer? by lazy {
    __1325879705_Interface.__1325879705_Ptr
  }


  public override val __1325879704_Ptr: JNAPointer? by lazy {
    __1325879704_Interface.__1325879704_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1758345003_Interface, __1325879705_Interface, __1325879704_Interface)

  private fun as_1758345003(): IAdaptiveMediaSourceDownloadCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadCompletedEventArgs.ABI.makeIAdaptiveMediaSourceDownloadCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadCompletedEventArgs.ABI.makeIAdaptiveMediaSourceDownloadCompletedEventArgs(ref.value))
  }

  private fun as_1325879705(): IAdaptiveMediaSourceDownloadCompletedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadCompletedEventArgs2.ABI.makeIAdaptiveMediaSourceDownloadCompletedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadCompletedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadCompletedEventArgs2.ABI.makeIAdaptiveMediaSourceDownloadCompletedEventArgs2(ref.value))
  }

  private fun as_1325879704(): IAdaptiveMediaSourceDownloadCompletedEventArgs3.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadCompletedEventArgs3.ABI.makeIAdaptiveMediaSourceDownloadCompletedEventArgs3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadCompletedEventArgs3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadCompletedEventArgs3.ABI.makeIAdaptiveMediaSourceDownloadCompletedEventArgs3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourceDownloadCompletedEventArgs> {
    public override fun getValue() =
        AdaptiveMediaSourceDownloadCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourceDownloadCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourceDownloadCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AdaptiveMediaSourceDownloadCompletedEventArgs {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourceDownloadCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourceDownloadCompletedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
