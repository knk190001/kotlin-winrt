package Windows.System

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AppDiagnosticInfo.ABI::class)
@Signature("rc(Windows.System.AppDiagnosticInfo;{e348a69a-8889-4ca3-be07-d5ffff5f0804})")
@WinRTByReference(brClass = AppDiagnosticInfo.ByReference::class)
public class AppDiagnosticInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppDiagnosticInfo.WithDefault, IAppDiagnosticInfo2.WithDefault,
    IAppDiagnosticInfo3.WithDefault, IWinRTObject {
  private val __1784887833_Interface: IAppDiagnosticInfo.WithDefault by lazy {
    as_1784887833()
  }


  private val __503052075_Interface: IAppDiagnosticInfo2.WithDefault by lazy {
    as_503052075()
  }


  private val __503052076_Interface: IAppDiagnosticInfo3.WithDefault by lazy {
    as_503052076()
  }


  public override val __1784887833_Ptr: JNAPointer? by lazy {
    __1784887833_Interface.__1784887833_Ptr
  }


  public override val __503052075_Ptr: JNAPointer? by lazy {
    __503052075_Interface.__503052075_Ptr
  }


  public override val __503052076_Ptr: JNAPointer? by lazy {
    __503052076_Interface.__503052076_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1784887833_Interface, __503052075_Interface, __503052076_Interface)

  private fun as_1784887833(): IAppDiagnosticInfo.WithDefault {
    if(pointer == NULL) {
      return(IAppDiagnosticInfo.ABI.makeIAppDiagnosticInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppDiagnosticInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppDiagnosticInfo.ABI.makeIAppDiagnosticInfo(ref.value))
  }

  private fun as_503052075(): IAppDiagnosticInfo2.WithDefault {
    if(pointer == NULL) {
      return(IAppDiagnosticInfo2.ABI.makeIAppDiagnosticInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppDiagnosticInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppDiagnosticInfo2.ABI.makeIAppDiagnosticInfo2(ref.value))
  }

  private fun as_503052076(): IAppDiagnosticInfo3.WithDefault {
    if(pointer == NULL) {
      return(IAppDiagnosticInfo3.ABI.makeIAppDiagnosticInfo3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppDiagnosticInfo3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppDiagnosticInfo3.ABI.makeIAppDiagnosticInfo3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppDiagnosticInfo> {
    public override fun getValue() = AppDiagnosticInfo(pointer.getPointer(0))

    public fun setValue(value: AppDiagnosticInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppDiagnosticInfo, MemoryAddress> {
    public val IAppDiagnosticInfoStatics_Instance: IAppDiagnosticInfoStatics by lazy {
      createIAppDiagnosticInfoStatics()
    }


    public val IAppDiagnosticInfoStatics2_Instance: IAppDiagnosticInfoStatics2 by lazy {
      createIAppDiagnosticInfoStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppDiagnosticInfoStatics(): IAppDiagnosticInfoStatics {
      val refiid = Guid.REFIID(IAppDiagnosticInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.AppDiagnosticInfo".toHandle(),refiid,interfacePtr)
      val result = IAppDiagnosticInfoStatics.ABI.makeIAppDiagnosticInfoStatics(interfacePtr.value)
      return result
    }

    public fun createIAppDiagnosticInfoStatics2(): IAppDiagnosticInfoStatics2 {
      val refiid = Guid.REFIID(IAppDiagnosticInfoStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.AppDiagnosticInfo".toHandle(),refiid,interfacePtr)
      val result = IAppDiagnosticInfoStatics2.ABI.makeIAppDiagnosticInfoStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppDiagnosticInfo {
      val address = segment.toRawLongValue()
      return AppDiagnosticInfo(Pointer(address))
    }

    public override fun toNative(obj: AppDiagnosticInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestInfoAsync() = ABI.IAppDiagnosticInfoStatics_Instance.RequestInfoAsync()

    public fun CreateWatcher() = ABI.IAppDiagnosticInfoStatics2_Instance.CreateWatcher()

    public fun RequestAccessAsync() = ABI.IAppDiagnosticInfoStatics2_Instance.RequestAccessAsync()

    public fun RequestInfoForPackageAsync(packageFamilyName: String) =
        ABI.IAppDiagnosticInfoStatics2_Instance.RequestInfoForPackageAsync(packageFamilyName)

    public fun RequestInfoForAppAsync() =
        ABI.IAppDiagnosticInfoStatics2_Instance.RequestInfoForAppAsync()

    public fun RequestInfoForAppAsync(appUserModelId: String) =
        ABI.IAppDiagnosticInfoStatics2_Instance.RequestInfoForAppAsync(appUserModelId)
  }
}
