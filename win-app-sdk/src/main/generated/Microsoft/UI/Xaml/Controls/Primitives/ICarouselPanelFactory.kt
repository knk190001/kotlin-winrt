package Microsoft.UI.Xaml.Controls.Primitives

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ICarouselPanelFactory.ABI::class)
@Signature("{161d3fc2-d1ec-5d1d-ac8a-cf4577f06c3c}")
@Guid("161d3fc2d1ec5d1dac8acf4577f06c3c")
@WinRTInterface("161d3fc2d1ec5d1dac8acf4577f06c3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICarouselPanelFactory.ByReference::class)
public interface ICarouselPanelFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): CarouselPanel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICarouselPanelFactory> {
    public override fun getValue() = ABI.makeICarouselPanelFactory(pointer.getPointer(0))

    public fun setValue(value: ICarouselPanelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICarouselPanelFactory {
    public val __1406449079_Ptr: Pointer?

    public val _1406449079_VtblPtr: Pointer?
      get() = __1406449079_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CarouselPanel? {
      val fnPtr = _1406449079_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CarouselPanel>()
      val hr = fn.invokeHR(arrayOf(__1406449079_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CarouselPanel>(result.getValue())
      return resultValue
    }
  }

  public class ICarouselPanelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1406449079_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICarouselPanelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("161d3fc2d1ec5d1dac8acf4577f06c3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICarouselPanelFactory(ptr: Pointer?): WithDefault =
        ICarouselPanelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICarouselPanelFactory {
      val address = segment.toRawLongValue()
      return makeICarouselPanelFactory(Pointer(address))
    }

    public override fun toNative(obj: ICarouselPanelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1406449079_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICarouselPanelFactory): Array<ICarouselPanelFactory?> =
        (elements as
        Array<ICarouselPanelFactory?>).castToImpl<ICarouselPanelFactory,ICarouselPanelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICarouselPanelFactory?> =
        arrayOfNulls<ICarouselPanelFactory_Impl>(size) as Array<ICarouselPanelFactory?>
  }
}
