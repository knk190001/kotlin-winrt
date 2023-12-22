package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.ContentControl
import Windows.UI.Xaml.Controls.Primitives.INavigationViewItemPresenterFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.NavigationViewItemPresenter;{9956d3fc-4693-59cb-b6bf-37249058be96})")
@WinRTByReference(brClass = NavigationViewItemPresenter.ByReference::class)
public open class NavigationViewItemPresenter(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), INavigationViewItemPresenter.WithDefault, IWinRTObject {
  private val __1700052448_Interface: INavigationViewItemPresenter.WithDefault by lazy {
    as_1700052448()
  }


  public override val __1700052448_Ptr: JNAPointer? by lazy {
    __1700052448_Interface.__1700052448_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1700052448_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1700052448(): INavigationViewItemPresenter.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemPresenter.ABI.makeINavigationViewItemPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemPresenter.ABI.makeINavigationViewItemPresenter(ref.value))
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


    public val INavigationViewItemPresenterFactory_Instance: INavigationViewItemPresenterFactory by
        lazy {
      createINavigationViewItemPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewItemPresenterStatics(): INavigationViewItemPresenterStatics {
      val refiid = Guid.REFIID(INavigationViewItemPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.NavigationViewItemPresenter".toHandle(),refiid,interfacePtr)
      val result =
          INavigationViewItemPresenterStatics.ABI.makeINavigationViewItemPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createINavigationViewItemPresenterFactory(): INavigationViewItemPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.NavigationViewItemPresenter".toHandle(),refiid,factoryActivatorPtr)
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
  }
}
