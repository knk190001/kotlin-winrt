package Windows.Security.Credentials

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

@ABIMarker(KeyCredentialAttestationResult.ABI::class)
@Signature("rc(Windows.Security.Credentials.KeyCredentialAttestationResult;{78aab3a1-a3c1-4103-b6cc-472c44171cbb})")
@WinRTByReference(brClass = KeyCredentialAttestationResult.ByReference::class)
public class KeyCredentialAttestationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeyCredentialAttestationResult.WithDefault, IWinRTObject {
  private val __1805818151_Interface: IKeyCredentialAttestationResult.WithDefault by lazy {
    as_1805818151()
  }


  public override val __1805818151_Ptr: JNAPointer? by lazy {
    __1805818151_Interface.__1805818151_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1805818151_Interface)

  private fun as_1805818151(): IKeyCredentialAttestationResult.WithDefault {
    if(pointer == NULL) {
      return(IKeyCredentialAttestationResult.ABI.makeIKeyCredentialAttestationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyCredentialAttestationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyCredentialAttestationResult.ABI.makeIKeyCredentialAttestationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyCredentialAttestationResult> {
    public override fun getValue() = KeyCredentialAttestationResult(pointer.getPointer(0))

    public fun setValue(value: KeyCredentialAttestationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyCredentialAttestationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): KeyCredentialAttestationResult {
      val address = segment.toRawLongValue()
      return KeyCredentialAttestationResult(Pointer(address))
    }

    public override fun toNative(obj: KeyCredentialAttestationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
