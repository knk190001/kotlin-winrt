package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.Media.Animation.INavigationTransitionInfoFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.NavigationTransitionInfo;{25bb17fb-6e15-514e-b278-197537a4d990})")
@WinRTByReference(brClass = NavigationTransitionInfo.ByReference::class)
public open class NavigationTransitionInfo(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), INavigationTransitionInfo.WithDefault,
    INavigationTransitionInfoOverrides.WithDefault, IWinRTObject {
  private val __1254482898_Interface: INavigationTransitionInfo.WithDefault by lazy {
    as_1254482898()
  }


  private val __785987979_Interface: INavigationTransitionInfoOverrides.WithDefault by lazy {
    as_785987979()
  }


  public override val __1254482898_Ptr: JNAPointer? by lazy {
    __1254482898_Interface.__1254482898_Ptr
  }


  public override val __785987979_Ptr: JNAPointer? by lazy {
    __785987979_Interface.__785987979_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1254482898_Interface, __785987979_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1254482898(): INavigationTransitionInfo.WithDefault {
    if(pointer == NULL) {
      return(INavigationTransitionInfo.ABI.makeINavigationTransitionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationTransitionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationTransitionInfo.ABI.makeINavigationTransitionInfo(ref.value))
  }

  private fun as_785987979(): INavigationTransitionInfoOverrides.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.NavigationTransitionInfo".toHandle(),refiid,factoryActivatorPtr)
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
