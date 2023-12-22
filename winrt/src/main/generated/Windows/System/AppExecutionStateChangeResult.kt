package Windows.System

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

@ABIMarker(AppExecutionStateChangeResult.ABI::class)
@Signature("rc(Windows.System.AppExecutionStateChangeResult;{6f039bf0-f91b-4df8-ae77-3033ccb69114})")
@WinRTByReference(brClass = AppExecutionStateChangeResult.ByReference::class)
public class AppExecutionStateChangeResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppExecutionStateChangeResult.WithDefault, IWinRTObject {
  private val __1507707688_Interface: IAppExecutionStateChangeResult.WithDefault by lazy {
    as_1507707688()
  }


  public override val __1507707688_Ptr: JNAPointer? by lazy {
    __1507707688_Interface.__1507707688_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1507707688_Interface)

  private fun as_1507707688(): IAppExecutionStateChangeResult.WithDefault {
    if(pointer == NULL) {
      return(IAppExecutionStateChangeResult.ABI.makeIAppExecutionStateChangeResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppExecutionStateChangeResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppExecutionStateChangeResult.ABI.makeIAppExecutionStateChangeResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppExecutionStateChangeResult> {
    public override fun getValue() = AppExecutionStateChangeResult(pointer.getPointer(0))

    public fun setValue(value: AppExecutionStateChangeResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppExecutionStateChangeResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppExecutionStateChangeResult {
      val address = segment.toRawLongValue()
      return AppExecutionStateChangeResult(Pointer(address))
    }

    public override fun toNative(obj: AppExecutionStateChangeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
