package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAppBarFactory.ABI.IID
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

@ABIMarker(AppBar.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AppBar;{3d8c2927-5ac5-51bb-8bec-13ff4c1bd6c8})")
@WinRTByReference(brClass = AppBar.ByReference::class)
public open class AppBar(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IAppBar.WithDefault, IAppBarOverrides.WithDefault, IWinRTObject {
  private val __1851156153_Interface: IAppBar.WithDefault by lazy {
    as_1851156153()
  }


  private val __1766692718_Interface: IAppBarOverrides.WithDefault by lazy {
    as_1766692718()
  }


  public override val __1851156153_Ptr: JNAPointer? by lazy {
    __1851156153_Interface.__1851156153_Ptr
  }


  public override val __1766692718_Ptr: JNAPointer? by lazy {
    __1766692718_Interface.__1766692718_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1851156153_Interface, __1766692718_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1851156153(): IAppBar.WithDefault {
    if(pointer == NULL) {
      return(IAppBar.ABI.makeIAppBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBar.ABI.makeIAppBar(ref.value))
  }

  private fun as_1766692718(): IAppBarOverrides.WithDefault {
    if(pointer == NULL) {
      return(IAppBarOverrides.ABI.makeIAppBarOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarOverrides.ABI.makeIAppBarOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppBar> {
    public override fun getValue() = AppBar(pointer.getPointer(0))

    public fun setValue(value: AppBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBar, MemoryAddress> {
    public val IAppBarStatics_Instance: IAppBarStatics by lazy {
      createIAppBarStatics()
    }


    public val IAppBarFactory_Instance: IAppBarFactory by lazy {
      createIAppBarFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarStatics(): IAppBarStatics {
      val refiid = Guid.REFIID(IAppBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AppBar".toHandle(),refiid,interfacePtr)
      val result = IAppBarStatics.ABI.makeIAppBarStatics(interfacePtr.value)
      return result
    }

    public fun createIAppBarFactory(): IAppBarFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AppBar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppBarFactory.ABI.makeIAppBarFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAppBarFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppBar {
      val address = segment.toRawLongValue()
      return AppBar(Pointer(address))
    }

    public override fun toNative(obj: AppBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsOpenProperty() = ABI.IAppBarStatics_Instance.get_IsOpenProperty()

    public fun get_IsStickyProperty() = ABI.IAppBarStatics_Instance.get_IsStickyProperty()

    public fun get_ClosedDisplayModeProperty() =
        ABI.IAppBarStatics_Instance.get_ClosedDisplayModeProperty()

    public fun get_LightDismissOverlayModeProperty() =
        ABI.IAppBarStatics_Instance.get_LightDismissOverlayModeProperty()
  }
}
