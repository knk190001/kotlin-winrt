package Windows.ApplicationModel

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

@ABIMarker(AppInstallerInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppInstallerInfo;{29ab2ac0-d4f6-42a3-adcd-d6583c659508})")
@WinRTByReference(brClass = AppInstallerInfo.ByReference::class)
public class AppInstallerInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppInstallerInfo.WithDefault, IAppInstallerInfo2.WithDefault, IWinRTObject {
  private val __1750704794_Interface: IAppInstallerInfo.WithDefault by lazy {
    as_1750704794()
  }


  private val __1562726184_Interface: IAppInstallerInfo2.WithDefault by lazy {
    as_1562726184()
  }


  public override val __1750704794_Ptr: JNAPointer? by lazy {
    __1750704794_Interface.__1750704794_Ptr
  }


  public override val __1562726184_Ptr: JNAPointer? by lazy {
    __1562726184_Interface.__1562726184_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1750704794_Interface, __1562726184_Interface)

  private fun as_1750704794(): IAppInstallerInfo.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallerInfo.ABI.makeIAppInstallerInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallerInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallerInfo.ABI.makeIAppInstallerInfo(ref.value))
  }

  private fun as_1562726184(): IAppInstallerInfo2.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallerInfo2.ABI.makeIAppInstallerInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallerInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallerInfo2.ABI.makeIAppInstallerInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppInstallerInfo> {
    public override fun getValue() = AppInstallerInfo(pointer.getPointer(0))

    public fun setValue(value: AppInstallerInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppInstallerInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppInstallerInfo {
      val address = segment.toRawLongValue()
      return AppInstallerInfo(Pointer(address))
    }

    public override fun toNative(obj: AppInstallerInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
