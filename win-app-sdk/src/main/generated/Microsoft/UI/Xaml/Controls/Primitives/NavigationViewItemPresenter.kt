package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ContentControl
import Microsoft.UI.Xaml.Controls.Primitives.INavigationViewItemPresenterFactory.ABI.IID
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

@ABIMarker(NavigationViewItemPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.NavigationViewItemPresenter;{64939df5-760c-5b0b-af4d-d8dd4ee50278})")
@WinRTByReference(brClass = NavigationViewItemPresenter.ByReference::class)
public open class NavigationViewItemPresenter(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), INavigationViewItemPresenter.WithDefault,
    INavigationViewItemPresenter2.WithDefault, IWinRTObject {
  private val __1383930763_Interface: INavigationViewItemPresenter.WithDefault by lazy {
    as_1383930763()
  }


  private val __47819257_Interface: INavigationViewItemPresenter2.WithDefault by lazy {
    as_47819257()
  }


  public override val __1383930763_Ptr: JNAPointer? by lazy {
    __1383930763_Interface.__1383930763_Ptr
  }


  public override val __47819257_Ptr: JNAPointer? by lazy {
    __47819257_Interface.__47819257_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1383930763_Interface, __47819257_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1383930763(): INavigationViewItemPresenter.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemPresenter.ABI.makeINavigationViewItemPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemPresenter.ABI.makeINavigationViewItemPresenter(ref.value))
  }

  private fun as_47819257(): INavigationViewItemPresenter2.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemPresenter2.ABI.makeINavigationViewItemPresenter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemPresenter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemPresenter2.ABI.makeINavigationViewItemPresenter2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewItemPresenter> {
    public override fun getValue() = NavigationViewItemPresenter(pointer.getPointer(0))

    public fun setValue(value: NavigationViewItemPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewItemPresenter, MemoryAddress> {
    public val INavigationViewItemPresenterStatics_Instance: INavigationViewItemPresenterStatics by
        lazy {
      createINavigationViewItemPresenterStatics()
    }


    public val INavigationViewItemPresenterStatics2_Instance: INavigationViewItemPresenterStatics2
        by lazy {
      createINavigationViewItemPresenterStatics2()
    }


    public val INavigationViewItemPresenterFactory_Instance: INavigationViewItemPresenterFactory by
        lazy {
      createINavigationViewItemPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewItemPresenterStatics(): INavigationViewItemPresenterStatics {
      val refiid = Guid.REFIID(INavigationViewItemPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.NavigationViewItemPresenter".toHandle(),refiid,interfacePtr)
      val result =
          INavigationViewItemPresenterStatics.ABI.makeINavigationViewItemPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createINavigationViewItemPresenterStatics2(): INavigationViewItemPresenterStatics2 {
      val refiid = Guid.REFIID(INavigationViewItemPresenterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.NavigationViewItemPresenter".toHandle(),refiid,interfacePtr)
      val result =
          INavigationViewItemPresenterStatics2.ABI.makeINavigationViewItemPresenterStatics2(interfacePtr.value)
      return result
    }

    public fun createINavigationViewItemPresenterFactory(): INavigationViewItemPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.NavigationViewItemPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INavigationViewItemPresenterFactory.ABI.makeINavigationViewItemPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        INavigationViewItemPresenterFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NavigationViewItemPresenter {
      val address = segment.toRawLongValue()
      return NavigationViewItemPresenter(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewItemPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IconProperty() =
        ABI.INavigationViewItemPresenterStatics_Instance.get_IconProperty()

    public fun get_TemplateSettingsProperty() =
        ABI.INavigationViewItemPresenterStatics_Instance.get_TemplateSettingsProperty()

    public fun get_InfoBadgeProperty() =
        ABI.INavigationViewItemPresenterStatics2_Instance.get_InfoBadgeProperty()
  }
}
