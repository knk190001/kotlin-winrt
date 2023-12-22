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

@ABIMarker(KeyCredentialOperationResult.ABI::class)
@Signature("rc(Windows.Security.Credentials.KeyCredentialOperationResult;{f53786c1-5261-4cdd-976d-cc909ac71620})")
@WinRTByReference(brClass = KeyCredentialOperationResult.ByReference::class)
public class KeyCredentialOperationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeyCredentialOperationResult.WithDefault, IWinRTObject {
  private val __635150590_Interface: IKeyCredentialOperationResult.WithDefault by lazy {
    as_635150590()
  }


  public override val __635150590_Ptr: JNAPointer? by lazy {
    __635150590_Interface.__635150590_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__635150590_Interface)

  private fun as_635150590(): IKeyCredentialOperationResult.WithDefault {
    if(pointer == NULL) {
      return(IKeyCredentialOperationResult.ABI.makeIKeyCredentialOperationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyCredentialOperationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyCredentialOperationResult.ABI.makeIKeyCredentialOperationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyCredentialOperationResult> {
    public override fun getValue() = KeyCredentialOperationResult(pointer.getPointer(0))

    public fun setValue(value: KeyCredentialOperationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyCredentialOperationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): KeyCredentialOperationResult {
      val address = segment.toRawLongValue()
      return KeyCredentialOperationResult(Pointer(address))
    }

    public override fun toNative(obj: KeyCredentialOperationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
