package Microsoft.UI.Windowing

import Microsoft.UI.Dispatching.DispatcherQueue
import Microsoft.UI.WindowId
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppWindow.ABI::class)
@Signature("rc(Microsoft.UI.Windowing.AppWindow;{cfa788b3-643b-5c5e-ad4e-321d48a82acd})")
@WinRTByReference(brClass = AppWindow.ByReference::class)
public class AppWindow(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppWindow.WithDefault, IAppWindow2.WithDefault, IAppWindow3.WithDefault,
    IWinRTObject {
  private val __77393216_Interface: IAppWindow.WithDefault by lazy {
    as_77393216()
  }


  private val __1895777550_Interface: IAppWindow2.WithDefault by lazy {
    as_1895777550()
  }


  private val __1895777549_Interface: IAppWindow3.WithDefault by lazy {
    as_1895777549()
  }


  public override val __77393216_Ptr: JNAPointer? by lazy {
    __77393216_Interface.__77393216_Ptr
  }


  public override val __1895777550_Ptr: JNAPointer? by lazy {
    __1895777550_Interface.__1895777550_Ptr
  }


  public override val __1895777549_Ptr: JNAPointer? by lazy {
    __1895777549_Interface.__1895777549_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__77393216_Interface, __1895777550_Interface, __1895777549_Interface)

  private fun as_77393216(): IAppWindow.WithDefault {
    if(pointer == NULL) {
      return(IAppWindow.ABI.makeIAppWindow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindow.ABI.makeIAppWindow(ref.value))
  }

  private fun as_1895777550(): IAppWindow2.WithDefault {
    if(pointer == NULL) {
      return(IAppWindow2.ABI.makeIAppWindow2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindow2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindow2.ABI.makeIAppWindow2(ref.value))
  }

  private fun as_1895777549(): IAppWindow3.WithDefault {
    if(pointer == NULL) {
      return(IAppWindow3.ABI.makeIAppWindow3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppWindow3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppWindow3.ABI.makeIAppWindow3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppWindow> {
    public override fun getValue() = AppWindow(pointer.getPointer(0))

    public fun setValue(value: AppWindow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppWindow, MemoryAddress> {
    public val IAppWindowStatics2_Instance: IAppWindowStatics2 by lazy {
      createIAppWindowStatics2()
    }


    public val IAppWindowStatics_Instance: IAppWindowStatics by lazy {
      createIAppWindowStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppWindowStatics2(): IAppWindowStatics2 {
      val refiid = Guid.REFIID(IAppWindowStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Windowing.AppWindow".toHandle(),refiid,interfacePtr)
      val result = IAppWindowStatics2.ABI.makeIAppWindowStatics2(interfacePtr.value)
      return result
    }

    public fun createIAppWindowStatics(): IAppWindowStatics {
      val refiid = Guid.REFIID(IAppWindowStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Windowing.AppWindow".toHandle(),refiid,interfacePtr)
      val result = IAppWindowStatics.ABI.makeIAppWindowStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppWindow {
      val address = segment.toRawLongValue()
      return AppWindow(Pointer(address))
    }

    public override fun toNative(obj: AppWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(
      appWindowPresenter: AppWindowPresenter,
      ownerWindowId: WindowId,
      DispatcherQueue: DispatcherQueue
    ) = ABI.IAppWindowStatics2_Instance.Create(appWindowPresenter, ownerWindowId, DispatcherQueue)

    public fun Create() = ABI.IAppWindowStatics_Instance.Create()

    public fun Create(appWindowPresenter: AppWindowPresenter) =
        ABI.IAppWindowStatics_Instance.Create(appWindowPresenter)

    public fun Create(appWindowPresenter: AppWindowPresenter, ownerWindowId: WindowId) =
        ABI.IAppWindowStatics_Instance.Create(appWindowPresenter, ownerWindowId)

    public fun GetFromWindowId(windowId: WindowId) =
        ABI.IAppWindowStatics_Instance.GetFromWindowId(windowId)
  }
}
