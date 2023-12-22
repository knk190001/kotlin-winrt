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

@ABIMarker(MediaStreamSourceSampleRequest.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSourceSampleRequest;{4db341a9-3501-4d9b-83f9-8f235c822532})")
@WinRTByReference(brClass = MediaStreamSourceSampleRequest.ByReference::class)
public class MediaStreamSourceSampleRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSourceSampleRequest.WithDefault, IWinRTObject {
  private val __657351195_Interface: IMediaStreamSourceSampleRequest.WithDefault by lazy {
    as_657351195()
  }


  public override val __657351195_Ptr: JNAPointer? by lazy {
    __657351195_Interface.__657351195_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__657351195_Interface)

  private fun as_657351195(): IMediaStreamSourceSampleRequest.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSourceSampleRequest.ABI.makeIMediaStreamSourceSampleRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSourceSampleRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSourceSampleRequest.ABI.makeIMediaStreamSourceSampleRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSourceSampleRequest> {
    public override fun getValue() = MediaStreamSourceSampleRequest(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSourceSampleRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSourceSampleRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaStreamSourceSampleRequest {
      val address = segment.toRawLongValue()
      return MediaStreamSourceSampleRequest(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSourceSampleRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
