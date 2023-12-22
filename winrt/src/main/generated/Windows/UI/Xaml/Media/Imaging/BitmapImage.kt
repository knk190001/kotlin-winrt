package Windows.UI.Xaml.Media.Imaging

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
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(BitmapImage.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Imaging.BitmapImage;{31af3271-e3b4-442d-a341-4c0226b2725b})")
@WinRTByReference(brClass = BitmapImage.ByReference::class)
public class BitmapImage(
  ptr: JNAPointer? = NULL
) : BitmapSource(ptr), IBitmapImage.WithDefault, IBitmapImage2.WithDefault,
    IBitmapImage3.WithDefault, IWinRTObject {
  private val __974605626_Interface: IBitmapImage.WithDefault by lazy {
    as_974605626()
  }


  private val __148003384_Interface: IBitmapImage2.WithDefault by lazy {
    as_148003384()
  }


  private val __148003385_Interface: IBitmapImage3.WithDefault by lazy {
    as_148003385()
  }


  public override val __974605626_Ptr: JNAPointer? by lazy {
    __974605626_Interface.__974605626_Ptr
  }


  public override val __148003384_Ptr: JNAPointer? by lazy {
    __148003384_Interface.__148003384_Ptr
  }


  public override val __148003385_Ptr: JNAPointer? by lazy {
    __148003385_Interface.__148003385_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__974605626_Interface, __148003384_Interface, __148003385_Interface)

  public constructor() : this(ABI.activate())

  public constructor(uriSource: Uri) : this(ABI.activate(uriSource))

  private fun as_974605626(): IBitmapImage.WithDefault {
    if(pointer == NULL) {
      return(IBitmapImage.ABI.makeIBitmapImage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapImage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapImage.ABI.makeIBitmapImage(ref.value))
  }

  private fun as_148003384(): IBitmapImage2.WithDefault {
    if(pointer == NULL) {
      return(IBitmapImage2.ABI.makeIBitmapImage2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapImage2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapImage2.ABI.makeIBitmapImage2(ref.value))
  }

  private fun as_148003385(): IBitmapImage3.WithDefault {
    if(pointer == NULL) {
      return(IBitmapImage3.ABI.makeIBitmapImage3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapImage3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapImage3.ABI.makeIBitmapImage3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BitmapImage> {
    public override fun getValue() = BitmapImage(pointer.getPointer(0))

    public fun setValue(value: BitmapImage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapImage, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBitmapImageStatics_Instance: IBitmapImageStatics by lazy {
      createIBitmapImageStatics()
    }


    public val IBitmapImageStatics3_Instance: IBitmapImageStatics3 by lazy {
      createIBitmapImageStatics3()
    }


    public val IBitmapImageStatics2_Instance: IBitmapImageStatics2 by lazy {
      createIBitmapImageStatics2()
    }


    public val IBitmapImageFactory_Instance: IBitmapImageFactory by lazy {
      createIBitmapImageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Imaging.BitmapImage".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIBitmapImageStatics(): IBitmapImageStatics {
      val refiid = Guid.REFIID(IBitmapImageStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Imaging.BitmapImage".toHandle(),refiid,interfacePtr)
      val result = IBitmapImageStatics.ABI.makeIBitmapImageStatics(interfacePtr.value)
      return result
    }

    public fun createIBitmapImageStatics3(): IBitmapImageStatics3 {
      val refiid = Guid.REFIID(IBitmapImageStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Imaging.BitmapImage".toHandle(),refiid,interfacePtr)
      val result = IBitmapImageStatics3.ABI.makeIBitmapImageStatics3(interfacePtr.value)
      return result
    }

    public fun createIBitmapImageStatics2(): IBitmapImageStatics2 {
      val refiid = Guid.REFIID(IBitmapImageStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Imaging.BitmapImage".toHandle(),refiid,interfacePtr)
      val result = IBitmapImageStatics2.ABI.makeIBitmapImageStatics2(interfacePtr.value)
      return result
    }

    public fun createIBitmapImageFactory(): IBitmapImageFactory {
      val refiid = Guid.REFIID(IBitmapImageFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Imaging.BitmapImage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBitmapImageFactory.ABI.makeIBitmapImageFactory(factoryActivatorPtr.value))
    }

    public fun activate(uriSource: Uri): JNAPointer? =
        IBitmapImageFactory_Instance.CreateInstanceWithUriSource(uriSource)?.pointer

    public override fun fromNative(segment: MemoryAddress): BitmapImage {
      val address = segment.toRawLongValue()
      return BitmapImage(Pointer(address))
    }

    public override fun toNative(obj: BitmapImage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CreateOptionsProperty() =
        ABI.IBitmapImageStatics_Instance.get_CreateOptionsProperty()

    public fun get_UriSourceProperty() = ABI.IBitmapImageStatics_Instance.get_UriSourceProperty()

    public fun get_DecodePixelWidthProperty() =
        ABI.IBitmapImageStatics_Instance.get_DecodePixelWidthProperty()

    public fun get_DecodePixelHeightProperty() =
        ABI.IBitmapImageStatics_Instance.get_DecodePixelHeightProperty()

    public fun get_IsAnimatedBitmapProperty() =
        ABI.IBitmapImageStatics3_Instance.get_IsAnimatedBitmapProperty()

    public fun get_IsPlayingProperty() = ABI.IBitmapImageStatics3_Instance.get_IsPlayingProperty()

    public fun get_AutoPlayProperty() = ABI.IBitmapImageStatics3_Instance.get_AutoPlayProperty()

    public fun get_DecodePixelTypeProperty() =
        ABI.IBitmapImageStatics2_Instance.get_DecodePixelTypeProperty()
  }
}
