package Windows.ApplicationModel.ExtendedExecution

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

@ABIMarker(IExtendedExecutionRevokedEventArgs.ABI::class)
@Signature("{bfbc9f16-63b5-4c0b-aad6-828af5373ec3}")
@Guid("bfbc9f1663b54c0baad6828af5373ec3")
@WinRTInterface("bfbc9f1663b54c0baad6828af5373ec3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExtendedExecutionRevokedEventArgs.ByReference::class)
public interface IExtendedExecutionRevokedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): ExtendedExecutionRevokedReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExtendedExecutionRevokedEventArgs> {
    public override fun getValue() =
        ABI.makeIExtendedExecutionRevokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IExtendedExecutionRevokedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExtendedExecutionRevokedEventArgs {
    public val __1387627364_Ptr: Pointer?

    public val _1387627364_VtblPtr: Pointer?
      get() = __1387627364_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): ExtendedExecutionRevokedReason? {
      val fnPtr = _1387627364_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExtendedExecutionRevokedReason>()
      val hr = fn.invokeHR(arrayOf(__1387627364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExtendedExecutionRevokedReason>(result.getValue())
      return resultValue
    }
  }

  public class IExtendedExecutionRevokedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1387627364_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExtendedExecutionRevokedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bfbc9f1663b54c0baad6828af5373ec3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExtendedExecutionRevokedEventArgs(ptr: Pointer?): WithDefault =
        IExtendedExecutionRevokedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExtendedExecutionRevokedEventArgs {
      val address = segment.toRawLongValue()
      return makeIExtendedExecutionRevokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IExtendedExecutionRevokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1387627364_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExtendedExecutionRevokedEventArgs):
        Array<IExtendedExecutionRevokedEventArgs?> = (elements as
        Array<IExtendedExecutionRevokedEventArgs?>).castToImpl<IExtendedExecutionRevokedEventArgs,IExtendedExecutionRevokedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExtendedExecutionRevokedEventArgs?> =
        arrayOfNulls<IExtendedExecutionRevokedEventArgs_Impl>(size) as
        Array<IExtendedExecutionRevokedEventArgs?>
  }
}
