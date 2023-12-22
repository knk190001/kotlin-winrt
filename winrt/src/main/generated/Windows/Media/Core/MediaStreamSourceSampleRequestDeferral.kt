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

@ABIMarker(MediaStreamSourceSampleRequestDeferral.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSourceSampleRequestDeferral;{7895cc02-f982-43c8-9d16-c62d999319be})")
@WinRTByReference(brClass = MediaStreamSourceSampleRequestDeferral.ByReference::class)
public class MediaStreamSourceSampleRequestDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSourceSampleRequestDeferral.WithDefault, IWinRTObject {
  private val __425493158_Interface: IMediaStreamSourceSampleRequestDeferral.WithDefault by lazy {
    as_425493158()
  }


  public override val __425493158_Ptr: JNAPointer? by lazy {
    __425493158_Interface.__425493158_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__425493158_Interface)

  private fun as_425493158(): IMediaStreamSourceSampleRequestDeferral.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSourceSampleRequestDeferral.ABI.makeIMediaStreamSourceSampleRequestDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSourceSampleRequestDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSourceSampleRequestDeferral.ABI.makeIMediaStreamSourceSampleRequestDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSourceSampleRequestDeferral> {
    public override fun getValue() = MediaStreamSourceSampleRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSourceSampleRequestDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSourceSampleRequestDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaStreamSourceSampleRequestDeferral {
      val address = segment.toRawLongValue()
      return MediaStreamSourceSampleRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSourceSampleRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
