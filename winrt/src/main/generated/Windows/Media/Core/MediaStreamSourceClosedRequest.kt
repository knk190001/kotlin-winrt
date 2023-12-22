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

@ABIMarker(MediaStreamSourceClosedRequest.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSourceClosedRequest;{907c00e9-18a3-4951-887a-2c1eebd5c69e})")
@WinRTByReference(brClass = MediaStreamSourceClosedRequest.ByReference::class)
public class MediaStreamSourceClosedRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSourceClosedRequest.WithDefault, IWinRTObject {
  private val __612735001_Interface: IMediaStreamSourceClosedRequest.WithDefault by lazy {
    as_612735001()
  }


  public override val __612735001_Ptr: JNAPointer? by lazy {
    __612735001_Interface.__612735001_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__612735001_Interface)

  private fun as_612735001(): IMediaStreamSourceClosedRequest.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSourceClosedRequest.ABI.makeIMediaStreamSourceClosedRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSourceClosedRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSourceClosedRequest.ABI.makeIMediaStreamSourceClosedRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSourceClosedRequest> {
    public override fun getValue() = MediaStreamSourceClosedRequest(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSourceClosedRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSourceClosedRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaStreamSourceClosedRequest {
      val address = segment.toRawLongValue()
      return MediaStreamSourceClosedRequest(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSourceClosedRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
