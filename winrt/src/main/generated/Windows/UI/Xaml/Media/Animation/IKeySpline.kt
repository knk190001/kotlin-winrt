package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IKeySpline.ABI::class)
@Signature("{77a163bb-d5ca-4a32-ba0b-7dff988e58a0}")
@Guid("77a163bbd5ca4a32ba0b7dff988e58a0")
@WinRTInterface("77a163bbd5ca4a32ba0b7dff988e58a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeySpline.ByReference::class)
public interface IKeySpline : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ControlPoint1(): Point?

  @InterfaceMethod(1)
  public fun put_ControlPoint1(value: Point?): Unit

  @InterfaceMethod(2)
  public fun get_ControlPoint2(): Point?

  @InterfaceMethod(3)
  public fun put_ControlPoint2(value: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IKeySpline> {
    public override fun getValue() = ABI.makeIKeySpline(pointer.getPointer(0))

    public fun setValue(value: IKeySpline_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeySpline {
    public val __1272188982_Ptr: Pointer?

    public val _1272188982_VtblPtr: Pointer?
      get() = __1272188982_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ControlPoint1(): Point? {
      val fnPtr = _1272188982_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1272188982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ControlPoint1(value: Point?): Unit {
      val fnPtr = _1272188982_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1272188982_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ControlPoint2(): Point? {
      val fnPtr = _1272188982_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1272188982_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ControlPoint2(value: Point?): Unit {
      val fnPtr = _1272188982_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1272188982_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IKeySpline_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1272188982_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeySpline, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77a163bbd5ca4a32ba0b7dff988e58a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeySpline(ptr: Pointer?): WithDefault = IKeySpline_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeySpline {
      val address = segment.toRawLongValue()
      return makeIKeySpline(Pointer(address))
    }

    public override fun toNative(obj: IKeySpline): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1272188982_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeySpline): Array<IKeySpline?> = (elements as
        Array<IKeySpline?>).castToImpl<IKeySpline,IKeySpline_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeySpline?> = arrayOfNulls<IKeySpline_Impl>(size)
        as Array<IKeySpline?>
  }
}
