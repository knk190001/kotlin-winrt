package Windows.UI.Xaml.Media

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

@ABIMarker(IPolyBezierSegment.ABI::class)
@Signature("{36805271-38c4-4bcf-96cd-028a6d38af25}")
@Guid("3680527138c44bcf96cd028a6d38af25")
@WinRTInterface("3680527138c44bcf96cd028a6d38af25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPolyBezierSegment.ByReference::class)
public interface IPolyBezierSegment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Points(): PointCollection?

  @InterfaceMethod(1)
  public fun put_Points(value: PointCollection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPolyBezierSegment> {
    public override fun getValue() = ABI.makeIPolyBezierSegment(pointer.getPointer(0))

    public fun setValue(value: IPolyBezierSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPolyBezierSegment {
    public val __1036818540_Ptr: Pointer?

    public val _1036818540_VtblPtr: Pointer?
      get() = __1036818540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Points(): PointCollection? {
      val fnPtr = _1036818540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointCollection>()
      val hr = fn.invokeHR(arrayOf(__1036818540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Points(value: PointCollection?): Unit {
      val fnPtr = _1036818540_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1036818540_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPolyBezierSegment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1036818540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPolyBezierSegment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3680527138c44bcf96cd028a6d38af25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPolyBezierSegment(ptr: Pointer?): WithDefault = IPolyBezierSegment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPolyBezierSegment {
      val address = segment.toRawLongValue()
      return makeIPolyBezierSegment(Pointer(address))
    }

    public override fun toNative(obj: IPolyBezierSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1036818540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPolyBezierSegment): Array<IPolyBezierSegment?> =
        (elements as
        Array<IPolyBezierSegment?>).castToImpl<IPolyBezierSegment,IPolyBezierSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPolyBezierSegment?> =
        arrayOfNulls<IPolyBezierSegment_Impl>(size) as Array<IPolyBezierSegment?>
  }
}
