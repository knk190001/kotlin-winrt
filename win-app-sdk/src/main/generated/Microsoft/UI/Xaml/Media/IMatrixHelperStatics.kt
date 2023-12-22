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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMatrixHelperStatics.ABI::class)
@Signature("{5762cf6b-4fb0-532f-8368-de960042701f}")
@Guid("5762cf6b4fb0532f8368de960042701f")
@WinRTInterface("5762cf6b4fb0532f8368de960042701f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMatrixHelperStatics.ByReference::class)
public interface IMatrixHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Identity(): Matrix?

  @InterfaceMethod(1)
  public fun FromElements(
    m11: Double,
    m12: Double,
    m21: Double,
    m22: Double,
    offsetX: Double,
    offsetY: Double
  ): Matrix?

  @InterfaceMethod(2)
  public fun GetIsIdentity(target: Matrix?): Boolean

  @InterfaceMethod(3)
  public fun Transform(target: Matrix?, point: Point?): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMatrixHelperStatics> {
    public override fun getValue() = ABI.makeIMatrixHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IMatrixHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMatrixHelperStatics {
    public val __2066664923_Ptr: Pointer?

    public val _2066664923_VtblPtr: Pointer?
      get() = __2066664923_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Identity(): Matrix? {
      val fnPtr = _2066664923_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix>()
      val hr = fn.invokeHR(arrayOf(__2066664923_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromElements(
      m11: Double,
      m12: Double,
      m21: Double,
      m22: Double,
      offsetX: Double,
      offsetY: Double
    ): Matrix? {
      val fnPtr = _2066664923_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix>()
      val hr = fn.invokeHR(arrayOf(__2066664923_Ptr, m11, m12, m21, m22, offsetX, offsetY, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetIsIdentity(target: Matrix?): Boolean {
      val fnPtr = _2066664923_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2066664923_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun Transform(target: Matrix?, point: Point?): Point? {
      val fnPtr = _2066664923_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__2066664923_Ptr, marshalToNative(target),
          marshalToNative(point), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class IMatrixHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2066664923_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMatrixHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5762cf6b4fb0532f8368de960042701f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMatrixHelperStatics(ptr: Pointer?): WithDefault = IMatrixHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMatrixHelperStatics {
      val address = segment.toRawLongValue()
      return makeIMatrixHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IMatrixHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2066664923_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMatrixHelperStatics): Array<IMatrixHelperStatics?> =
        (elements as
        Array<IMatrixHelperStatics?>).castToImpl<IMatrixHelperStatics,IMatrixHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMatrixHelperStatics?> =
        arrayOfNulls<IMatrixHelperStatics_Impl>(size) as Array<IMatrixHelperStatics?>
  }
}
