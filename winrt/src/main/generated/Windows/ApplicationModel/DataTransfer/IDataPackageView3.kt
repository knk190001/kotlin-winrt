package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.IAsyncOperation
import Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult
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

@ABIMarker(IDataPackageView3.ABI::class)
@Signature("{d37771a8-ddad-4288-8428-d1cae394128b}")
@Guid("d37771a8ddad42888428d1cae394128b")
@WinRTInterface("d37771a8ddad42888428d1cae394128b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackageView3.ByReference::class)
public interface IDataPackageView3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessAsync(): IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(1)
  public fun RequestAccessAsync(enterpriseId: String?):
      IAsyncOperation<ProtectionPolicyEvaluationResult?>?

  @InterfaceMethod(2)
  public fun UnlockAndAssumeEnterpriseIdentity(): ProtectionPolicyEvaluationResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackageView3> {
    public override fun getValue() = ABI.makeIDataPackageView3(pointer.getPointer(0))

    public fun setValue(value: IDataPackageView3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackageView3 {
    public val __1138264292_Ptr: Pointer?

    public val _1138264292_VtblPtr: Pointer?
      get() = __1138264292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessAsync(): IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _1138264292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1138264292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAccessAsync(enterpriseId: String?):
        IAsyncOperation<ProtectionPolicyEvaluationResult?>? {
      val fnPtr = _1138264292_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ProtectionPolicyEvaluationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1138264292_Ptr, marshalToNative(enterpriseId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ProtectionPolicyEvaluationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun UnlockAndAssumeEnterpriseIdentity(): ProtectionPolicyEvaluationResult? {
      val fnPtr = _1138264292_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProtectionPolicyEvaluationResult>()
      val hr = fn.invokeHR(arrayOf(__1138264292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProtectionPolicyEvaluationResult>(result.getValue())
      return resultValue
    }
  }

  public class IDataPackageView3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1138264292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackageView3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d37771a8ddad42888428d1cae394128b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackageView3(ptr: Pointer?): WithDefault = IDataPackageView3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackageView3 {
      val address = segment.toRawLongValue()
      return makeIDataPackageView3(Pointer(address))
    }

    public override fun toNative(obj: IDataPackageView3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1138264292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackageView3): Array<IDataPackageView3?> = (elements
        as Array<IDataPackageView3?>).castToImpl<IDataPackageView3,IDataPackageView3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackageView3?> =
        arrayOfNulls<IDataPackageView3_Impl>(size) as Array<IDataPackageView3?>
  }
}
