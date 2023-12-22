package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IFlyoutFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase
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

@ABIMarker(Flyout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Flyout;{d4a1eb7d-59b8-5df9-87c3-bd5e3856923f})")
@WinRTByReference(brClass = Flyout.ByReference::class)
public open class Flyout(
  ptr: JNAPointer? = NULL
) : FlyoutBase(ptr), IFlyout.WithDefault, IWinRTObject {
  private val __1990919810_Interface: IFlyout.WithDefault by lazy {
    as_1990919810()
  }


  public override val __1990919810_Ptr: JNAPointer? by lazy {
    __1990919810_Interface.__1990919810_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1990919810_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1990919810(): IFlyout.WithDefault {
    if(pointer == NULL) {
      return(IFlyout.ABI.makeIFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyout.ABI.makeIFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Flyout> {
    public override fun getValue() = Flyout(pointer.getPointer(0))

    public fun setValue(value: Flyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Flyout, MemoryAddress> {
    public val IFlyoutStatics_Instance: IFlyoutStatics by lazy {
      createIFlyoutStatics()
    }


    public val IFlyoutFactory_Instance: IFlyoutFactory by lazy {
      createIFlyoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlyoutStatics(): IFlyoutStatics {
      val refiid = Guid.REFIID(IFlyoutStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Flyout".toHandle(),refiid,interfacePtr)
      val result = IFlyoutStatics.ABI.makeIFlyoutStatics(interfacePtr.value)
      return result
    }

    public fun createIFlyoutFactory(): IFlyoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Flyout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFlyoutFactory.ABI.makeIFlyoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFlyoutFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Flyout {
      val address = segment.toRawLongValue()
      return Flyout(Pointer(address))
    }

    public override fun toNative(obj: Flyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ContentProperty() = ABI.IFlyoutStatics_Instance.get_ContentProperty()

    public fun get_FlyoutPresenterStyleProperty() =
        ABI.IFlyoutStatics_Instance.get_FlyoutPresenterStyleProperty()
  }
}
