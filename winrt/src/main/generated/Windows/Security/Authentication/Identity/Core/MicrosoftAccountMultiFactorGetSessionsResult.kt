package Windows.Security.Authentication.Identity.Core

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

@ABIMarker(MicrosoftAccountMultiFactorGetSessionsResult.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.Core.MicrosoftAccountMultiFactorGetSessionsResult;{4e23a9a0-e9fa-497a-95de-6d5747bf974c})")
@WinRTByReference(brClass = MicrosoftAccountMultiFactorGetSessionsResult.ByReference::class)
public class MicrosoftAccountMultiFactorGetSessionsResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMicrosoftAccountMultiFactorGetSessionsResult.WithDefault, IWinRTObject {
  private val __414291980_Interface: IMicrosoftAccountMultiFactorGetSessionsResult.WithDefault by
      lazy {
    as_414291980()
  }


  public override val __414291980_Ptr: JNAPointer? by lazy {
    __414291980_Interface.__414291980_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__414291980_Interface)

  private fun as_414291980(): IMicrosoftAccountMultiFactorGetSessionsResult.WithDefault {
    if(pointer == NULL) {
      return(IMicrosoftAccountMultiFactorGetSessionsResult.ABI.makeIMicrosoftAccountMultiFactorGetSessionsResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMicrosoftAccountMultiFactorGetSessionsResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMicrosoftAccountMultiFactorGetSessionsResult.ABI.makeIMicrosoftAccountMultiFactorGetSessionsResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MicrosoftAccountMultiFactorGetSessionsResult> {
    public override fun getValue() =
        MicrosoftAccountMultiFactorGetSessionsResult(pointer.getPointer(0))

    public fun setValue(value: MicrosoftAccountMultiFactorGetSessionsResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MicrosoftAccountMultiFactorGetSessionsResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MicrosoftAccountMultiFactorGetSessionsResult {
      val address = segment.toRawLongValue()
      return MicrosoftAccountMultiFactorGetSessionsResult(Pointer(address))
    }

    public override fun toNative(obj: MicrosoftAccountMultiFactorGetSessionsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
