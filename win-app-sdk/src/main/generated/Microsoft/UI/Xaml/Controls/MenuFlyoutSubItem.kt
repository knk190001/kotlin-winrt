package Microsoft.UI.Xaml.Controls

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

@ABIMarker(MenuFlyoutSubItem.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.MenuFlyoutSubItem;{6b0688c1-47b0-53b5-b6f9-5ec5d6623b84})")
@WinRTByReference(brClass = MenuFlyoutSubItem.ByReference::class)
public class MenuFlyoutSubItem(
  ptr: JNAPointer? = NULL
) : MenuFlyoutItemBase(ptr), IMenuFlyoutSubItem.WithDefault, IWinRTObject {
  private val __663699214_Interface: IMenuFlyoutSubItem.WithDefault by lazy {
    as_663699214()
  }


  public override val __663699214_Ptr: JNAPointer? by lazy {
    __663699214_Interface.__663699214_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__663699214_Interface)

  public constructor() : this(ABI.activate())

  private fun as_663699214(): IMenuFlyoutSubItem.WithDefault {
    if(pointer == NULL) {
      return(IMenuFlyoutSubItem.ABI.makeIMenuFlyoutSubItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMenuFlyoutSubItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMenuFlyoutSubItem.ABI.makeIMenuFlyoutSubItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MenuFlyoutSubItem> {
    public override fun getValue() = MenuFlyoutSubItem(pointer.getPointer(0))

    public fun setValue(value: MenuFlyoutSubItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MenuFlyoutSubItem, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMenuFlyoutSubItemStatics_Instance: IMenuFlyoutSubItemStatics by lazy {
      createIMenuFlyoutSubItemStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MenuFlyoutSubItem".toHandle(),
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

    public fun createIMenuFlyoutSubItemStatics(): IMenuFlyoutSubItemStatics {
      val refiid = Guid.REFIID(IMenuFlyoutSubItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MenuFlyoutSubItem".toHandle(),refiid,interfacePtr)
      val result = IMenuFlyoutSubItemStatics.ABI.makeIMenuFlyoutSubItemStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MenuFlyoutSubItem {
      val address = segment.toRawLongValue()
      return MenuFlyoutSubItem(Pointer(address))
    }

    public override fun toNative(obj: MenuFlyoutSubItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TextProperty() = ABI.IMenuFlyoutSubItemStatics_Instance.get_TextProperty()

    public fun get_IconProperty() = ABI.IMenuFlyoutSubItemStatics_Instance.get_IconProperty()
  }
}
