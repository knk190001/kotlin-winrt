package Windows.UI.Xaml.Media.Imaging

import Windows.UI.Xaml.Media.ImageSource
import Windows.UI.Xaml.Media.Imaging.IBitmapSourceFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Media.Imaging.BitmapSource;{23d86411-202f-41b2-8c5b-a8a3b333800b})")
@WinRTByReference(brClass = BitmapSource.ByReference::class)
public open class BitmapSource(
  ptr: JNAPointer? = NULL
) : ImageSource(ptr), IBitmapSource.WithDefault, IWinRTObject {
  private val __436748316_Interface: IBitmapSource.WithDefault by lazy {
    as_436748316()
  }


  public override val __436748316_Ptr: JNAPointer? by lazy {
    __436748316_Interface.__436748316_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__436748316_Interface)

  public constructor() : this(ABI.activate())

  private fun as_436748316(): IBitmapSource.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Imaging.BitmapSource".toHandle(),refiid,interfacePtr)
      val result = IBitmapSourceStatics.ABI.makeIBitmapSourceStatics(interfacePtr.value)
      return result
    }

    public fun createIBitmapSourceFactory(): IBitmapSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Imaging.BitmapSource".toHandle(),refiid,factoryActivatorPtr)
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
