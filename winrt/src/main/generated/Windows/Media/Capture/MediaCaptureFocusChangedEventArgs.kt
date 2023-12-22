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

@ABIMarker(MediaCaptureFocusChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.MediaCaptureFocusChangedEventArgs;{81e1bc7f-2277-493e-abee-d3f44ff98c04})")
@WinRTByReference(brClass = MediaCaptureFocusChangedEventArgs.ByReference::class)
public class MediaCaptureFocusChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaCaptureFocusChangedEventArgs.WithDefault, IWinRTObject {
  private val __242563265_Interface: IMediaCaptureFocusChangedEventArgs.WithDefault by lazy {
    as_242563265()
  }


  public override val __242563265_Ptr: JNAPointer? by lazy {
    __242563265_Interface.__242563265_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__242563265_Interface)

  private fun as_242563265(): IMediaCaptureFocusChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaCaptureFocusChangedEventArgs.ABI.makeIMediaCaptureFocusChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCaptureFocusChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCaptureFocusChangedEventArgs.ABI.makeIMediaCaptureFocusChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaCaptureFocusChangedEventArgs> {
    public override fun getValue() = MediaCaptureFocusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaCaptureFocusChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaCaptureFocusChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaCaptureFocusChangedEventArgs {
      val address = segment.toRawLongValue()
      return MediaCaptureFocusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaCaptureFocusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
