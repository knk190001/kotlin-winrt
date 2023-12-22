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

@ABIMarker(IGeneralTransform.ABI::class)
@Signature("{a06798b7-a2ec-415f-ade2-eade9333f2c7}")
@Guid("a06798b7a2ec415fade2eade9333f2c7")
@WinRTInterface("a06798b7a2ec415fade2eade9333f2c7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeneralTransform.ByReference::class)
public interface IGeneralTransform : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Inverse(): GeneralTransform?

  @InterfaceMethod(1)
  public fun TransformPoint(point: Point?): Point?

  @InterfaceMethod(2)
  public fun TryTransform(inPoint: Point?, outPoint: Windows.Foundation.Point.ByReference?): Boolean

  @InterfaceMethod(3)
  public fun TransformBounds(rect: Rect?): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeneralTransform> {
    public override fun getValue() = ABI.makeIGeneralTransform(pointer.getPointer(0))

    public fun setValue(value: IGeneralTransform_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeneralTransform {
    public val __1437114720_Ptr: Pointer?

    public val _1437114720_VtblPtr: Pointer?
      get() = __1437114720_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Inverse(): GeneralTransform? {
      val fnPtr = _1437114720_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeneralTransform>()
      val hr = fn.invokeHR(arrayOf(__1437114720_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeneralTransform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TransformPoint(point: Point?): Point? {
      val fnPtr = _1437114720_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1437114720_Ptr, marshalToNative(point), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryTransform(inPoint: Point?,
        outPoint: Windows.Foundation.Point.ByReference?): Boolean {
      val fnPtr = _1437114720_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1437114720_Ptr, marshalToNative(inPoint),
          marshalToNative(outPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun TransformBounds(rect: Rect?): Rect? {
      val fnPtr = _1437114720_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1437114720_Ptr, marshalToNative(rect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class IGeneralTransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1437114720_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeneralTransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a06798b7a2ec415fade2eade9333f2c7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeneralTransform(ptr: Pointer?): WithDefault = IGeneralTransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeneralTransform {
      val address = segment.toRawLongValue()
      return makeIGeneralTransform(Pointer(address))
    }

    public override fun toNative(obj: IGeneralTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1437114720_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeneralTransform): Array<IGeneralTransform?> = (elements
        as Array<IGeneralTransform?>).castToImpl<IGeneralTransform,IGeneralTransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeneralTransform?> =
        arrayOfNulls<IGeneralTransform_Impl>(size) as Array<IGeneralTransform?>
  }
}
