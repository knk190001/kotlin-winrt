package Windows.Phone.Management.Deployment

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

@ABIMarker(IEnterprise.ABI::class)
@Signature("{96592f8d-856c-4426-a947-b06307718078}")
@Guid("96592f8d856c4426a947b06307718078")
@WinRTInterface("96592f8d856c4426a947b06307718078")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEnterprise.ByReference::class)
public interface IEnterprise : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun get_WorkplaceId(): Int

  @InterfaceMethod(3)
  public fun get_EnrollmentValidFrom(): DateTime?

  @InterfaceMethod(4)
  public fun get_EnrollmentValidTo(): DateTime?

  @InterfaceMethod(5)
  public fun get_Status(): EnterpriseStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEnterprise> {
    public override fun getValue() = ABI.makeIEnterprise(pointer.getPointer(0))

    public fun setValue(value: IEnterprise_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEnterprise {
    public val __140789819_Ptr: Pointer?

    public val _140789819_VtblPtr: Pointer?
      get() = __140789819_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _140789819_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__140789819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _140789819_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__140789819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_WorkplaceId(): Int {
      val fnPtr = _140789819_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__140789819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_EnrollmentValidFrom(): DateTime? {
      val fnPtr = _140789819_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__140789819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_EnrollmentValidTo(): DateTime? {
      val fnPtr = _140789819_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__140789819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Status(): EnterpriseStatus? {
      val fnPtr = _140789819_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EnterpriseStatus>()
      val hr = fn.invokeHR(arrayOf(__140789819_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EnterpriseStatus>(result.getValue())
      return resultValue
    }
  }

  public class IEnterprise_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __140789819_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEnterprise, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96592f8d856c4426a947b06307718078")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEnterprise(ptr: Pointer?): WithDefault = IEnterprise_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEnterprise {
      val address = segment.toRawLongValue()
      return makeIEnterprise(Pointer(address))
    }

    public override fun toNative(obj: IEnterprise): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__140789819_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEnterprise): Array<IEnterprise?> = (elements as
        Array<IEnterprise?>).castToImpl<IEnterprise,IEnterprise_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEnterprise?> =
        arrayOfNulls<IEnterprise_Impl>(size) as Array<IEnterprise?>
  }
}
