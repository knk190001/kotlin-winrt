package Windows.Devices.Spi

import Windows.Devices.Spi.Provider.ISpiProvider
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

@ABIMarker(ISpiControllerStatics.ABI::class)
@Signature("{0d5229e2-138b-4e48-b964-4f2f79b9c5a2}")
@Guid("0d5229e2138b4e48b9644f2f79b9c5a2")
@WinRTInterface("0d5229e2138b4e48b9644f2f79b9c5a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpiControllerStatics.ByReference::class)
public interface ISpiControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultAsync(): IAsyncOperation<SpiController?>?

  @InterfaceMethod(1)
  public fun GetControllersAsync(provider: ISpiProvider?):
      IAsyncOperation<IVectorView<SpiController?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpiControllerStatics> {
    public override fun getValue() = ABI.makeISpiControllerStatics(pointer.getPointer(0))

    public fun setValue(value: ISpiControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpiControllerStatics {
    public val __1983410774_Ptr: Pointer?

    public val _1983410774_VtblPtr: Pointer?
      get() = __1983410774_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultAsync(): IAsyncOperation<SpiController?>? {
      val fnPtr = _1983410774_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SpiController?>>()
      val hr = fn.invokeHR(arrayOf(__1983410774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<SpiController?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetControllersAsync(provider: ISpiProvider?):
        IAsyncOperation<IVectorView<SpiController?>?>? {
      val fnPtr = _1983410774_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<SpiController?>?>>()
      val hr = fn.invokeHR(arrayOf(__1983410774_Ptr, marshalToNative(provider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<SpiController?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpiControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1983410774_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpiControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d5229e2138b4e48b9644f2f79b9c5a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpiControllerStatics(ptr: Pointer?): WithDefault =
        ISpiControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpiControllerStatics {
      val address = segment.toRawLongValue()
      return makeISpiControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: ISpiControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1983410774_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpiControllerStatics): Array<ISpiControllerStatics?> =
        (elements as
        Array<ISpiControllerStatics?>).castToImpl<ISpiControllerStatics,ISpiControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpiControllerStatics?> =
        arrayOfNulls<ISpiControllerStatics_Impl>(size) as Array<ISpiControllerStatics?>
  }
}
