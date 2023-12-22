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

@ABIMarker(MediaCaptureSettings.ABI::class)
@Signature("rc(Windows.Media.Capture.MediaCaptureSettings;{1d83aafe-6d45-4477-8dc4-ac5bc01c4091})")
@WinRTByReference(brClass = MediaCaptureSettings.ByReference::class)
public class MediaCaptureSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaCaptureSettings.WithDefault, IMediaCaptureSettings2.WithDefault,
    IMediaCaptureSettings3.WithDefault, IWinRTObject {
  private val __1030992675_Interface: IMediaCaptureSettings.WithDefault by lazy {
    as_1030992675()
  }


  private val __1896001803_Interface: IMediaCaptureSettings2.WithDefault by lazy {
    as_1896001803()
  }


  private val __1896001802_Interface: IMediaCaptureSettings3.WithDefault by lazy {
    as_1896001802()
  }


  public override val __1030992675_Ptr: JNAPointer? by lazy {
    __1030992675_Interface.__1030992675_Ptr
  }


  public override val __1896001803_Ptr: JNAPointer? by lazy {
    __1896001803_Interface.__1896001803_Ptr
  }


  public override val __1896001802_Ptr: JNAPointer? by lazy {
    __1896001802_Interface.__1896001802_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1030992675_Interface, __1896001803_Interface, __1896001802_Interface)

  private fun as_1030992675(): IMediaCaptureSettings.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureSettings.ABI.makeIMediaCaptureSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureSettings.ABI.makeIMediaCaptureSettings(ref.value))
  }

  private fun as_1896001803(): IMediaCaptureSettings2.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureSettings2.ABI.makeIMediaCaptureSettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureSettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureSettings2.ABI.makeIMediaCaptureSettings2(ref.value))
  }

  private fun as_1896001802(): IMediaCaptureSettings3.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureSettings3.ABI.makeIMediaCaptureSettings3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureSettings3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureSettings3.ABI.makeIMediaCaptureSettings3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaCaptureSettings> {
    public override fun getValue() = MediaCaptureSettings(pointer.getPointer(0))

    public fun setValue(value: MediaCaptureSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaCaptureSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaCaptureSettings {
      val address = segment.toRawLongValue()
      return MediaCaptureSettings(Pointer(address))
    }

    public override fun toNative(obj: MediaCaptureSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
