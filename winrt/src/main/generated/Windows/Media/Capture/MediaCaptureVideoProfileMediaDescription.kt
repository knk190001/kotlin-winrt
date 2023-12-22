package Windows.Media.Capture

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

@ABIMarker(MediaCaptureVideoProfileMediaDescription.ABI::class)
@Signature("rc(Windows.Media.Capture.MediaCaptureVideoProfileMediaDescription;{8012afef-b691-49ff-83f2-c1e76eaaea1b})")
@WinRTByReference(brClass = MediaCaptureVideoProfileMediaDescription.ByReference::class)
public class MediaCaptureVideoProfileMediaDescription(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaCaptureVideoProfileMediaDescription.WithDefault,
    IMediaCaptureVideoProfileMediaDescription2.WithDefault, IWinRTObject {
  private val __1677075968_Interface: IMediaCaptureVideoProfileMediaDescription.WithDefault by
      lazy {
    as_1677075968()
  }


  private val __449747406_Interface: IMediaCaptureVideoProfileMediaDescription2.WithDefault by
      lazy {
    as_449747406()
  }


  public override val __1677075968_Ptr: JNAPointer? by lazy {
    __1677075968_Interface.__1677075968_Ptr
  }


  public override val __449747406_Ptr: JNAPointer? by lazy {
    __449747406_Interface.__449747406_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1677075968_Interface, __449747406_Interface)

  private fun as_1677075968(): IMediaCaptureVideoProfileMediaDescription.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureVideoProfileMediaDescription.ABI.makeIMediaCaptureVideoProfileMediaDescription(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureVideoProfileMediaDescription>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureVideoProfileMediaDescription.ABI.makeIMediaCaptureVideoProfileMediaDescription(ref.value))
  }

  private fun as_449747406(): IMediaCaptureVideoProfileMediaDescription2.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureVideoProfileMediaDescription2.ABI.makeIMediaCaptureVideoProfileMediaDescription2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureVideoProfileMediaDescription2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureVideoProfileMediaDescription2.ABI.makeIMediaCaptureVideoProfileMediaDescription2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaCaptureVideoProfileMediaDescription> {
    public override fun getValue() = MediaCaptureVideoProfileMediaDescription(pointer.getPointer(0))

    public fun setValue(value: MediaCaptureVideoProfileMediaDescription): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaCaptureVideoProfileMediaDescription, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaCaptureVideoProfileMediaDescription {
      val address = segment.toRawLongValue()
      return MediaCaptureVideoProfileMediaDescription(Pointer(address))
    }

    public override fun toNative(obj: MediaCaptureVideoProfileMediaDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
