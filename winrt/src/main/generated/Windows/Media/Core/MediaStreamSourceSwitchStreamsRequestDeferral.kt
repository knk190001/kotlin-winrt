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

@ABIMarker(MediaStreamSourceSwitchStreamsRequestDeferral.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSourceSwitchStreamsRequestDeferral;{bee3d835-a505-4f9a-b943-2b8cb1b4bbd9})")
@WinRTByReference(brClass = MediaStreamSourceSwitchStreamsRequestDeferral.ByReference::class)
public class MediaStreamSourceSwitchStreamsRequestDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSourceSwitchStreamsRequestDeferral.WithDefault, IWinRTObject {
  private val __1868773029_Interface: IMediaStreamSourceSwitchStreamsRequestDeferral.WithDefault by
      lazy {
    as_1868773029()
  }


  public override val __1868773029_Ptr: JNAPointer? by lazy {
    __1868773029_Interface.__1868773029_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1868773029_Interface)

  private fun as_1868773029(): IMediaStreamSourceSwitchStreamsRequestDeferral.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSourceSwitchStreamsRequestDeferral.ABI.makeIMediaStreamSourceSwitchStreamsRequestDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSourceSwitchStreamsRequestDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSourceSwitchStreamsRequestDeferral.ABI.makeIMediaStreamSourceSwitchStreamsRequestDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSourceSwitchStreamsRequestDeferral> {
    public override fun getValue() =
        MediaStreamSourceSwitchStreamsRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSourceSwitchStreamsRequestDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSourceSwitchStreamsRequestDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaStreamSourceSwitchStreamsRequestDeferral {
      val address = segment.toRawLongValue()
      return MediaStreamSourceSwitchStreamsRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSourceSwitchStreamsRequestDeferral): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
