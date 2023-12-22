package Windows.Security.Authentication.Identity.Provider

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

@ABIMarker(SecondaryAuthenticationFactorAuthenticationStageInfo.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorAuthenticationStageInfo;{56fec28b-e8aa-4c0f-8e4c-a559e73add88})")
@WinRTByReference(brClass = SecondaryAuthenticationFactorAuthenticationStageInfo.ByReference::class)
public class SecondaryAuthenticationFactorAuthenticationStageInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISecondaryAuthenticationFactorAuthenticationStageInfo.WithDefault,
    IWinRTObject {
  private val __1248925076_Interface:
      ISecondaryAuthenticationFactorAuthenticationStageInfo.WithDefault by lazy {
    as_1248925076()
  }


  public override val __1248925076_Ptr: JNAPointer? by lazy {
    __1248925076_Interface.__1248925076_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1248925076_Interface)

  private fun as_1248925076(): ISecondaryAuthenticationFactorAuthenticationStageInfo.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryAuthenticationFactorAuthenticationStageInfo.ABI.makeISecondaryAuthenticationFactorAuthenticationStageInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryAuthenticationFactorAuthenticationStageInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryAuthenticationFactorAuthenticationStageInfo.ABI.makeISecondaryAuthenticationFactorAuthenticationStageInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SecondaryAuthenticationFactorAuthenticationStageInfo> {
    public override fun getValue() =
        SecondaryAuthenticationFactorAuthenticationStageInfo(pointer.getPointer(0))

    public fun setValue(value: SecondaryAuthenticationFactorAuthenticationStageInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SecondaryAuthenticationFactorAuthenticationStageInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SecondaryAuthenticationFactorAuthenticationStageInfo {
      val address = segment.toRawLongValue()
      return SecondaryAuthenticationFactorAuthenticationStageInfo(Pointer(address))
    }

    public override fun toNative(obj: SecondaryAuthenticationFactorAuthenticationStageInfo):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
