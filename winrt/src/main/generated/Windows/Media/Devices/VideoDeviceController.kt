package Windows.Media.Devices

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

@ABIMarker(VideoDeviceController.ABI::class)
@Signature("rc(Windows.Media.Devices.VideoDeviceController;{99555575-2e2e-40b8-b6c7-f82d10013210})")
@WinRTByReference(brClass = VideoDeviceController.ByReference::class)
public class VideoDeviceController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoDeviceController.WithDefault, IMediaDeviceController.WithDefault,
    IAdvancedVideoCaptureDeviceController.WithDefault,
    IAdvancedVideoCaptureDeviceController2.WithDefault,
    IAdvancedVideoCaptureDeviceController3.WithDefault,
    IAdvancedVideoCaptureDeviceController4.WithDefault,
    IAdvancedVideoCaptureDeviceController5.WithDefault,
    IAdvancedVideoCaptureDeviceController6.WithDefault,
    IAdvancedVideoCaptureDeviceController7.WithDefault,
    IAdvancedVideoCaptureDeviceController8.WithDefault,
    IAdvancedVideoCaptureDeviceController9.WithDefault,
    IAdvancedVideoCaptureDeviceController10.WithDefault, IWinRTObject {
  private val __1051825492_Interface: IVideoDeviceController.WithDefault by lazy {
    as_1051825492()
  }


  private val __1516491797_Interface: IMediaDeviceController.WithDefault by lazy {
    as_1516491797()
  }


  private val __1798808352_Interface: IAdvancedVideoCaptureDeviceController.WithDefault by lazy {
    as_1798808352()
  }


  private val __71515986_Interface: IAdvancedVideoCaptureDeviceController2.WithDefault by lazy {
    as_71515986()
  }


  private val __71515987_Interface: IAdvancedVideoCaptureDeviceController3.WithDefault by lazy {
    as_71515987()
  }


  private val __71515988_Interface: IAdvancedVideoCaptureDeviceController4.WithDefault by lazy {
    as_71515988()
  }


  private val __71515989_Interface: IAdvancedVideoCaptureDeviceController5.WithDefault by lazy {
    as_71515989()
  }


  private val __71515990_Interface: IAdvancedVideoCaptureDeviceController6.WithDefault by lazy {
    as_71515990()
  }


  private val __71515991_Interface: IAdvancedVideoCaptureDeviceController7.WithDefault by lazy {
    as_71515991()
  }


  private val __71515992_Interface: IAdvancedVideoCaptureDeviceController8.WithDefault by lazy {
    as_71515992()
  }


  private val __71515993_Interface: IAdvancedVideoCaptureDeviceController9.WithDefault by lazy {
    as_71515993()
  }


  private val __2077971713_Interface: IAdvancedVideoCaptureDeviceController10.WithDefault by lazy {
    as_2077971713()
  }


  public override val __1051825492_Ptr: JNAPointer? by lazy {
    __1051825492_Interface.__1051825492_Ptr
  }


  public override val __1516491797_Ptr: JNAPointer? by lazy {
    __1516491797_Interface.__1516491797_Ptr
  }


  public override val __1798808352_Ptr: JNAPointer? by lazy {
    __1798808352_Interface.__1798808352_Ptr
  }


  public override val __71515986_Ptr: JNAPointer? by lazy {
    __71515986_Interface.__71515986_Ptr
  }


  public override val __71515987_Ptr: JNAPointer? by lazy {
    __71515987_Interface.__71515987_Ptr
  }


  public override val __71515988_Ptr: JNAPointer? by lazy {
    __71515988_Interface.__71515988_Ptr
  }


  public override val __71515989_Ptr: JNAPointer? by lazy {
    __71515989_Interface.__71515989_Ptr
  }


  public override val __71515990_Ptr: JNAPointer? by lazy {
    __71515990_Interface.__71515990_Ptr
  }


  public override val __71515991_Ptr: JNAPointer? by lazy {
    __71515991_Interface.__71515991_Ptr
  }


  public override val __71515992_Ptr: JNAPointer? by lazy {
    __71515992_Interface.__71515992_Ptr
  }


  public override val __71515993_Ptr: JNAPointer? by lazy {
    __71515993_Interface.__71515993_Ptr
  }


  public override val __2077971713_Ptr: JNAPointer? by lazy {
    __2077971713_Interface.__2077971713_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1051825492_Interface, __1516491797_Interface, __1798808352_Interface,
        __71515986_Interface, __71515987_Interface, __71515988_Interface, __71515989_Interface,
        __71515990_Interface, __71515991_Interface, __71515992_Interface, __71515993_Interface,
        __2077971713_Interface)

  private fun as_1051825492(): IVideoDeviceController.WithDefault {
    if(pointer == NULL) {
      return(IVideoDeviceController.ABI.makeIVideoDeviceController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoDeviceController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoDeviceController.ABI.makeIVideoDeviceController(ref.value))
  }

  private fun as_1516491797(): IMediaDeviceController.WithDefault {
    if(pointer == NULL) {
      return(IMediaDeviceController.ABI.makeIMediaDeviceController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaDeviceController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaDeviceController.ABI.makeIMediaDeviceController(ref.value))
  }

  private fun as_1798808352(): IAdvancedVideoCaptureDeviceController.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedVideoCaptureDeviceController.ABI.makeIAdvancedVideoCaptureDeviceController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedVideoCaptureDeviceController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedVideoCaptureDeviceController.ABI.makeIAdvancedVideoCaptureDeviceController(ref.value))
  }

  private fun as_71515986(): IAdvancedVideoCaptureDeviceController2.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedVideoCaptureDeviceController2.ABI.makeIAdvancedVideoCaptureDeviceController2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedVideoCaptureDeviceController2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedVideoCaptureDeviceController2.ABI.makeIAdvancedVideoCaptureDeviceController2(ref.value))
  }

  private fun as_71515987(): IAdvancedVideoCaptureDeviceController3.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedVideoCaptureDeviceController3.ABI.makeIAdvancedVideoCaptureDeviceController3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedVideoCaptureDeviceController3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedVideoCaptureDeviceController3.ABI.makeIAdvancedVideoCaptureDeviceController3(ref.value))
  }

  private fun as_71515988(): IAdvancedVideoCaptureDeviceController4.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedVideoCaptureDeviceController4.ABI.makeIAdvancedVideoCaptureDeviceController4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedVideoCaptureDeviceController4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedVideoCaptureDeviceController4.ABI.makeIAdvancedVideoCaptureDeviceController4(ref.value))
  }

  private fun as_71515989(): IAdvancedVideoCaptureDeviceController5.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedVideoCaptureDeviceController5.ABI.makeIAdvancedVideoCaptureDeviceController5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedVideoCaptureDeviceController5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedVideoCaptureDeviceController5.ABI.makeIAdvancedVideoCaptureDeviceController5(ref.value))
  }

  private fun as_71515990(): IAdvancedVideoCaptureDeviceController6.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedVideoCaptureDeviceController6.ABI.makeIAdvancedVideoCaptureDeviceController6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedVideoCaptureDeviceController6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedVideoCaptureDeviceController6.ABI.makeIAdvancedVideoCaptureDeviceController6(ref.value))
  }

  private fun as_71515991(): IAdvancedVideoCaptureDeviceController7.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedVideoCaptureDeviceController7.ABI.makeIAdvancedVideoCaptureDeviceController7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedVideoCaptureDeviceController7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedVideoCaptureDeviceController7.ABI.makeIAdvancedVideoCaptureDeviceController7(ref.value))
  }

  private fun as_71515992(): IAdvancedVideoCaptureDeviceController8.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedVideoCaptureDeviceController8.ABI.makeIAdvancedVideoCaptureDeviceController8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedVideoCaptureDeviceController8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedVideoCaptureDeviceController8.ABI.makeIAdvancedVideoCaptureDeviceController8(ref.value))
  }

  private fun as_71515993(): IAdvancedVideoCaptureDeviceController9.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedVideoCaptureDeviceController9.ABI.makeIAdvancedVideoCaptureDeviceController9(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedVideoCaptureDeviceController9>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedVideoCaptureDeviceController9.ABI.makeIAdvancedVideoCaptureDeviceController9(ref.value))
  }

  private fun as_2077971713(): IAdvancedVideoCaptureDeviceController10.WithDefault {
    if(pointer == NULL) {
      return(IAdvancedVideoCaptureDeviceController10.ABI.makeIAdvancedVideoCaptureDeviceController10(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdvancedVideoCaptureDeviceController10>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdvancedVideoCaptureDeviceController10.ABI.makeIAdvancedVideoCaptureDeviceController10(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoDeviceController> {
    public override fun getValue() = VideoDeviceController(pointer.getPointer(0))

    public fun setValue(value: VideoDeviceController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoDeviceController, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VideoDeviceController {
      val address = segment.toRawLongValue()
      return VideoDeviceController(Pointer(address))
    }

    public override fun toNative(obj: VideoDeviceController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
