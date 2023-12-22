package Windows.Phone.Notification.Management

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

@ABIMarker(MediaMetadata.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.MediaMetadata;{9b50ddf7-bb6c-4330-b3cd-0704a54cdb80})")
@WinRTByReference(brClass = MediaMetadata.ByReference::class)
public class MediaMetadata(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaMetadata.WithDefault, IWinRTObject {
  private val __670902171_Interface: IMediaMetadata.WithDefault by lazy {
    as_670902171()
  }


  public override val __670902171_Ptr: JNAPointer? by lazy {
    __670902171_Interface.__670902171_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__670902171_Interface)

  private fun as_670902171(): IMediaMetadata.WithDefault {
    if(pointer == NULL) {
      return(IMediaMetadata.ABI.makeIMediaMetadata(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaMetadata>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaMetadata.ABI.makeIMediaMetadata(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MediaMetadata>
      {
    public override fun getValue() = MediaMetadata(pointer.getPointer(0))

    public fun setValue(value: MediaMetadata): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaMetadata, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaMetadata {
      val address = segment.toRawLongValue()
      return MediaMetadata(Pointer(address))
    }

    public override fun toNative(obj: MediaMetadata): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
