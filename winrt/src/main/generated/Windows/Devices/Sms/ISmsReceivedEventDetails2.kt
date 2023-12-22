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

@ABIMarker(ISmsReceivedEventDetails2.ABI::class)
@Signature("{40e05c86-a7b4-4771-9ae7-0b5ffb12c03a}")
@Guid("40e05c86a7b447719ae70b5ffb12c03a")
@WinRTInterface("40e05c86a7b447719ae70b5ffb12c03a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsReceivedEventDetails2.ByReference::class)
public interface ISmsReceivedEventDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MessageClass(): SmsMessageClass?

  @InterfaceMethod(1)
  public fun get_BinaryMessage(): SmsBinaryMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsReceivedEventDetails2> {
    public override fun getValue() = ABI.makeISmsReceivedEventDetails2(pointer.getPointer(0))

    public fun setValue(value: ISmsReceivedEventDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsReceivedEventDetails2 {
    public val __1313853124_Ptr: Pointer?

    public val _1313853124_VtblPtr: Pointer?
      get() = __1313853124_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MessageClass(): SmsMessageClass? {
      val fnPtr = _1313853124_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsMessageClass>()
      val hr = fn.invokeHR(arrayOf(__1313853124_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsMessageClass>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BinaryMessage(): SmsBinaryMessage? {
      val fnPtr = _1313853124_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsBinaryMessage>()
      val hr = fn.invokeHR(arrayOf(__1313853124_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsBinaryMessage>(result.getValue())
      return resultValue
    }
  }

  public class ISmsReceivedEventDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1313853124_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsReceivedEventDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40e05c86a7b447719ae70b5ffb12c03a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsReceivedEventDetails2(ptr: Pointer?): WithDefault =
        ISmsReceivedEventDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsReceivedEventDetails2 {
      val address = segment.toRawLongValue()
      return makeISmsReceivedEventDetails2(Pointer(address))
    }

    public override fun toNative(obj: ISmsReceivedEventDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1313853124_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsReceivedEventDetails2):
        Array<ISmsReceivedEventDetails2?> = (elements as
        Array<ISmsReceivedEventDetails2?>).castToImpl<ISmsReceivedEventDetails2,ISmsReceivedEventDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsReceivedEventDetails2?> =
        arrayOfNulls<ISmsReceivedEventDetails2_Impl>(size) as Array<ISmsReceivedEventDetails2?>
  }
}
