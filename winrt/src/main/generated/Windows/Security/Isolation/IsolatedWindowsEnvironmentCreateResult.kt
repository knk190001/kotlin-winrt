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

@ABIMarker(IsolatedWindowsEnvironmentCreateResult.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentCreateResult;{ef9a5e58-dcd7-45c2-9c85-ab642a715e8e})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentCreateResult.ByReference::class)
public class IsolatedWindowsEnvironmentCreateResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentCreateResult.WithDefault, IWinRTObject {
  private val __1040572512_Interface: IIsolatedWindowsEnvironmentCreateResult.WithDefault by lazy {
    as_1040572512()
  }


  public override val __1040572512_Ptr: JNAPointer? by lazy {
    __1040572512_Interface.__1040572512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1040572512_Interface)

  private fun as_1040572512(): IIsolatedWindowsEnvironmentCreateResult.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentCreateResult.ABI.makeIIsolatedWindowsEnvironmentCreateResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentCreateResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentCreateResult.ABI.makeIIsolatedWindowsEnvironmentCreateResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentCreateResult> {
    public override fun getValue() = IsolatedWindowsEnvironmentCreateResult(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentCreateResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentCreateResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): IsolatedWindowsEnvironmentCreateResult {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentCreateResult(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentCreateResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
