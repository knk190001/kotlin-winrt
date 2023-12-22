package Windows.ApplicationModel.AppService

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

@ABIMarker(AppServiceTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppService.AppServiceTriggerDetails;{88a2dcac-ad28-41b8-80bb-bdf1b2169e19})")
@WinRTByReference(brClass = AppServiceTriggerDetails.ByReference::class)
public class AppServiceTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppServiceTriggerDetails.WithDefault, IAppServiceTriggerDetails2.WithDefault,
    IAppServiceTriggerDetails3.WithDefault, IAppServiceTriggerDetails4.WithDefault, IWinRTObject {
  private val __876434071_Interface: IAppServiceTriggerDetails.WithDefault by lazy {
    as_876434071()
  }


  private val __1399652375_Interface: IAppServiceTriggerDetails2.WithDefault by lazy {
    as_1399652375()
  }


  private val __1399652374_Interface: IAppServiceTriggerDetails3.WithDefault by lazy {
    as_1399652374()
  }


  private val __1399652373_Interface: IAppServiceTriggerDetails4.WithDefault by lazy {
    as_1399652373()
  }


  public override val __876434071_Ptr: JNAPointer? by lazy {
    __876434071_Interface.__876434071_Ptr
  }


  public override val __1399652375_Ptr: JNAPointer? by lazy {
    __1399652375_Interface.__1399652375_Ptr
  }


  public override val __1399652374_Ptr: JNAPointer? by lazy {
    __1399652374_Interface.__1399652374_Ptr
  }


  public override val __1399652373_Ptr: JNAPointer? by lazy {
    __1399652373_Interface.__1399652373_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__876434071_Interface, __1399652375_Interface, __1399652374_Interface,
        __1399652373_Interface)

  private fun as_876434071(): IAppServiceTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IAppServiceTriggerDetails.ABI.makeIAppServiceTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppServiceTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppServiceTriggerDetails.ABI.makeIAppServiceTriggerDetails(ref.value))
  }

  private fun as_1399652375(): IAppServiceTriggerDetails2.WithDefault {
    if(pointer == NULL) {
      return(IAppServiceTriggerDetails2.ABI.makeIAppServiceTriggerDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppServiceTriggerDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppServiceTriggerDetails2.ABI.makeIAppServiceTriggerDetails2(ref.value))
  }

  private fun as_1399652374(): IAppServiceTriggerDetails3.WithDefault {
    if(pointer == NULL) {
      return(IAppServiceTriggerDetails3.ABI.makeIAppServiceTriggerDetails3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppServiceTriggerDetails3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppServiceTriggerDetails3.ABI.makeIAppServiceTriggerDetails3(ref.value))
  }

  private fun as_1399652373(): IAppServiceTriggerDetails4.WithDefault {
    if(pointer == NULL) {
      return(IAppServiceTriggerDetails4.ABI.makeIAppServiceTriggerDetails4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppServiceTriggerDetails4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppServiceTriggerDetails4.ABI.makeIAppServiceTriggerDetails4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppServiceTriggerDetails> {
    public override fun getValue() = AppServiceTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: AppServiceTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppServiceTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppServiceTriggerDetails {
      val address = segment.toRawLongValue()
      return AppServiceTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: AppServiceTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
