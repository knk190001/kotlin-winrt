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

@ABIMarker(KeyCredentialRetrievalResult.ABI::class)
@Signature("rc(Windows.Security.Credentials.KeyCredentialRetrievalResult;{58cd7703-8d87-4249-9b58-f6598cc9644e})")
@WinRTByReference(brClass = KeyCredentialRetrievalResult.ByReference::class)
public class KeyCredentialRetrievalResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeyCredentialRetrievalResult.WithDefault, IWinRTObject {
  private val __1053312267_Interface: IKeyCredentialRetrievalResult.WithDefault by lazy {
    as_1053312267()
  }


  public override val __1053312267_Ptr: JNAPointer? by lazy {
    __1053312267_Interface.__1053312267_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1053312267_Interface)

  private fun as_1053312267(): IKeyCredentialRetrievalResult.WithDefault {
    if(pointer == NULL) {
      return(IKeyCredentialRetrievalResult.ABI.makeIKeyCredentialRetrievalResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyCredentialRetrievalResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyCredentialRetrievalResult.ABI.makeIKeyCredentialRetrievalResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KeyCredentialRetrievalResult> {
    public override fun getValue() = KeyCredentialRetrievalResult(pointer.getPointer(0))

    public fun setValue(value: KeyCredentialRetrievalResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyCredentialRetrievalResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): KeyCredentialRetrievalResult {
      val address = segment.toRawLongValue()
      return KeyCredentialRetrievalResult(Pointer(address))
    }

    public override fun toNative(obj: KeyCredentialRetrievalResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
