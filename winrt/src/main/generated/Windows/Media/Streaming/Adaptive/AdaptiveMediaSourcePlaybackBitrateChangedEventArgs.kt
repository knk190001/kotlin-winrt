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

@ABIMarker(AdaptiveMediaSourcePlaybackBitrateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourcePlaybackBitrateChangedEventArgs;{23a29f6d-7dda-4a51-87a9-6fa8c5b292be})")
@WinRTByReference(brClass = AdaptiveMediaSourcePlaybackBitrateChangedEventArgs.ByReference::class)
public class AdaptiveMediaSourcePlaybackBitrateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs.WithDefault, IWinRTObject
    {
  private val __698482274_Interface: IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs.WithDefault
      by lazy {
    as_698482274()
  }


  public override val __698482274_Ptr: JNAPointer? by lazy {
    __698482274_Interface.__698482274_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__698482274_Interface)

  private fun as_698482274(): IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs.ABI.makeIAdaptiveMediaSourcePlaybackBitrateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourcePlaybackBitrateChangedEventArgs.ABI.makeIAdaptiveMediaSourcePlaybackBitrateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourcePlaybackBitrateChangedEventArgs> {
    public override fun getValue() =
        AdaptiveMediaSourcePlaybackBitrateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourcePlaybackBitrateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourcePlaybackBitrateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AdaptiveMediaSourcePlaybackBitrateChangedEventArgs {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourcePlaybackBitrateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourcePlaybackBitrateChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
