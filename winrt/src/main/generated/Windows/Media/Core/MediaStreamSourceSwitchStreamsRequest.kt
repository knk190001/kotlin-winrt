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

@ABIMarker(MediaStreamSourceSwitchStreamsRequest.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSourceSwitchStreamsRequest;{41b8808e-38a9-4ec3-9ba0-b69b85501e90})")
@WinRTByReference(brClass = MediaStreamSourceSwitchStreamsRequest.ByReference::class)
public class MediaStreamSourceSwitchStreamsRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSourceSwitchStreamsRequest.WithDefault, IWinRTObject {
  private val __1270053606_Interface: IMediaStreamSourceSwitchStreamsRequest.WithDefault by lazy {
    as_1270053606()
  }


  public override val __1270053606_Ptr: JNAPointer? by lazy {
    __1270053606_Interface.__1270053606_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1270053606_Interface)

  private fun as_1270053606(): IMediaStreamSourceSwitchStreamsRequest.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSourceSwitchStreamsRequest.ABI.makeIMediaStreamSourceSwitchStreamsRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSourceSwitchStreamsRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSourceSwitchStreamsRequest.ABI.makeIMediaStreamSourceSwitchStreamsRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSourceSwitchStreamsRequest> {
    public override fun getValue() = MediaStreamSourceSwitchStreamsRequest(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSourceSwitchStreamsRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSourceSwitchStreamsRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaStreamSourceSwitchStreamsRequest {
      val address = segment.toRawLongValue()
      return MediaStreamSourceSwitchStreamsRequest(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSourceSwitchStreamsRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
