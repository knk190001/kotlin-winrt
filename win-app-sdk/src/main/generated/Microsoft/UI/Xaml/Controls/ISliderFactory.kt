package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ISliderFactory.ABI::class)
@Signature("{06604d71-34ca-5f39-9656-29d81d3c110c}")
@Guid("06604d7134ca5f39965629d81d3c110c")
@WinRTInterface("06604d7134ca5f39965629d81d3c110c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISliderFactory.ByReference::class)
public interface ISliderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Slider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISliderFactory>
      {
    public override fun getValue() = ABI.makeISliderFactory(pointer.getPointer(0))

    public fun setValue(value: ISliderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISliderFactory {
    public val __665439874_Ptr: Pointer?

    public val _665439874_VtblPtr: Pointer?
      get() = __665439874_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Slider? {
      val fnPtr = _665439874_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Slider>()
      val hr = fn.invokeHR(arrayOf(__665439874_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Slider>(result.getValue())
      return resultValue
    }
  }

  public class ISliderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __665439874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISliderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06604d7134ca5f39965629d81d3c110c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISliderFactory(ptr: Pointer?): WithDefault = ISliderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISliderFactory {
      val address = segment.toRawLongValue()
      return makeISliderFactory(Pointer(address))
    }

    public override fun toNative(obj: ISliderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__665439874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISliderFactory): Array<ISliderFactory?> = (elements as
        Array<ISliderFactory?>).castToImpl<ISliderFactory,ISliderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISliderFactory?> =
        arrayOfNulls<ISliderFactory_Impl>(size) as Array<ISliderFactory?>
  }
}
