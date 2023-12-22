package Microsoft.UI.Xaml.Media

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

@ABIMarker(ILineGeometry.ABI::class)
@Signature("{467ef3c5-bc43-50ed-bb23-16be2c63356e}")
@Guid("467ef3c5bc4350edbb2316be2c63356e")
@WinRTInterface("467ef3c5bc4350edbb2316be2c63356e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineGeometry.ByReference::class)
public interface ILineGeometry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartPoint(): Point?

  @InterfaceMethod(1)
  public fun put_StartPoint(value: Point?): Unit

  @InterfaceMethod(2)
  public fun get_EndPoint(): Point?

  @InterfaceMethod(3)
  public fun put_EndPoint(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILineGeometry>
      {
    public override fun getValue() = ABI.makeILineGeometry(pointer.getPointer(0))

    public fun setValue(value: ILineGeometry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineGeometry {
    public val __1374822199_Ptr: Pointer?

    public val _1374822199_VtblPtr: Pointer?
      get() = __1374822199_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartPoint(): Point? {
      val fnPtr = _1374822199_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1374822199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_StartPoint(value: Point?): Unit {
      val fnPtr = _1374822199_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1374822199_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_EndPoint(): Point? {
      val fnPtr = _1374822199_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1374822199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_EndPoint(value: Point?): Unit {
      val fnPtr = _1374822199_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1374822199_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILineGeometry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1374822199_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineGeometry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("467ef3c5bc4350edbb2316be2c63356e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineGeometry(ptr: Pointer?): WithDefault = ILineGeometry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineGeometry {
      val address = segment.toRawLongValue()
      return makeILineGeometry(Pointer(address))
    }

    public override fun toNative(obj: ILineGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1374822199_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineGeometry): Array<ILineGeometry?> = (elements as
        Array<ILineGeometry?>).castToImpl<ILineGeometry,ILineGeometry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineGeometry?> =
        arrayOfNulls<ILineGeometry_Impl>(size) as Array<ILineGeometry?>
  }
}
