package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.FrameworkElement
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

@ABIMarker(Image.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Image;{220d3d8d-66de-53a1-a215-ba9c165565ab})")
@WinRTByReference(brClass = Image.ByReference::class)
public class Image(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IImage.WithDefault, IWinRTObject {
  private val __2011209740_Interface: IImage.WithDefault by lazy {
    as_2011209740()
  }


  public override val __2011209740_Ptr: JNAPointer? by lazy {
    __2011209740_Interface.__2011209740_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2011209740_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2011209740(): IImage.WithDefault {
    if(pointer == NULL) {
      return(IImage.ABI.makeIImage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImage.ABI.makeIImage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Image> {
    public override fun getValue() = Image(pointer.getPointer(0))

    public fun setValue(value: Image): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Image, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IImageStatics_Instance: IImageStatics by lazy {
      createIImageStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Image".toHandle(),
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

    public fun createIImageStatics(): IImageStatics {
      val refiid = Guid.REFIID(IImageStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Image".toHandle(),refiid,interfacePtr)
      val result = IImageStatics.ABI.makeIImageStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Image {
      val address = segment.toRawLongValue()
      return Image(Pointer(address))
    }

    public override fun toNative(obj: Image): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SourceProperty() = ABI.IImageStatics_Instance.get_SourceProperty()

    public fun get_StretchProperty() = ABI.IImageStatics_Instance.get_StretchProperty()

    public fun get_NineGridProperty() = ABI.IImageStatics_Instance.get_NineGridProperty()
  }
}
