package Windows.Media.Core

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

@ABIMarker(MediaSourceStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.MediaSourceStateChangedEventArgs;{0a30af82-9071-4bac-bc39-ca2a93b717a9})")
@WinRTByReference(brClass = MediaSourceStateChangedEventArgs.ByReference::class)
public class MediaSourceStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaSourceStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __1222618090_Interface: IMediaSourceStateChangedEventArgs.WithDefault by lazy {
    as_1222618090()
  }


  public override val __1222618090_Ptr: JNAPointer? by lazy {
    __1222618090_Interface.__1222618090_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1222618090_Interface)

  private fun as_1222618090(): IMediaSourceStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaSourceStateChangedEventArgs.ABI.makeIMediaSourceStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaSourceStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaSourceStateChangedEventArgs.ABI.makeIMediaSourceStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaSourceStateChangedEventArgs> {
    public override fun getValue() = MediaSourceStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaSourceStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaSourceStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaSourceStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return MediaSourceStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaSourceStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
