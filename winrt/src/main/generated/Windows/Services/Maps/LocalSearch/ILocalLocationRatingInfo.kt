package Windows.Services.Maps.LocalSearch

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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILocalLocationRatingInfo.ABI::class)
@Signature("{cb1dab56-3354-4311-8bc0-a2d4d5eb806e}")
@Guid("cb1dab56335443118bc0a2d4d5eb806e")
@WinRTInterface("cb1dab56335443118bc0a2d4d5eb806e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILocalLocationRatingInfo.ByReference::class)
public interface ILocalLocationRatingInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AggregateRating(): IReference<Double>?

  @InterfaceMethod(1)
  public fun get_RatingCount(): IReference<Int>?

  @InterfaceMethod(2)
  public fun get_ProviderIdentifier(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILocalLocationRatingInfo> {
    public override fun getValue() = ABI.makeILocalLocationRatingInfo(pointer.getPointer(0))

    public fun setValue(value: ILocalLocationRatingInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILocalLocationRatingInfo {
    public val __35029373_Ptr: Pointer?

    public val _35029373_VtblPtr: Pointer?
      get() = __35029373_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AggregateRating(): IReference<Double>? {
      val fnPtr = _35029373_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__35029373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RatingCount(): IReference<Int>? {
      val fnPtr = _35029373_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__35029373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ProviderIdentifier(): String? {
      val fnPtr = _35029373_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__35029373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ILocalLocationRatingInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __35029373_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILocalLocationRatingInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb1dab56335443118bc0a2d4d5eb806e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILocalLocationRatingInfo(ptr: Pointer?): WithDefault =
        ILocalLocationRatingInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILocalLocationRatingInfo {
      val address = segment.toRawLongValue()
      return makeILocalLocationRatingInfo(Pointer(address))
    }

    public override fun toNative(obj: ILocalLocationRatingInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__35029373_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILocalLocationRatingInfo):
        Array<ILocalLocationRatingInfo?> = (elements as
        Array<ILocalLocationRatingInfo?>).castToImpl<ILocalLocationRatingInfo,ILocalLocationRatingInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILocalLocationRatingInfo?> =
        arrayOfNulls<ILocalLocationRatingInfo_Impl>(size) as Array<ILocalLocationRatingInfo?>
  }
}
