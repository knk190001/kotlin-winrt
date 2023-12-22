package Windows.Services.Maps.LocalSearch

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILocalLocationFinderResult.ABI::class)
@Signature("{d09b6cc6-f338-4191-9fd8-5440b9a68f52}")
@Guid("d09b6cc6f33841919fd85440b9a68f52")
@WinRTInterface("d09b6cc6f33841919fd85440b9a68f52")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILocalLocationFinderResult.ByReference::class)
public interface ILocalLocationFinderResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocalLocations(): IVectorView<LocalLocation?>?

  @InterfaceMethod(1)
  public fun get_Status(): LocalLocationFinderStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILocalLocationFinderResult> {
    public override fun getValue() = ABI.makeILocalLocationFinderResult(pointer.getPointer(0))

    public fun setValue(value: ILocalLocationFinderResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILocalLocationFinderResult {
    public val __2094809989_Ptr: Pointer?

    public val _2094809989_VtblPtr: Pointer?
      get() = __2094809989_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocalLocations(): IVectorView<LocalLocation?>? {
      val fnPtr = _2094809989_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<LocalLocation?>>()
      val hr = fn.invokeHR(arrayOf(__2094809989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<LocalLocation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): LocalLocationFinderStatus? {
      val fnPtr = _2094809989_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LocalLocationFinderStatus>()
      val hr = fn.invokeHR(arrayOf(__2094809989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LocalLocationFinderStatus>(result.getValue())
      return resultValue
    }
  }

  public class ILocalLocationFinderResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2094809989_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILocalLocationFinderResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d09b6cc6f33841919fd85440b9a68f52")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILocalLocationFinderResult(ptr: Pointer?): WithDefault =
        ILocalLocationFinderResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILocalLocationFinderResult {
      val address = segment.toRawLongValue()
      return makeILocalLocationFinderResult(Pointer(address))
    }

    public override fun toNative(obj: ILocalLocationFinderResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2094809989_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILocalLocationFinderResult):
        Array<ILocalLocationFinderResult?> = (elements as
        Array<ILocalLocationFinderResult?>).castToImpl<ILocalLocationFinderResult,ILocalLocationFinderResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILocalLocationFinderResult?> =
        arrayOfNulls<ILocalLocationFinderResult_Impl>(size) as Array<ILocalLocationFinderResult?>
  }
}
