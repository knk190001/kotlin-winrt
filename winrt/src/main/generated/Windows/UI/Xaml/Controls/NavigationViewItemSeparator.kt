package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.INavigationViewItemSeparatorFactory.ABI.IID
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

@ABIMarker(NavigationViewItemSeparator.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.NavigationViewItemSeparator;{de62c951-bb9b-471e-83e3-af4791e7096a})")
@WinRTByReference(brClass = NavigationViewItemSeparator.ByReference::class)
public open class NavigationViewItemSeparator(
  ptr: JNAPointer? = NULL
) : NavigationViewItemBase(ptr), INavigationViewItemSeparator.WithDefault, IWinRTObject {
  private val __14584093_Interface: INavigationViewItemSeparator.WithDefault by lazy {
    as_14584093()
  }


  public override val __14584093_Ptr: JNAPointer? by lazy {
    __14584093_Interface.__14584093_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__14584093_Interface)

  public constructor() : this(ABI.activate())

  private fun as_14584093(): INavigationViewItemSeparator.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemSeparator.ABI.makeINavigationViewItemSeparator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemSeparator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemSeparator.ABI.makeINavigationViewItemSeparator(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewItemSeparator> {
    public override fun getValue() = NavigationViewItemSeparator(pointer.getPointer(0))

    public fun setValue(value: NavigationViewItemSeparator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewItemSeparator, MemoryAddress> {
    public val INavigationViewItemSeparatorFactory_Instance: INavigationViewItemSeparatorFactory by
        lazy {
      createINavigationViewItemSeparatorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewItemSeparatorFactory(): INavigationViewItemSeparatorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.NavigationViewItemSeparator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INavigationViewItemSeparatorFactory.ABI.makeINavigationViewItemSeparatorFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        INavigationViewItemSeparatorFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NavigationViewItemSeparator {
      val address = segment.toRawLongValue()
      return NavigationViewItemSeparator(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewItemSeparator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
