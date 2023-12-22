package Microsoft.UI.Xaml.Media

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

@ABIMarker(MediaTransportControlsThumbnailRequestedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.MediaTransportControlsThumbnailRequestedEventArgs;{fe0ffb86-74b0-5031-accc-b34d0382a637})")
@WinRTByReference(brClass = MediaTransportControlsThumbnailRequestedEventArgs.ByReference::class)
public class MediaTransportControlsThumbnailRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaTransportControlsThumbnailRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1363037623_Interface: IMediaTransportControlsThumbnailRequestedEventArgs.WithDefault
      by lazy {
    as_1363037623()
  }


  public override val __1363037623_Ptr: JNAPointer? by lazy {
    __1363037623_Interface.__1363037623_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1363037623_Interface)

  private fun as_1363037623(): IMediaTransportControlsThumbnailRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaTransportControlsThumbnailRequestedEventArgs.ABI.makeIMediaTransportControlsThumbnailRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTransportControlsThumbnailRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTransportControlsThumbnailRequestedEventArgs.ABI.makeIMediaTransportControlsThumbnailRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaTransportControlsThumbnailRequestedEventArgs> {
    public override fun getValue() =
        MediaTransportControlsThumbnailRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaTransportControlsThumbnailRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaTransportControlsThumbnailRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaTransportControlsThumbnailRequestedEventArgs {
      val address = segment.toRawLongValue()
      return MediaTransportControlsThumbnailRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaTransportControlsThumbnailRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
