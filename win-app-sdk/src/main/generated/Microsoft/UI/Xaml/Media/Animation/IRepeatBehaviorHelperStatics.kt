package Microsoft.UI.Xaml.Media.Animation

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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRepeatBehaviorHelperStatics.ABI::class)
@Signature("{c66d4425-6461-5189-b17d-cca0cca34ca0}")
@Guid("c66d442564615189b17dcca0cca34ca0")
@WinRTInterface("c66d442564615189b17dcca0cca34ca0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepeatBehaviorHelperStatics.ByReference::class)
public interface IRepeatBehaviorHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Forever(): RepeatBehavior?

  @InterfaceMethod(1)
  public fun FromCount(count: Double): RepeatBehavior?

  @InterfaceMethod(2)
  public fun FromDuration(duration: TimeSpan?): RepeatBehavior?

  @InterfaceMethod(3)
  public fun GetHasCount(target: RepeatBehavior?): Boolean

  @InterfaceMethod(4)
  public fun GetHasDuration(target: RepeatBehavior?): Boolean

  @InterfaceMethod(5)
  public fun Equals(target: RepeatBehavior?, value: RepeatBehavior?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepeatBehaviorHelperStatics> {
    public override fun getValue() = ABI.makeIRepeatBehaviorHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IRepeatBehaviorHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepeatBehaviorHelperStatics {
    public val __549344945_Ptr: Pointer?

    public val _549344945_VtblPtr: Pointer?
      get() = __549344945_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Forever(): RepeatBehavior? {
      val fnPtr = _549344945_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RepeatBehavior>()
      val hr = fn.invokeHR(arrayOf(__549344945_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RepeatBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromCount(count: Double): RepeatBehavior? {
      val fnPtr = _549344945_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RepeatBehavior>()
      val hr = fn.invokeHR(arrayOf(__549344945_Ptr, count, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RepeatBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromDuration(duration: TimeSpan?): RepeatBehavior? {
      val fnPtr = _549344945_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RepeatBehavior>()
      val hr = fn.invokeHR(arrayOf(__549344945_Ptr, marshalToNative(duration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RepeatBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetHasCount(target: RepeatBehavior?): Boolean {
      val fnPtr = _549344945_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__549344945_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun GetHasDuration(target: RepeatBehavior?): Boolean {
      val fnPtr = _549344945_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__549344945_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun Equals(target: RepeatBehavior?, value: RepeatBehavior?): Boolean {
      val fnPtr = _549344945_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__549344945_Ptr, marshalToNative(target), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRepeatBehaviorHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __549344945_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepeatBehaviorHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c66d442564615189b17dcca0cca34ca0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepeatBehaviorHelperStatics(ptr: Pointer?): WithDefault =
        IRepeatBehaviorHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepeatBehaviorHelperStatics {
      val address = segment.toRawLongValue()
      return makeIRepeatBehaviorHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IRepeatBehaviorHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__549344945_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepeatBehaviorHelperStatics):
        Array<IRepeatBehaviorHelperStatics?> = (elements as
        Array<IRepeatBehaviorHelperStatics?>).castToImpl<IRepeatBehaviorHelperStatics,IRepeatBehaviorHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepeatBehaviorHelperStatics?> =
        arrayOfNulls<IRepeatBehaviorHelperStatics_Impl>(size) as
        Array<IRepeatBehaviorHelperStatics?>
  }
}
