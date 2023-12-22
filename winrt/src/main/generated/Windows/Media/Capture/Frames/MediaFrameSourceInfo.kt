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

@ABIMarker(MediaFrameSourceInfo.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.MediaFrameSourceInfo;{87bdc9cd-4601-408f-91cf-038318cd0af3})")
@WinRTByReference(brClass = MediaFrameSourceInfo.ByReference::class)
public class MediaFrameSourceInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaFrameSourceInfo.WithDefault, IMediaFrameSourceInfo2.WithDefault,
    IMediaFrameSourceInfo3.WithDefault, IWinRTObject {
  private val __983663448_Interface: IMediaFrameSourceInfo.WithDefault by lazy {
    as_983663448()
  }


  private val __428795866_Interface: IMediaFrameSourceInfo2.WithDefault by lazy {
    as_428795866()
  }


  private val __428795867_Interface: IMediaFrameSourceInfo3.WithDefault by lazy {
    as_428795867()
  }


  public override val __983663448_Ptr: JNAPointer? by lazy {
    __983663448_Interface.__983663448_Ptr
  }


  public override val __428795866_Ptr: JNAPointer? by lazy {
    __428795866_Interface.__428795866_Ptr
  }


  public override val __428795867_Ptr: JNAPointer? by lazy {
    __428795867_Interface.__428795867_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__983663448_Interface, __428795866_Interface, __428795867_Interface)

  private fun as_983663448(): IMediaFrameSourceInfo.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameSourceInfo.ABI.makeIMediaFrameSourceInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameSourceInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameSourceInfo.ABI.makeIMediaFrameSourceInfo(ref.value))
  }

  private fun as_428795866(): IMediaFrameSourceInfo2.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameSourceInfo2.ABI.makeIMediaFrameSourceInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameSourceInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameSourceInfo2.ABI.makeIMediaFrameSourceInfo2(ref.value))
  }

  private fun as_428795867(): IMediaFrameSourceInfo3.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameSourceInfo3.ABI.makeIMediaFrameSourceInfo3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameSourceInfo3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameSourceInfo3.ABI.makeIMediaFrameSourceInfo3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaFrameSourceInfo> {
    public override fun getValue() = MediaFrameSourceInfo(pointer.getPointer(0))

    public fun setValue(value: MediaFrameSourceInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaFrameSourceInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaFrameSourceInfo {
      val address = segment.toRawLongValue()
      return MediaFrameSourceInfo(Pointer(address))
    }

    public override fun toNative(obj: MediaFrameSourceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
