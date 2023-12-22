package Windows.ApplicationModel.ExtendedExecution.Foreground

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

@ABIMarker(IExtendedExecutionForegroundRevokedEventArgs.ABI::class)
@Signature("{b07cd940-9557-aea4-2c99-bdd56d9be461}")
@Guid("b07cd9409557aea42c99bdd56d9be461")
@WinRTInterface("b07cd9409557aea42c99bdd56d9be461")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExtendedExecutionForegroundRevokedEventArgs.ByReference::class)
public interface IExtendedExecutionForegroundRevokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): ExtendedExecutionForegroundRevokedReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExtendedExecutionForegroundRevokedEventArgs> {
    public override fun getValue() =
        ABI.makeIExtendedExecutionForegroundRevokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IExtendedExecutionForegroundRevokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExtendedExecutionForegroundRevokedEventArgs {
    public val __816999118_Ptr: Pointer?

    public val _816999118_VtblPtr: Pointer?
      get() = __816999118_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): ExtendedExecutionForegroundRevokedReason? {
      val fnPtr = _816999118_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExtendedExecutionForegroundRevokedReason>()
      val hr = fn.invokeHR(arrayOf(__816999118_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ExtendedExecutionForegroundRevokedReason>(result.getValue())
      return resultValue
    }
  }

  public class IExtendedExecutionForegroundRevokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __816999118_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExtendedExecutionForegroundRevokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b07cd9409557aea42c99bdd56d9be461")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExtendedExecutionForegroundRevokedEventArgs(ptr: Pointer?): WithDefault =
        IExtendedExecutionForegroundRevokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IExtendedExecutionForegroundRevokedEventArgs {
      val address = segment.toRawLongValue()
      return makeIExtendedExecutionForegroundRevokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IExtendedExecutionForegroundRevokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__816999118_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExtendedExecutionForegroundRevokedEventArgs):
        Array<IExtendedExecutionForegroundRevokedEventArgs?> = (elements as
        Array<IExtendedExecutionForegroundRevokedEventArgs?>).castToImpl<IExtendedExecutionForegroundRevokedEventArgs,IExtendedExecutionForegroundRevokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExtendedExecutionForegroundRevokedEventArgs?> =
        arrayOfNulls<IExtendedExecutionForegroundRevokedEventArgs_Impl>(size) as
        Array<IExtendedExecutionForegroundRevokedEventArgs?>
  }
}
