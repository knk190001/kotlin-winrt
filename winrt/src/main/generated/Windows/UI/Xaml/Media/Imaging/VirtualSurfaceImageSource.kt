package Windows.UI.Xaml.Media.Imaging

import Windows.UI.Xaml.Media.Imaging.IVirtualSurfaceImageSourceFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(VirtualSurfaceImageSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Imaging.VirtualSurfaceImageSource;{4a711fea-bfac-11e0-a06a-9de44724019b})")
@WinRTByReference(brClass = VirtualSurfaceImageSource.ByReference::class)
public class VirtualSurfaceImageSource(
  ptr: JNAPointer? = NULL
) : SurfaceImageSource(ptr), IVirtualSurfaceImageSource.WithDefault, IWinRTObject {
  private val __1233258462_Interface: IVirtualSurfaceImageSource.WithDefault by lazy {
    as_1233258462()
  }


  public override val __1233258462_Ptr: JNAPointer? by lazy {
    __1233258462_Interface.__1233258462_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1233258462_Interface)

  public constructor(pixelWidth: Int, pixelHeight: Int) : this(ABI.activate(pixelWidth,
      pixelHeight))

  public constructor(
    pixelWidth: Int,
    pixelHeight: Int,
    isOpaque: Boolean
  ) : this(ABI.activate(pixelWidth, pixelHeight, isOpaque))

  private fun as_1233258462(): IVirtualSurfaceImageSource.WithDefault {
    if(pointer == NULL) {
      return(IVirtualSurfaceImageSource.ABI.makeIVirtualSurfaceImageSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualSurfaceImageSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualSurfaceImageSource.ABI.makeIVirtualSurfaceImageSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VirtualSurfaceImageSource> {
    public override fun getValue() = VirtualSurfaceImageSource(pointer.getPointer(0))

    public fun setValue(value: VirtualSurfaceImageSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VirtualSurfaceImageSource, MemoryAddress> {
    public val IVirtualSurfaceImageSourceFactory_Instance: IVirtualSurfaceImageSourceFactory by
        lazy {
      createIVirtualSurfaceImageSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVirtualSurfaceImageSourceFactory(): IVirtualSurfaceImageSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Imaging.VirtualSurfaceImageSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVirtualSurfaceImageSourceFactory.ABI.makeIVirtualSurfaceImageSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(pixelWidth: Int, pixelHeight: Int): JNAPointer? =
        IVirtualSurfaceImageSourceFactory_Instance.CreateInstanceWithDimensions(pixelWidth,
        pixelHeight)?.pointer

    public fun activate(
      pixelWidth: Int,
      pixelHeight: Int,
      isOpaque: Boolean
    ): JNAPointer? =
        IVirtualSurfaceImageSourceFactory_Instance.CreateInstanceWithDimensionsAndOpacity(pixelWidth,
        pixelHeight, isOpaque)?.pointer

    public override fun fromNative(segment: MemoryAddress): VirtualSurfaceImageSource {
      val address = segment.toRawLongValue()
      return VirtualSurfaceImageSource(Pointer(address))
    }

    public override fun toNative(obj: VirtualSurfaceImageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
