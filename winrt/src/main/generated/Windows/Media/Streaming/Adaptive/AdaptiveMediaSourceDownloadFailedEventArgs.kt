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

@ABIMarker(AdaptiveMediaSourceDownloadFailedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDownloadFailedEventArgs;{37739048-f4ab-40a4-b135-c6dfd8bd7ff1})")
@WinRTByReference(brClass = AdaptiveMediaSourceDownloadFailedEventArgs.ByReference::class)
public class AdaptiveMediaSourceDownloadFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourceDownloadFailedEventArgs.WithDefault,
    IAdaptiveMediaSourceDownloadFailedEventArgs2.WithDefault,
    IAdaptiveMediaSourceDownloadFailedEventArgs3.WithDefault, IWinRTObject {
  private val __1725683557_Interface: IAdaptiveMediaSourceDownloadFailedEventArgs.WithDefault by
      lazy {
    as_1725683557()
  }


  private val __1956582665_Interface: IAdaptiveMediaSourceDownloadFailedEventArgs2.WithDefault by
      lazy {
    as_1956582665()
  }


  private val __1956582664_Interface: IAdaptiveMediaSourceDownloadFailedEventArgs3.WithDefault by
      lazy {
    as_1956582664()
  }


  public override val __1725683557_Ptr: JNAPointer? by lazy {
    __1725683557_Interface.__1725683557_Ptr
  }


  public override val __1956582665_Ptr: JNAPointer? by lazy {
    __1956582665_Interface.__1956582665_Ptr
  }


  public override val __1956582664_Ptr: JNAPointer? by lazy {
    __1956582664_Interface.__1956582664_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1725683557_Interface, __1956582665_Interface, __1956582664_Interface)

  private fun as_1725683557(): IAdaptiveMediaSourceDownloadFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadFailedEventArgs.ABI.makeIAdaptiveMediaSourceDownloadFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadFailedEventArgs.ABI.makeIAdaptiveMediaSourceDownloadFailedEventArgs(ref.value))
  }

  private fun as_1956582665(): IAdaptiveMediaSourceDownloadFailedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadFailedEventArgs2.ABI.makeIAdaptiveMediaSourceDownloadFailedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadFailedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadFailedEventArgs2.ABI.makeIAdaptiveMediaSourceDownloadFailedEventArgs2(ref.value))
  }

  private fun as_1956582664(): IAdaptiveMediaSourceDownloadFailedEventArgs3.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDownloadFailedEventArgs3.ABI.makeIAdaptiveMediaSourceDownloadFailedEventArgs3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDownloadFailedEventArgs3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDownloadFailedEventArgs3.ABI.makeIAdaptiveMediaSourceDownloadFailedEventArgs3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourceDownloadFailedEventArgs> {
    public override fun getValue() =
        AdaptiveMediaSourceDownloadFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourceDownloadFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourceDownloadFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AdaptiveMediaSourceDownloadFailedEventArgs {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourceDownloadFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourceDownloadFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
