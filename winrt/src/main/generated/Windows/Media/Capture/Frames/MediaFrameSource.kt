package Windows.Media.Capture.Frames

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

@ABIMarker(MediaFrameSource.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.MediaFrameSource;{d6782953-90db-46a8-8add-2aa884a8d253})")
@WinRTByReference(brClass = MediaFrameSource.ByReference::class)
public class MediaFrameSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaFrameSource.WithDefault, IWinRTObject {
  private val __1539145610_Interface: IMediaFrameSource.WithDefault by lazy {
    as_1539145610()
  }


  public override val __1539145610_Ptr: JNAPointer? by lazy {
    __1539145610_Interface.__1539145610_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1539145610_Interface)

  private fun as_1539145610(): IMediaFrameSource.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameSource.ABI.makeIMediaFrameSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameSource.ABI.makeIMediaFrameSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaFrameSource> {
    public override fun getValue() = MediaFrameSource(pointer.getPointer(0))

    public fun setValue(value: MediaFrameSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaFrameSource, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaFrameSource {
      val address = segment.toRawLongValue()
      return MediaFrameSource(Pointer(address))
    }

    public override fun toNative(obj: MediaFrameSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
