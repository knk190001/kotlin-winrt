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

@ABIMarker(MediaCueEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.MediaCueEventArgs;{d12f47f7-5fa4-4e68-9fe5-32160dcee57e})")
@WinRTByReference(brClass = MediaCueEventArgs.ByReference::class)
public class MediaCueEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaCueEventArgs.WithDefault, IWinRTObject {
  private val __1243718285_Interface: IMediaCueEventArgs.WithDefault by lazy {
    as_1243718285()
  }


  public override val __1243718285_Ptr: JNAPointer? by lazy {
    __1243718285_Interface.__1243718285_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1243718285_Interface)

  private fun as_1243718285(): IMediaCueEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaCueEventArgs.ABI.makeIMediaCueEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaCueEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaCueEventArgs.ABI.makeIMediaCueEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaCueEventArgs> {
    public override fun getValue() = MediaCueEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaCueEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaCueEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaCueEventArgs {
      val address = segment.toRawLongValue()
      return MediaCueEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaCueEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
