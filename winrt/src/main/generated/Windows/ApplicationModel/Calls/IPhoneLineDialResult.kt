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

@ABIMarker(IPhoneLineDialResult.ABI::class)
@Signature("{e825a30a-5c7f-546f-b918-3ad2fe70fb34}")
@Guid("e825a30a5c7f546fb9183ad2fe70fb34")
@WinRTInterface("e825a30a5c7f546fb9183ad2fe70fb34")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLineDialResult.ByReference::class)
public interface IPhoneLineDialResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DialCallStatus(): PhoneCallOperationStatus?

  @InterfaceMethod(1)
  public fun get_DialedCall(): PhoneCall?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneLineDialResult> {
    public override fun getValue() = ABI.makeIPhoneLineDialResult(pointer.getPointer(0))

    public fun setValue(value: IPhoneLineDialResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLineDialResult {
    public val __898363247_Ptr: Pointer?

    public val _898363247_VtblPtr: Pointer?
      get() = __898363247_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DialCallStatus(): PhoneCallOperationStatus? {
      val fnPtr = _898363247_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__898363247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DialedCall(): PhoneCall? {
      val fnPtr = _898363247_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCall>()
      val hr = fn.invokeHR(arrayOf(__898363247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCall>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneLineDialResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __898363247_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLineDialResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e825a30a5c7f546fb9183ad2fe70fb34")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLineDialResult(ptr: Pointer?): WithDefault = IPhoneLineDialResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLineDialResult {
      val address = segment.toRawLongValue()
      return makeIPhoneLineDialResult(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLineDialResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__898363247_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLineDialResult): Array<IPhoneLineDialResult?> =
        (elements as
        Array<IPhoneLineDialResult?>).castToImpl<IPhoneLineDialResult,IPhoneLineDialResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLineDialResult?> =
        arrayOfNulls<IPhoneLineDialResult_Impl>(size) as Array<IPhoneLineDialResult?>
  }
}
