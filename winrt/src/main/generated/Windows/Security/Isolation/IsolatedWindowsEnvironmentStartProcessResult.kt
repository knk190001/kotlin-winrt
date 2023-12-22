package Windows.Security.Isolation

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

@ABIMarker(IsolatedWindowsEnvironmentStartProcessResult.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentStartProcessResult;{8fa1dc2f-57da-4bb5-9c06-fa072d2032e2})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentStartProcessResult.ByReference::class)
public class IsolatedWindowsEnvironmentStartProcessResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentStartProcessResult.WithDefault, IWinRTObject {
  private val __214117457_Interface: IIsolatedWindowsEnvironmentStartProcessResult.WithDefault by
      lazy {
    as_214117457()
  }


  public override val __214117457_Ptr: JNAPointer? by lazy {
    __214117457_Interface.__214117457_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__214117457_Interface)

  private fun as_214117457(): IIsolatedWindowsEnvironmentStartProcessResult.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentStartProcessResult.ABI.makeIIsolatedWindowsEnvironmentStartProcessResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentStartProcessResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentStartProcessResult.ABI.makeIIsolatedWindowsEnvironmentStartProcessResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentStartProcessResult> {
    public override fun getValue() =
        IsolatedWindowsEnvironmentStartProcessResult(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentStartProcessResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentStartProcessResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        IsolatedWindowsEnvironmentStartProcessResult {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentStartProcessResult(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentStartProcessResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
