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

@ABIMarker(IsolatedWindowsEnvironmentOwnerRegistrationResult.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironmentOwnerRegistrationResult;{6dab9451-6169-55df-8f51-790e99d7277d})")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentOwnerRegistrationResult.ByReference::class)
public class IsolatedWindowsEnvironmentOwnerRegistrationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironmentOwnerRegistrationResult.WithDefault, IWinRTObject {
  private val __1980979070_Interface: IIsolatedWindowsEnvironmentOwnerRegistrationResult.WithDefault
      by lazy {
    as_1980979070()
  }


  public override val __1980979070_Ptr: JNAPointer? by lazy {
    __1980979070_Interface.__1980979070_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1980979070_Interface)

  private fun as_1980979070(): IIsolatedWindowsEnvironmentOwnerRegistrationResult.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironmentOwnerRegistrationResult.ABI.makeIIsolatedWindowsEnvironmentOwnerRegistrationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironmentOwnerRegistrationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironmentOwnerRegistrationResult.ABI.makeIIsolatedWindowsEnvironmentOwnerRegistrationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironmentOwnerRegistrationResult> {
    public override fun getValue() =
        IsolatedWindowsEnvironmentOwnerRegistrationResult(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironmentOwnerRegistrationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentOwnerRegistrationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        IsolatedWindowsEnvironmentOwnerRegistrationResult {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironmentOwnerRegistrationResult(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironmentOwnerRegistrationResult):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
