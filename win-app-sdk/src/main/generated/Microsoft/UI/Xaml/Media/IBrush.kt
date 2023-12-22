package Microsoft.UI.Xaml.Media

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBrush.ABI::class)
@Signature("{2de3cb83-1329-5679-88f8-c822bc5442cb}")
@Guid("2de3cb831329567988f8c822bc5442cb")
@WinRTInterface("2de3cb831329567988f8c822bc5442cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBrush.ByReference::class)
public interface IBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Opacity(): Double

  @InterfaceMethod(1)
  public fun put_Opacity(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_Transform(): Transform?

  @InterfaceMethod(3)
  public fun put_Transform(value: Transform?): Unit

  @InterfaceMethod(4)
  public fun get_RelativeTransform(): Transform?

  @InterfaceMethod(5)
  public fun put_RelativeTransform(value: Transform?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBrush> {
    public override fun getValue() = ABI.makeIBrush(pointer.getPointer(0))

    public fun setValue(value: IBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBrush {
    public val __1563355735_Ptr: Pointer?

    public val _1563355735_VtblPtr: Pointer?
      get() = __1563355735_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Opacity(): Double {
      val fnPtr = _1563355735_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1563355735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Opacity(value: Double): Unit {
      val fnPtr = _1563355735_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1563355735_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Transform(): Transform? {
      val fnPtr = _1563355735_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Transform>()
      val hr = fn.invokeHR(arrayOf(__1563355735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Transform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Transform(value: Transform?): Unit {
      val fnPtr = _1563355735_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1563355735_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RelativeTransform(): Transform? {
      val fnPtr = _1563355735_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Transform>()
      val hr = fn.invokeHR(arrayOf(__1563355735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Transform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_RelativeTransform(value: Transform?): Unit {
      val fnPtr = _1563355735_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1563355735_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1563355735_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2de3cb831329567988f8c822bc5442cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBrush(ptr: Pointer?): WithDefault = IBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBrush {
      val address = segment.toRawLongValue()
      return makeIBrush(Pointer(address))
    }

    public override fun toNative(obj: IBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1563355735_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBrush): Array<IBrush?> = (elements as
        Array<IBrush?>).castToImpl<IBrush,IBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBrush?> = arrayOfNulls<IBrush_Impl>(size) as
        Array<IBrush?>
  }
}
