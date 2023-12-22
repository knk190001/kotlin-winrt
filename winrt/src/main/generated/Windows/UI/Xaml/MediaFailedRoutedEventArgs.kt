package Windows.UI.Xaml

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaFailedRoutedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.MediaFailedRoutedEventArgs;{46d1fa8d-5149-4153-ba3c-b03e64ee531e})")
@WinRTByReference(brClass = MediaFailedRoutedEventArgs.ByReference::class)
public class MediaFailedRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : ExceptionRoutedEventArgs(ptr), IMediaFailedRoutedEventArgs.WithDefault, IWinRTObject {
  private val __1566117395_Interface: IMediaFailedRoutedEventArgs.WithDefault by lazy {
    as_1566117395()
  }


  public override val __1566117395_Ptr: JNAPointer? by lazy {
    __1566117395_Interface.__1566117395_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1566117395_Interface)

  private fun as_1566117395(): IMediaFailedRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaFailedRoutedEventArgs.ABI.makeIMediaFailedRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFailedRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFailedRoutedEventArgs.ABI.makeIMediaFailedRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaFailedRoutedEventArgs> {
    public override fun getValue() = MediaFailedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaFailedRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaFailedRoutedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaFailedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return MediaFailedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaFailedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
