package Windows.Security.EnterpriseData

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IProtectionPolicyManagerStatics3.ABI::class)
@Signature("{48ff9e8c-6a6f-4d9f-bced-18ab537aa015}")
@Guid("48ff9e8c6a6f4d9fbced18ab537aa015")
@WinRTInterface("48ff9e8c6a6f4d9fbced18ab537aa015")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectionPolicyManagerStatics3.ByReference::class)
public interface IProtectionPolicyManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessAsync(
    sourceIdentity: String?,
    targetIdentity: String?,
    auditInfo: ProtectionPolicyAuditInfo?
  ): IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(1)
  public fun RequestAccessAsync(
    sourceIdentity: String?,
    targetIdentity: String?,
    auditInfo: ProtectionPolicyAuditInfo?,
    messageFromApp: String?
  ): IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(2)
  public fun RequestAccessForAppAsync(
    sourceIdentity: String?,
    appPackageFamilyName: String?,
    auditInfo: ProtectionPolicyAuditInfo?
  ): IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(3)
  public fun RequestAccessForAppAsync(
    sourceIdentity: String?,
    appPackageFamilyName: String?,
    auditInfo: ProtectionPolicyAuditInfo?,
    messageFromApp: String?
  ): IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(4)
  public fun LogAuditEvent(
    sourceIdentity: String?,
    targetIdentity: String?,
    auditInfo: ProtectionPolicyAuditInfo?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectionPolicyManagerStatics3> {
    public override fun getValue() = ABI.makeIProtectionPolicyManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IProtectionPolicyManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectionPolicyManagerStatics3 {
    public val __64085493_Ptr: Pointer?

    public val _64085493_VtblPtr: Pointer?
      get() = __64085493_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessAsync(
      sourceIdentity: String?,
      targetIdentity: String?,
      auditInfo: ProtectionPolicyAuditInfo?
    ): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _64085493_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__64085493_Ptr, marshalToNative(sourceIdentity),
          marshalToNative(targetIdentity), marshalToNative(auditInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAccessAsync(
      sourceIdentity: String?,
      targetIdentity: String?,
      auditInfo: ProtectionPolicyAuditInfo?,
      messageFromApp: String?
    ): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _64085493_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__64085493_Ptr, marshalToNative(sourceIdentity),
          marshalToNative(targetIdentity), marshalToNative(auditInfo),
          marshalToNative(messageFromApp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestAccessForAppAsync(
      sourceIdentity: String?,
      appPackageFamilyName: String?,
      auditInfo: ProtectionPolicyAuditInfo?
    ): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _64085493_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__64085493_Ptr, marshalToNative(sourceIdentity),
          marshalToNative(appPackageFamilyName), marshalToNative(auditInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestAccessForAppAsync(
      sourceIdentity: String?,
      appPackageFamilyName: String?,
      auditInfo: ProtectionPolicyAuditInfo?,
      messageFromApp: String?
    ): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _64085493_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__64085493_Ptr, marshalToNative(sourceIdentity),
          marshalToNative(appPackageFamilyName), marshalToNative(auditInfo),
          marshalToNative(messageFromApp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun LogAuditEvent(
      sourceIdentity: String?,
      targetIdentity: String?,
      auditInfo: ProtectionPolicyAuditInfo?
    ): Unit {
      val fnPtr = _64085493_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__64085493_Ptr, marshalToNative(sourceIdentity),
          marshalToNative(targetIdentity), marshalToNative(auditInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IProtectionPolicyManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __64085493_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectionPolicyManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48ff9e8c6a6f4d9fbced18ab537aa015")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectionPolicyManagerStatics3(ptr: Pointer?): WithDefault =
        IProtectionPolicyManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectionPolicyManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIProtectionPolicyManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IProtectionPolicyManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__64085493_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectionPolicyManagerStatics3):
        Array<IProtectionPolicyManagerStatics3?> = (elements as
        Array<IProtectionPolicyManagerStatics3?>).castToImpl<IProtectionPolicyManagerStatics3,IProtectionPolicyManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectionPolicyManagerStatics3?> =
        arrayOfNulls<IProtectionPolicyManagerStatics3_Impl>(size) as
        Array<IProtectionPolicyManagerStatics3?>
  }
}
