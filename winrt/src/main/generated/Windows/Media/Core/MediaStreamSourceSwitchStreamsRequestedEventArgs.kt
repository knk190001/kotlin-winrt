package Windows.Media.Core

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

@ABIMarker(MediaStreamSourceSwitchStreamsRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSourceSwitchStreamsRequestedEventArgs;{42202b72-6ea1-4677-981e-350a0da412aa})")
@WinRTByReference(brClass = MediaStreamSourceSwitchStreamsRequestedEventArgs.ByReference::class)
public class MediaStreamSourceSwitchStreamsRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSourceSwitchStreamsRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1688414370_Interface: IMediaStreamSourceSwitchStreamsRequestedEventArgs.WithDefault
      by lazy {
    as_1688414370()
  }


  public override val __1688414370_Ptr: JNAPointer? by lazy {
    __1688414370_Interface.__1688414370_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1688414370_Interface)

  private fun as_1688414370(): IMediaStreamSourceSwitchStreamsRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSourceSwitchStreamsRequestedEventArgs.ABI.makeIMediaStreamSourceSwitchStreamsRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSourceSwitchStreamsRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSourceSwitchStreamsRequestedEventArgs.ABI.makeIMediaStreamSourceSwitchStreamsRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSourceSwitchStreamsRequestedEventArgs> {
    public override fun getValue() =
        MediaStreamSourceSwitchStreamsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSourceSwitchStreamsRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSourceSwitchStreamsRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaStreamSourceSwitchStreamsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return MediaStreamSourceSwitchStreamsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSourceSwitchStreamsRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
