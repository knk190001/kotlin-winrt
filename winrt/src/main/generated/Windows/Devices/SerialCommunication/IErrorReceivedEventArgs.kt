package Windows.Devices.SerialCommunication

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

@ABIMarker(IErrorReceivedEventArgs.ABI::class)
@Signature("{fcc6bf59-1283-4d8a-bfdf-566b33ddb28f}")
@Guid("fcc6bf5912834d8abfdf566b33ddb28f")
@WinRTInterface("fcc6bf5912834d8abfdf566b33ddb28f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IErrorReceivedEventArgs.ByReference::class)
public interface IErrorReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Error(): SerialError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IErrorReceivedEventArgs> {
    public override fun getValue() = ABI.makeIErrorReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IErrorReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IErrorReceivedEventArgs {
    public val __1944101103_Ptr: Pointer?

    public val _1944101103_VtblPtr: Pointer?
      get() = __1944101103_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Error(): SerialError? {
      val fnPtr = _1944101103_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SerialError>()
      val hr = fn.invokeHR(arrayOf(__1944101103_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SerialError>(result.getValue())
      return resultValue
    }
  }

  public class IErrorReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1944101103_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IErrorReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fcc6bf5912834d8abfdf566b33ddb28f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIErrorReceivedEventArgs(ptr: Pointer?): WithDefault =
        IErrorReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IErrorReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIErrorReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IErrorReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1944101103_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IErrorReceivedEventArgs): Array<IErrorReceivedEventArgs?>
        = (elements as
        Array<IErrorReceivedEventArgs?>).castToImpl<IErrorReceivedEventArgs,IErrorReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IErrorReceivedEventArgs?> =
        arrayOfNulls<IErrorReceivedEventArgs_Impl>(size) as Array<IErrorReceivedEventArgs?>
  }
}
