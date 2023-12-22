package Windows.ApplicationModel.Calls

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

@ABIMarker(ICallStateChangeEventArgs.ABI::class)
@Signature("{eab2349e-66f5-47f9-9fb5-459c5198c720}")
@Guid("eab2349e66f547f99fb5459c5198c720")
@WinRTInterface("eab2349e66f547f99fb5459c5198c720")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICallStateChangeEventArgs.ByReference::class)
public interface ICallStateChangeEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): VoipPhoneCallState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICallStateChangeEventArgs> {
    public override fun getValue() = ABI.makeICallStateChangeEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICallStateChangeEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICallStateChangeEventArgs {
    public val __1400348658_Ptr: Pointer?

    public val _1400348658_VtblPtr: Pointer?
      get() = __1400348658_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): VoipPhoneCallState? {
      val fnPtr = _1400348658_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoipPhoneCallState>()
      val hr = fn.invokeHR(arrayOf(__1400348658_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoipPhoneCallState>(result.getValue())
      return resultValue
    }
  }

  public class ICallStateChangeEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1400348658_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICallStateChangeEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eab2349e66f547f99fb5459c5198c720")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICallStateChangeEventArgs(ptr: Pointer?): WithDefault =
        ICallStateChangeEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICallStateChangeEventArgs {
      val address = segment.toRawLongValue()
      return makeICallStateChangeEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICallStateChangeEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1400348658_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICallStateChangeEventArgs):
        Array<ICallStateChangeEventArgs?> = (elements as
        Array<ICallStateChangeEventArgs?>).castToImpl<ICallStateChangeEventArgs,ICallStateChangeEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICallStateChangeEventArgs?> =
        arrayOfNulls<ICallStateChangeEventArgs_Impl>(size) as Array<ICallStateChangeEventArgs?>
  }
}
