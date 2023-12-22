package Microsoft.UI.Xaml.Media.Imaging

import Microsoft.UI.Xaml.Media.ImageSource
import Microsoft.UI.Xaml.Media.Imaging.IBitmapSourceFactory.ABI.IID
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

@ABIMarker(BitmapSource.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Imaging.BitmapSource;{8424269d-9b82-534f-8fea-af5b5ef96bf2})")
@WinRTByReference(brClass = BitmapSource.ByReference::class)
public open class BitmapSource(
  ptr: JNAPointer? = NULL
) : ImageSource(ptr), IBitmapSource.WithDefault, IWinRTObject {
  private val __1369504209_Interface: IBitmapSource.WithDefault by lazy {
    as_1369504209()
  }


  public override val __1369504209_Ptr: JNAPointer? by lazy {
    __1369504209_Interface.__1369504209_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1369504209_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1369504209(): IBitmapSource.WithDefault {
    if(pointer == NULL) {
      return(IBitmapSource.ABI.makeIBitmapSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapSource.ABI.makeIBitmapSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BitmapSource> {
    public override fun getValue() = BitmapSource(pointer.getPointer(0))

    public fun setValue(value: BitmapSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapSource, MemoryAddress> {
    public val IBitmapSourceStatics_Instance: IBitmapSourceStatics by lazy {
      createIBitmapSourceStatics()
    }


    public val IBitmapSourceFactory_Instance: IBitmapSourceFactory by lazy {
      createIBitmapSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBitmapSourceStatics(): IBitmapSourceStatics {
      val refiid = Guid.REFIID(IBitmapSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Imaging.BitmapSource".toHandle(),refiid,interfacePtr)
      val result = IBitmapSourceStatics.ABI.makeIBitmapSourceStatics(interfacePtr.value)
      return result
    }

    public fun createIBitmapSourceFactory(): IBitmapSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Imaging.BitmapSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBitmapSourceFactory.ABI.makeIBitmapSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IBitmapSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): BitmapSource {
      val address = segment.toRawLongValue()
      return BitmapSource(Pointer(address))
    }

    public override fun toNative(obj: BitmapSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_PixelWidthProperty() = ABI.IBitmapSourceStatics_Instance.get_PixelWidthProperty()

    public fun get_PixelHeightProperty() =
        ABI.IBitmapSourceStatics_Instance.get_PixelHeightProperty()
  }
}
