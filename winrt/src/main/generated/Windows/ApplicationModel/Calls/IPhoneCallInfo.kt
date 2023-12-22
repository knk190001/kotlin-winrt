package Windows.ApplicationModel.Calls

import Windows.Foundation.DateTime
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallInfo.ABI::class)
@Signature("{22b42577-3e4d-5dc6-89c2-469fe5ffc189}")
@Guid("22b425773e4d5dc689c2469fe5ffc189")
@WinRTInterface("22b425773e4d5dc689c2469fe5ffc189")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallInfo.ByReference::class)
public interface IPhoneCallInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_IsHoldSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_StartTime(): DateTime?

  @InterfaceMethod(3)
  public fun get_PhoneNumber(): String?

  @InterfaceMethod(4)
  public fun get_DisplayName(): String?

  @InterfaceMethod(5)
  public fun get_CallDirection(): PhoneCallDirection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPhoneCallInfo>
      {
    public override fun getValue() = ABI.makeIPhoneCallInfo(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallInfo {
    public val __2040596988_Ptr: Pointer?

    public val _2040596988_VtblPtr: Pointer?
      get() = __2040596988_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LineId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _2040596988_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__2040596988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsHoldSupported(): Boolean {
      val fnPtr = _2040596988_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2040596988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_StartTime(): DateTime? {
      val fnPtr = _2040596988_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2040596988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PhoneNumber(): String? {
      val fnPtr = _2040596988_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2040596988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DisplayName(): String? {
      val fnPtr = _2040596988_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2040596988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CallDirection(): PhoneCallDirection? {
      val fnPtr = _2040596988_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallDirection>()
      val hr = fn.invokeHR(arrayOf(__2040596988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallDirection>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2040596988_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22b425773e4d5dc689c2469fe5ffc189")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallInfo(ptr: Pointer?): WithDefault = IPhoneCallInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallInfo {
      val address = segment.toRawLongValue()
      return makeIPhoneCallInfo(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2040596988_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallInfo): Array<IPhoneCallInfo?> = (elements as
        Array<IPhoneCallInfo?>).castToImpl<IPhoneCallInfo,IPhoneCallInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallInfo?> =
        arrayOfNulls<IPhoneCallInfo_Impl>(size) as Array<IPhoneCallInfo?>
  }
}
