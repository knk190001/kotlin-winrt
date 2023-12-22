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

@ABIMarker(SecondaryAuthenticationFactorRegistrationResult.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorRegistrationResult;{a4fe35f0-ade3-4981-af6b-ec195921682a})")
@WinRTByReference(brClass = SecondaryAuthenticationFactorRegistrationResult.ByReference::class)
public class SecondaryAuthenticationFactorRegistrationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISecondaryAuthenticationFactorRegistrationResult.WithDefault, IWinRTObject {
  private val __626487850_Interface: ISecondaryAuthenticationFactorRegistrationResult.WithDefault by
      lazy {
    as_626487850()
  }


  public override val __626487850_Ptr: JNAPointer? by lazy {
    __626487850_Interface.__626487850_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__626487850_Interface)

  private fun as_626487850(): ISecondaryAuthenticationFactorRegistrationResult.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryAuthenticationFactorRegistrationResult.ABI.makeISecondaryAuthenticationFactorRegistrationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryAuthenticationFactorRegistrationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryAuthenticationFactorRegistrationResult.ABI.makeISecondaryAuthenticationFactorRegistrationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SecondaryAuthenticationFactorRegistrationResult> {
    public override fun getValue() =
        SecondaryAuthenticationFactorRegistrationResult(pointer.getPointer(0))

    public fun setValue(value: SecondaryAuthenticationFactorRegistrationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SecondaryAuthenticationFactorRegistrationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SecondaryAuthenticationFactorRegistrationResult {
      val address = segment.toRawLongValue()
      return SecondaryAuthenticationFactorRegistrationResult(Pointer(address))
    }

    public override fun toNative(obj: SecondaryAuthenticationFactorRegistrationResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
