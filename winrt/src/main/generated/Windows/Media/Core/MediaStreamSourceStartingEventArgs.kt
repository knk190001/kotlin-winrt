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

@ABIMarker(MediaStreamSourceStartingEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSourceStartingEventArgs;{f41468f2-c274-4940-a5bb-28a572452fa7})")
@WinRTByReference(brClass = MediaStreamSourceStartingEventArgs.ByReference::class)
public class MediaStreamSourceStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSourceStartingEventArgs.WithDefault, IWinRTObject {
  private val __974800845_Interface: IMediaStreamSourceStartingEventArgs.WithDefault by lazy {
    as_974800845()
  }


  public override val __974800845_Ptr: JNAPointer? by lazy {
    __974800845_Interface.__974800845_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__974800845_Interface)

  private fun as_974800845(): IMediaStreamSourceStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSourceStartingEventArgs.ABI.makeIMediaStreamSourceStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSourceStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSourceStartingEventArgs.ABI.makeIMediaStreamSourceStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSourceStartingEventArgs> {
    public override fun getValue() = MediaStreamSourceStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSourceStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSourceStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaStreamSourceStartingEventArgs {
      val address = segment.toRawLongValue()
      return MediaStreamSourceStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSourceStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
