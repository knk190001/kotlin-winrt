package Windows.ApplicationModel.Calls

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IPhoneCallsResult.ABI::class)
@Signature("{1bfad365-57cf-57dd-986d-b057c91eac33}")
@Guid("1bfad36557cf57dd986db057c91eac33")
@WinRTInterface("1bfad36557cf57dd986db057c91eac33")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallsResult.ByReference::class)
public interface IPhoneCallsResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OperationStatus(): PhoneLineOperationStatus?

  @InterfaceMethod(1)
  public fun get_AllActivePhoneCalls(): IVectorView<PhoneCall?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallsResult> {
    public override fun getValue() = ABI.makeIPhoneCallsResult(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallsResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallsResult {
    public val __1724093822_Ptr: Pointer?

    public val _1724093822_VtblPtr: Pointer?
      get() = __1724093822_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OperationStatus(): PhoneLineOperationStatus? {
      val fnPtr = _1724093822_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1724093822_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AllActivePhoneCalls(): IVectorView<PhoneCall?>? {
      val fnPtr = _1724093822_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PhoneCall?>>()
      val hr = fn.invokeHR(arrayOf(__1724093822_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PhoneCall?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1724093822_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallsResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1bfad36557cf57dd986db057c91eac33")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallsResult(ptr: Pointer?): WithDefault = IPhoneCallsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallsResult {
      val address = segment.toRawLongValue()
      return makeIPhoneCallsResult(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1724093822_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallsResult): Array<IPhoneCallsResult?> = (elements
        as Array<IPhoneCallsResult?>).castToImpl<IPhoneCallsResult,IPhoneCallsResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallsResult?> =
        arrayOfNulls<IPhoneCallsResult_Impl>(size) as Array<IPhoneCallsResult?>
  }
}
