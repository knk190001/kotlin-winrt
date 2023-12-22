package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IBitmapIconSourceFactory.ABI.IID
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

@ABIMarker(BitmapIconSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.BitmapIconSource;{c8e33dc7-d4ae-4a87-947f-ac4d0bcf5af4})")
@WinRTByReference(brClass = BitmapIconSource.ByReference::class)
public open class BitmapIconSource(
  ptr: JNAPointer? = NULL
) : IconSource(ptr), IBitmapIconSource.WithDefault, IWinRTObject {
  private val __373593247_Interface: IBitmapIconSource.WithDefault by lazy {
    as_373593247()
  }


  public override val __373593247_Ptr: JNAPointer? by lazy {
    __373593247_Interface.__373593247_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__373593247_Interface)

  public constructor() : this(ABI.activate())

  private fun as_373593247(): IBitmapIconSource.WithDefault {
    if(pointer == NULL) {
      return(IBitmapIconSource.ABI.makeIBitmapIconSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapIconSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapIconSource.ABI.makeIBitmapIconSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BitmapIconSource> {
    public override fun getValue() = BitmapIconSource(pointer.getPointer(0))

    public fun setValue(value: BitmapIconSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapIconSource, MemoryAddress> {
    public val IBitmapIconSourceStatics_Instance: IBitmapIconSourceStatics by lazy {
      createIBitmapIconSourceStatics()
    }


    public val IBitmapIconSourceFactory_Instance: IBitmapIconSourceFactory by lazy {
      createIBitmapIconSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBitmapIconSourceStatics(): IBitmapIconSourceStatics {
      val refiid = Guid.REFIID(IBitmapIconSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.BitmapIconSource".toHandle(),refiid,interfacePtr)
      val result = IBitmapIconSourceStatics.ABI.makeIBitmapIconSourceStatics(interfacePtr.value)
      return result
    }

    public fun createIBitmapIconSourceFactory(): IBitmapIconSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.BitmapIconSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBitmapIconSourceFactory.ABI.makeIBitmapIconSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IBitmapIconSourceFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): BitmapIconSource {
      val address = segment.toRawLongValue()
      return BitmapIconSource(Pointer(address))
    }

    public override fun toNative(obj: BitmapIconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_UriSourceProperty() =
        ABI.IBitmapIconSourceStatics_Instance.get_UriSourceProperty()

    public fun get_ShowAsMonochromeProperty() =
        ABI.IBitmapIconSourceStatics_Instance.get_ShowAsMonochromeProperty()
  }
}
