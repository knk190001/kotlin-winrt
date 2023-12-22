package Windows.ApplicationModel

import Windows.System.User
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppInfo;{cf7f59b3-6a09-4de8-a6c0-5792d56880d1})")
@WinRTByReference(brClass = AppInfo.ByReference::class)
public class AppInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppInfo.WithDefault, IAppInfo2.WithDefault, IAppInfo3.WithDefault,
    IAppInfo4.WithDefault, IWinRTObject {
  private val __1551633942_Interface: IAppInfo.WithDefault by lazy {
    as_1551633942()
  }


  private val __856011896_Interface: IAppInfo2.WithDefault by lazy {
    as_856011896()
  }


  private val __856011895_Interface: IAppInfo3.WithDefault by lazy {
    as_856011895()
  }


  private val __856011894_Interface: IAppInfo4.WithDefault by lazy {
    as_856011894()
  }


  public override val __1551633942_Ptr: JNAPointer? by lazy {
    __1551633942_Interface.__1551633942_Ptr
  }


  public override val __856011896_Ptr: JNAPointer? by lazy {
    __856011896_Interface.__856011896_Ptr
  }


  public override val __856011895_Ptr: JNAPointer? by lazy {
    __856011895_Interface.__856011895_Ptr
  }


  public override val __856011894_Ptr: JNAPointer? by lazy {
    __856011894_Interface.__856011894_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1551633942_Interface, __856011896_Interface, __856011895_Interface,
        __856011894_Interface)

  private fun as_1551633942(): IAppInfo.WithDefault {
    if(pointer == NULL) {
      return(IAppInfo.ABI.makeIAppInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInfo.ABI.makeIAppInfo(ref.value))
  }

  private fun as_856011896(): IAppInfo2.WithDefault {
    if(pointer == NULL) {
      return(IAppInfo2.ABI.makeIAppInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInfo2.ABI.makeIAppInfo2(ref.value))
  }

  private fun as_856011895(): IAppInfo3.WithDefault {
    if(pointer == NULL) {
      return(IAppInfo3.ABI.makeIAppInfo3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInfo3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInfo3.ABI.makeIAppInfo3(ref.value))
  }

  private fun as_856011894(): IAppInfo4.WithDefault {
    if(pointer == NULL) {
      return(IAppInfo4.ABI.makeIAppInfo4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInfo4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInfo4.ABI.makeIAppInfo4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AppInfo> {
    public override fun getValue() = AppInfo(pointer.getPointer(0))

    public fun setValue(value: AppInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppInfo, MemoryAddress> {
    public val IAppInfoStatics_Instance: IAppInfoStatics by lazy {
      createIAppInfoStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppInfoStatics(): IAppInfoStatics {
      val refiid = Guid.REFIID(IAppInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.AppInfo".toHandle(),refiid,interfacePtr)
      val result = IAppInfoStatics.ABI.makeIAppInfoStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppInfo {
      val address = segment.toRawLongValue()
      return AppInfo(Pointer(address))
    }

    public override fun toNative(obj: AppInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.IAppInfoStatics_Instance.get_Current()

    public fun GetFromAppUserModelId(appUserModelId: String) =
        ABI.IAppInfoStatics_Instance.GetFromAppUserModelId(appUserModelId)

    public fun GetFromAppUserModelIdForUser(user: User, appUserModelId: String) =
        ABI.IAppInfoStatics_Instance.GetFromAppUserModelIdForUser(user, appUserModelId)
  }
}
