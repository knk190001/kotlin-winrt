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

@ABIMarker(MediaBreakSkippedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaBreakSkippedEventArgs;{6ee94c05-2f54-4a3e-a3ab-24c3b270b4a3})")
@WinRTByReference(brClass = MediaBreakSkippedEventArgs.ByReference::class)
public class MediaBreakSkippedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaBreakSkippedEventArgs.WithDefault, IWinRTObject {
  private val __290235387_Interface: IMediaBreakSkippedEventArgs.WithDefault by lazy {
    as_290235387()
  }


  public override val __290235387_Ptr: JNAPointer? by lazy {
    __290235387_Interface.__290235387_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__290235387_Interface)

  private fun as_290235387(): IMediaBreakSkippedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaBreakSkippedEventArgs.ABI.makeIMediaBreakSkippedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaBreakSkippedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaBreakSkippedEventArgs.ABI.makeIMediaBreakSkippedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaBreakSkippedEventArgs> {
    public override fun getValue() = MediaBreakSkippedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaBreakSkippedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaBreakSkippedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaBreakSkippedEventArgs {
      val address = segment.toRawLongValue()
      return MediaBreakSkippedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaBreakSkippedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
