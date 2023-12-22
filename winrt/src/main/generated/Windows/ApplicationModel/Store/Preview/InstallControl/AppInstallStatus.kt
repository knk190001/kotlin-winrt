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

@ABIMarker(AppInstallStatus.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallStatus;{936dccfa-2450-4126-88b1-6127a644dd5c})")
@WinRTByReference(brClass = AppInstallStatus.ByReference::class)
public class AppInstallStatus(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppInstallStatus.WithDefault, IAppInstallStatus2.WithDefault,
    IAppInstallStatus3.WithDefault, IWinRTObject {
  private val __353590582_Interface: IAppInstallStatus.WithDefault by lazy {
    as_353590582()
  }


  private val __1923593796_Interface: IAppInstallStatus2.WithDefault by lazy {
    as_1923593796()
  }


  private val __1923593795_Interface: IAppInstallStatus3.WithDefault by lazy {
    as_1923593795()
  }


  public override val __353590582_Ptr: JNAPointer? by lazy {
    __353590582_Interface.__353590582_Ptr
  }


  public override val __1923593796_Ptr: JNAPointer? by lazy {
    __1923593796_Interface.__1923593796_Ptr
  }


  public override val __1923593795_Ptr: JNAPointer? by lazy {
    __1923593795_Interface.__1923593795_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__353590582_Interface, __1923593796_Interface, __1923593795_Interface)

  private fun as_353590582(): IAppInstallStatus.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallStatus.ABI.makeIAppInstallStatus(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallStatus>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallStatus.ABI.makeIAppInstallStatus(ref.value))
  }

  private fun as_1923593796(): IAppInstallStatus2.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallStatus2.ABI.makeIAppInstallStatus2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallStatus2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallStatus2.ABI.makeIAppInstallStatus2(ref.value))
  }

  private fun as_1923593795(): IAppInstallStatus3.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallStatus3.ABI.makeIAppInstallStatus3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallStatus3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallStatus3.ABI.makeIAppInstallStatus3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppInstallStatus> {
    public override fun getValue() = AppInstallStatus(pointer.getPointer(0))

    public fun setValue(value: AppInstallStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppInstallStatus, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppInstallStatus {
      val address = segment.toRawLongValue()
      return AppInstallStatus(Pointer(address))
    }

    public override fun toNative(obj: AppInstallStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
