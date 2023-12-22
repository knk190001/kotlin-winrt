package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Point
import Windows.UI.Input.PointerPoint
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

@ABIMarker(IInkStrokeBuilder.ABI::class)
@Signature("{82bbd1dc-1c63-41dc-9e07-4b4a70ced801}")
@Guid("82bbd1dc1c6341dc9e074b4a70ced801")
@WinRTInterface("82bbd1dc1c6341dc9e074b4a70ced801")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStrokeBuilder.ByReference::class)
public interface IInkStrokeBuilder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun BeginStroke(pointerPoint: PointerPoint?): Unit

  @InterfaceMethod(1)
  public fun AppendToStroke(pointerPoint: PointerPoint?): PointerPoint?

  @InterfaceMethod(2)
  public fun EndStroke(pointerPoint: PointerPoint?): InkStroke?

  @InterfaceMethod(3)
  public fun CreateStroke(points: IIterable<Point?>?): InkStroke?

  @InterfaceMethod(4)
  public fun SetDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkStrokeBuilder> {
    public override fun getValue() = ABI.makeIInkStrokeBuilder(pointer.getPointer(0))

    public fun setValue(value: IInkStrokeBuilder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStrokeBuilder {
    public val __188990057_Ptr: Pointer?

    public val _188990057_VtblPtr: Pointer?
      get() = __188990057_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun BeginStroke(pointerPoint: PointerPoint?): Unit {
      val fnPtr = _188990057_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__188990057_Ptr, marshalToNative(pointerPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun AppendToStroke(pointerPoint: PointerPoint?): PointerPoint? {
      val fnPtr = _188990057_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerPoint>()
      val hr = fn.invokeHR(arrayOf(__188990057_Ptr, marshalToNative(pointerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerPoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun EndStroke(pointerPoint: PointerPoint?): InkStroke? {
      val fnPtr = _188990057_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkStroke>()
      val hr = fn.invokeHR(arrayOf(__188990057_Ptr, marshalToNative(pointerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkStroke>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateStroke(points: IIterable<Point?>?): InkStroke? {
      val fnPtr = _188990057_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkStroke>()
      val hr = fn.invokeHR(arrayOf(__188990057_Ptr, marshalToNative(points), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkStroke>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes?):
        Unit {
      val fnPtr = _188990057_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__188990057_Ptr, marshalToNative(drawingAttributes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkStrokeBuilder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __188990057_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStrokeBuilder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82bbd1dc1c6341dc9e074b4a70ced801")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStrokeBuilder(ptr: Pointer?): WithDefault = IInkStrokeBuilder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStrokeBuilder {
      val address = segment.toRawLongValue()
      return makeIInkStrokeBuilder(Pointer(address))
    }

    public override fun toNative(obj: IInkStrokeBuilder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__188990057_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStrokeBuilder): Array<IInkStrokeBuilder?> = (elements
        as Array<IInkStrokeBuilder?>).castToImpl<IInkStrokeBuilder,IInkStrokeBuilder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStrokeBuilder?> =
        arrayOfNulls<IInkStrokeBuilder_Impl>(size) as Array<IInkStrokeBuilder?>
  }
}
