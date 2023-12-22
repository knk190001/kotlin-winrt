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

@ABIMarker(IsolatedWindowsEnvironmentShareFileResult.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentShareFileResult;{aec7caa7-9ac6-4bf5-8b91-5c1adf0d7d00})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentShareFileResult.ByReference::class)
public class IsolatedWindowsEnvironmentShareFileResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentShareFileResult.WithDefault, IWinRTObject {
  private val __1606174415_Interface: IIsolatedWindowsEnvironmentShareFileResult.WithDefault by
      lazy {
    as_1606174415()
  }


  public override val __1606174415_Ptr: JNAPointer? by lazy {
    __1606174415_Interface.__1606174415_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1606174415_Interface)

  private fun as_1606174415(): IIsolatedWindowsEnvironmentShareFileResult.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentShareFileResult.ABI.makeIIsolatedWindowsEnvironmentShareFileResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentShareFileResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentShareFileResult.ABI.makeIIsolatedWindowsEnvironmentShareFileResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentShareFileResult> {
    public override fun getValue() =
        IsolatedWindowsEnvironmentShareFileResult(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentShareFileResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentShareFileResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        IsolatedWindowsEnvironmentShareFileResult {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentShareFileResult(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentShareFileResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
