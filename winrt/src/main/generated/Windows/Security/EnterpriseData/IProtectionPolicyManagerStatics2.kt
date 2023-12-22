package Windows.Security.EnterpriseData

import Windows.Foundation.DateTime
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IProtectionPolicyManagerStatics2.ABI::class)
@Signature("{b68f9a8c-39e0-4649-b2e4-070ab8a579b3}")
@Guid("b68f9a8c39e04649b2e4070ab8a579b3")
@WinRTInterface("b68f9a8c39e04649b2e4070ab8a579b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectionPolicyManagerStatics2.ByReference::class)
public interface IProtectionPolicyManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun HasContentBeenRevokedSince(identity: String?, since: DateTime?): Boolean

  @InterfaceMethod(1)
  public fun CheckAccessForApp(sourceIdentity: String?, appPackageFamilyName: String?):
      ProtectionPolicyEvaluationResult?

  @InterfaceMethod(2)
  public fun RequestAccessForAppAsync(sourceIdentity: String?, appPackageFamilyName: String?):
      IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(3)
  public fun GetEnforcementLevel(identity: String?): EnforcementLevel?

  @InterfaceMethod(4)
  public fun IsUserDecryptionAllowed(identity: String?): Boolean

  @InterfaceMethod(5)
  public fun IsProtectionUnderLockRequired(identity: String?): Boolean

  @InterfaceMethod(6)
  public fun add_PolicyChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_PolicyChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun get_IsProtectionEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectionPolicyManagerStatics2> {
    public override fun getValue() = ABI.makeIProtectionPolicyManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IProtectionPolicyManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectionPolicyManagerStatics2 {
    public val __64085492_Ptr: Pointer?

    public val _64085492_VtblPtr: Pointer?
      get() = __64085492_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun HasContentBeenRevokedSince(identity: String?, since: DateTime?): Boolean {
      val fnPtr = _64085492_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__64085492_Ptr, marshalToNative(identity),
          marshalToNative(since), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun CheckAccessForApp(sourceIdentity: String?, appPackageFamilyName: String?):
        ProtectionPolicyEvaluationResult? {
      val fnPtr = _64085492_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProtectionPolicyEvaluationResult>()
      val hr = fn.invokeHR(arrayOf(__64085492_Ptr, marshalToNative(sourceIdentity),
          marshalToNative(appPackageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProtectionPolicyEvaluationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestAccessForAppAsync(sourceIdentity: String?,
        appPackageFamilyName: String?): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _64085492_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__64085492_Ptr, marshalToNative(sourceIdentity),
          marshalToNative(appPackageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetEnforcementLevel(identity: String?): EnforcementLevel? {
      val fnPtr = _64085492_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EnforcementLevel>()
      val hr = fn.invokeHR(arrayOf(__64085492_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EnforcementLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun IsUserDecryptionAllowed(identity: String?): Boolean {
      val fnPtr = _64085492_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__64085492_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun IsProtectionUnderLockRequired(identity: String?): Boolean {
      val fnPtr = _64085492_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__64085492_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun add_PolicyChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _64085492_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__64085492_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_PolicyChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _64085492_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__64085492_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsProtectionEnabled(): Boolean {
      val fnPtr = _64085492_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__64085492_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IProtectionPolicyManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __64085492_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectionPolicyManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b68f9a8c39e04649b2e4070ab8a579b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectionPolicyManagerStatics2(ptr: Pointer?): WithDefault =
        IProtectionPolicyManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectionPolicyManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIProtectionPolicyManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IProtectionPolicyManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__64085492_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectionPolicyManagerStatics2):
        Array<IProtectionPolicyManagerStatics2?> = (elements as
        Array<IProtectionPolicyManagerStatics2?>).castToImpl<IProtectionPolicyManagerStatics2,IProtectionPolicyManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectionPolicyManagerStatics2?> =
        arrayOfNulls<IProtectionPolicyManagerStatics2_Impl>(size) as
        Array<IProtectionPolicyManagerStatics2?>
  }
}
