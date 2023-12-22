package Windows.Networking.NetworkOperators

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

@ABIMarker(IUssdReply.ABI::class)
@Signature("{2f9acf82-2005-4d5d-bf81-2aba1b4be4a8}")
@Guid("2f9acf8220054d5dbf812aba1b4be4a8")
@WinRTInterface("2f9acf8220054d5dbf812aba1b4be4a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUssdReply.ByReference::class)
public interface IUssdReply : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResultCode(): UssdResultCode?

  @InterfaceMethod(1)
  public fun get_Message(): UssdMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUssdReply> {
    public override fun getValue() = ABI.makeIUssdReply(pointer.getPointer(0))

    public fun setValue(value: IUssdReply_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUssdReply {
    public val __840857826_Ptr: Pointer?

    public val _840857826_VtblPtr: Pointer?
      get() = __840857826_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResultCode(): UssdResultCode? {
      val fnPtr = _840857826_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UssdResultCode>()
      val hr = fn.invokeHR(arrayOf(__840857826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UssdResultCode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Message(): UssdMessage? {
      val fnPtr = _840857826_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UssdMessage>()
      val hr = fn.invokeHR(arrayOf(__840857826_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UssdMessage>(result.getValue())
      return resultValue
    }
  }

  public class IUssdReply_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __840857826_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUssdReply, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f9acf8220054d5dbf812aba1b4be4a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUssdReply(ptr: Pointer?): WithDefault = IUssdReply_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUssdReply {
      val address = segment.toRawLongValue()
      return makeIUssdReply(Pointer(address))
    }

    public override fun toNative(obj: IUssdReply): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__840857826_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUssdReply): Array<IUssdReply?> = (elements as
        Array<IUssdReply?>).castToImpl<IUssdReply,IUssdReply_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUssdReply?> = arrayOfNulls<IUssdReply_Impl>(size)
        as Array<IUssdReply?>
  }
}
