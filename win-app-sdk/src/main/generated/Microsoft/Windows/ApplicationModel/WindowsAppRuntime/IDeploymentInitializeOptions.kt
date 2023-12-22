package Microsoft.Windows.ApplicationModel.WindowsAppRuntime

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

@ABIMarker(IDeploymentInitializeOptions.ABI::class)
@Signature("{578a5fd4-9d7f-5e01-97b8-d8ea61db4027}")
@Guid("578a5fd49d7f5e0197b8d8ea61db4027")
@WinRTInterface("578a5fd49d7f5e0197b8d8ea61db4027")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeploymentInitializeOptions.ByReference::class)
public interface IDeploymentInitializeOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ForceDeployment(): Boolean

  @InterfaceMethod(1)
  public fun put_ForceDeployment(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeploymentInitializeOptions> {
    public override fun getValue() = ABI.makeIDeploymentInitializeOptions(pointer.getPointer(0))

    public fun setValue(value: IDeploymentInitializeOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeploymentInitializeOptions {
    public val __137141872_Ptr: Pointer?

    public val _137141872_VtblPtr: Pointer?
      get() = __137141872_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ForceDeployment(): Boolean {
      val fnPtr = _137141872_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__137141872_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ForceDeployment(value: Boolean): Unit {
      val fnPtr = _137141872_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__137141872_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDeploymentInitializeOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __137141872_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeploymentInitializeOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("578a5fd49d7f5e0197b8d8ea61db4027")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeploymentInitializeOptions(ptr: Pointer?): WithDefault =
        IDeploymentInitializeOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeploymentInitializeOptions {
      val address = segment.toRawLongValue()
      return makeIDeploymentInitializeOptions(Pointer(address))
    }

    public override fun toNative(obj: IDeploymentInitializeOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__137141872_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeploymentInitializeOptions):
        Array<IDeploymentInitializeOptions?> = (elements as
        Array<IDeploymentInitializeOptions?>).castToImpl<IDeploymentInitializeOptions,IDeploymentInitializeOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeploymentInitializeOptions?> =
        arrayOfNulls<IDeploymentInitializeOptions_Impl>(size) as
        Array<IDeploymentInitializeOptions?>
  }
}
