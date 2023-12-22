package Windows.Security.Authentication.Identity.Core

import Windows.Foundation.TimeSpan
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

@ABIMarker(IMicrosoftAccountMultiFactorOneTimeCodedInfo.ABI::class)
@Signature("{82ba264b-d87c-4668-a976-40cfae547d08}")
@Guid("82ba264bd87c4668a97640cfae547d08")
@WinRTInterface("82ba264bd87c4668a97640cfae547d08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMicrosoftAccountMultiFactorOneTimeCodedInfo.ByReference::class)
public interface IMicrosoftAccountMultiFactorOneTimeCodedInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Code(): String?

  @InterfaceMethod(1)
  public fun get_TimeInterval(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_TimeToLive(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_ServiceResponse(): MicrosoftAccountMultiFactorServiceResponse?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMicrosoftAccountMultiFactorOneTimeCodedInfo> {
    public override fun getValue() =
        ABI.makeIMicrosoftAccountMultiFactorOneTimeCodedInfo(pointer.getPointer(0))

    public fun setValue(value: IMicrosoftAccountMultiFactorOneTimeCodedInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMicrosoftAccountMultiFactorOneTimeCodedInfo {
    public val __1285354478_Ptr: Pointer?

    public val _1285354478_VtblPtr: Pointer?
      get() = __1285354478_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Code(): String? {
      val fnPtr = _1285354478_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1285354478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TimeInterval(): TimeSpan? {
      val fnPtr = _1285354478_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1285354478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TimeToLive(): TimeSpan? {
      val fnPtr = _1285354478_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1285354478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ServiceResponse(): MicrosoftAccountMultiFactorServiceResponse? {
      val fnPtr = _1285354478_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MicrosoftAccountMultiFactorServiceResponse>()
      val hr = fn.invokeHR(arrayOf(__1285354478_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MicrosoftAccountMultiFactorServiceResponse>(result.getValue())
      return resultValue
    }
  }

  public class IMicrosoftAccountMultiFactorOneTimeCodedInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1285354478_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMicrosoftAccountMultiFactorOneTimeCodedInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82ba264bd87c4668a97640cfae547d08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMicrosoftAccountMultiFactorOneTimeCodedInfo(ptr: Pointer?): WithDefault =
        IMicrosoftAccountMultiFactorOneTimeCodedInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMicrosoftAccountMultiFactorOneTimeCodedInfo {
      val address = segment.toRawLongValue()
      return makeIMicrosoftAccountMultiFactorOneTimeCodedInfo(Pointer(address))
    }

    public override fun toNative(obj: IMicrosoftAccountMultiFactorOneTimeCodedInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1285354478_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMicrosoftAccountMultiFactorOneTimeCodedInfo):
        Array<IMicrosoftAccountMultiFactorOneTimeCodedInfo?> = (elements as
        Array<IMicrosoftAccountMultiFactorOneTimeCodedInfo?>).castToImpl<IMicrosoftAccountMultiFactorOneTimeCodedInfo,IMicrosoftAccountMultiFactorOneTimeCodedInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMicrosoftAccountMultiFactorOneTimeCodedInfo?> =
        arrayOfNulls<IMicrosoftAccountMultiFactorOneTimeCodedInfo_Impl>(size) as
        Array<IMicrosoftAccountMultiFactorOneTimeCodedInfo?>
  }
}
