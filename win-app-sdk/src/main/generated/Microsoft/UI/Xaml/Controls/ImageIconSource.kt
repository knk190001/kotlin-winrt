package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IImageIconSourceFactory.ABI.IID
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

@ABIMarker(ImageIconSource.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ImageIconSource;{67f75be0-c84d-57ff-9f68-039c81ea7896})")
@WinRTByReference(brClass = ImageIconSource.ByReference::class)
public open class ImageIconSource(
  ptr: JNAPointer? = NULL
) : IconSource(ptr), IImageIconSource.WithDefault, IWinRTObject {
  private val __1318874376_Interface: IImageIconSource.WithDefault by lazy {
    as_1318874376()
  }


  public override val __1318874376_Ptr: JNAPointer? by lazy {
    __1318874376_Interface.__1318874376_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1318874376_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1318874376(): IImageIconSource.WithDefault {
    if(pointer == NULL) {
      return(IImageIconSource.ABI.makeIImageIconSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageIconSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageIconSource.ABI.makeIImageIconSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ImageIconSource> {
    public override fun getValue() = ImageIconSource(pointer.getPointer(0))

    public fun setValue(value: ImageIconSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageIconSource, MemoryAddress> {
    public val IImageIconSourceStatics_Instance: IImageIconSourceStatics by lazy {
      createIImageIconSourceStatics()
    }


    public val IImageIconSourceFactory_Instance: IImageIconSourceFactory by lazy {
      createIImageIconSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIImageIconSourceStatics(): IImageIconSourceStatics {
      val refiid = Guid.REFIID(IImageIconSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ImageIconSource".toHandle(),refiid,interfacePtr)
      val result = IImageIconSourceStatics.ABI.makeIImageIconSourceStatics(interfacePtr.value)
      return result
    }

    public fun createIImageIconSourceFactory(): IImageIconSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ImageIconSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IImageIconSourceFactory.ABI.makeIImageIconSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IImageIconSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ImageIconSource {
      val address = segment.toRawLongValue()
      return ImageIconSource(Pointer(address))
    }

    public override fun toNative(obj: ImageIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ImageSourceProperty() =
        ABI.IImageIconSourceStatics_Instance.get_ImageSourceProperty()
  }
}
