package Windows.Devices.SmartCards

import Windows.Foundation.DateTime
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ISmartCardPinResetRequest.ABI::class)
@Signature("{12fe3c4d-5fb9-4e8e-9ff6-61f475124fef}")
@Guid("12fe3c4d5fb94e8e9ff661f475124fef")
@WinRTInterface("12fe3c4d5fb94e8e9ff661f475124fef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardPinResetRequest.ByReference::class)
public interface ISmartCardPinResetRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Challenge(): IBuffer?

  @InterfaceMethod(1)
  public fun get_Deadline(): DateTime?

  @InterfaceMethod(2)
  public fun GetDeferral(): SmartCardPinResetDeferral?

  @InterfaceMethod(3)
  public fun SetResponse(response: IBuffer?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardPinResetRequest> {
    public override fun getValue() = ABI.makeISmartCardPinResetRequest(pointer.getPointer(0))

    public fun setValue(value: ISmartCardPinResetRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardPinResetRequest {
    public val __27207057_Ptr: Pointer?

    public val _27207057_VtblPtr: Pointer?
      get() = __27207057_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Challenge(): IBuffer? {
      val fnPtr = _27207057_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__27207057_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _27207057_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__27207057_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): SmartCardPinResetDeferral? {
      val fnPtr = _27207057_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardPinResetDeferral>()
      val hr = fn.invokeHR(arrayOf(__27207057_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardPinResetDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetResponse(response: IBuffer?): Unit {
      val fnPtr = _27207057_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__27207057_Ptr, marshalToNative(response),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmartCardPinResetRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __27207057_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardPinResetRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12fe3c4d5fb94e8e9ff661f475124fef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardPinResetRequest(ptr: Pointer?): WithDefault =
        ISmartCardPinResetRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardPinResetRequest {
      val address = segment.toRawLongValue()
      return makeISmartCardPinResetRequest(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardPinResetRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__27207057_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardPinResetRequest):
        Array<ISmartCardPinResetRequest?> = (elements as
        Array<ISmartCardPinResetRequest?>).castToImpl<ISmartCardPinResetRequest,ISmartCardPinResetRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardPinResetRequest?> =
        arrayOfNulls<ISmartCardPinResetRequest_Impl>(size) as Array<ISmartCardPinResetRequest?>
  }
}
