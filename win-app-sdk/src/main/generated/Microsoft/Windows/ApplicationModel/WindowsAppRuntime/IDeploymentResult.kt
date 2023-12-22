package Microsoft.Windows.ApplicationModel.WindowsAppRuntime

import Windows.Foundation.HResult
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

@ABIMarker(IDeploymentResult.ABI::class)
@Signature("{27203f62-463d-587a-8eb7-870098901078}")
@Guid("27203f62463d587a8eb7870098901078")
@WinRTInterface("27203f62463d587a8eb7870098901078")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeploymentResult.ByReference::class)
public interface IDeploymentResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): DeploymentStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeploymentResult> {
    public override fun getValue() = ABI.makeIDeploymentResult(pointer.getPointer(0))

    public fun setValue(value: IDeploymentResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeploymentResult {
    public val __784640187_Ptr: Pointer?

    public val _784640187_VtblPtr: Pointer?
      get() = __784640187_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): DeploymentStatus? {
      val fnPtr = _784640187_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeploymentStatus>()
      val hr = fn.invokeHR(arrayOf(__784640187_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeploymentStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _784640187_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__784640187_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IDeploymentResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __784640187_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeploymentResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27203f62463d587a8eb7870098901078")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeploymentResult(ptr: Pointer?): WithDefault = IDeploymentResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeploymentResult {
      val address = segment.toRawLongValue()
      return makeIDeploymentResult(Pointer(address))
    }

    public override fun toNative(obj: IDeploymentResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__784640187_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeploymentResult): Array<IDeploymentResult?> = (elements
        as Array<IDeploymentResult?>).castToImpl<IDeploymentResult,IDeploymentResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeploymentResult?> =
        arrayOfNulls<IDeploymentResult_Impl>(size) as Array<IDeploymentResult?>
  }
}
