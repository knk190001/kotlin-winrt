package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.INavigationViewListFactory.ABI.IID
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

@ABIMarker(NavigationViewList.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.NavigationViewList;{4f726f85-5ce0-48cd-8ef2-1a29458a3404})")
@WinRTByReference(brClass = NavigationViewList.ByReference::class)
public open class NavigationViewList(
  ptr: JNAPointer? = NULL
) : ListView(ptr), INavigationViewList.WithDefault, IWinRTObject {
  private val __1651200973_Interface: INavigationViewList.WithDefault by lazy {
    as_1651200973()
  }


  public override val __1651200973_Ptr: JNAPointer? by lazy {
    __1651200973_Interface.__1651200973_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1651200973_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1651200973(): INavigationViewList.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewList.ABI.makeINavigationViewList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewList.ABI.makeINavigationViewList(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewList> {
    public override fun getValue() = NavigationViewList(pointer.getPointer(0))

    public fun setValue(value: NavigationViewList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewList, MemoryAddress> {
    public val INavigationViewListFactory_Instance: INavigationViewListFactory by lazy {
      createINavigationViewListFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewListFactory(): INavigationViewListFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.NavigationViewList".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INavigationViewListFactory.ABI.makeINavigationViewListFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = INavigationViewListFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NavigationViewList {
      val address = segment.toRawLongValue()
      return NavigationViewList(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
