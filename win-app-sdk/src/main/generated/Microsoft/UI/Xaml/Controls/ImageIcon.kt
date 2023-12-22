package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IImageIconFactory.ABI.IID
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

@ABIMarker(ImageIcon.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ImageIcon;{78a7b526-e635-59c6-93a1-d7e3c2fac6d5})")
@WinRTByReference(brClass = ImageIcon.ByReference::class)
public open class ImageIcon(
  ptr: JNAPointer? = NULL
) : IconElement(ptr), IImageIcon.WithDefault, IWinRTObject {
  private val __1461127539_Interface: IImageIcon.WithDefault by lazy {
    as_1461127539()
  }


  public override val __1461127539_Ptr: JNAPointer? by lazy {
    __1461127539_Interface.__1461127539_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1461127539_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1461127539(): IImageIcon.WithDefault {
    if(pointer == NULL) {
      return(IImageIcon.ABI.makeIImageIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageIcon.ABI.makeIImageIcon(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ImageIcon> {
    public override fun getValue() = ImageIcon(pointer.getPointer(0))

    public fun setValue(value: ImageIcon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageIcon, MemoryAddress> {
    public val IImageIconStatics_Instance: IImageIconStatics by lazy {
      createIImageIconStatics()
    }


    public val IImageIconFactory_Instance: IImageIconFactory by lazy {
      createIImageIconFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIImageIconStatics(): IImageIconStatics {
      val refiid = Guid.REFIID(IImageIconStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ImageIcon".toHandle(),refiid,interfacePtr)
      val result = IImageIconStatics.ABI.makeIImageIconStatics(interfacePtr.value)
      return result
    }

    public fun createIImageIconFactory(): IImageIconFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ImageIcon".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IImageIconFactory.ABI.makeIImageIconFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IImageIconFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ImageIcon {
      val address = segment.toRawLongValue()
      return ImageIcon(Pointer(address))
    }

    public override fun toNative(obj: ImageIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SourceProperty() = ABI.IImageIconStatics_Instance.get_SourceProperty()
  }
}
