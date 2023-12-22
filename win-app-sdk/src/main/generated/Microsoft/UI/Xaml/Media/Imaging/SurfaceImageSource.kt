package Microsoft.UI.Xaml.Media.Imaging

import Microsoft.UI.Xaml.Media.ImageSource
import Microsoft.UI.Xaml.Media.Imaging.ISurfaceImageSourceFactory.ABI.IID
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

@ABIMarker(SurfaceImageSource.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Imaging.SurfaceImageSource;{ac078d9c-d0e0-5ff9-b73e-98e82e4c8d36})")
@WinRTByReference(brClass = SurfaceImageSource.ByReference::class)
public open class SurfaceImageSource(
  ptr: JNAPointer? = NULL
) : ImageSource(ptr), ISurfaceImageSource.WithDefault, IWinRTObject {
  private val __1665287376_Interface: ISurfaceImageSource.WithDefault by lazy {
    as_1665287376()
  }


  public override val __1665287376_Ptr: JNAPointer? by lazy {
    __1665287376_Interface.__1665287376_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1665287376_Interface)

  public constructor(pixelWidth: Int, pixelHeight: Int) : this(ABI.activate(pixelWidth,
      pixelHeight))

  public constructor(
    pixelWidth: Int,
    pixelHeight: Int,
    isOpaque: Boolean
  ) : this(ABI.activate(pixelWidth, pixelHeight, isOpaque))

  private fun as_1665287376(): ISurfaceImageSource.WithDefault {
    if(pointer == NULL) {
      return(ISurfaceImageSource.ABI.makeISurfaceImageSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISurfaceImageSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISurfaceImageSource.ABI.makeISurfaceImageSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SurfaceImageSource> {
    public override fun getValue() = SurfaceImageSource(pointer.getPointer(0))

    public fun setValue(value: SurfaceImageSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SurfaceImageSource, MemoryAddress> {
    public val ISurfaceImageSourceFactory_Instance: ISurfaceImageSourceFactory by lazy {
      createISurfaceImageSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISurfaceImageSourceFactory(): ISurfaceImageSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Imaging.SurfaceImageSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISurfaceImageSourceFactory.ABI.makeISurfaceImageSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(pixelWidth: Int, pixelHeight: Int): JNAPointer? =
        ISurfaceImageSourceFactory_Instance.CreateInstanceWithDimensions(pixelWidth, pixelHeight,
        null, null)?.pointer

    public fun activate(
      pixelWidth: Int,
      pixelHeight: Int,
      isOpaque: Boolean
    ): JNAPointer? =
        ISurfaceImageSourceFactory_Instance.CreateInstanceWithDimensionsAndOpacity(pixelWidth,
        pixelHeight, isOpaque, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SurfaceImageSource {
      val address = segment.toRawLongValue()
      return SurfaceImageSource(Pointer(address))
    }

    public override fun toNative(obj: SurfaceImageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
