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

@ABIMarker(CurrentMediaPlaybackItemChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.CurrentMediaPlaybackItemChangedEventArgs;{1743a892-5c43-4a15-967a-572d2d0f26c6})")
@WinRTByReference(brClass = CurrentMediaPlaybackItemChangedEventArgs.ByReference::class)
public class CurrentMediaPlaybackItemChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICurrentMediaPlaybackItemChangedEventArgs.WithDefault,
    ICurrentMediaPlaybackItemChangedEventArgs2.WithDefault, IWinRTObject {
  private val __387091221_Interface: ICurrentMediaPlaybackItemChangedEventArgs.WithDefault by lazy {
    as_387091221()
  }


  private val __885073987_Interface: ICurrentMediaPlaybackItemChangedEventArgs2.WithDefault by
      lazy {
    as_885073987()
  }


  public override val __387091221_Ptr: JNAPointer? by lazy {
    __387091221_Interface.__387091221_Ptr
  }


  public override val __885073987_Ptr: JNAPointer? by lazy {
    __885073987_Interface.__885073987_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__387091221_Interface, __885073987_Interface)

  private fun as_387091221(): ICurrentMediaPlaybackItemChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICurrentMediaPlaybackItemChangedEventArgs.ABI.makeICurrentMediaPlaybackItemChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICurrentMediaPlaybackItemChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICurrentMediaPlaybackItemChangedEventArgs.ABI.makeICurrentMediaPlaybackItemChangedEventArgs(ref.value))
  }

  private fun as_885073987(): ICurrentMediaPlaybackItemChangedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(ICurrentMediaPlaybackItemChangedEventArgs2.ABI.makeICurrentMediaPlaybackItemChangedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICurrentMediaPlaybackItemChangedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICurrentMediaPlaybackItemChangedEventArgs2.ABI.makeICurrentMediaPlaybackItemChangedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CurrentMediaPlaybackItemChangedEventArgs> {
    public override fun getValue() = CurrentMediaPlaybackItemChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CurrentMediaPlaybackItemChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CurrentMediaPlaybackItemChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CurrentMediaPlaybackItemChangedEventArgs {
      val address = segment.toRawLongValue()
      return CurrentMediaPlaybackItemChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CurrentMediaPlaybackItemChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
