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

@ABIMarker(MediaBreakSeekedOverEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaBreakSeekedOverEventArgs;{e5aa6746-0606-4492-b9d3-c3c8fde0a4ea})")
@WinRTByReference(brClass = MediaBreakSeekedOverEventArgs.ByReference::class)
public class MediaBreakSeekedOverEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaBreakSeekedOverEventArgs.WithDefault, IWinRTObject {
  private val __156161304_Interface: IMediaBreakSeekedOverEventArgs.WithDefault by lazy {
    as_156161304()
  }


  public override val __156161304_Ptr: JNAPointer? by lazy {
    __156161304_Interface.__156161304_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__156161304_Interface)

  private fun as_156161304(): IMediaBreakSeekedOverEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaBreakSeekedOverEventArgs.ABI.makeIMediaBreakSeekedOverEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaBreakSeekedOverEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaBreakSeekedOverEventArgs.ABI.makeIMediaBreakSeekedOverEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaBreakSeekedOverEventArgs> {
    public override fun getValue() = MediaBreakSeekedOverEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaBreakSeekedOverEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaBreakSeekedOverEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaBreakSeekedOverEventArgs {
      val address = segment.toRawLongValue()
      return MediaBreakSeekedOverEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaBreakSeekedOverEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
