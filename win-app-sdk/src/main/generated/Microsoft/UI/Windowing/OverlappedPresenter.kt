package Microsoft.UI.Windowing

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

@ABIMarker(OverlappedPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Windowing.OverlappedPresenter;{21693970-4f4c-5172-9e9d-682a2d174884})")
@WinRTByReference(brClass = OverlappedPresenter.ByReference::class)
public class OverlappedPresenter(
  ptr: JNAPointer? = NULL
) : AppWindowPresenter(ptr), IOverlappedPresenter.WithDefault, IOverlappedPresenter2.WithDefault,
    IWinRTObject {
  private val __307680559_Interface: IOverlappedPresenter.WithDefault by lazy {
    as_307680559()
  }


  private val __948162787_Interface: IOverlappedPresenter2.WithDefault by lazy {
    as_948162787()
  }


  public override val __307680559_Ptr: JNAPointer? by lazy {
    __307680559_Interface.__307680559_Ptr
  }


  public override val __948162787_Ptr: JNAPointer? by lazy {
    __948162787_Interface.__948162787_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__307680559_Interface, __948162787_Interface)

  private fun as_307680559(): IOverlappedPresenter.WithDefault {
    if(pointer == NULL) {
      return(IOverlappedPresenter.ABI.makeIOverlappedPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOverlappedPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOverlappedPresenter.ABI.makeIOverlappedPresenter(ref.value))
  }

  private fun as_948162787(): IOverlappedPresenter2.WithDefault {
    if(pointer == NULL) {
      return(IOverlappedPresenter2.ABI.makeIOverlappedPresenter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOverlappedPresenter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOverlappedPresenter2.ABI.makeIOverlappedPresenter2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OverlappedPresenter> {
    public override fun getValue() = OverlappedPresenter(pointer.getPointer(0))

    public fun setValue(value: OverlappedPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OverlappedPresenter, MemoryAddress> {
    public val IOverlappedPresenterStatics_Instance: IOverlappedPresenterStatics by lazy {
      createIOverlappedPresenterStatics()
    }


    public val IOverlappedPresenterStatics2_Instance: IOverlappedPresenterStatics2 by lazy {
      createIOverlappedPresenterStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIOverlappedPresenterStatics(): IOverlappedPresenterStatics {
      val refiid = Guid.REFIID(IOverlappedPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Windowing.OverlappedPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IOverlappedPresenterStatics.ABI.makeIOverlappedPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIOverlappedPresenterStatics2(): IOverlappedPresenterStatics2 {
      val refiid = Guid.REFIID(IOverlappedPresenterStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Windowing.OverlappedPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IOverlappedPresenterStatics2.ABI.makeIOverlappedPresenterStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): OverlappedPresenter {
      val address = segment.toRawLongValue()
      return OverlappedPresenter(Pointer(address))
    }

    public override fun toNative(obj: OverlappedPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create() = ABI.IOverlappedPresenterStatics_Instance.Create()

    public fun CreateForContextMenu() =
        ABI.IOverlappedPresenterStatics_Instance.CreateForContextMenu()

    public fun CreateForDialog() = ABI.IOverlappedPresenterStatics_Instance.CreateForDialog()

    public fun CreateForToolWindow() =
        ABI.IOverlappedPresenterStatics_Instance.CreateForToolWindow()

    public fun get_RequestedStartupState() =
        ABI.IOverlappedPresenterStatics2_Instance.get_RequestedStartupState()
  }
}
