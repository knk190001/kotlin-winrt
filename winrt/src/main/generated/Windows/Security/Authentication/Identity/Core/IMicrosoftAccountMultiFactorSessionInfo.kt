package Windows.Security.Authentication.Identity.Core

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMicrosoftAccountMultiFactorSessionInfo.ABI::class)
@Signature("{5f7eabb4-a278-4635-b765-b494eb260af4}")
@Guid("5f7eabb4a2784635b765b494eb260af4")
@WinRTInterface("5f7eabb4a2784635b765b494eb260af4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMicrosoftAccountMultiFactorSessionInfo.ByReference::class)
public interface IMicrosoftAccountMultiFactorSessionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UserAccountId(): String?

  @InterfaceMethod(1)
  public fun get_SessionId(): String?

  @InterfaceMethod(2)
  public fun get_DisplaySessionId(): String?

  @InterfaceMethod(3)
  public fun get_ApprovalStatus(): MicrosoftAccountMultiFactorSessionApprovalStatus?

  @InterfaceMethod(4)
  public fun get_AuthenticationType(): MicrosoftAccountMultiFactorAuthenticationType?

  @InterfaceMethod(5)
  public fun get_RequestTime(): DateTime?

  @InterfaceMethod(6)
  public fun get_ExpirationTime(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMicrosoftAccountMultiFactorSessionInfo> {
    public override fun getValue() =
        ABI.makeIMicrosoftAccountMultiFactorSessionInfo(pointer.getPointer(0))

    public fun setValue(value: IMicrosoftAccountMultiFactorSessionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMicrosoftAccountMultiFactorSessionInfo {
    public val __2121753784_Ptr: Pointer?

    public val _2121753784_VtblPtr: Pointer?
      get() = __2121753784_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UserAccountId(): String? {
      val fnPtr = _2121753784_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2121753784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SessionId(): String? {
      val fnPtr = _2121753784_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2121753784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DisplaySessionId(): String? {
      val fnPtr = _2121753784_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2121753784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ApprovalStatus(): MicrosoftAccountMultiFactorSessionApprovalStatus? {
      val fnPtr = _2121753784_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MicrosoftAccountMultiFactorSessionApprovalStatus>()
      val hr = fn.invokeHR(arrayOf(__2121753784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MicrosoftAccountMultiFactorSessionApprovalStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AuthenticationType(): MicrosoftAccountMultiFactorAuthenticationType? {
      val fnPtr = _2121753784_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MicrosoftAccountMultiFactorAuthenticationType>()
      val hr = fn.invokeHR(arrayOf(__2121753784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MicrosoftAccountMultiFactorAuthenticationType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RequestTime(): DateTime? {
      val fnPtr = _2121753784_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2121753784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ExpirationTime(): DateTime? {
      val fnPtr = _2121753784_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2121753784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IMicrosoftAccountMultiFactorSessionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2121753784_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMicrosoftAccountMultiFactorSessionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f7eabb4a2784635b765b494eb260af4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMicrosoftAccountMultiFactorSessionInfo(ptr: Pointer?): WithDefault =
        IMicrosoftAccountMultiFactorSessionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMicrosoftAccountMultiFactorSessionInfo {
      val address = segment.toRawLongValue()
      return makeIMicrosoftAccountMultiFactorSessionInfo(Pointer(address))
    }

    public override fun toNative(obj: IMicrosoftAccountMultiFactorSessionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2121753784_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMicrosoftAccountMultiFactorSessionInfo):
        Array<IMicrosoftAccountMultiFactorSessionInfo?> = (elements as
        Array<IMicrosoftAccountMultiFactorSessionInfo?>).castToImpl<IMicrosoftAccountMultiFactorSessionInfo,IMicrosoftAccountMultiFactorSessionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMicrosoftAccountMultiFactorSessionInfo?> =
        arrayOfNulls<IMicrosoftAccountMultiFactorSessionInfo_Impl>(size) as
        Array<IMicrosoftAccountMultiFactorSessionInfo?>
  }
}
