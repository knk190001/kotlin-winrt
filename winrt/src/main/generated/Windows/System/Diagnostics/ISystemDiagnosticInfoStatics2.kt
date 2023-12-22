package Windows.System.Diagnostics

import Windows.System.ProcessorArchitecture
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

@ABIMarker(ISystemDiagnosticInfoStatics2.ABI::class)
@Signature("{79ded189-6af9-4da9-a422-15f73255b3eb}")
@Guid("79ded1896af94da9a42215f73255b3eb")
@WinRTInterface("79ded1896af94da9a42215f73255b3eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemDiagnosticInfoStatics2.ByReference::class)
public interface ISystemDiagnosticInfoStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsArchitectureSupported(type: ProcessorArchitecture?): Boolean

  @InterfaceMethod(1)
  public fun get_PreferredArchitecture(): ProcessorArchitecture?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemDiagnosticInfoStatics2> {
    public override fun getValue() = ABI.makeISystemDiagnosticInfoStatics2(pointer.getPointer(0))

    public fun setValue(value: ISystemDiagnosticInfoStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemDiagnosticInfoStatics2 {
    public val __981551038_Ptr: Pointer?

    public val _981551038_VtblPtr: Pointer?
      get() = __981551038_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsArchitectureSupported(type: ProcessorArchitecture?): Boolean {
      val fnPtr = _981551038_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__981551038_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_PreferredArchitecture(): ProcessorArchitecture? {
      val fnPtr = _981551038_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProcessorArchitecture>()
      val hr = fn.invokeHR(arrayOf(__981551038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProcessorArchitecture>(result.getValue())
      return resultValue
    }
  }

  public class ISystemDiagnosticInfoStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __981551038_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemDiagnosticInfoStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79ded1896af94da9a42215f73255b3eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemDiagnosticInfoStatics2(ptr: Pointer?): WithDefault =
        ISystemDiagnosticInfoStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemDiagnosticInfoStatics2 {
      val address = segment.toRawLongValue()
      return makeISystemDiagnosticInfoStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISystemDiagnosticInfoStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__981551038_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemDiagnosticInfoStatics2):
        Array<ISystemDiagnosticInfoStatics2?> = (elements as
        Array<ISystemDiagnosticInfoStatics2?>).castToImpl<ISystemDiagnosticInfoStatics2,ISystemDiagnosticInfoStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemDiagnosticInfoStatics2?> =
        arrayOfNulls<ISystemDiagnosticInfoStatics2_Impl>(size) as
        Array<ISystemDiagnosticInfoStatics2?>
  }
}
