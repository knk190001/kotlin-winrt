package Microsoft.UI.Xaml.Controls

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

@ABIMarker(NavigationViewItemBase.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.NavigationViewItemBase;{33586494-af48-513f-be4d-f645e8c89005})")
@WinRTByReference(brClass = NavigationViewItemBase.ByReference::class)
public open class NavigationViewItemBase(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), INavigationViewItemBase.WithDefault, INavigationViewItemBase2.WithDefault,
    IWinRTObject {
  private val __786993916_Interface: INavigationViewItemBase.WithDefault by lazy {
    as_786993916()
  }


  private val __1372992430_Interface: INavigationViewItemBase2.WithDefault by lazy {
    as_1372992430()
  }


  public override val __786993916_Ptr: JNAPointer? by lazy {
    __786993916_Interface.__786993916_Ptr
  }


  public override val __1372992430_Ptr: JNAPointer? by lazy {
    __1372992430_Interface.__1372992430_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__786993916_Interface, __1372992430_Interface)

  private fun as_786993916(): INavigationViewItemBase.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemBase.ABI.makeINavigationViewItemBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemBase.ABI.makeINavigationViewItemBase(ref.value))
  }

  private fun as_1372992430(): INavigationViewItemBase2.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemBase2.ABI.makeINavigationViewItemBase2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemBase2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemBase2.ABI.makeINavigationViewItemBase2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewItemBase> {
    public override fun getValue() = NavigationViewItemBase(pointer.getPointer(0))

    public fun setValue(value: NavigationViewItemBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewItemBase, MemoryAddress> {
    public val INavigationViewItemBaseStatics_Instance: INavigationViewItemBaseStatics by lazy {
      createINavigationViewItemBaseStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewItemBaseStatics(): INavigationViewItemBaseStatics {
      val refiid = Guid.REFIID(INavigationViewItemBaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.NavigationViewItemBase".toHandle(),refiid,interfacePtr)
      val result =
          INavigationViewItemBaseStatics.ABI.makeINavigationViewItemBaseStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): NavigationViewItemBase {
      val address = segment.toRawLongValue()
      return NavigationViewItemBase(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewItemBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsSelectedProperty() =
        ABI.INavigationViewItemBaseStatics_Instance.get_IsSelectedProperty()
  }
}
