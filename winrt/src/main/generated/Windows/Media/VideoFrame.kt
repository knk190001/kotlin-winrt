package Windows.Media

import Windows.Foundation.IClosable
import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import Windows.Graphics.DirectX.DirectXPixelFormat
import Windows.Graphics.Imaging.BitmapAlphaMode
import Windows.Graphics.Imaging.BitmapPixelFormat
import Windows.Graphics.Imaging.SoftwareBitmap
import Windows.Media.IVideoFrameFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(VideoFrame.ABI::class)
@Signature("rc(Windows.Media.VideoFrame;{0cc06625-90fc-4c92-bd95-7ded21819d1c})")
@WinRTByReference(brClass = VideoFrame.ByReference::class)
public class VideoFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoFrame.WithDefault, IMediaFrame.WithDefault, IClosable.WithDefault,
    IVideoFrame2.WithDefault, IWinRTObject {
  private val __1893542082_Interface: IVideoFrame.WithDefault by lazy {
    as_1893542082()
  }


  private val __1156286201_Interface: IMediaFrame.WithDefault by lazy {
    as_1156286201()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1429737552_Interface: IVideoFrame2.WithDefault by lazy {
    as_1429737552()
  }


  public override val __1893542082_Ptr: JNAPointer? by lazy {
    __1893542082_Interface.__1893542082_Ptr
  }


  public override val __1156286201_Ptr: JNAPointer? by lazy {
    __1156286201_Interface.__1156286201_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1429737552_Ptr: JNAPointer? by lazy {
    __1429737552_Interface.__1429737552_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1893542082_Interface, __1156286201_Interface, __1260617006_Interface,
        __1429737552_Interface)

  public constructor(
    format: BitmapPixelFormat,
    width: Int,
    height: Int
  ) : this(ABI.activate(format, width, height))

  public constructor(
    format: BitmapPixelFormat,
    width: Int,
    height: Int,
    alpha: BitmapAlphaMode
  ) : this(ABI.activate(format, width, height, alpha))

  private fun as_1893542082(): IVideoFrame.WithDefault {
    if(pointer == NULL) {
      return(IVideoFrame.ABI.makeIVideoFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoFrame.ABI.makeIVideoFrame(ref.value))
  }

  private fun as_1156286201(): IMediaFrame.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrame.ABI.makeIMediaFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrame.ABI.makeIMediaFrame(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_1429737552(): IVideoFrame2.WithDefault {
    if(pointer == NULL) {
      return(IVideoFrame2.ABI.makeIVideoFrame2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoFrame2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoFrame2.ABI.makeIVideoFrame2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<VideoFrame> {
    public override fun getValue() = VideoFrame(pointer.getPointer(0))

    public fun setValue(value: VideoFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoFrame, MemoryAddress> {
    public val IVideoFrameStatics_Instance: IVideoFrameStatics by lazy {
      createIVideoFrameStatics()
    }


    public val IVideoFrameFactory_Instance: IVideoFrameFactory by lazy {
      createIVideoFrameFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVideoFrameStatics(): IVideoFrameStatics {
      val refiid = Guid.REFIID(IVideoFrameStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.VideoFrame".toHandle(),refiid,interfacePtr)
      val result = IVideoFrameStatics.ABI.makeIVideoFrameStatics(interfacePtr.value)
      return result
    }

    public fun createIVideoFrameFactory(): IVideoFrameFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.VideoFrame".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVideoFrameFactory.ABI.makeIVideoFrameFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      format: BitmapPixelFormat,
      width: Int,
      height: Int
    ): JNAPointer? = IVideoFrameFactory_Instance.Create(format, width, height)?.pointer

    public fun activate(
      format: BitmapPixelFormat,
      width: Int,
      height: Int,
      alpha: BitmapAlphaMode
    ): JNAPointer? = IVideoFrameFactory_Instance.CreateWithAlpha(format, width, height,
        alpha)?.pointer

    public override fun fromNative(segment: MemoryAddress): VideoFrame {
      val address = segment.toRawLongValue()
      return VideoFrame(Pointer(address))
    }

    public override fun toNative(obj: VideoFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAsDirect3D11SurfaceBacked(
      format: DirectXPixelFormat,
      width: Int,
      height: Int
    ) = ABI.IVideoFrameStatics_Instance.CreateAsDirect3D11SurfaceBacked(format, width, height)

    public fun CreateAsDirect3D11SurfaceBacked(
      format: DirectXPixelFormat,
      width: Int,
      height: Int,
      device: IDirect3DDevice
    ) = ABI.IVideoFrameStatics_Instance.CreateAsDirect3D11SurfaceBacked(format, width, height,
        device)

    public fun CreateWithSoftwareBitmap(bitmap: SoftwareBitmap) =
        ABI.IVideoFrameStatics_Instance.CreateWithSoftwareBitmap(bitmap)

    public fun CreateWithDirect3D11Surface(surface: IDirect3DSurface) =
        ABI.IVideoFrameStatics_Instance.CreateWithDirect3D11Surface(surface)
  }
}
