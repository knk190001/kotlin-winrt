package Windows.System.Diagnostics

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDiagnosticInvokerStatics.ABI::class)
@Signature("{5cfad8de-f15c-4554-a813-c113c3881b09}")
@Guid("5cfad8def15c4554a813c113c3881b09")
@WinRTInterface("5cfad8def15c4554a813c113c3881b09")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDiagnosticInvokerStatics.ByReference::class)
public interface IDiagnosticInvokerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): DiagnosticInvoker?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): DiagnosticInvoker?

  @InterfaceMethod(2)
  public fun get_IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDiagnosticInvokerStatics> {
    public override fun getValue() = ABI.makeIDiagnosticInvokerStatics(pointer.getPointer(0))

    public fun setValue(value: IDiagnosticInvokerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDiagnosticInvokerStatics {
    public val __882958973_Ptr: Pointer?

    public val _882958973_VtblPtr: Pointer?
      get() = __882958973_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): DiagnosticInvoker? {
      val fnPtr = _882958973_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DiagnosticInvoker>()
      val hr = fn.invokeHR(arrayOf(__882958973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DiagnosticInvoker>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): DiagnosticInvoker? {
      val fnPtr = _882958973_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DiagnosticInvoker>()
      val hr = fn.invokeHR(arrayOf(__882958973_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DiagnosticInvoker>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsSupported(): Boolean {
      val fnPtr = _882958973_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__882958973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDiagnosticInvokerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __882958973_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDiagnosticInvokerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5cfad8def15c4554a813c113c3881b09")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDiagnosticInvokerStatics(ptr: Pointer?): WithDefault =
        IDiagnosticInvokerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDiagnosticInvokerStatics {
      val address = segment.toRawLongValue()
      return makeIDiagnosticInvokerStatics(Pointer(address))
    }

    public override fun toNative(obj: IDiagnosticInvokerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__882958973_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDiagnosticInvokerStatics):
        Array<IDiagnosticInvokerStatics?> = (elements as
        Array<IDiagnosticInvokerStatics?>).castToImpl<IDiagnosticInvokerStatics,IDiagnosticInvokerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDiagnosticInvokerStatics?> =
        arrayOfNulls<IDiagnosticInvokerStatics_Impl>(size) as Array<IDiagnosticInvokerStatics?>
  }
}
