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

@ABIMarker(SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs;{d4a5ee56-7291-4073-bc1f-ccb8f5afdf96})")
@WinRTByReference(brClass =
    SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs.ByReference::class)
public class SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs.WithDefault,
    IWinRTObject {
  private val __864097751_Interface:
      ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs.WithDefault by lazy {
    as_864097751()
  }


  public override val __864097751_Ptr: JNAPointer? by lazy {
    __864097751_Interface.__864097751_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__864097751_Interface)

  private fun as_864097751():
      ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs.ABI.makeISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs(NULL))
    }
    val refiid =
        Guid.REFIID(guidOf<ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs.ABI.makeISecondaryAuthenticationFactorAuthenticationStageChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs> {
    public override fun getValue() =
        SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs,
      MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs {
      val address = segment.toRawLongValue()
      return SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs(Pointer(address))
    }

    public override
        fun toNative(obj: SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
