package Windows.Security.EnterpriseData

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Networking.HostName
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

@ABIMarker(IProtectionPolicyManagerStatics.ABI::class)
@Signature("{c0bffc66-8c3d-4d56-8804-c68f0ad32ec5}")
@Guid("c0bffc668c3d4d568804c68f0ad32ec5")
@WinRTInterface("c0bffc668c3d4d568804c68f0ad32ec5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectionPolicyManagerStatics.ByReference::class)
public interface IProtectionPolicyManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsIdentityManaged(identity: String?): Boolean

  @InterfaceMethod(1)
  public fun TryApplyProcessUIPolicy(identity: String?): Boolean

  @InterfaceMethod(2)
  public fun ClearProcessUIPolicy(): Unit

  @InterfaceMethod(3)
  public fun CreateCurrentThreadNetworkContext(identity: String?): ThreadNetworkContext?

  @InterfaceMethod(4)
  public fun GetPrimaryManagedIdentityForNetworkEndpointAsync(endpointHost: HostName?):
      IAsyncOperation<String?>?

  @InterfaceMethod(5)
  public fun RevokeContent(identity: String?): Unit

  @InterfaceMethod(6)
  public fun GetForCurrentView(): ProtectionPolicyManager?

  @InterfaceMethod(7)
  public
      fun add_ProtectedAccessSuspending(handler: EventHandler<ProtectedAccessSuspendingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_ProtectedAccessSuspending(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_ProtectedAccessResumed(handler: EventHandler<ProtectedAccessResumedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_ProtectedAccessResumed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_ProtectedContentRevoked(handler: EventHandler<ProtectedContentRevokedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_ProtectedContentRevoked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun CheckAccess(sourceIdentity: String?, targetIdentity: String?):
      ProtectionPolicyEvaluationResult?

  @InterfaceMethod(14)
  public fun RequestAccessAsync(sourceIdentity: String?, targetIdentity: String?):
      IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectionPolicyManagerStatics> {
    public override fun getValue() = ABI.makeIProtectionPolicyManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IProtectionPolicyManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectionPolicyManagerStatics {
    public val __1803182590_Ptr: Pointer?

    public val _1803182590_VtblPtr: Pointer?
      get() = __1803182590_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsIdentityManaged(identity: String?): Boolean {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TryApplyProcessUIPolicy(identity: String?): Boolean {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun ClearProcessUIPolicy(): Unit {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun CreateCurrentThreadNetworkContext(identity: String?):
        ThreadNetworkContext? {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ThreadNetworkContext>()
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ThreadNetworkContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetPrimaryManagedIdentityForNetworkEndpointAsync(endpointHost: HostName?):
        IAsyncOperation<String?>? {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(endpointHost), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RevokeContent(identity: String?): Unit {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(identity),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun GetForCurrentView(): ProtectionPolicyManager? {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProtectionPolicyManager>()
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProtectionPolicyManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override
        fun add_ProtectedAccessSuspending(handler: EventHandler<ProtectedAccessSuspendingEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_ProtectedAccessSuspending(token: EventRegistrationToken?): Unit {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override
        fun add_ProtectedAccessResumed(handler: EventHandler<ProtectedAccessResumedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_ProtectedAccessResumed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override
        fun add_ProtectedContentRevoked(handler: EventHandler<ProtectedContentRevokedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_ProtectedContentRevoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun CheckAccess(sourceIdentity: String?, targetIdentity: String?):
        ProtectionPolicyEvaluationResult? {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProtectionPolicyEvaluationResult>()
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(sourceIdentity),
          marshalToNative(targetIdentity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProtectionPolicyEvaluationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun RequestAccessAsync(sourceIdentity: String?, targetIdentity: String?):
        IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _1803182590_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1803182590_Ptr, marshalToNative(sourceIdentity),
          marshalToNative(targetIdentity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IProtectionPolicyManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1803182590_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectionPolicyManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0bffc668c3d4d568804c68f0ad32ec5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectionPolicyManagerStatics(ptr: Pointer?): WithDefault =
        IProtectionPolicyManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectionPolicyManagerStatics {
      val address = segment.toRawLongValue()
      return makeIProtectionPolicyManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IProtectionPolicyManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1803182590_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectionPolicyManagerStatics):
        Array<IProtectionPolicyManagerStatics?> = (elements as
        Array<IProtectionPolicyManagerStatics?>).castToImpl<IProtectionPolicyManagerStatics,IProtectionPolicyManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectionPolicyManagerStatics?> =
        arrayOfNulls<IProtectionPolicyManagerStatics_Impl>(size) as
        Array<IProtectionPolicyManagerStatics?>
  }
}
