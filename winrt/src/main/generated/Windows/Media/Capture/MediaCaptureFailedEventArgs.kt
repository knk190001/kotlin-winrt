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

@ABIMarker(MediaCaptureFailedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.MediaCaptureFailedEventArgs;{80fde3f4-54c4-42c0-8d19-cea1a87ca18b})")
@WinRTByReference(brClass = MediaCaptureFailedEventArgs.ByReference::class)
public class MediaCaptureFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaCaptureFailedEventArgs.WithDefault, IWinRTObject {
  private val __1022892832_Interface: IMediaCaptureFailedEventArgs.WithDefault by lazy {
    as_1022892832()
  }


  public override val __1022892832_Ptr: JNAPointer? by lazy {
    __1022892832_Interface.__1022892832_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1022892832_Interface)

  private fun as_1022892832(): IMediaCaptureFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureFailedEventArgs.ABI.makeIMediaCaptureFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureFailedEventArgs.ABI.makeIMediaCaptureFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaCaptureFailedEventArgs> {
    public override fun getValue() = MediaCaptureFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaCaptureFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaCaptureFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaCaptureFailedEventArgs {
      val address = segment.toRawLongValue()
      return MediaCaptureFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaCaptureFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
