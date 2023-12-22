package Windows.System.Diagnostics

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IProcessDiagnosticInfoStatics.ABI::class)
@Signature("{2f41b260-b49f-428c-aa0e-84744f49ca95}")
@Guid("2f41b260b49f428caa0e84744f49ca95")
@WinRTInterface("2f41b260b49f428caa0e84744f49ca95")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessDiagnosticInfoStatics.ByReference::class)
public interface IProcessDiagnosticInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForProcesses(): IVectorView<ProcessDiagnosticInfo?>?

  @InterfaceMethod(1)
  public fun GetForCurrentProcess(): ProcessDiagnosticInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessDiagnosticInfoStatics> {
    public override fun getValue() = ABI.makeIProcessDiagnosticInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IProcessDiagnosticInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessDiagnosticInfoStatics {
    public val __1343310862_Ptr: Pointer?

    public val _1343310862_VtblPtr: Pointer?
      get() = __1343310862_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForProcesses(): IVectorView<ProcessDiagnosticInfo?>? {
      val fnPtr = _1343310862_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ProcessDiagnosticInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1343310862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ProcessDiagnosticInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForCurrentProcess(): ProcessDiagnosticInfo? {
      val fnPtr = _1343310862_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProcessDiagnosticInfo>()
      val hr = fn.invokeHR(arrayOf(__1343310862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProcessDiagnosticInfo>(result.getValue())
      return resultValue
    }
  }

  public class IProcessDiagnosticInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1343310862_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessDiagnosticInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f41b260b49f428caa0e84744f49ca95")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessDiagnosticInfoStatics(ptr: Pointer?): WithDefault =
        IProcessDiagnosticInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessDiagnosticInfoStatics {
      val address = segment.toRawLongValue()
      return makeIProcessDiagnosticInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IProcessDiagnosticInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1343310862_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessDiagnosticInfoStatics):
        Array<IProcessDiagnosticInfoStatics?> = (elements as
        Array<IProcessDiagnosticInfoStatics?>).castToImpl<IProcessDiagnosticInfoStatics,IProcessDiagnosticInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessDiagnosticInfoStatics?> =
        arrayOfNulls<IProcessDiagnosticInfoStatics_Impl>(size) as
        Array<IProcessDiagnosticInfoStatics?>
  }
}
