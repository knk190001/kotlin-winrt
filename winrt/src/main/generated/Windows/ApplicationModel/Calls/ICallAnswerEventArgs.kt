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

@ABIMarker(ICallAnswerEventArgs.ABI::class)
@Signature("{fd789617-2dd7-4c8c-b2bd-95d17a5bb733}")
@Guid("fd7896172dd74c8cb2bd95d17a5bb733")
@WinRTInterface("fd7896172dd74c8cb2bd95d17a5bb733")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICallAnswerEventArgs.ByReference::class)
public interface ICallAnswerEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AcceptedMedia(): VoipPhoneCallMedia?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICallAnswerEventArgs> {
    public override fun getValue() = ABI.makeICallAnswerEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICallAnswerEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICallAnswerEventArgs {
    public val __2048291075_Ptr: Pointer?

    public val _2048291075_VtblPtr: Pointer?
      get() = __2048291075_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AcceptedMedia(): VoipPhoneCallMedia? {
      val fnPtr = _2048291075_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoipPhoneCallMedia>()
      val hr = fn.invokeHR(arrayOf(__2048291075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoipPhoneCallMedia>(result.getValue())
      return resultValue
    }
  }

  public class ICallAnswerEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2048291075_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICallAnswerEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd7896172dd74c8cb2bd95d17a5bb733")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICallAnswerEventArgs(ptr: Pointer?): WithDefault = ICallAnswerEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICallAnswerEventArgs {
      val address = segment.toRawLongValue()
      return makeICallAnswerEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICallAnswerEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2048291075_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICallAnswerEventArgs): Array<ICallAnswerEventArgs?> =
        (elements as
        Array<ICallAnswerEventArgs?>).castToImpl<ICallAnswerEventArgs,ICallAnswerEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICallAnswerEventArgs?> =
        arrayOfNulls<ICallAnswerEventArgs_Impl>(size) as Array<ICallAnswerEventArgs?>
  }
}
