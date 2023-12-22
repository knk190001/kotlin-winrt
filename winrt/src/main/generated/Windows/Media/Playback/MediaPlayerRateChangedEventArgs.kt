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

@ABIMarker(MediaPlayerRateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlayerRateChangedEventArgs;{40600d58-3b61-4bb2-989f-fc65608b6cab})")
@WinRTByReference(brClass = MediaPlayerRateChangedEventArgs.ByReference::class)
public class MediaPlayerRateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlayerRateChangedEventArgs.WithDefault, IWinRTObject {
  private val __1775075663_Interface: IMediaPlayerRateChangedEventArgs.WithDefault by lazy {
    as_1775075663()
  }


  public override val __1775075663_Ptr: JNAPointer? by lazy {
    __1775075663_Interface.__1775075663_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1775075663_Interface)

  private fun as_1775075663(): IMediaPlayerRateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayerRateChangedEventArgs.ABI.makeIMediaPlayerRateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayerRateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayerRateChangedEventArgs.ABI.makeIMediaPlayerRateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlayerRateChangedEventArgs> {
    public override fun getValue() = MediaPlayerRateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaPlayerRateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlayerRateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaPlayerRateChangedEventArgs {
      val address = segment.toRawLongValue()
      return MediaPlayerRateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaPlayerRateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
