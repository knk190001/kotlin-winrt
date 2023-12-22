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

@ABIMarker(ITouchHitTestingEventArgs.ABI::class)
@Signature("{c2196f0c-60ed-5b5d-b919-aa7357e0a25c}")
@Guid("c2196f0c60ed5b5db919aa7357e0a25c")
@WinRTInterface("c2196f0c60ed5b5db919aa7357e0a25c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITouchHitTestingEventArgs.ByReference::class)
public interface ITouchHitTestingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BoundingBox(): Rect?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_Point(): Point?

  @InterfaceMethod(4)
  public fun GetProximityEvaluation(): ProximityEvaluation?

  @InterfaceMethod(5)
  public fun SetProximityEvaluation(proximityEvaluation: ProximityEvaluation?): Unit

  @InterfaceMethod(6)
  public fun EvaluateProximityToRect(controlBoundingBox: Rect?): ProximityEvaluation?

  @InterfaceMethod(7)
  public fun EvaluateProximityToPolygon(controlVertices: Array<Point?>): ProximityEvaluation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITouchHitTestingEventArgs> {
    public override fun getValue() = ABI.makeITouchHitTestingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITouchHitTestingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITouchHitTestingEventArgs {
    public val __428864724_Ptr: Pointer?

    public val _428864724_VtblPtr: Pointer?
      get() = __428864724_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BoundingBox(): Rect? {
      val fnPtr = _428864724_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__428864724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _428864724_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__428864724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _428864724_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__428864724_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Point(): Point? {
      val fnPtr = _428864724_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__428864724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetProximityEvaluation(): ProximityEvaluation? {
      val fnPtr = _428864724_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProximityEvaluation>()
      val hr = fn.invokeHR(arrayOf(__428864724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProximityEvaluation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetProximityEvaluation(proximityEvaluation: ProximityEvaluation?): Unit {
      val fnPtr = _428864724_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__428864724_Ptr, marshalToNative(proximityEvaluation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun EvaluateProximityToRect(controlBoundingBox: Rect?): ProximityEvaluation? {
      val fnPtr = _428864724_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProximityEvaluation>()
      val hr = fn.invokeHR(arrayOf(__428864724_Ptr, marshalToNative(controlBoundingBox), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProximityEvaluation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun EvaluateProximityToPolygon(controlVertices: Array<Point?>):
        ProximityEvaluation? {
      val fnPtr = _428864724_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProximityEvaluation>()
      val hr = fn.invokeHR(arrayOf(__428864724_Ptr,
          controlVertices.size,marshalToNative(controlVertices), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProximityEvaluation>(result.getValue())
      return resultValue
    }
  }

  public class ITouchHitTestingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __428864724_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITouchHitTestingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c2196f0c60ed5b5db919aa7357e0a25c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITouchHitTestingEventArgs(ptr: Pointer?): WithDefault =
        ITouchHitTestingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITouchHitTestingEventArgs {
      val address = segment.toRawLongValue()
      return makeITouchHitTestingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITouchHitTestingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__428864724_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITouchHitTestingEventArgs):
        Array<ITouchHitTestingEventArgs?> = (elements as
        Array<ITouchHitTestingEventArgs?>).castToImpl<ITouchHitTestingEventArgs,ITouchHitTestingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITouchHitTestingEventArgs?> =
        arrayOfNulls<ITouchHitTestingEventArgs_Impl>(size) as Array<ITouchHitTestingEventArgs?>
  }
}
