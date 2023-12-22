package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(AppInstallItem.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallItem;{49d3dfab-168a-4cbf-a93a-9e448c82737d})")
@WinRTByReference(brClass = AppInstallItem.ByReference::class)
public class AppInstallItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppInstallItem.WithDefault, IAppInstallItem2.WithDefault,
    IAppInstallItem3.WithDefault, IAppInstallItem4.WithDefault, IAppInstallItem5.WithDefault,
    IWinRTObject {
  private val __1908307625_Interface: IAppInstallItem.WithDefault by lazy {
    as_1908307625()
  }


  private val __972005819_Interface: IAppInstallItem2.WithDefault by lazy {
    as_972005819()
  }


  private val __972005820_Interface: IAppInstallItem3.WithDefault by lazy {
    as_972005820()
  }


  private val __972005821_Interface: IAppInstallItem4.WithDefault by lazy {
    as_972005821()
  }


  private val __972005822_Interface: IAppInstallItem5.WithDefault by lazy {
    as_972005822()
  }


  public override val __1908307625_Ptr: JNAPointer? by lazy {
    __1908307625_Interface.__1908307625_Ptr
  }


  public override val __972005819_Ptr: JNAPointer? by lazy {
    __972005819_Interface.__972005819_Ptr
  }


  public override val __972005820_Ptr: JNAPointer? by lazy {
    __972005820_Interface.__972005820_Ptr
  }


  public override val __972005821_Ptr: JNAPointer? by lazy {
    __972005821_Interface.__972005821_Ptr
  }


  public override val __972005822_Ptr: JNAPointer? by lazy {
    __972005822_Interface.__972005822_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1908307625_Interface, __972005819_Interface, __972005820_Interface,
        __972005821_Interface, __972005822_Interface)

  private fun as_1908307625(): IAppInstallItem.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallItem.ABI.makeIAppInstallItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallItem.ABI.makeIAppInstallItem(ref.value))
  }

  private fun as_972005819(): IAppInstallItem2.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallItem2.ABI.makeIAppInstallItem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallItem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallItem2.ABI.makeIAppInstallItem2(ref.value))
  }

  private fun as_972005820(): IAppInstallItem3.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallItem3.ABI.makeIAppInstallItem3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallItem3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallItem3.ABI.makeIAppInstallItem3(ref.value))
  }

  private fun as_972005821(): IAppInstallItem4.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallItem4.ABI.makeIAppInstallItem4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallItem4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallItem4.ABI.makeIAppInstallItem4(ref.value))
  }

  private fun as_972005822(): IAppInstallItem5.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallItem5.ABI.makeIAppInstallItem5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallItem5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallItem5.ABI.makeIAppInstallItem5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppInstallItem>
      {
    public override fun getValue() = AppInstallItem(pointer.getPointer(0))

    public fun setValue(value: AppInstallItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppInstallItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppInstallItem {
      val address = segment.toRawLongValue()
      return AppInstallItem(Pointer(address))
    }

    public override fun toNative(obj: AppInstallItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
