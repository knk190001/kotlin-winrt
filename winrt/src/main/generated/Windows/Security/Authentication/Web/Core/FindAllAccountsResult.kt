package Windows.Security.Authentication.Web.Core

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

@ABIMarker(FindAllAccountsResult.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Core.FindAllAccountsResult;{a5812b5d-b72e-420c-86ab-aac0d7b7261f})")
@WinRTByReference(brClass = FindAllAccountsResult.ByReference::class)
public class FindAllAccountsResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFindAllAccountsResult.WithDefault, IWinRTObject {
  private val __980948082_Interface: IFindAllAccountsResult.WithDefault by lazy {
    as_980948082()
  }


  public override val __980948082_Ptr: JNAPointer? by lazy {
    __980948082_Interface.__980948082_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__980948082_Interface)

  private fun as_980948082(): IFindAllAccountsResult.WithDefault {
    if(pointer == NULL) {
      return(IFindAllAccountsResult.ABI.makeIFindAllAccountsResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFindAllAccountsResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFindAllAccountsResult.ABI.makeIFindAllAccountsResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FindAllAccountsResult> {
    public override fun getValue() = FindAllAccountsResult(pointer.getPointer(0))

    public fun setValue(value: FindAllAccountsResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FindAllAccountsResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FindAllAccountsResult {
      val address = segment.toRawLongValue()
      return FindAllAccountsResult(Pointer(address))
    }

    public override fun toNative(obj: FindAllAccountsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
