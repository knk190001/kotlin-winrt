package Windows.Phone.Management.Deployment

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEnterpriseEnrollmentManager.ABI::class)
@Signature("{20f9f390-2c69-41d8-88e6-e4b3884026cb}")
@Guid("20f9f3902c6941d888e6e4b3884026cb")
@WinRTInterface("20f9f3902c6941d888e6e4b3884026cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEnterpriseEnrollmentManager.ByReference::class)
public interface IEnterpriseEnrollmentManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnrolledEnterprises(): IVectorView<Enterprise?>?

  @InterfaceMethod(1)
  public fun get_CurrentEnterprise(): Enterprise?

  @InterfaceMethod(2)
  public fun ValidateEnterprisesAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun RequestEnrollmentAsync(enrollmentToken: String?):
      IAsyncOperation<EnterpriseEnrollmentResult?>?

  @InterfaceMethod(4)
  public fun RequestUnenrollmentAsync(enterprise: Enterprise?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEnterpriseEnrollmentManager> {
    public override fun getValue() = ABI.makeIEnterpriseEnrollmentManager(pointer.getPointer(0))

    public fun setValue(value: IEnterpriseEnrollmentManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEnterpriseEnrollmentManager {
    public val __49937724_Ptr: Pointer?

    public val _49937724_VtblPtr: Pointer?
      get() = __49937724_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnrolledEnterprises(): IVectorView<Enterprise?>? {
      val fnPtr = _49937724_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Enterprise?>>()
      val hr = fn.invokeHR(arrayOf(__49937724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Enterprise?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CurrentEnterprise(): Enterprise? {
      val fnPtr = _49937724_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Enterprise>()
      val hr = fn.invokeHR(arrayOf(__49937724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Enterprise>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ValidateEnterprisesAsync(): IAsyncAction? {
      val fnPtr = _49937724_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__49937724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestEnrollmentAsync(enrollmentToken: String?):
        IAsyncOperation<EnterpriseEnrollmentResult?>? {
      val fnPtr = _49937724_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<EnterpriseEnrollmentResult?>>()
      val hr = fn.invokeHR(arrayOf(__49937724_Ptr, marshalToNative(enrollmentToken), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<EnterpriseEnrollmentResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestUnenrollmentAsync(enterprise: Enterprise?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _49937724_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__49937724_Ptr, marshalToNative(enterprise), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IEnterpriseEnrollmentManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __49937724_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEnterpriseEnrollmentManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20f9f3902c6941d888e6e4b3884026cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEnterpriseEnrollmentManager(ptr: Pointer?): WithDefault =
        IEnterpriseEnrollmentManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEnterpriseEnrollmentManager {
      val address = segment.toRawLongValue()
      return makeIEnterpriseEnrollmentManager(Pointer(address))
    }

    public override fun toNative(obj: IEnterpriseEnrollmentManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__49937724_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEnterpriseEnrollmentManager):
        Array<IEnterpriseEnrollmentManager?> = (elements as
        Array<IEnterpriseEnrollmentManager?>).castToImpl<IEnterpriseEnrollmentManager,IEnterpriseEnrollmentManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEnterpriseEnrollmentManager?> =
        arrayOfNulls<IEnterpriseEnrollmentManager_Impl>(size) as
        Array<IEnterpriseEnrollmentManager?>
  }
}
