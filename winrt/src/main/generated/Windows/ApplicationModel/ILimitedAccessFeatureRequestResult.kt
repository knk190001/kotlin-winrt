package Windows.ApplicationModel

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(ILimitedAccessFeatureRequestResult.ABI::class)
@Signature("{d45156a6-1e24-5ddd-abb4-6188aba4d5bf}")
@Guid("d45156a61e245dddabb46188aba4d5bf")
@WinRTInterface("d45156a61e245dddabb46188aba4d5bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILimitedAccessFeatureRequestResult.ByReference::class)
public interface ILimitedAccessFeatureRequestResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FeatureId(): String?

  @InterfaceMethod(1)
  public fun get_Status(): LimitedAccessFeatureStatus?

  @InterfaceMethod(2)
  public fun get_EstimatedRemovalDate(): IReference<DateTime?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILimitedAccessFeatureRequestResult> {
    public override fun getValue() =
        ABI.makeILimitedAccessFeatureRequestResult(pointer.getPointer(0))

    public fun setValue(value: ILimitedAccessFeatureRequestResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILimitedAccessFeatureRequestResult {
    public val __466948945_Ptr: Pointer?

    public val _466948945_VtblPtr: Pointer?
      get() = __466948945_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FeatureId(): String? {
      val fnPtr = _466948945_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__466948945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): LimitedAccessFeatureStatus? {
      val fnPtr = _466948945_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LimitedAccessFeatureStatus>()
      val hr = fn.invokeHR(arrayOf(__466948945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LimitedAccessFeatureStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_EstimatedRemovalDate(): IReference<DateTime?>? {
      val fnPtr = _466948945_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__466948945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }
  }

  public class ILimitedAccessFeatureRequestResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __466948945_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILimitedAccessFeatureRequestResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d45156a61e245dddabb46188aba4d5bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILimitedAccessFeatureRequestResult(ptr: Pointer?): WithDefault =
        ILimitedAccessFeatureRequestResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILimitedAccessFeatureRequestResult {
      val address = segment.toRawLongValue()
      return makeILimitedAccessFeatureRequestResult(Pointer(address))
    }

    public override fun toNative(obj: ILimitedAccessFeatureRequestResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__466948945_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILimitedAccessFeatureRequestResult):
        Array<ILimitedAccessFeatureRequestResult?> = (elements as
        Array<ILimitedAccessFeatureRequestResult?>).castToImpl<ILimitedAccessFeatureRequestResult,ILimitedAccessFeatureRequestResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILimitedAccessFeatureRequestResult?> =
        arrayOfNulls<ILimitedAccessFeatureRequestResult_Impl>(size) as
        Array<ILimitedAccessFeatureRequestResult?>
  }
}
