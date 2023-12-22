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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRepeatedZoomSnapPointFactory.ABI::class)
@Signature("{7d032a7c-d91c-5660-b1c2-b36e8810ac65}")
@Guid("7d032a7cd91c5660b1c2b36e8810ac65")
@WinRTInterface("7d032a7cd91c5660b1c2b36e8810ac65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepeatedZoomSnapPointFactory.ByReference::class)
public interface IRepeatedZoomSnapPointFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    offset: Double,
    interval: Double,
    start: Double,
    end: Double,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): RepeatedZoomSnapPoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepeatedZoomSnapPointFactory> {
    public override fun getValue() = ABI.makeIRepeatedZoomSnapPointFactory(pointer.getPointer(0))

    public fun setValue(value: IRepeatedZoomSnapPointFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepeatedZoomSnapPointFactory {
    public val __2024487006_Ptr: Pointer?

    public val _2024487006_VtblPtr: Pointer?
      get() = __2024487006_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      offset: Double,
      interval: Double,
      start: Double,
      end: Double,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): RepeatedZoomSnapPoint? {
      val fnPtr = _2024487006_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RepeatedZoomSnapPoint>()
      val hr = fn.invokeHR(arrayOf(__2024487006_Ptr, offset, interval, start, end,
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RepeatedZoomSnapPoint>(result.getValue())
      return resultValue
    }
  }

  public class IRepeatedZoomSnapPointFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2024487006_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepeatedZoomSnapPointFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d032a7cd91c5660b1c2b36e8810ac65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepeatedZoomSnapPointFactory(ptr: Pointer?): WithDefault =
        IRepeatedZoomSnapPointFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepeatedZoomSnapPointFactory {
      val address = segment.toRawLongValue()
      return makeIRepeatedZoomSnapPointFactory(Pointer(address))
    }

    public override fun toNative(obj: IRepeatedZoomSnapPointFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2024487006_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepeatedZoomSnapPointFactory):
        Array<IRepeatedZoomSnapPointFactory?> = (elements as
        Array<IRepeatedZoomSnapPointFactory?>).castToImpl<IRepeatedZoomSnapPointFactory,IRepeatedZoomSnapPointFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepeatedZoomSnapPointFactory?> =
        arrayOfNulls<IRepeatedZoomSnapPointFactory_Impl>(size) as
        Array<IRepeatedZoomSnapPointFactory?>
  }
}
