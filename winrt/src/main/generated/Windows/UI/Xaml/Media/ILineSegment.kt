package Windows.UI.Xaml.Media

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILineSegment.ABI::class)
@Signature("{ef6a2e25-3ff0-4420-a411-7182a4cecb15}")
@Guid("ef6a2e253ff04420a4117182a4cecb15")
@WinRTInterface("ef6a2e253ff04420a4117182a4cecb15")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineSegment.ByReference::class)
public interface ILineSegment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Point(): Point?

  @InterfaceMethod(1)
  public fun put_Point(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILineSegment> {
    public override fun getValue() = ABI.makeILineSegment(pointer.getPointer(0))

    public fun setValue(value: ILineSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineSegment {
    public val __518751523_Ptr: Pointer?

    public val _518751523_VtblPtr: Pointer?
      get() = __518751523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Point(): Point? {
      val fnPtr = _518751523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__518751523_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Point(value: Point?): Unit {
      val fnPtr = _518751523_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__518751523_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILineSegment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __518751523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineSegment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef6a2e253ff04420a4117182a4cecb15")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineSegment(ptr: Pointer?): WithDefault = ILineSegment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineSegment {
      val address = segment.toRawLongValue()
      return makeILineSegment(Pointer(address))
    }

    public override fun toNative(obj: ILineSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__518751523_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineSegment): Array<ILineSegment?> = (elements as
        Array<ILineSegment?>).castToImpl<ILineSegment,ILineSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineSegment?> =
        arrayOfNulls<ILineSegment_Impl>(size) as Array<ILineSegment?>
  }
}
