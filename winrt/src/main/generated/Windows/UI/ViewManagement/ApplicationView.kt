package Windows.UI.ViewManagement

import Windows.Foundation.Size
import Windows.UI.Core.ICoreWindow
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ApplicationView.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.ApplicationView;{d222d519-4361-451e-96c4-60f4f9742db0})")
@WinRTByReference(brClass = ApplicationView.ByReference::class)
public class ApplicationView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IApplicationView.WithDefault, IApplicationView2.WithDefault,
    IApplicationView3.WithDefault, IApplicationView4.WithDefault, IApplicationView7.WithDefault,
    IApplicationView9.WithDefault, IApplicationViewWithContext.WithDefault, IWinRTObject {
  private val __1867806909_Interface: IApplicationView.WithDefault by lazy {
    as_1867806909()
  }


  private val __2067439281_Interface: IApplicationView2.WithDefault by lazy {
    as_2067439281()
  }


  private val __2067439280_Interface: IApplicationView3.WithDefault by lazy {
    as_2067439280()
  }


  private val __2067439279_Interface: IApplicationView4.WithDefault by lazy {
    as_2067439279()
  }


  private val __2067439276_Interface: IApplicationView7.WithDefault by lazy {
    as_2067439276()
  }


  private val __2067439274_Interface: IApplicationView9.WithDefault by lazy {
    as_2067439274()
  }


  private val __1651301062_Interface: IApplicationViewWithContext.WithDefault by lazy {
    as_1651301062()
  }


  public override val __1867806909_Ptr: JNAPointer? by lazy {
    __1867806909_Interface.__1867806909_Ptr
  }


  public override val __2067439281_Ptr: JNAPointer? by lazy {
    __2067439281_Interface.__2067439281_Ptr
  }


  public override val __2067439280_Ptr: JNAPointer? by lazy {
    __2067439280_Interface.__2067439280_Ptr
  }


  public override val __2067439279_Ptr: JNAPointer? by lazy {
    __2067439279_Interface.__2067439279_Ptr
  }


  public override val __2067439276_Ptr: JNAPointer? by lazy {
    __2067439276_Interface.__2067439276_Ptr
  }


  public override val __2067439274_Ptr: JNAPointer? by lazy {
    __2067439274_Interface.__2067439274_Ptr
  }


  public override val __1651301062_Ptr: JNAPointer? by lazy {
    __1651301062_Interface.__1651301062_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1867806909_Interface, __2067439281_Interface, __2067439280_Interface,
        __2067439279_Interface, __2067439276_Interface, __2067439274_Interface,
        __1651301062_Interface)

  private fun as_1867806909(): IApplicationView.WithDefault {
    if(pointer == NULL) {
      return(IApplicationView.ABI.makeIApplicationView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationView.ABI.makeIApplicationView(ref.value))
  }

  private fun as_2067439281(): IApplicationView2.WithDefault {
    if(pointer == NULL) {
      return(IApplicationView2.ABI.makeIApplicationView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationView2.ABI.makeIApplicationView2(ref.value))
  }

  private fun as_2067439280(): IApplicationView3.WithDefault {
    if(pointer == NULL) {
      return(IApplicationView3.ABI.makeIApplicationView3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationView3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationView3.ABI.makeIApplicationView3(ref.value))
  }

  private fun as_2067439279(): IApplicationView4.WithDefault {
    if(pointer == NULL) {
      return(IApplicationView4.ABI.makeIApplicationView4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationView4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationView4.ABI.makeIApplicationView4(ref.value))
  }

  private fun as_2067439276(): IApplicationView7.WithDefault {
    if(pointer == NULL) {
      return(IApplicationView7.ABI.makeIApplicationView7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationView7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationView7.ABI.makeIApplicationView7(ref.value))
  }

  private fun as_2067439274(): IApplicationView9.WithDefault {
    if(pointer == NULL) {
      return(IApplicationView9.ABI.makeIApplicationView9(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationView9>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationView9.ABI.makeIApplicationView9(ref.value))
  }

  private fun as_1651301062(): IApplicationViewWithContext.WithDefault {
    if(pointer == NULL) {
      return(IApplicationViewWithContext.ABI.makeIApplicationViewWithContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationViewWithContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationViewWithContext.ABI.makeIApplicationViewWithContext(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationView> {
    public override fun getValue() = ApplicationView(pointer.getPointer(0))

    public fun setValue(value: ApplicationView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationView, MemoryAddress> {
    public val IApplicationViewStatics4_Instance: IApplicationViewStatics4 by lazy {
      createIApplicationViewStatics4()
    }


    public val IApplicationViewStatics2_Instance: IApplicationViewStatics2 by lazy {
      createIApplicationViewStatics2()
    }


    public val IApplicationViewStatics_Instance: IApplicationViewStatics by lazy {
      createIApplicationViewStatics()
    }


    public val IApplicationViewStatics3_Instance: IApplicationViewStatics3 by lazy {
      createIApplicationViewStatics3()
    }


    public val IApplicationViewInteropStatics_Instance: IApplicationViewInteropStatics by lazy {
      createIApplicationViewInteropStatics()
    }


    public val IApplicationViewFullscreenStatics_Instance: IApplicationViewFullscreenStatics by
        lazy {
      createIApplicationViewFullscreenStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIApplicationViewStatics4(): IApplicationViewStatics4 {
      val refiid = Guid.REFIID(IApplicationViewStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationView".toHandle(),refiid,interfacePtr)
      val result = IApplicationViewStatics4.ABI.makeIApplicationViewStatics4(interfacePtr.value)
      return result
    }

    public fun createIApplicationViewStatics2(): IApplicationViewStatics2 {
      val refiid = Guid.REFIID(IApplicationViewStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationView".toHandle(),refiid,interfacePtr)
      val result = IApplicationViewStatics2.ABI.makeIApplicationViewStatics2(interfacePtr.value)
      return result
    }

    public fun createIApplicationViewStatics(): IApplicationViewStatics {
      val refiid = Guid.REFIID(IApplicationViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationView".toHandle(),refiid,interfacePtr)
      val result = IApplicationViewStatics.ABI.makeIApplicationViewStatics(interfacePtr.value)
      return result
    }

    public fun createIApplicationViewStatics3(): IApplicationViewStatics3 {
      val refiid = Guid.REFIID(IApplicationViewStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationView".toHandle(),refiid,interfacePtr)
      val result = IApplicationViewStatics3.ABI.makeIApplicationViewStatics3(interfacePtr.value)
      return result
    }

    public fun createIApplicationViewInteropStatics(): IApplicationViewInteropStatics {
      val refiid = Guid.REFIID(IApplicationViewInteropStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationView".toHandle(),refiid,interfacePtr)
      val result =
          IApplicationViewInteropStatics.ABI.makeIApplicationViewInteropStatics(interfacePtr.value)
      return result
    }

    public fun createIApplicationViewFullscreenStatics(): IApplicationViewFullscreenStatics {
      val refiid = Guid.REFIID(IApplicationViewFullscreenStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationView".toHandle(),refiid,interfacePtr)
      val result =
          IApplicationViewFullscreenStatics.ABI.makeIApplicationViewFullscreenStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ApplicationView {
      val address = segment.toRawLongValue()
      return ApplicationView(Pointer(address))
    }

    public override fun toNative(obj: ApplicationView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ClearAllPersistedState() =
        ABI.IApplicationViewStatics4_Instance.ClearAllPersistedState()

    public fun ClearPersistedState(key: String) =
        ABI.IApplicationViewStatics4_Instance.ClearPersistedState(key)

    public fun GetForCurrentView() = ABI.IApplicationViewStatics2_Instance.GetForCurrentView()

    public fun get_TerminateAppOnFinalViewClose() =
        ABI.IApplicationViewStatics2_Instance.get_TerminateAppOnFinalViewClose()

    public fun put_TerminateAppOnFinalViewClose(value: Boolean) =
        ABI.IApplicationViewStatics2_Instance.put_TerminateAppOnFinalViewClose(value)

    public fun get_Value() = ABI.IApplicationViewStatics_Instance.get_Value()

    public fun TryUnsnap() = ABI.IApplicationViewStatics_Instance.TryUnsnap()

    public fun get_PreferredLaunchWindowingMode() =
        ABI.IApplicationViewStatics3_Instance.get_PreferredLaunchWindowingMode()

    public fun put_PreferredLaunchWindowingMode(value: ApplicationViewWindowingMode) =
        ABI.IApplicationViewStatics3_Instance.put_PreferredLaunchWindowingMode(value)

    public fun get_PreferredLaunchViewSize() =
        ABI.IApplicationViewStatics3_Instance.get_PreferredLaunchViewSize()

    public fun put_PreferredLaunchViewSize(value: Size) =
        ABI.IApplicationViewStatics3_Instance.put_PreferredLaunchViewSize(value)

    public fun GetApplicationViewIdForWindow(window: ICoreWindow) =
        ABI.IApplicationViewInteropStatics_Instance.GetApplicationViewIdForWindow(window)

    public fun TryUnsnapToFullscreen() =
        ABI.IApplicationViewFullscreenStatics_Instance.TryUnsnapToFullscreen()
  }
}
