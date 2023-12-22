package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IFlyoutPresenterFactory.ABI.IID
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

@ABIMarker(FlyoutPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.FlyoutPresenter;{70259825-7f56-5107-917e-7194b1ef1b81})")
@WinRTByReference(brClass = FlyoutPresenter.ByReference::class)
public open class FlyoutPresenter(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IFlyoutPresenter.WithDefault, IWinRTObject {
  private val __534409658_Interface: IFlyoutPresenter.WithDefault by lazy {
    as_534409658()
  }


  public override val __534409658_Ptr: JNAPointer? by lazy {
    __534409658_Interface.__534409658_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__534409658_Interface)

  public constructor() : this(ABI.activate())

  private fun as_534409658(): IFlyoutPresenter.WithDefault {
    if(pointer == NULL) {
      return(IFlyoutPresenter.ABI.makeIFlyoutPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFlyoutPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFlyoutPresenter.ABI.makeIFlyoutPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FlyoutPresenter> {
    public override fun getValue() = FlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: FlyoutPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FlyoutPresenter, MemoryAddress> {
    public val IFlyoutPresenterStatics_Instance: IFlyoutPresenterStatics by lazy {
      createIFlyoutPresenterStatics()
    }


    public val IFlyoutPresenterFactory_Instance: IFlyoutPresenterFactory by lazy {
      createIFlyoutPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFlyoutPresenterStatics(): IFlyoutPresenterStatics {
      val refiid = Guid.REFIID(IFlyoutPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.FlyoutPresenter".toHandle(),refiid,interfacePtr)
      val result = IFlyoutPresenterStatics.ABI.makeIFlyoutPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIFlyoutPresenterFactory(): IFlyoutPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.FlyoutPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFlyoutPresenterFactory.ABI.makeIFlyoutPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFlyoutPresenterFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FlyoutPresenter {
      val address = segment.toRawLongValue()
      return FlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: FlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsDefaultShadowEnabledProperty() =
        ABI.IFlyoutPresenterStatics_Instance.get_IsDefaultShadowEnabledProperty()
  }
}
