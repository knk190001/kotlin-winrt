package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.Media.Animation.EasingFunctionBase
import Microsoft.UI.Xaml.Media.Animation.Storyboard
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVisualTransition.ABI::class)
@Signature("{dd21af54-2ce1-59de-9fd1-2b45f6bf6581}")
@Guid("dd21af542ce159de9fd12b45f6bf6581")
@WinRTInterface("dd21af542ce159de9fd12b45f6bf6581")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualTransition.ByReference::class)
public interface IVisualTransition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GeneratedDuration(): Duration?

  @InterfaceMethod(1)
  public fun put_GeneratedDuration(value: Duration?): Unit

  @InterfaceMethod(2)
  public fun get_GeneratedEasingFunction(): EasingFunctionBase?

  @InterfaceMethod(3)
  public fun put_GeneratedEasingFunction(value: EasingFunctionBase?): Unit

  @InterfaceMethod(4)
  public fun get_To(): String?

  @InterfaceMethod(5)
  public fun put_To(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_From(): String?

  @InterfaceMethod(7)
  public fun put_From(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_Storyboard(): Storyboard?

  @InterfaceMethod(9)
  public fun put_Storyboard(value: Storyboard?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualTransition> {
    public override fun getValue() = ABI.makeIVisualTransition(pointer.getPointer(0))

    public fun setValue(value: IVisualTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualTransition {
    public val __716049148_Ptr: Pointer?

    public val _716049148_VtblPtr: Pointer?
      get() = __716049148_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GeneratedDuration(): Duration? {
      val fnPtr = _716049148_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Duration>()
      val hr = fn.invokeHR(arrayOf(__716049148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Duration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_GeneratedDuration(value: Duration?): Unit {
      val fnPtr = _716049148_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__716049148_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_GeneratedEasingFunction(): EasingFunctionBase? {
      val fnPtr = _716049148_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasingFunctionBase>()
      val hr = fn.invokeHR(arrayOf(__716049148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasingFunctionBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_GeneratedEasingFunction(value: EasingFunctionBase?): Unit {
      val fnPtr = _716049148_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__716049148_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_To(): String? {
      val fnPtr = _716049148_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__716049148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_To(value: String?): Unit {
      val fnPtr = _716049148_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__716049148_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_From(): String? {
      val fnPtr = _716049148_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__716049148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_From(value: String?): Unit {
      val fnPtr = _716049148_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__716049148_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Storyboard(): Storyboard? {
      val fnPtr = _716049148_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Storyboard>()
      val hr = fn.invokeHR(arrayOf(__716049148_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Storyboard>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Storyboard(value: Storyboard?): Unit {
      val fnPtr = _716049148_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__716049148_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisualTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __716049148_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd21af542ce159de9fd12b45f6bf6581")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualTransition(ptr: Pointer?): WithDefault = IVisualTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualTransition {
      val address = segment.toRawLongValue()
      return makeIVisualTransition(Pointer(address))
    }

    public override fun toNative(obj: IVisualTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__716049148_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualTransition): Array<IVisualTransition?> = (elements
        as Array<IVisualTransition?>).castToImpl<IVisualTransition,IVisualTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualTransition?> =
        arrayOfNulls<IVisualTransition_Impl>(size) as Array<IVisualTransition?>
  }
}
