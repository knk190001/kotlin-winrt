package Microsoft.UI.Input

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

@ABIMarker(IPointerPointTransform.ABI::class)
@Signature("{db4791bc-994d-54c7-92ef-66ea1de9b43c}")
@Guid("db4791bc994d54c792ef66ea1de9b43c")
@WinRTInterface("db4791bc994d54c792ef66ea1de9b43c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerPointTransform.ByReference::class)
public interface IPointerPointTransform : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Inverse(): IPointerPointTransform?

  @InterfaceMethod(1)
  public fun TryTransform(inPoint: Point?, outPoint: Windows.Foundation.Point.ByReference?): Boolean

  @InterfaceMethod(2)
  public fun TryTransformBounds(inRect: Rect?, outRect: Windows.Foundation.Rect.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerPointTransform> {
    public override fun getValue() = ABI.makeIPointerPointTransform(pointer.getPointer(0))

    public fun setValue(value: IPointerPointTransform_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerPointTransform {
    public val __1885687680_Ptr: Pointer?

    public val _1885687680_VtblPtr: Pointer?
      get() = __1885687680_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Inverse(): IPointerPointTransform? {
      val fnPtr = _1885687680_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPointerPointTransform>()
      val hr = fn.invokeHR(arrayOf(__1885687680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPointerPointTransform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryTransform(inPoint: Point?,
        outPoint: Windows.Foundation.Point.ByReference?): Boolean {
      val fnPtr = _1885687680_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1885687680_Ptr, marshalToNative(inPoint),
          marshalToNative(outPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun TryTransformBounds(inRect: Rect?,
        outRect: Windows.Foundation.Rect.ByReference?): Boolean {
      val fnPtr = _1885687680_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1885687680_Ptr, marshalToNative(inRect),
          marshalToNative(outRect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPointerPointTransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1885687680_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerPointTransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db4791bc994d54c792ef66ea1de9b43c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerPointTransform(ptr: Pointer?): WithDefault =
        IPointerPointTransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerPointTransform {
      val address = segment.toRawLongValue()
      return makeIPointerPointTransform(Pointer(address))
    }

    public override fun toNative(obj: IPointerPointTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1885687680_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerPointTransform): Array<IPointerPointTransform?> =
        (elements as
        Array<IPointerPointTransform?>).castToImpl<IPointerPointTransform,IPointerPointTransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerPointTransform?> =
        arrayOfNulls<IPointerPointTransform_Impl>(size) as Array<IPointerPointTransform?>
  }
}
