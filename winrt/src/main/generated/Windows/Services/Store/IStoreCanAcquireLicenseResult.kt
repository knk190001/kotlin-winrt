package Windows.Services.Store

import Windows.Foundation.HResult
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

@ABIMarker(IStoreCanAcquireLicenseResult.ABI::class)
@Signature("{3a693db3-0088-482f-86d5-bd46522663ad}")
@Guid("3a693db30088482f86d5bd46522663ad")
@WinRTInterface("3a693db30088482f86d5bd46522663ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreCanAcquireLicenseResult.ByReference::class)
public interface IStoreCanAcquireLicenseResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(1)
  public fun get_LicensableSku(): String?

  @InterfaceMethod(2)
  public fun get_Status(): StoreCanLicenseStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreCanAcquireLicenseResult> {
    public override fun getValue() = ABI.makeIStoreCanAcquireLicenseResult(pointer.getPointer(0))

    public fun setValue(value: IStoreCanAcquireLicenseResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreCanAcquireLicenseResult {
    public val __849540228_Ptr: Pointer?

    public val _849540228_VtblPtr: Pointer?
      get() = __849540228_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _849540228_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__849540228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LicensableSku(): String? {
      val fnPtr = _849540228_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__849540228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Status(): StoreCanLicenseStatus? {
      val fnPtr = _849540228_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreCanLicenseStatus>()
      val hr = fn.invokeHR(arrayOf(__849540228_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreCanLicenseStatus>(result.getValue())
      return resultValue
    }
  }

  public class IStoreCanAcquireLicenseResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __849540228_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreCanAcquireLicenseResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a693db30088482f86d5bd46522663ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreCanAcquireLicenseResult(ptr: Pointer?): WithDefault =
        IStoreCanAcquireLicenseResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreCanAcquireLicenseResult {
      val address = segment.toRawLongValue()
      return makeIStoreCanAcquireLicenseResult(Pointer(address))
    }

    public override fun toNative(obj: IStoreCanAcquireLicenseResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__849540228_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreCanAcquireLicenseResult):
        Array<IStoreCanAcquireLicenseResult?> = (elements as
        Array<IStoreCanAcquireLicenseResult?>).castToImpl<IStoreCanAcquireLicenseResult,IStoreCanAcquireLicenseResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreCanAcquireLicenseResult?> =
        arrayOfNulls<IStoreCanAcquireLicenseResult_Impl>(size) as
        Array<IStoreCanAcquireLicenseResult?>
  }
}
