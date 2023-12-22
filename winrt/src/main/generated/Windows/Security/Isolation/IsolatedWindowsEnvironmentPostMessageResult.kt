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

@ABIMarker(IsolatedWindowsEnvironmentPostMessageResult.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentPostMessageResult;{0dfa28fa-2ef0-4d8f-b341-3171b2df93b1})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentPostMessageResult.ByReference::class)
public class IsolatedWindowsEnvironmentPostMessageResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentPostMessageResult.WithDefault, IWinRTObject {
  private val __121176259_Interface: IIsolatedWindowsEnvironmentPostMessageResult.WithDefault by
      lazy {
    as_121176259()
  }


  public override val __121176259_Ptr: JNAPointer? by lazy {
    __121176259_Interface.__121176259_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__121176259_Interface)

  private fun as_121176259(): IIsolatedWindowsEnvironmentPostMessageResult.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentPostMessageResult.ABI.makeIIsolatedWindowsEnvironmentPostMessageResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentPostMessageResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentPostMessageResult.ABI.makeIIsolatedWindowsEnvironmentPostMessageResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentPostMessageResult> {
    public override fun getValue() =
        IsolatedWindowsEnvironmentPostMessageResult(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentPostMessageResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentPostMessageResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        IsolatedWindowsEnvironmentPostMessageResult {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentPostMessageResult(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentPostMessageResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
