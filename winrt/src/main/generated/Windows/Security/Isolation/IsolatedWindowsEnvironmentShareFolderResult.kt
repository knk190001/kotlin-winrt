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

@ABIMarker(IsolatedWindowsEnvironmentShareFolderResult.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentShareFolderResult;{556ba72e-ca9d-4211-b143-1cedc86eb2fe})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentShareFolderResult.ByReference::class)
public class IsolatedWindowsEnvironmentShareFolderResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentShareFolderResult.WithDefault, IWinRTObject {
  private val __1282726749_Interface: IIsolatedWindowsEnvironmentShareFolderResult.WithDefault by
      lazy {
    as_1282726749()
  }


  public override val __1282726749_Ptr: JNAPointer? by lazy {
    __1282726749_Interface.__1282726749_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1282726749_Interface)

  private fun as_1282726749(): IIsolatedWindowsEnvironmentShareFolderResult.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentShareFolderResult.ABI.makeIIsolatedWindowsEnvironmentShareFolderResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentShareFolderResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentShareFolderResult.ABI.makeIIsolatedWindowsEnvironmentShareFolderResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentShareFolderResult> {
    public override fun getValue() =
        IsolatedWindowsEnvironmentShareFolderResult(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentShareFolderResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentShareFolderResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        IsolatedWindowsEnvironmentShareFolderResult {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentShareFolderResult(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentShareFolderResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
