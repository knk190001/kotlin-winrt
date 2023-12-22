package Windows.Globalization.PhoneNumberFormatting

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

@ABIMarker(IPhoneNumberInfoStatics.ABI::class)
@Signature("{5b3f4f6a-86a9-40e9-8649-6d61161928d4}")
@Guid("5b3f4f6a86a940e986496d61161928d4")
@WinRTInterface("5b3f4f6a86a940e986496d61161928d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneNumberInfoStatics.ByReference::class)
public interface IPhoneNumberInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryParse(input: String?,
      phoneNumber: Windows.Globalization.PhoneNumberFormatting.PhoneNumberInfo.ByReference?):
      PhoneNumberParseResult?

  @InterfaceMethod(1)
  public fun TryParse(
    input: String?,
    regionCode: String?,
    phoneNumber: Windows.Globalization.PhoneNumberFormatting.PhoneNumberInfo.ByReference?
  ): PhoneNumberParseResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneNumberInfoStatics> {
    public override fun getValue() = ABI.makeIPhoneNumberInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IPhoneNumberInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneNumberInfoStatics {
    public val __1813014651_Ptr: Pointer?

    public val _1813014651_VtblPtr: Pointer?
      get() = __1813014651_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryParse(input: String?,
        phoneNumber: Windows.Globalization.PhoneNumberFormatting.PhoneNumberInfo.ByReference?):
        PhoneNumberParseResult? {
      val fnPtr = _1813014651_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneNumberParseResult>()
      val hr = fn.invokeHR(arrayOf(__1813014651_Ptr, marshalToNative(input),
          marshalToNative(phoneNumber), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneNumberParseResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(
      input: String?,
      regionCode: String?,
      phoneNumber: Windows.Globalization.PhoneNumberFormatting.PhoneNumberInfo.ByReference?
    ): PhoneNumberParseResult? {
      val fnPtr = _1813014651_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneNumberParseResult>()
      val hr = fn.invokeHR(arrayOf(__1813014651_Ptr, marshalToNative(input),
          marshalToNative(regionCode), marshalToNative(phoneNumber), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneNumberParseResult>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneNumberInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813014651_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneNumberInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b3f4f6a86a940e986496d61161928d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneNumberInfoStatics(ptr: Pointer?): WithDefault =
        IPhoneNumberInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneNumberInfoStatics {
      val address = segment.toRawLongValue()
      return makeIPhoneNumberInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhoneNumberInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813014651_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneNumberInfoStatics): Array<IPhoneNumberInfoStatics?>
        = (elements as
        Array<IPhoneNumberInfoStatics?>).castToImpl<IPhoneNumberInfoStatics,IPhoneNumberInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneNumberInfoStatics?> =
        arrayOfNulls<IPhoneNumberInfoStatics_Impl>(size) as Array<IPhoneNumberInfoStatics?>
  }
}
