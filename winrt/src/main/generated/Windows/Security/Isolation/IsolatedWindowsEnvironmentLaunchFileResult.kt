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

@ABIMarker(IsolatedWindowsEnvironmentLaunchFileResult.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentLaunchFileResult;{685d4176-f6e0-4569-b1aa-215c0ff5b257})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentLaunchFileResult.ByReference::class)
public class IsolatedWindowsEnvironmentLaunchFileResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentLaunchFileResult.WithDefault, IWinRTObject {
  private val __357612365_Interface: IIsolatedWindowsEnvironmentLaunchFileResult.WithDefault by
      lazy {
    as_357612365()
  }


  public override val __357612365_Ptr: JNAPointer? by lazy {
    __357612365_Interface.__357612365_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__357612365_Interface)

  private fun as_357612365(): IIsolatedWindowsEnvironmentLaunchFileResult.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentLaunchFileResult.ABI.makeIIsolatedWindowsEnvironmentLaunchFileResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentLaunchFileResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentLaunchFileResult.ABI.makeIIsolatedWindowsEnvironmentLaunchFileResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentLaunchFileResult> {
    public override fun getValue() =
        IsolatedWindowsEnvironmentLaunchFileResult(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentLaunchFileResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentLaunchFileResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        IsolatedWindowsEnvironmentLaunchFileResult {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentLaunchFileResult(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentLaunchFileResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
