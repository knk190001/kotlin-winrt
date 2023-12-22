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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IProcessDiagnosticInfoStatics2.ABI::class)
@Signature("{4a869897-9899-4a44-a29b-091663be09b6}")
@Guid("4a86989798994a44a29b091663be09b6")
@WinRTInterface("4a86989798994a44a29b091663be09b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessDiagnosticInfoStatics2.ByReference::class)
public interface IProcessDiagnosticInfoStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetForProcessId(processId: WinDef.UINT): ProcessDiagnosticInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessDiagnosticInfoStatics2> {
    public override fun getValue() = ABI.makeIProcessDiagnosticInfoStatics2(pointer.getPointer(0))

    public fun setValue(value: IProcessDiagnosticInfoStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessDiagnosticInfoStatics2 {
    public val __1307036288_Ptr: Pointer?

    public val _1307036288_VtblPtr: Pointer?
      get() = __1307036288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetForProcessId(processId: WinDef.UINT): ProcessDiagnosticInfo? {
      val fnPtr = _1307036288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProcessDiagnosticInfo>()
      val hr = fn.invokeHR(arrayOf(__1307036288_Ptr, processId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProcessDiagnosticInfo>(result.getValue())
      return resultValue
    }
  }

  public class IProcessDiagnosticInfoStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1307036288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessDiagnosticInfoStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a86989798994a44a29b091663be09b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessDiagnosticInfoStatics2(ptr: Pointer?): WithDefault =
        IProcessDiagnosticInfoStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessDiagnosticInfoStatics2 {
      val address = segment.toRawLongValue()
      return makeIProcessDiagnosticInfoStatics2(Pointer(address))
    }

    public override fun toNative(obj: IProcessDiagnosticInfoStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1307036288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessDiagnosticInfoStatics2):
        Array<IProcessDiagnosticInfoStatics2?> = (elements as
        Array<IProcessDiagnosticInfoStatics2?>).castToImpl<IProcessDiagnosticInfoStatics2,IProcessDiagnosticInfoStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessDiagnosticInfoStatics2?> =
        arrayOfNulls<IProcessDiagnosticInfoStatics2_Impl>(size) as
        Array<IProcessDiagnosticInfoStatics2?>
  }
}
