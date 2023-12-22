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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStoreRateAndReviewResult.ABI::class)
@Signature("{9d209d56-a6b5-4121-9b61-ee6d0fbdbdbb}")
@Guid("9d209d56a6b541219b61ee6d0fbdbdbb")
@WinRTInterface("9d209d56a6b541219b61ee6d0fbdbdbb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreRateAndReviewResult.ByReference::class)
public interface IStoreRateAndReviewResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(1)
  public fun get_ExtendedJsonData(): String?

  @InterfaceMethod(2)
  public fun get_WasUpdated(): Boolean

  @InterfaceMethod(3)
  public fun get_Status(): StoreRateAndReviewStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreRateAndReviewResult> {
    public override fun getValue() = ABI.makeIStoreRateAndReviewResult(pointer.getPointer(0))

    public fun setValue(value: IStoreRateAndReviewResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreRateAndReviewResult {
    public val __886451224_Ptr: Pointer?

    public val _886451224_VtblPtr: Pointer?
      get() = __886451224_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _886451224_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__886451224_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedJsonData(): String? {
      val fnPtr = _886451224_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__886451224_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_WasUpdated(): Boolean {
      val fnPtr = _886451224_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__886451224_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Status(): StoreRateAndReviewStatus? {
      val fnPtr = _886451224_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StoreRateAndReviewStatus>()
      val hr = fn.invokeHR(arrayOf(__886451224_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StoreRateAndReviewStatus>(result.getValue())
      return resultValue
    }
  }

  public class IStoreRateAndReviewResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __886451224_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreRateAndReviewResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d209d56a6b541219b61ee6d0fbdbdbb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreRateAndReviewResult(ptr: Pointer?): WithDefault =
        IStoreRateAndReviewResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreRateAndReviewResult {
      val address = segment.toRawLongValue()
      return makeIStoreRateAndReviewResult(Pointer(address))
    }

    public override fun toNative(obj: IStoreRateAndReviewResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__886451224_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreRateAndReviewResult):
        Array<IStoreRateAndReviewResult?> = (elements as
        Array<IStoreRateAndReviewResult?>).castToImpl<IStoreRateAndReviewResult,IStoreRateAndReviewResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreRateAndReviewResult?> =
        arrayOfNulls<IStoreRateAndReviewResult_Impl>(size) as Array<IStoreRateAndReviewResult?>
  }
}
