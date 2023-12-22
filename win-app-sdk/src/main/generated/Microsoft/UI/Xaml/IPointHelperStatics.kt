package Microsoft.UI.Xaml

import Windows.Foundation.Point
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPointHelperStatics.ABI::class)
@Signature("{b0b2bd44-600b-51b3-a42c-3fd36c1ab042}")
@Guid("b0b2bd44600b51b3a42c3fd36c1ab042")
@WinRTInterface("b0b2bd44600b51b3a42c3fd36c1ab042")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointHelperStatics.ByReference::class)
public interface IPointHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromCoordinates(x: Float, y: Float): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointHelperStatics> {
    public override fun getValue() = ABI.makeIPointHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IPointHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointHelperStatics {
    public val __1619369714_Ptr: Pointer?

    public val _1619369714_VtblPtr: Pointer?
      get() = __1619369714_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromCoordinates(x: Float, y: Float): Point? {
      val fnPtr = _1619369714_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1619369714_Ptr, x, y, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class IPointHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1619369714_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0b2bd44600b51b3a42c3fd36c1ab042")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointHelperStatics(ptr: Pointer?): WithDefault = IPointHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointHelperStatics {
      val address = segment.toRawLongValue()
      return makeIPointHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IPointHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1619369714_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointHelperStatics): Array<IPointHelperStatics?> =
        (elements as
        Array<IPointHelperStatics?>).castToImpl<IPointHelperStatics,IPointHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointHelperStatics?> =
        arrayOfNulls<IPointHelperStatics_Impl>(size) as Array<IPointHelperStatics?>
  }
}
