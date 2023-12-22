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

@ABIMarker(MediaBreakStartedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaBreakStartedEventArgs;{a87efe71-dfd4-454a-956e-0a4a648395f8})")
@WinRTByReference(brClass = MediaBreakStartedEventArgs.ByReference::class)
public class MediaBreakStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaBreakStartedEventArgs.WithDefault, IWinRTObject {
  private val __652326346_Interface: IMediaBreakStartedEventArgs.WithDefault by lazy {
    as_652326346()
  }


  public override val __652326346_Ptr: JNAPointer? by lazy {
    __652326346_Interface.__652326346_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__652326346_Interface)

  private fun as_652326346(): IMediaBreakStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaBreakStartedEventArgs.ABI.makeIMediaBreakStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaBreakStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaBreakStartedEventArgs.ABI.makeIMediaBreakStartedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaBreakStartedEventArgs> {
    public override fun getValue() = MediaBreakStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaBreakStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaBreakStartedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaBreakStartedEventArgs {
      val address = segment.toRawLongValue()
      return MediaBreakStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaBreakStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
