package Windows.Services.Store

import Windows.Foundation.Collections.IMapView
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

@ABIMarker(IStoreProductQueryResult.ABI::class)
@Signature("{d805e6c5-d456-4ff6-8049-9076d5165f73}")
@Guid("d805e6c5d4564ff680499076d5165f73")
@WinRTInterface("d805e6c5d4564ff680499076d5165f73")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreProductQueryResult.ByReference::class)
public interface IStoreProductQueryResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Products(): IMapView<String?, StoreProduct?>?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreProductQueryResult> {
    public override fun getValue() = ABI.makeIStoreProductQueryResult(pointer.getPointer(0))

    public fun setValue(value: IStoreProductQueryResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreProductQueryResult {
    public val __1318458634_Ptr: Pointer?

    public val _1318458634_VtblPtr: Pointer?
      get() = __1318458634_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Products(): IMapView<String?, StoreProduct?>? {
      val fnPtr = _1318458634_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, StoreProduct?>>()
      val hr = fn.invokeHR(arrayOf(__1318458634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, StoreProduct?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1318458634_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1318458634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IStoreProductQueryResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1318458634_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreProductQueryResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d805e6c5d4564ff680499076d5165f73")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreProductQueryResult(ptr: Pointer?): WithDefault =
        IStoreProductQueryResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreProductQueryResult {
      val address = segment.toRawLongValue()
      return makeIStoreProductQueryResult(Pointer(address))
    }

    public override fun toNative(obj: IStoreProductQueryResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1318458634_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreProductQueryResult):
        Array<IStoreProductQueryResult?> = (elements as
        Array<IStoreProductQueryResult?>).castToImpl<IStoreProductQueryResult,IStoreProductQueryResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreProductQueryResult?> =
        arrayOfNulls<IStoreProductQueryResult_Impl>(size) as Array<IStoreProductQueryResult?>
  }
}
