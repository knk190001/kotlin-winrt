package Windows.Devices.Adc.Provider

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

@ABIMarker(IAdcProvider.ABI::class)
@Signature("{28953668-9359-4c57-bc88-e275e81638c9}")
@Guid("2895366893594c57bc88e275e81638c9")
@WinRTInterface("2895366893594c57bc88e275e81638c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdcProvider.ByReference::class)
public interface IAdcProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetControllers(): IVectorView<IAdcControllerProvider?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAdcProvider> {
    public override fun getValue() = ABI.makeIAdcProvider(pointer.getPointer(0))

    public fun setValue(value: IAdcProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdcProvider {
    public val __181309917_Ptr: Pointer?

    public val _181309917_VtblPtr: Pointer?
      get() = __181309917_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetControllers(): IVectorView<IAdcControllerProvider?>? {
      val fnPtr = _181309917_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IAdcControllerProvider?>>()
      val hr = fn.invokeHR(arrayOf(__181309917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IAdcControllerProvider?>>(result.getValue())
      return resultValue
    }
  }

  public class IAdcProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __181309917_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdcProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2895366893594c57bc88e275e81638c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdcProvider(ptr: Pointer?): WithDefault = IAdcProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdcProvider {
      val address = segment.toRawLongValue()
      return makeIAdcProvider(Pointer(address))
    }

    public override fun toNative(obj: IAdcProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__181309917_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdcProvider): Array<IAdcProvider?> = (elements as
        Array<IAdcProvider?>).castToImpl<IAdcProvider,IAdcProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdcProvider?> =
        arrayOfNulls<IAdcProvider_Impl>(size) as Array<IAdcProvider?>
  }
}
