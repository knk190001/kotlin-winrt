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

@ABIMarker(MediaCaptureVideoProfile.ABI::class)
@Signature("rc(Windows.Media.Capture.MediaCaptureVideoProfile;{21a073bf-a3ee-4ecf-9ef6-50b0bc4e1305})")
@WinRTByReference(brClass = MediaCaptureVideoProfile.ByReference::class)
public class MediaCaptureVideoProfile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaCaptureVideoProfile.WithDefault, IMediaCaptureVideoProfile2.WithDefault,
    IWinRTObject {
  private val __1664630680_Interface: IMediaCaptureVideoProfile.WithDefault by lazy {
    as_1664630680()
  }


  private val __63943478_Interface: IMediaCaptureVideoProfile2.WithDefault by lazy {
    as_63943478()
  }


  public override val __1664630680_Ptr: JNAPointer? by lazy {
    __1664630680_Interface.__1664630680_Ptr
  }


  public override val __63943478_Ptr: JNAPointer? by lazy {
    __63943478_Interface.__63943478_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1664630680_Interface, __63943478_Interface)

  private fun as_1664630680(): IMediaCaptureVideoProfile.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureVideoProfile.ABI.makeIMediaCaptureVideoProfile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureVideoProfile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureVideoProfile.ABI.makeIMediaCaptureVideoProfile(ref.value))
  }

  private fun as_63943478(): IMediaCaptureVideoProfile2.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureVideoProfile2.ABI.makeIMediaCaptureVideoProfile2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureVideoProfile2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureVideoProfile2.ABI.makeIMediaCaptureVideoProfile2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaCaptureVideoProfile> {
    public override fun getValue() = MediaCaptureVideoProfile(pointer.getPointer(0))

    public fun setValue(value: MediaCaptureVideoProfile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaCaptureVideoProfile, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaCaptureVideoProfile {
      val address = segment.toRawLongValue()
      return MediaCaptureVideoProfile(Pointer(address))
    }

    public override fun toNative(obj: MediaCaptureVideoProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
