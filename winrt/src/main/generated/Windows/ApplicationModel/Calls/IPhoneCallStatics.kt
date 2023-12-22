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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallStatics.ABI::class)
@Signature("{2218eeab-f60b-53e7-ba13-5aeafbc22957}")
@Guid("2218eeabf60b53e7ba135aeafbc22957")
@WinRTInterface("2218eeabf60b53e7ba135aeafbc22957")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallStatics.ByReference::class)
public interface IPhoneCallStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFromId(callId: String?): PhoneCall?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallStatics> {
    public override fun getValue() = ABI.makeIPhoneCallStatics(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallStatics {
    public val __910274487_Ptr: Pointer?

    public val _910274487_VtblPtr: Pointer?
      get() = __910274487_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFromId(callId: String?): PhoneCall? {
      val fnPtr = _910274487_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCall>()
      val hr = fn.invokeHR(arrayOf(__910274487_Ptr, marshalToNative(callId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCall>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __910274487_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2218eeabf60b53e7ba135aeafbc22957")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallStatics(ptr: Pointer?): WithDefault = IPhoneCallStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallStatics {
      val address = segment.toRawLongValue()
      return makeIPhoneCallStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__910274487_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallStatics): Array<IPhoneCallStatics?> = (elements
        as Array<IPhoneCallStatics?>).castToImpl<IPhoneCallStatics,IPhoneCallStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallStatics?> =
        arrayOfNulls<IPhoneCallStatics_Impl>(size) as Array<IPhoneCallStatics?>
  }
}
