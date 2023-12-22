package Windows.Devices.AllJoyn

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

@ABIMarker(IAllJoynSessionLostEventArgs.ABI::class)
@Signature("{e766a48a-8bb8-4954-ae67-d2fa43d1f96b}")
@Guid("e766a48a8bb84954ae67d2fa43d1f96b")
@WinRTInterface("e766a48a8bb84954ae67d2fa43d1f96b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynSessionLostEventArgs.ByReference::class)
public interface IAllJoynSessionLostEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): AllJoynSessionLostReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynSessionLostEventArgs> {
    public override fun getValue() = ABI.makeIAllJoynSessionLostEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAllJoynSessionLostEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynSessionLostEventArgs {
    public val __351264206_Ptr: Pointer?

    public val _351264206_VtblPtr: Pointer?
      get() = __351264206_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): AllJoynSessionLostReason? {
      val fnPtr = _351264206_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynSessionLostReason>()
      val hr = fn.invokeHR(arrayOf(__351264206_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynSessionLostReason>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynSessionLostEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __351264206_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynSessionLostEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e766a48a8bb84954ae67d2fa43d1f96b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynSessionLostEventArgs(ptr: Pointer?): WithDefault =
        IAllJoynSessionLostEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynSessionLostEventArgs {
      val address = segment.toRawLongValue()
      return makeIAllJoynSessionLostEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynSessionLostEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__351264206_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynSessionLostEventArgs):
        Array<IAllJoynSessionLostEventArgs?> = (elements as
        Array<IAllJoynSessionLostEventArgs?>).castToImpl<IAllJoynSessionLostEventArgs,IAllJoynSessionLostEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynSessionLostEventArgs?> =
        arrayOfNulls<IAllJoynSessionLostEventArgs_Impl>(size) as
        Array<IAllJoynSessionLostEventArgs?>
  }
}
