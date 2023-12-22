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

@ABIMarker(MediaFrameSourceController.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.MediaFrameSourceController;{6d076635-316d-4b8f-b7b6-eeb04a8c6525})")
@WinRTByReference(brClass = MediaFrameSourceController.ByReference::class)
public class MediaFrameSourceController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaFrameSourceController.WithDefault,
    IMediaFrameSourceController2.WithDefault, IMediaFrameSourceController3.WithDefault, IWinRTObject
    {
  private val __398239034_Interface: IMediaFrameSourceController.WithDefault by lazy {
    as_398239034()
  }


  private val __539491884_Interface: IMediaFrameSourceController2.WithDefault by lazy {
    as_539491884()
  }


  private val __539491885_Interface: IMediaFrameSourceController3.WithDefault by lazy {
    as_539491885()
  }


  public override val __398239034_Ptr: JNAPointer? by lazy {
    __398239034_Interface.__398239034_Ptr
  }


  public override val __539491884_Ptr: JNAPointer? by lazy {
    __539491884_Interface.__539491884_Ptr
  }


  public override val __539491885_Ptr: JNAPointer? by lazy {
    __539491885_Interface.__539491885_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__398239034_Interface, __539491884_Interface, __539491885_Interface)

  private fun as_398239034(): IMediaFrameSourceController.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameSourceController.ABI.makeIMediaFrameSourceController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameSourceController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameSourceController.ABI.makeIMediaFrameSourceController(ref.value))
  }

  private fun as_539491884(): IMediaFrameSourceController2.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameSourceController2.ABI.makeIMediaFrameSourceController2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameSourceController2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameSourceController2.ABI.makeIMediaFrameSourceController2(ref.value))
  }

  private fun as_539491885(): IMediaFrameSourceController3.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameSourceController3.ABI.makeIMediaFrameSourceController3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameSourceController3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameSourceController3.ABI.makeIMediaFrameSourceController3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaFrameSourceController> {
    public override fun getValue() = MediaFrameSourceController(pointer.getPointer(0))

    public fun setValue(value: MediaFrameSourceController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaFrameSourceController, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaFrameSourceController {
      val address = segment.toRawLongValue()
      return MediaFrameSourceController(Pointer(address))
    }

    public override fun toNative(obj: MediaFrameSourceController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
