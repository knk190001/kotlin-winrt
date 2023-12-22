package Windows.Networking.Sockets

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

@ABIMarker(IStreamSocketListenerConnectionReceivedEventArgs.ABI::class)
@Signature("{0c472ea9-373f-447b-85b1-ddd4548803ba}")
@Guid("0c472ea9373f447b85b1ddd4548803ba")
@WinRTInterface("0c472ea9373f447b85b1ddd4548803ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketListenerConnectionReceivedEventArgs.ByReference::class)
public interface IStreamSocketListenerConnectionReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Socket(): StreamSocket?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketListenerConnectionReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIStreamSocketListenerConnectionReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketListenerConnectionReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketListenerConnectionReceivedEventArgs {
    public val __934388569_Ptr: Pointer?

    public val _934388569_VtblPtr: Pointer?
      get() = __934388569_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Socket(): StreamSocket? {
      val fnPtr = _934388569_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StreamSocket>()
      val hr = fn.invokeHR(arrayOf(__934388569_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StreamSocket>(result.getValue())
      return resultValue
    }
  }

  public class IStreamSocketListenerConnectionReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __934388569_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketListenerConnectionReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c472ea9373f447b85b1ddd4548803ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketListenerConnectionReceivedEventArgs(ptr: Pointer?): WithDefault =
        IStreamSocketListenerConnectionReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IStreamSocketListenerConnectionReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIStreamSocketListenerConnectionReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketListenerConnectionReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__934388569_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketListenerConnectionReceivedEventArgs):
        Array<IStreamSocketListenerConnectionReceivedEventArgs?> = (elements as
        Array<IStreamSocketListenerConnectionReceivedEventArgs?>).castToImpl<IStreamSocketListenerConnectionReceivedEventArgs,IStreamSocketListenerConnectionReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketListenerConnectionReceivedEventArgs?>
        = arrayOfNulls<IStreamSocketListenerConnectionReceivedEventArgs_Impl>(size) as
        Array<IStreamSocketListenerConnectionReceivedEventArgs?>
  }
}
