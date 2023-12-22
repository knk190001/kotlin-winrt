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

@ABIMarker(MediaStreamSourceStartingRequestDeferral.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSourceStartingRequestDeferral;{3f1356a5-6340-4dc4-9910-068ed9f598f8})")
@WinRTByReference(brClass = MediaStreamSourceStartingRequestDeferral.ByReference::class)
public class MediaStreamSourceStartingRequestDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSourceStartingRequestDeferral.WithDefault, IWinRTObject {
  private val __1430418480_Interface: IMediaStreamSourceStartingRequestDeferral.WithDefault by
      lazy {
    as_1430418480()
  }


  public override val __1430418480_Ptr: JNAPointer? by lazy {
    __1430418480_Interface.__1430418480_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1430418480_Interface)

  private fun as_1430418480(): IMediaStreamSourceStartingRequestDeferral.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSourceStartingRequestDeferral.ABI.makeIMediaStreamSourceStartingRequestDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSourceStartingRequestDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSourceStartingRequestDeferral.ABI.makeIMediaStreamSourceStartingRequestDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSourceStartingRequestDeferral> {
    public override fun getValue() = MediaStreamSourceStartingRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSourceStartingRequestDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSourceStartingRequestDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaStreamSourceStartingRequestDeferral {
      val address = segment.toRawLongValue()
      return MediaStreamSourceStartingRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSourceStartingRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
