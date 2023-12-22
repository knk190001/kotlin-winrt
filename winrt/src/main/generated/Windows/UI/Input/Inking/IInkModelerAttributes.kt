package Windows.UI.Input.Inking

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkModelerAttributes.ABI::class)
@Signature("{bad31f27-0cd9-4bfd-b6f3-9e03ba8d7454}")
@Guid("bad31f270cd94bfdb6f39e03ba8d7454")
@WinRTInterface("bad31f270cd94bfdb6f39e03ba8d7454")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkModelerAttributes.ByReference::class)
public interface IInkModelerAttributes : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PredictionTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun put_PredictionTime(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_ScalingFactor(): Float

  @InterfaceMethod(3)
  public fun put_ScalingFactor(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkModelerAttributes> {
    public override fun getValue() = ABI.makeIInkModelerAttributes(pointer.getPointer(0))

    public fun setValue(value: IInkModelerAttributes_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkModelerAttributes {
    public val __1432040673_Ptr: Pointer?

    public val _1432040673_VtblPtr: Pointer?
      get() = __1432040673_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PredictionTime(): TimeSpan? {
      val fnPtr = _1432040673_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1432040673_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PredictionTime(value: TimeSpan?): Unit {
      val fnPtr = _1432040673_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1432040673_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ScalingFactor(): Float {
      val fnPtr = _1432040673_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1432040673_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ScalingFactor(value: Float): Unit {
      val fnPtr = _1432040673_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1432040673_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkModelerAttributes_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1432040673_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkModelerAttributes, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bad31f270cd94bfdb6f39e03ba8d7454")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkModelerAttributes(ptr: Pointer?): WithDefault =
        IInkModelerAttributes_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkModelerAttributes {
      val address = segment.toRawLongValue()
      return makeIInkModelerAttributes(Pointer(address))
    }

    public override fun toNative(obj: IInkModelerAttributes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1432040673_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkModelerAttributes): Array<IInkModelerAttributes?> =
        (elements as
        Array<IInkModelerAttributes?>).castToImpl<IInkModelerAttributes,IInkModelerAttributes_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkModelerAttributes?> =
        arrayOfNulls<IInkModelerAttributes_Impl>(size) as Array<IInkModelerAttributes?>
  }
}
