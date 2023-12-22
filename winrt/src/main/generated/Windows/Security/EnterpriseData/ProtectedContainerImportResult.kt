package Windows.Security.EnterpriseData

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

@ABIMarker(ProtectedContainerImportResult.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.ProtectedContainerImportResult;{cdb780d1-e7bb-4d1a-9339-34dc41149f9b})")
@WinRTByReference(brClass = ProtectedContainerImportResult.ByReference::class)
public class ProtectedContainerImportResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProtectedContainerImportResult.WithDefault, IWinRTObject {
  private val __2095306608_Interface: IProtectedContainerImportResult.WithDefault by lazy {
    as_2095306608()
  }


  public override val __2095306608_Ptr: JNAPointer? by lazy {
    __2095306608_Interface.__2095306608_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2095306608_Interface)

  private fun as_2095306608(): IProtectedContainerImportResult.WithDefault {
    if(pointer == NULL) {
      return(IProtectedContainerImportResult.ABI.makeIProtectedContainerImportResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProtectedContainerImportResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProtectedContainerImportResult.ABI.makeIProtectedContainerImportResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProtectedContainerImportResult> {
    public override fun getValue() = ProtectedContainerImportResult(pointer.getPointer(0))

    public fun setValue(value: ProtectedContainerImportResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProtectedContainerImportResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProtectedContainerImportResult {
      val address = segment.toRawLongValue()
      return ProtectedContainerImportResult(Pointer(address))
    }

    public override fun toNative(obj: ProtectedContainerImportResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
