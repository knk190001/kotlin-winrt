package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IBitmapIconFactory.ABI.IID
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

@ABIMarker(BitmapIcon.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.BitmapIcon;{c370bc29-805b-5bad-b615-ec640e579dbb})")
@WinRTByReference(brClass = BitmapIcon.ByReference::class)
public open class BitmapIcon(
  ptr: JNAPointer? = NULL
) : IconElement(ptr), IBitmapIcon.WithDefault, IWinRTObject {
  private val __1669591887_Interface: IBitmapIcon.WithDefault by lazy {
    as_1669591887()
  }


  public override val __1669591887_Ptr: JNAPointer? by lazy {
    __1669591887_Interface.__1669591887_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1669591887_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1669591887(): IBitmapIcon.WithDefault {
    if(pointer == NULL) {
      return(IBitmapIcon.ABI.makeIBitmapIcon(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBitmapIcon>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBitmapIcon.ABI.makeIBitmapIcon(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BitmapIcon> {
    public override fun getValue() = BitmapIcon(pointer.getPointer(0))

    public fun setValue(value: BitmapIcon): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BitmapIcon, MemoryAddress> {
    public val IBitmapIconStatics_Instance: IBitmapIconStatics by lazy {
      createIBitmapIconStatics()
    }


    public val IBitmapIconFactory_Instance: IBitmapIconFactory by lazy {
      createIBitmapIconFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBitmapIconStatics(): IBitmapIconStatics {
      val refiid = Guid.REFIID(IBitmapIconStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.BitmapIcon".toHandle(),refiid,interfacePtr)
      val result = IBitmapIconStatics.ABI.makeIBitmapIconStatics(interfacePtr.value)
      return result
    }

    public fun createIBitmapIconFactory(): IBitmapIconFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.BitmapIcon".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBitmapIconFactory.ABI.makeIBitmapIconFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IBitmapIconFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): BitmapIcon {
      val address = segment.toRawLongValue()
      return BitmapIcon(Pointer(address))
    }

    public override fun toNative(obj: BitmapIcon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_UriSourceProperty() = ABI.IBitmapIconStatics_Instance.get_UriSourceProperty()

    public fun get_ShowAsMonochromeProperty() =
        ABI.IBitmapIconStatics_Instance.get_ShowAsMonochromeProperty()
  }
}
