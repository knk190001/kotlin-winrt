package Microsoft.UI.Xaml.Media

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

@ABIMarker(ImageBrush.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.ImageBrush;{edcd91a3-a868-5ba6-9489-5b12b4c29d85})")
@WinRTByReference(brClass = ImageBrush.ByReference::class)
public class ImageBrush(
  ptr: JNAPointer? = NULL
) : TileBrush(ptr), IImageBrush.WithDefault, IWinRTObject {
  private val __1661350512_Interface: IImageBrush.WithDefault by lazy {
    as_1661350512()
  }


  public override val __1661350512_Ptr: JNAPointer? by lazy {
    __1661350512_Interface.__1661350512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1661350512_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1661350512(): IImageBrush.WithDefault {
    if(pointer == NULL) {
      return(IImageBrush.ABI.makeIImageBrush(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageBrush>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageBrush.ABI.makeIImageBrush(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ImageBrush> {
    public override fun getValue() = ImageBrush(pointer.getPointer(0))

    public fun setValue(value: ImageBrush): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageBrush, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IImageBrushStatics_Instance: IImageBrushStatics by lazy {
      createIImageBrushStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.ImageBrush".toHandle(),
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

    public fun createIImageBrushStatics(): IImageBrushStatics {
      val refiid = Guid.REFIID(IImageBrushStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.ImageBrush".toHandle(),refiid,interfacePtr)
      val result = IImageBrushStatics.ABI.makeIImageBrushStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ImageBrush {
      val address = segment.toRawLongValue()
      return ImageBrush(Pointer(address))
    }

    public override fun toNative(obj: ImageBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ImageSourceProperty() = ABI.IImageBrushStatics_Instance.get_ImageSourceProperty()
  }
}
