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

@ABIMarker(SecondaryAuthenticationFactorAuthenticationResult.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorAuthenticationResult;{9cbb5987-ef6d-4bc2-bf49-4617515a0f9a})")
@WinRTByReference(brClass = SecondaryAuthenticationFactorAuthenticationResult.ByReference::class)
public class SecondaryAuthenticationFactorAuthenticationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISecondaryAuthenticationFactorAuthenticationResult.WithDefault, IWinRTObject {
  private val __626355115_Interface: ISecondaryAuthenticationFactorAuthenticationResult.WithDefault
      by lazy {
    as_626355115()
  }


  public override val __626355115_Ptr: JNAPointer? by lazy {
    __626355115_Interface.__626355115_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__626355115_Interface)

  private fun as_626355115(): ISecondaryAuthenticationFactorAuthenticationResult.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryAuthenticationFactorAuthenticationResult.ABI.makeISecondaryAuthenticationFactorAuthenticationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryAuthenticationFactorAuthenticationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryAuthenticationFactorAuthenticationResult.ABI.makeISecondaryAuthenticationFactorAuthenticationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SecondaryAuthenticationFactorAuthenticationResult> {
    public override fun getValue() =
        SecondaryAuthenticationFactorAuthenticationResult(pointer.getPointer(0))

    public fun setValue(value: SecondaryAuthenticationFactorAuthenticationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SecondaryAuthenticationFactorAuthenticationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SecondaryAuthenticationFactorAuthenticationResult {
      val address = segment.toRawLongValue()
      return SecondaryAuthenticationFactorAuthenticationResult(Pointer(address))
    }

    public override fun toNative(obj: SecondaryAuthenticationFactorAuthenticationResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
