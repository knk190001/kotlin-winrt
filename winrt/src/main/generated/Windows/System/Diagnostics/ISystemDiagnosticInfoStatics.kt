package Windows.System.Diagnostics

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISystemDiagnosticInfoStatics.ABI::class)
@Signature("{d404ac21-fc7d-45f0-9a3f-39203aed9f7e}")
@Guid("d404ac21fc7d45f09a3f39203aed9f7e")
@WinRTInterface("d404ac21fc7d45f09a3f39203aed9f7e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemDiagnosticInfoStatics.ByReference::class)
public interface ISystemDiagnosticInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentSystem(): SystemDiagnosticInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemDiagnosticInfoStatics> {
    public override fun getValue() = ABI.makeISystemDiagnosticInfoStatics(pointer.getPointer(0))

    public fun setValue(value: ISystemDiagnosticInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemDiagnosticInfoStatics {
    public val __1832778256_Ptr: Pointer?

    public val _1832778256_VtblPtr: Pointer?
      get() = __1832778256_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentSystem(): SystemDiagnosticInfo? {
      val fnPtr = _1832778256_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemDiagnosticInfo>()
      val hr = fn.invokeHR(arrayOf(__1832778256_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemDiagnosticInfo>(result.getValue())
      return resultValue
    }
  }

  public class ISystemDiagnosticInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1832778256_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemDiagnosticInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d404ac21fc7d45f09a3f39203aed9f7e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemDiagnosticInfoStatics(ptr: Pointer?): WithDefault =
        ISystemDiagnosticInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemDiagnosticInfoStatics {
      val address = segment.toRawLongValue()
      return makeISystemDiagnosticInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: ISystemDiagnosticInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1832778256_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemDiagnosticInfoStatics):
        Array<ISystemDiagnosticInfoStatics?> = (elements as
        Array<ISystemDiagnosticInfoStatics?>).castToImpl<ISystemDiagnosticInfoStatics,ISystemDiagnosticInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemDiagnosticInfoStatics?> =
        arrayOfNulls<ISystemDiagnosticInfoStatics_Impl>(size) as
        Array<ISystemDiagnosticInfoStatics?>
  }
}
