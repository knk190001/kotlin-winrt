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

@ABIMarker(MediaStreamSourceSampleRenderedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSourceSampleRenderedEventArgs;{9d697b05-d4f2-4c7a-9dfe-8d6cd0b3ee84})")
@WinRTByReference(brClass = MediaStreamSourceSampleRenderedEventArgs.ByReference::class)
public class MediaStreamSourceSampleRenderedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSourceSampleRenderedEventArgs.WithDefault, IWinRTObject {
  private val __573626898_Interface: IMediaStreamSourceSampleRenderedEventArgs.WithDefault by lazy {
    as_573626898()
  }


  public override val __573626898_Ptr: JNAPointer? by lazy {
    __573626898_Interface.__573626898_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__573626898_Interface)

  private fun as_573626898(): IMediaStreamSourceSampleRenderedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSourceSampleRenderedEventArgs.ABI.makeIMediaStreamSourceSampleRenderedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSourceSampleRenderedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSourceSampleRenderedEventArgs.ABI.makeIMediaStreamSourceSampleRenderedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSourceSampleRenderedEventArgs> {
    public override fun getValue() = MediaStreamSourceSampleRenderedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSourceSampleRenderedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSourceSampleRenderedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MediaStreamSourceSampleRenderedEventArgs {
      val address = segment.toRawLongValue()
      return MediaStreamSourceSampleRenderedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSourceSampleRenderedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
