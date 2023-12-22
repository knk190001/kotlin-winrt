package Windows.Devices.Sms

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

@ABIMarker(ISmsMessageReceivedEventArgs.ABI::class)
@Signature("{08e80a98-b8e5-41c1-a3d8-d3abfae22675}")
@Guid("08e80a98b8e541c1a3d8d3abfae22675")
@WinRTInterface("08e80a98b8e541c1a3d8d3abfae22675")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsMessageReceivedEventArgs.ByReference::class)
public interface ISmsMessageReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextMessage(): SmsTextMessage?

  @InterfaceMethod(1)
  public fun get_BinaryMessage(): SmsBinaryMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsMessageReceivedEventArgs> {
    public override fun getValue() = ABI.makeISmsMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISmsMessageReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsMessageReceivedEventArgs {
    public val __1523644196_Ptr: Pointer?

    public val _1523644196_VtblPtr: Pointer?
      get() = __1523644196_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextMessage(): SmsTextMessage? {
      val fnPtr = _1523644196_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsTextMessage>()
      val hr = fn.invokeHR(arrayOf(__1523644196_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsTextMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BinaryMessage(): SmsBinaryMessage? {
      val fnPtr = _1523644196_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsBinaryMessage>()
      val hr = fn.invokeHR(arrayOf(__1523644196_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsBinaryMessage>(result.getValue())
      return resultValue
    }
  }

  public class ISmsMessageReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1523644196_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsMessageReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08e80a98b8e541c1a3d8d3abfae22675")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsMessageReceivedEventArgs(ptr: Pointer?): WithDefault =
        ISmsMessageReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeISmsMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISmsMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1523644196_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsMessageReceivedEventArgs):
        Array<ISmsMessageReceivedEventArgs?> = (elements as
        Array<ISmsMessageReceivedEventArgs?>).castToImpl<ISmsMessageReceivedEventArgs,ISmsMessageReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsMessageReceivedEventArgs?> =
        arrayOfNulls<ISmsMessageReceivedEventArgs_Impl>(size) as
        Array<ISmsMessageReceivedEventArgs?>
  }
}
