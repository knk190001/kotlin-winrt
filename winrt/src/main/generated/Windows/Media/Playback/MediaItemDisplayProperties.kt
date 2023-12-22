package Windows.Media.Playback

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

@ABIMarker(MediaItemDisplayProperties.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaItemDisplayProperties;{1e3c1b48-7097-4384-a217-c1291dfa8c16})")
@WinRTByReference(brClass = MediaItemDisplayProperties.ByReference::class)
public class MediaItemDisplayProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaItemDisplayProperties.WithDefault, IWinRTObject {
  private val __1379475543_Interface: IMediaItemDisplayProperties.WithDefault by lazy {
    as_1379475543()
  }


  public override val __1379475543_Ptr: JNAPointer? by lazy {
    __1379475543_Interface.__1379475543_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1379475543_Interface)

  private fun as_1379475543(): IMediaItemDisplayProperties.WithDefault {
    if(pointer == NULL) {
      return(IMediaItemDisplayProperties.ABI.makeIMediaItemDisplayProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaItemDisplayProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaItemDisplayProperties.ABI.makeIMediaItemDisplayProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaItemDisplayProperties> {
    public override fun getValue() = MediaItemDisplayProperties(pointer.getPointer(0))

    public fun setValue(value: MediaItemDisplayProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaItemDisplayProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaItemDisplayProperties {
      val address = segment.toRawLongValue()
      return MediaItemDisplayProperties(Pointer(address))
    }

    public override fun toNative(obj: MediaItemDisplayProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
