package Microsoft.UI.Xaml.Data

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISupportIncrementalLoading.ABI::class)
@Signature("{d8f9b586-a64a-5ff8-868e-204e144f2cf4}")
@Guid("d8f9b586a64a5ff8868e204e144f2cf4")
@WinRTInterface("d8f9b586a64a5ff8868e204e144f2cf4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISupportIncrementalLoading.ByReference::class)
public interface ISupportIncrementalLoading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadMoreItemsAsync(count: WinDef.UINT): IAsyncOperation<LoadMoreItemsResult?>?

  @InterfaceMethod(1)
  public fun get_HasMoreItems(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISupportIncrementalLoading> {
    public override fun getValue() = ABI.makeISupportIncrementalLoading(pointer.getPointer(0))

    public fun setValue(value: ISupportIncrementalLoading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISupportIncrementalLoading {
    public val __1107336130_Ptr: Pointer?

    public val _1107336130_VtblPtr: Pointer?
      get() = __1107336130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadMoreItemsAsync(count: WinDef.UINT):
        IAsyncOperation<LoadMoreItemsResult?>? {
      val fnPtr = _1107336130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LoadMoreItemsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1107336130_Ptr, count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<LoadMoreItemsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HasMoreItems(): Boolean {
      val fnPtr = _1107336130_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1107336130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISupportIncrementalLoading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1107336130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISupportIncrementalLoading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d8f9b586a64a5ff8868e204e144f2cf4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISupportIncrementalLoading(ptr: Pointer?): WithDefault =
        ISupportIncrementalLoading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISupportIncrementalLoading {
      val address = segment.toRawLongValue()
      return makeISupportIncrementalLoading(Pointer(address))
    }

    public override fun toNative(obj: ISupportIncrementalLoading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1107336130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISupportIncrementalLoading):
        Array<ISupportIncrementalLoading?> = (elements as
        Array<ISupportIncrementalLoading?>).castToImpl<ISupportIncrementalLoading,ISupportIncrementalLoading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISupportIncrementalLoading?> =
        arrayOfNulls<ISupportIncrementalLoading_Impl>(size) as Array<ISupportIncrementalLoading?>
  }
}
