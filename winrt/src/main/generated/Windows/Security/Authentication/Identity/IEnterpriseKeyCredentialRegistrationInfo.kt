package Windows.Security.Authentication.Identity

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

@ABIMarker(IEnterpriseKeyCredentialRegistrationInfo.ABI::class)
@Signature("{38321acc-672b-4823-b603-6b3c753daf97}")
@Guid("38321acc672b4823b6036b3c753daf97")
@WinRTInterface("38321acc672b4823b6036b3c753daf97")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEnterpriseKeyCredentialRegistrationInfo.ByReference::class)
public interface IEnterpriseKeyCredentialRegistrationInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TenantId(): String?

  @InterfaceMethod(1)
  public fun get_TenantName(): String?

  @InterfaceMethod(2)
  public fun get_Subject(): String?

  @InterfaceMethod(3)
  public fun get_KeyId(): String?

  @InterfaceMethod(4)
  public fun get_KeyName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEnterpriseKeyCredentialRegistrationInfo> {
    public override fun getValue() =
        ABI.makeIEnterpriseKeyCredentialRegistrationInfo(pointer.getPointer(0))

    public fun setValue(value: IEnterpriseKeyCredentialRegistrationInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEnterpriseKeyCredentialRegistrationInfo {
    public val __607986916_Ptr: Pointer?

    public val _607986916_VtblPtr: Pointer?
      get() = __607986916_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TenantId(): String? {
      val fnPtr = _607986916_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__607986916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TenantName(): String? {
      val fnPtr = _607986916_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__607986916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Subject(): String? {
      val fnPtr = _607986916_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__607986916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_KeyId(): String? {
      val fnPtr = _607986916_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__607986916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_KeyName(): String? {
      val fnPtr = _607986916_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__607986916_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IEnterpriseKeyCredentialRegistrationInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __607986916_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEnterpriseKeyCredentialRegistrationInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38321acc672b4823b6036b3c753daf97")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEnterpriseKeyCredentialRegistrationInfo(ptr: Pointer?): WithDefault =
        IEnterpriseKeyCredentialRegistrationInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEnterpriseKeyCredentialRegistrationInfo {
      val address = segment.toRawLongValue()
      return makeIEnterpriseKeyCredentialRegistrationInfo(Pointer(address))
    }

    public override fun toNative(obj: IEnterpriseKeyCredentialRegistrationInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__607986916_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEnterpriseKeyCredentialRegistrationInfo):
        Array<IEnterpriseKeyCredentialRegistrationInfo?> = (elements as
        Array<IEnterpriseKeyCredentialRegistrationInfo?>).castToImpl<IEnterpriseKeyCredentialRegistrationInfo,IEnterpriseKeyCredentialRegistrationInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEnterpriseKeyCredentialRegistrationInfo?> =
        arrayOfNulls<IEnterpriseKeyCredentialRegistrationInfo_Impl>(size) as
        Array<IEnterpriseKeyCredentialRegistrationInfo?>
  }
}
