package Windows.Media.Capture.Frames

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

@ABIMarker(MediaFrameFormat.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.MediaFrameFormat;{71902b4e-b279-4a97-a9db-bd5a2fb78f39})")
@WinRTByReference(brClass = MediaFrameFormat.ByReference::class)
public class MediaFrameFormat(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaFrameFormat.WithDefault, IMediaFrameFormat2.WithDefault, IWinRTObject {
  private val __1166872422_Interface: IMediaFrameFormat.WithDefault by lazy {
    as_1166872422()
  }


  private val __1813306764_Interface: IMediaFrameFormat2.WithDefault by lazy {
    as_1813306764()
  }


  public override val __1166872422_Ptr: JNAPointer? by lazy {
    __1166872422_Interface.__1166872422_Ptr
  }


  public override val __1813306764_Ptr: JNAPointer? by lazy {
    __1813306764_Interface.__1813306764_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1166872422_Interface, __1813306764_Interface)

  private fun as_1166872422(): IMediaFrameFormat.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameFormat.ABI.makeIMediaFrameFormat(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameFormat>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameFormat.ABI.makeIMediaFrameFormat(ref.value))
  }

  private fun as_1813306764(): IMediaFrameFormat2.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameFormat2.ABI.makeIMediaFrameFormat2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameFormat2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameFormat2.ABI.makeIMediaFrameFormat2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaFrameFormat> {
    public override fun getValue() = MediaFrameFormat(pointer.getPointer(0))

    public fun setValue(value: MediaFrameFormat): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaFrameFormat, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaFrameFormat {
      val address = segment.toRawLongValue()
      return MediaFrameFormat(Pointer(address))
    }

    public override fun toNative(obj: MediaFrameFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
