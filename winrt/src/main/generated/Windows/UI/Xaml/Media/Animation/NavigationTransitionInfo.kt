package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Media.Animation.INavigationTransitionInfoFactory.ABI.IID
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

@ABIMarker(NavigationTransitionInfo.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.NavigationTransitionInfo;{a9b05091-ae4a-4372-8625-21b7a8b98ca4})")
@WinRTByReference(brClass = NavigationTransitionInfo.ByReference::class)
public open class NavigationTransitionInfo(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), INavigationTransitionInfo.WithDefault,
    INavigationTransitionInfoOverrides.WithDefault, IWinRTObject {
  private val __625134301_Interface: INavigationTransitionInfo.WithDefault by lazy {
    as_625134301()
  }


  private val __966419510_Interface: INavigationTransitionInfoOverrides.WithDefault by lazy {
    as_966419510()
  }


  public override val __625134301_Ptr: JNAPointer? by lazy {
    __625134301_Interface.__625134301_Ptr
  }


  public override val __966419510_Ptr: JNAPointer? by lazy {
    __966419510_Interface.__966419510_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__625134301_Interface, __966419510_Interface)

  public constructor() : this(ABI.activate())

  private fun as_625134301(): INavigationTransitionInfo.WithDefault {
    if(pointer == NULL) {
      return(INavigationTransitionInfo.ABI.makeINavigationTransitionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationTransitionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationTransitionInfo.ABI.makeINavigationTransitionInfo(ref.value))
  }

  private fun as_966419510(): INavigationTransitionInfoOverrides.WithDefault {
    if(pointer == NULL) {
      return(INavigationTransitionInfoOverrides.ABI.makeINavigationTransitionInfoOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationTransitionInfoOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationTransitionInfoOverrides.ABI.makeINavigationTransitionInfoOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationTransitionInfo> {
    public override fun getValue() = NavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: NavigationTransitionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationTransitionInfo, MemoryAddress> {
    public val INavigationTransitionInfoFactory_Instance: INavigationTransitionInfoFactory by lazy {
      createINavigationTransitionInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINavigationTransitionInfoFactory(): INavigationTransitionInfoFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.NavigationTransitionInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INavigationTransitionInfoFactory.ABI.makeINavigationTransitionInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        INavigationTransitionInfoFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return NavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: NavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
