package Windows.Devices.Spi.Provider

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpiProvider.ABI::class)
@Signature("{96b461e2-77d4-48ce-aaa0-75715a8362cf}")
@Guid("96b461e277d448ceaaa075715a8362cf")
@WinRTInterface("96b461e277d448ceaaa075715a8362cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpiProvider.ByReference::class)
public interface ISpiProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetControllersAsync(): IAsyncOperation<IVectorView<ISpiControllerProvider?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpiProvider> {
    public override fun getValue() = ABI.makeISpiProvider(pointer.getPointer(0))

    public fun setValue(value: ISpiProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpiProvider {
    public val __1276935773_Ptr: Pointer?

    public val _1276935773_VtblPtr: Pointer?
      get() = __1276935773_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetControllersAsync():
        IAsyncOperation<IVectorView<ISpiControllerProvider?>?>? {
      val fnPtr = _1276935773_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ISpiControllerProvider?>?>>()
      val hr = fn.invokeHR(arrayOf(__1276935773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ISpiControllerProvider?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpiProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1276935773_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpiProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96b461e277d448ceaaa075715a8362cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpiProvider(ptr: Pointer?): WithDefault = ISpiProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpiProvider {
      val address = segment.toRawLongValue()
      return makeISpiProvider(Pointer(address))
    }

    public override fun toNative(obj: ISpiProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1276935773_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpiProvider): Array<ISpiProvider?> = (elements as
        Array<ISpiProvider?>).castToImpl<ISpiProvider,ISpiProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpiProvider?> =
        arrayOfNulls<ISpiProvider_Impl>(size) as Array<ISpiProvider?>
  }
}
