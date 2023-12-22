package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.INavigationViewItemHeaderFactory.ABI.IID
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

@ABIMarker(NavigationViewItemHeader.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.NavigationViewItemHeader;{e21df22c-da4a-4e74-9ffc-b163bd7adacd})")
@WinRTByReference(brClass = NavigationViewItemHeader.ByReference::class)
public open class NavigationViewItemHeader(
  ptr: JNAPointer? = NULL
) : NavigationViewItemBase(ptr), INavigationViewItemHeader.WithDefault, IWinRTObject {
  private val __978560853_Interface: INavigationViewItemHeader.WithDefault by lazy {
    as_978560853()
  }


  public override val __978560853_Ptr: JNAPointer? by lazy {
    __978560853_Interface.__978560853_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__978560853_Interface)

  public constructor() : this(ABI.activate())

  private fun as_978560853(): INavigationViewItemHeader.WithDefault {
    if(pointer == NULL) {
      return(INavigationViewItemHeader.ABI.makeINavigationViewItemHeader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationViewItemHeader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationViewItemHeader.ABI.makeINavigationViewItemHeader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationViewItemHeader> {
    public override fun getValue() = NavigationViewItemHeader(pointer.getPointer(0))

    public fun setValue(value: NavigationViewItemHeader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationViewItemHeader, MemoryAddress> {
    public val INavigationViewItemHeaderFactory_Instance: INavigationViewItemHeaderFactory by lazy {
      createINavigationViewItemHeaderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationViewItemHeaderFactory(): INavigationViewItemHeaderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.NavigationViewItemHeader".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INavigationViewItemHeaderFactory.ABI.makeINavigationViewItemHeaderFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        INavigationViewItemHeaderFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NavigationViewItemHeader {
      val address = segment.toRawLongValue()
      return NavigationViewItemHeader(Pointer(address))
    }

    public override fun toNative(obj: NavigationViewItemHeader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
