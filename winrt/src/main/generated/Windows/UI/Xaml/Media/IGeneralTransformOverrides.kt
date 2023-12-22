package Windows.UI.Xaml.Media

import Windows.Foundation.Point
import Windows.Foundation.Rect
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeneralTransformOverrides.ABI::class)
@Signature("{4f121083-24cf-4524-90ad-8a42b1c12783}")
@Guid("4f12108324cf452490ad8a42b1c12783")
@WinRTInterface("4f12108324cf452490ad8a42b1c12783")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeneralTransformOverrides.ByReference::class)
public interface IGeneralTransformOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InverseCore(): GeneralTransform?

  @InterfaceMethod(1)
  public fun TryTransformCore(inPoint: Point?, outPoint: Windows.Foundation.Point.ByReference?):
      Boolean

  @InterfaceMethod(2)
  public fun TransformBoundsCore(rect: Rect?): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeneralTransformOverrides> {
    public override fun getValue() = ABI.makeIGeneralTransformOverrides(pointer.getPointer(0))

    public fun setValue(value: IGeneralTransformOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeneralTransformOverrides {
    public val __1648007001_Ptr: Pointer?

    public val _1648007001_VtblPtr: Pointer?
      get() = __1648007001_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InverseCore(): GeneralTransform? {
      val fnPtr = _1648007001_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeneralTransform>()
      val hr = fn.invokeHR(arrayOf(__1648007001_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeneralTransform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryTransformCore(inPoint: Point?,
        outPoint: Windows.Foundation.Point.ByReference?): Boolean {
      val fnPtr = _1648007001_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1648007001_Ptr, marshalToNative(inPoint),
          marshalToNative(outPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun TransformBoundsCore(rect: Rect?): Rect? {
      val fnPtr = _1648007001_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1648007001_Ptr, marshalToNative(rect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class IGeneralTransformOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1648007001_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeneralTransformOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f12108324cf452490ad8a42b1c12783")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeneralTransformOverrides(ptr: Pointer?): WithDefault =
        IGeneralTransformOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeneralTransformOverrides {
      val address = segment.toRawLongValue()
      return makeIGeneralTransformOverrides(Pointer(address))
    }

    public override fun toNative(obj: IGeneralTransformOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1648007001_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeneralTransformOverrides):
        Array<IGeneralTransformOverrides?> = (elements as
        Array<IGeneralTransformOverrides?>).castToImpl<IGeneralTransformOverrides,IGeneralTransformOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeneralTransformOverrides?> =
        arrayOfNulls<IGeneralTransformOverrides_Impl>(size) as Array<IGeneralTransformOverrides?>
  }
}
