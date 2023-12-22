package Windows.Security.Credentials.UI

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

@ABIMarker(CredentialPickerResults.ABI::class)
@Signature("rc(Windows.Security.Credentials.UI.CredentialPickerResults;{1948f99a-cc30-410c-9c38-cc0884c5b3d7})")
@WinRTByReference(brClass = CredentialPickerResults.ByReference::class)
public class CredentialPickerResults(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICredentialPickerResults.WithDefault, IWinRTObject {
  private val __227890065_Interface: ICredentialPickerResults.WithDefault by lazy {
    as_227890065()
  }


  public override val __227890065_Ptr: JNAPointer? by lazy {
    __227890065_Interface.__227890065_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__227890065_Interface)

  private fun as_227890065(): ICredentialPickerResults.WithDefault {
    if(pointer == NULL) {
      return(ICredentialPickerResults.ABI.makeICredentialPickerResults(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICredentialPickerResults>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICredentialPickerResults.ABI.makeICredentialPickerResults(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CredentialPickerResults> {
    public override fun getValue() = CredentialPickerResults(pointer.getPointer(0))

    public fun setValue(value: CredentialPickerResults): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CredentialPickerResults, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CredentialPickerResults {
      val address = segment.toRawLongValue()
      return CredentialPickerResults(Pointer(address))
    }

    public override fun toNative(obj: CredentialPickerResults): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
