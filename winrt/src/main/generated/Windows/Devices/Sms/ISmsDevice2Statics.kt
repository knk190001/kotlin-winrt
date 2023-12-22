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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmsDevice2Statics.ABI::class)
@Signature("{65c78325-1031-491e-8fb6-ef9991afe363}")
@Guid("65c783251031491e8fb6ef9991afe363")
@WinRTInterface("65c783251031491e8fb6ef9991afe363")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsDevice2Statics.ByReference::class)
public interface ISmsDevice2Statics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun FromId(deviceId: String?): SmsDevice2?

  @InterfaceMethod(2)
  public fun GetDefault(): SmsDevice2?

  @InterfaceMethod(3)
  public fun FromParentId(parentDeviceId: String?): SmsDevice2?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsDevice2Statics> {
    public override fun getValue() = ABI.makeISmsDevice2Statics(pointer.getPointer(0))

    public fun setValue(value: ISmsDevice2Statics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsDevice2Statics {
    public val __1525550026_Ptr: Pointer?

    public val _1525550026_VtblPtr: Pointer?
      get() = __1525550026_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1525550026_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1525550026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromId(deviceId: String?): SmsDevice2? {
      val fnPtr = _1525550026_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsDevice2>()
      val hr = fn.invokeHR(arrayOf(__1525550026_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsDevice2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDefault(): SmsDevice2? {
      val fnPtr = _1525550026_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsDevice2>()
      val hr = fn.invokeHR(arrayOf(__1525550026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsDevice2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FromParentId(parentDeviceId: String?): SmsDevice2? {
      val fnPtr = _1525550026_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsDevice2>()
      val hr = fn.invokeHR(arrayOf(__1525550026_Ptr, marshalToNative(parentDeviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsDevice2>(result.getValue())
      return resultValue
    }
  }

  public class ISmsDevice2Statics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1525550026_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsDevice2Statics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("65c783251031491e8fb6ef9991afe363")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsDevice2Statics(ptr: Pointer?): WithDefault = ISmsDevice2Statics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsDevice2Statics {
      val address = segment.toRawLongValue()
      return makeISmsDevice2Statics(Pointer(address))
    }

    public override fun toNative(obj: ISmsDevice2Statics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1525550026_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsDevice2Statics): Array<ISmsDevice2Statics?> =
        (elements as
        Array<ISmsDevice2Statics?>).castToImpl<ISmsDevice2Statics,ISmsDevice2Statics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsDevice2Statics?> =
        arrayOfNulls<ISmsDevice2Statics_Impl>(size) as Array<ISmsDevice2Statics?>
  }
}
