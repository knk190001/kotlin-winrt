package Microsoft.UI.Input

import Windows.Foundation.TimeSpan
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

@ABIMarker(IPointerPredictor.ABI::class)
@Signature("{12c100ec-2100-565f-a60c-f1187f438828}")
@Guid("12c100ec2100565fa60cf1187f438828")
@WinRTInterface("12c100ec2100565fa60cf1187f438828")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerPredictor.ByReference::class)
public interface IPointerPredictor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PredictionTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_PredictionTime(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun GetPredictedPoints(point: PointerPoint?): Array<PointerPoint?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerPredictor> {
    public override fun getValue() = ABI.makeIPointerPredictor(pointer.getPointer(0))

    public fun setValue(value: IPointerPredictor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerPredictor {
    public val __598454728_Ptr: Pointer?

    public val _598454728_VtblPtr: Pointer?
      get() = __598454728_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PredictionTime(): TimeSpan? {
      val fnPtr = _598454728_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__598454728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PredictionTime(value: TimeSpan?): Unit {
      val fnPtr = _598454728_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__598454728_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetPredictedPoints(point: PointerPoint?): Array<PointerPoint?>? {
      val fnPtr = _598454728_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<PointerPoint>()
      val hr = fn.invokeHR(arrayOf(__598454728_Ptr, marshalToNative(point), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class IPointerPredictor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __598454728_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerPredictor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12c100ec2100565fa60cf1187f438828")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerPredictor(ptr: Pointer?): WithDefault = IPointerPredictor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerPredictor {
      val address = segment.toRawLongValue()
      return makeIPointerPredictor(Pointer(address))
    }

    public override fun toNative(obj: IPointerPredictor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__598454728_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerPredictor): Array<IPointerPredictor?> = (elements
        as Array<IPointerPredictor?>).castToImpl<IPointerPredictor,IPointerPredictor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerPredictor?> =
        arrayOfNulls<IPointerPredictor_Impl>(size) as Array<IPointerPredictor?>
  }
}
