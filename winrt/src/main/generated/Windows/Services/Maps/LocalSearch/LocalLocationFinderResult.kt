package Windows.Services.Maps.LocalSearch

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

@ABIMarker(LocalLocationFinderResult.ABI::class)
@Signature("rc(Windows.Services.Maps.LocalSearch.LocalLocationFinderResult;{d09b6cc6-f338-4191-9fd8-5440b9a68f52})")
@WinRTByReference(brClass = LocalLocationFinderResult.ByReference::class)
public class LocalLocationFinderResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILocalLocationFinderResult.WithDefault, IWinRTObject {
  private val __2094809989_Interface: ILocalLocationFinderResult.WithDefault by lazy {
    as_2094809989()
  }


  public override val __2094809989_Ptr: JNAPointer? by lazy {
    __2094809989_Interface.__2094809989_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2094809989_Interface)

  private fun as_2094809989(): ILocalLocationFinderResult.WithDefault {
    if(pointer == NULL) {
      return(ILocalLocationFinderResult.ABI.makeILocalLocationFinderResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILocalLocationFinderResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILocalLocationFinderResult.ABI.makeILocalLocationFinderResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LocalLocationFinderResult> {
    public override fun getValue() = LocalLocationFinderResult(pointer.getPointer(0))

    public fun setValue(value: LocalLocationFinderResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LocalLocationFinderResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LocalLocationFinderResult {
      val address = segment.toRawLongValue()
      return LocalLocationFinderResult(Pointer(address))
    }

    public override fun toNative(obj: LocalLocationFinderResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
