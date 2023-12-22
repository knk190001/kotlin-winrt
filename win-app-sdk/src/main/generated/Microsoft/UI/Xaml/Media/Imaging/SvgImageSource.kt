package Microsoft.UI.Xaml.Media.Imaging

import Microsoft.UI.Xaml.Media.ImageSource
import Microsoft.UI.Xaml.Media.Imaging.ISvgImageSourceFactory.ABI.IID
import Windows.Foundation.Uri
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SvgImageSource.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Imaging.SvgImageSource;{d5b61d3c-b68d-53a2-b07b-ba6adfdd5887})")
@WinRTByReference(brClass = SvgImageSource.ByReference::class)
public open class SvgImageSource(
  ptr: JNAPointer? = NULL
) : ImageSource(ptr), ISvgImageSource.WithDefault, IWinRTObject {
  private val __883009991_Interface: ISvgImageSource.WithDefault by lazy {
    as_883009991()
  }


  public override val __883009991_Ptr: JNAPointer? by lazy {
    __883009991_Interface.__883009991_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__883009991_Interface)

  public constructor() : this(ABI.activate())

  public constructor(uriSource: Uri) : this(ABI.activate(uriSource))

  private fun as_883009991(): ISvgImageSource.WithDefault {
    if(pointer == NULL) {
      return(ISvgImageSource.ABI.makeISvgImageSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISvgImageSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISvgImageSource.ABI.makeISvgImageSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SvgImageSource>
      {
    public override fun getValue() = SvgImageSource(pointer.getPointer(0))

    public fun setValue(value: SvgImageSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SvgImageSource, MemoryAddress> {
    public val ISvgImageSourceStatics_Instance: ISvgImageSourceStatics by lazy {
      createISvgImageSourceStatics()
    }


    public val ISvgImageSourceFactory_Instance: ISvgImageSourceFactory by lazy {
      createISvgImageSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISvgImageSourceStatics(): ISvgImageSourceStatics {
      val refiid = Guid.REFIID(ISvgImageSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Imaging.SvgImageSource".toHandle(),refiid,interfacePtr)
      val result = ISvgImageSourceStatics.ABI.makeISvgImageSourceStatics(interfacePtr.value)
      return result
    }

    public fun createISvgImageSourceFactory(): ISvgImageSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Imaging.SvgImageSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISvgImageSourceFactory.ABI.makeISvgImageSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISvgImageSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public fun activate(uriSource: Uri): JNAPointer? =
        ISvgImageSourceFactory_Instance.CreateInstanceWithUriSource(uriSource, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SvgImageSource {
      val address = segment.toRawLongValue()
      return SvgImageSource(Pointer(address))
    }

    public override fun toNative(obj: SvgImageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_UriSourceProperty() = ABI.ISvgImageSourceStatics_Instance.get_UriSourceProperty()

    public fun get_RasterizePixelWidthProperty() =
        ABI.ISvgImageSourceStatics_Instance.get_RasterizePixelWidthProperty()

    public fun get_RasterizePixelHeightProperty() =
        ABI.ISvgImageSourceStatics_Instance.get_RasterizePixelHeightProperty()
  }
}
