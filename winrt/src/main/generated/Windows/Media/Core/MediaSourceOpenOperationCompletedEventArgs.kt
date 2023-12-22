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

@ABIMarker(MediaSourceOpenOperationCompletedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.MediaSourceOpenOperationCompletedEventArgs;{fc682ceb-e281-477c-a8e0-1acd654114c8})")
@WinRTByReference(brClass = MediaSourceOpenOperationCompletedEventArgs.ByReference::class)
public class MediaSourceOpenOperationCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaSourceOpenOperationCompletedEventArgs.WithDefault, IWinRTObject {
  private val __286557921_Interface: IMediaSourceOpenOperationCompletedEventArgs.WithDefault by
      lazy {
    as_286557921()
  }


  public override val __286557921_Ptr: JNAPointer? by lazy {
    __286557921_Interface.__286557921_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__286557921_Interface)

  private fun as_286557921(): IMediaSourceOpenOperationCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaSourceOpenOperationCompletedEventArgs.ABI.makeIMediaSourceOpenOperationCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaSourceOpenOperationCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaSourceOpenOperationCompletedEventArgs.ABI.makeIMediaSourceOpenOperationCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaSourceOpenOperationCompletedEventArgs> {
    public override fun getValue() =
        MediaSourceOpenOperationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaSourceOpenOperationCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaSourceOpenOperationCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaSourceOpenOperationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return MediaSourceOpenOperationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaSourceOpenOperationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
