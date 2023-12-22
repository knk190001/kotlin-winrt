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

@ABIMarker(ICallRejectEventArgs.ABI::class)
@Signature("{da47fad7-13d4-4d92-a1c2-b77811ee37ec}")
@Guid("da47fad713d44d92a1c2b77811ee37ec")
@WinRTInterface("da47fad713d44d92a1c2b77811ee37ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICallRejectEventArgs.ByReference::class)
public interface ICallRejectEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RejectReason(): VoipPhoneCallRejectReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICallRejectEventArgs> {
    public override fun getValue() = ABI.makeICallRejectEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICallRejectEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICallRejectEventArgs {
    public val __1583360060_Ptr: Pointer?

    public val _1583360060_VtblPtr: Pointer?
      get() = __1583360060_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RejectReason(): VoipPhoneCallRejectReason? {
      val fnPtr = _1583360060_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoipPhoneCallRejectReason>()
      val hr = fn.invokeHR(arrayOf(__1583360060_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoipPhoneCallRejectReason>(result.getValue())
      return resultValue
    }
  }

  public class ICallRejectEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1583360060_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICallRejectEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da47fad713d44d92a1c2b77811ee37ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICallRejectEventArgs(ptr: Pointer?): WithDefault = ICallRejectEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICallRejectEventArgs {
      val address = segment.toRawLongValue()
      return makeICallRejectEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICallRejectEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1583360060_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICallRejectEventArgs): Array<ICallRejectEventArgs?> =
        (elements as
        Array<ICallRejectEventArgs?>).castToImpl<ICallRejectEventArgs,ICallRejectEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICallRejectEventArgs?> =
        arrayOfNulls<ICallRejectEventArgs_Impl>(size) as Array<ICallRejectEventArgs?>
  }
}
