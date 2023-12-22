package Windows.UI.Core

import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.UI.Core.ICoreWindowEventArgs.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ITouchHitTestingEventArgs.ABI::class)
@Signature("{22f3b823-0b7c-424e-9df7-33d4f962931b}")
@Guid("22f3b8230b7c424e9df733d4f962931b")
@WinRTInterface("22f3b8230b7c424e9df733d4f962931b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITouchHitTestingEventArgs.ByReference::class)
public interface ITouchHitTestingEventArgs : NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
  @InterfaceMethod(0)
  public fun get_ProximityEvaluation(): CoreProximityEvaluation?

  @InterfaceMethod(1)
  public fun put_ProximityEvaluation(value: CoreProximityEvaluation?): Unit

  @InterfaceMethod(2)
  public fun get_Point(): Point?

  @InterfaceMethod(3)
  public fun get_BoundingBox(): Rect?

  @InterfaceMethod(4)
  public fun EvaluateProximity(controlBoundingBox: Rect?): CoreProximityEvaluation?

  @InterfaceMethod(5)
  public fun EvaluateProximity(controlVertices: Array<Point?>): CoreProximityEvaluation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITouchHitTestingEventArgs> {
    public override fun getValue() = ABI.makeITouchHitTestingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITouchHitTestingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITouchHitTestingEventArgs, ICoreWindowEventArgs.WithDefault {
    public val __1986994890_Ptr: Pointer?

    public val _1986994890_VtblPtr: Pointer?
      get() = __1986994890_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProximityEvaluation(): CoreProximityEvaluation? {
      val fnPtr = _1986994890_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreProximityEvaluation>()
      val hr = fn.invokeHR(arrayOf(__1986994890_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreProximityEvaluation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ProximityEvaluation(value: CoreProximityEvaluation?): Unit {
      val fnPtr = _1986994890_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1986994890_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Point(): Point? {
      val fnPtr = _1986994890_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1986994890_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BoundingBox(): Rect? {
      val fnPtr = _1986994890_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1986994890_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun EvaluateProximity(controlBoundingBox: Rect?): CoreProximityEvaluation? {
      val fnPtr = _1986994890_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreProximityEvaluation>()
      val hr = fn.invokeHR(arrayOf(__1986994890_Ptr, marshalToNative(controlBoundingBox), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreProximityEvaluation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun EvaluateProximity(controlVertices: Array<Point?>):
        CoreProximityEvaluation? {
      val fnPtr = _1986994890_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreProximityEvaluation>()
      val hr = fn.invokeHR(arrayOf(__1986994890_Ptr,
          controlVertices.size,marshalToNative(controlVertices), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreProximityEvaluation>(result.getValue())
      return resultValue
    }
  }

  public class ITouchHitTestingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
    public override val __407060269_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1986994890_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1986994890_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITouchHitTestingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22f3b8230b7c424e9df733d4f962931b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITouchHitTestingEventArgs(ptr: Pointer?): WithDefault =
        ITouchHitTestingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITouchHitTestingEventArgs {
      val address = segment.toRawLongValue()
      return makeITouchHitTestingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITouchHitTestingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1986994890_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITouchHitTestingEventArgs):
        Array<ITouchHitTestingEventArgs?> = (elements as
        Array<ITouchHitTestingEventArgs?>).castToImpl<ITouchHitTestingEventArgs,ITouchHitTestingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITouchHitTestingEventArgs?> =
        arrayOfNulls<ITouchHitTestingEventArgs_Impl>(size) as Array<ITouchHitTestingEventArgs?>
  }
}
