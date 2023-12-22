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

@ABIMarker(MediaStreamSourceClosedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSourceClosedEventArgs;{cd8c7eb2-4816-4e24-88f0-491ef7386406})")
@WinRTByReference(brClass = MediaStreamSourceClosedEventArgs.ByReference::class)
public class MediaStreamSourceClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSourceClosedEventArgs.WithDefault, IWinRTObject {
  private val __235256415_Interface: IMediaStreamSourceClosedEventArgs.WithDefault by lazy {
    as_235256415()
  }


  public override val __235256415_Ptr: JNAPointer? by lazy {
    __235256415_Interface.__235256415_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__235256415_Interface)

  private fun as_235256415(): IMediaStreamSourceClosedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSourceClosedEventArgs.ABI.makeIMediaStreamSourceClosedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSourceClosedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSourceClosedEventArgs.ABI.makeIMediaStreamSourceClosedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSourceClosedEventArgs> {
    public override fun getValue() = MediaStreamSourceClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSourceClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSourceClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaStreamSourceClosedEventArgs {
      val address = segment.toRawLongValue()
      return MediaStreamSourceClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSourceClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
