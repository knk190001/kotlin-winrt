package Windows.Security.EnterpriseData

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageFolder
import Windows.Storage.IStorageItem
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IProtectionPolicyManagerStatics4.ABI::class)
@Signature("{20b794db-ccbd-490f-8c83-49ccb77aea6c}")
@Guid("20b794dbccbd490f8c8349ccb77aea6c")
@WinRTInterface("20b794dbccbd490f8c8349ccb77aea6c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectionPolicyManagerStatics4.ByReference::class)
public interface IProtectionPolicyManagerStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsRoamableProtectionEnabled(identity: String?): Boolean

  @InterfaceMethod(1)
  public fun RequestAccessAsync(
    sourceIdentity: String?,
    targetIdentity: String?,
    auditInfo: ProtectionPolicyAuditInfo?,
    messageFromApp: String?,
    behavior: ProtectionPolicyRequestAccessBehavior?
  ): IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(2)
  public fun RequestAccessForAppAsync(
    sourceIdentity: String?,
    appPackageFamilyName: String?,
    auditInfo: ProtectionPolicyAuditInfo?,
    messageFromApp: String?,
    behavior: ProtectionPolicyRequestAccessBehavior?
  ): IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(3)
  public fun RequestAccessToFilesForAppAsync(
    sourceItemList: IIterable<IStorageItem?>?,
    appPackageFamilyName: String?,
    auditInfo: ProtectionPolicyAuditInfo?
  ): IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(4)
  public fun RequestAccessToFilesForAppAsync(
    sourceItemList: IIterable<IStorageItem?>?,
    appPackageFamilyName: String?,
    auditInfo: ProtectionPolicyAuditInfo?,
    messageFromApp: String?,
    behavior: ProtectionPolicyRequestAccessBehavior?
  ): IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(5)
  public fun RequestAccessToFilesForProcessAsync(
    sourceItemList: IIterable<IStorageItem?>?,
    processId: WinDef.UINT,
    auditInfo: ProtectionPolicyAuditInfo?
  ): IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(6)
  public fun RequestAccessToFilesForProcessAsync(
    sourceItemList: IIterable<IStorageItem?>?,
    processId: WinDef.UINT,
    auditInfo: ProtectionPolicyAuditInfo?,
    messageFromApp: String?,
    behavior: ProtectionPolicyRequestAccessBehavior?
  ): IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(7)
  public fun IsFileProtectionRequiredAsync(target: IStorageItem?, identity: String?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(8)
  public fun IsFileProtectionRequiredForNewFileAsync(
    parentFolder: IStorageFolder?,
    identity: String?,
    desiredName: String?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(9)
  public fun get_PrimaryManagedIdentity(): String?

  @InterfaceMethod(10)
  public fun GetPrimaryManagedIdentityForIdentity(identity: String?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectionPolicyManagerStatics4> {
    public override fun getValue() = ABI.makeIProtectionPolicyManagerStatics4(pointer.getPointer(0))

    public fun setValue(value: IProtectionPolicyManagerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectionPolicyManagerStatics4 {
    public val __64085494_Ptr: Pointer?

    public val _64085494_VtblPtr: Pointer?
      get() = __64085494_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsRoamableProtectionEnabled(identity: String?): Boolean {
      val fnPtr = _64085494_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__64085494_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun RequestAccessAsync(
      sourceIdentity: String?,
      targetIdentity: String?,
      auditInfo: ProtectionPolicyAuditInfo?,
      messageFromApp: String?,
      behavior: ProtectionPolicyRequestAccessBehavior?
    ): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _64085494_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__64085494_Ptr, marshalToNative(sourceIdentity),
          marshalToNative(targetIdentity), marshalToNative(auditInfo),
          marshalToNative(messageFromApp), marshalToNative(behavior), result))
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
      auditInfo: ProtectionPolicyAuditInfo?,
      messageFromApp: String?,
      behavior: ProtectionPolicyRequestAccessBehavior?
    ): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _64085494_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__64085494_Ptr, marshalToNative(sourceIdentity),
          marshalToNative(appPackageFamilyName), marshalToNative(auditInfo),
          marshalToNative(messageFromApp), marshalToNative(behavior), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestAccessToFilesForAppAsync(
      sourceItemList: IIterable<IStorageItem?>?,
      appPackageFamilyName: String?,
      auditInfo: ProtectionPolicyAuditInfo?
    ): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _64085494_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__64085494_Ptr, marshalToNative(sourceItemList),
          marshalToNative(appPackageFamilyName), marshalToNative(auditInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestAccessToFilesForAppAsync(
      sourceItemList: IIterable<IStorageItem?>?,
      appPackageFamilyName: String?,
      auditInfo: ProtectionPolicyAuditInfo?,
      messageFromApp: String?,
      behavior: ProtectionPolicyRequestAccessBehavior?
    ): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _64085494_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__64085494_Ptr, marshalToNative(sourceItemList),
          marshalToNative(appPackageFamilyName), marshalToNative(auditInfo),
          marshalToNative(messageFromApp), marshalToNative(behavior), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RequestAccessToFilesForProcessAsync(
      sourceItemList: IIterable<IStorageItem?>?,
      processId: WinDef.UINT,
      auditInfo: ProtectionPolicyAuditInfo?
    ): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _64085494_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__64085494_Ptr, marshalToNative(sourceItemList), processId,
          marshalToNative(auditInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun RequestAccessToFilesForProcessAsync(
      sourceItemList: IIterable<IStorageItem?>?,
      processId: WinDef.UINT,
      auditInfo: ProtectionPolicyAuditInfo?,
      messageFromApp: String?,
      behavior: ProtectionPolicyRequestAccessBehavior?
    ): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _64085494_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__64085494_Ptr, marshalToNative(sourceItemList), processId,
          marshalToNative(auditInfo), marshalToNative(messageFromApp), marshalToNative(behavior),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun IsFileProtectionRequiredAsync(target: IStorageItem?, identity: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _64085494_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__64085494_Ptr, marshalToNative(target),
          marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun IsFileProtectionRequiredForNewFileAsync(
      parentFolder: IStorageFolder?,
      identity: String?,
      desiredName: String?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _64085494_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__64085494_Ptr, marshalToNative(parentFolder),
          marshalToNative(identity), marshalToNative(desiredName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_PrimaryManagedIdentity(): String? {
      val fnPtr = _64085494_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__64085494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetPrimaryManagedIdentityForIdentity(identity: String?): String? {
      val fnPtr = _64085494_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__64085494_Ptr, marshalToNative(identity), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IProtectionPolicyManagerStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __64085494_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectionPolicyManagerStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20b794dbccbd490f8c8349ccb77aea6c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectionPolicyManagerStatics4(ptr: Pointer?): WithDefault =
        IProtectionPolicyManagerStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectionPolicyManagerStatics4 {
      val address = segment.toRawLongValue()
      return makeIProtectionPolicyManagerStatics4(Pointer(address))
    }

    public override fun toNative(obj: IProtectionPolicyManagerStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__64085494_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectionPolicyManagerStatics4):
        Array<IProtectionPolicyManagerStatics4?> = (elements as
        Array<IProtectionPolicyManagerStatics4?>).castToImpl<IProtectionPolicyManagerStatics4,IProtectionPolicyManagerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectionPolicyManagerStatics4?> =
        arrayOfNulls<IProtectionPolicyManagerStatics4_Impl>(size) as
        Array<IProtectionPolicyManagerStatics4?>
  }
}
