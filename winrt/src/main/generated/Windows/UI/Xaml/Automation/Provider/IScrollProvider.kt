package Windows.UI.Xaml.Automation.Provider

import Windows.UI.Xaml.Automation.ScrollAmount
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

@ABIMarker(IScrollProvider.ABI::class)
@Signature("{374bf581-7716-4bbc-82eb-d997006ea999}")
@Guid("374bf58177164bbc82ebd997006ea999")
@WinRTInterface("374bf58177164bbc82ebd997006ea999")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollProvider.ByReference::class)
public interface IScrollProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontallyScrollable(): Boolean

  @InterfaceMethod(1)
  public fun get_HorizontalScrollPercent(): Double

  @InterfaceMethod(2)
  public fun get_HorizontalViewSize(): Double

  @InterfaceMethod(3)
  public fun get_VerticallyScrollable(): Boolean

  @InterfaceMethod(4)
  public fun get_VerticalScrollPercent(): Double

  @InterfaceMethod(5)
  public fun get_VerticalViewSize(): Double

  @InterfaceMethod(6)
  public fun Scroll(horizontalAmount: ScrollAmount?, verticalAmount: ScrollAmount?): Unit

  @InterfaceMethod(7)
  public fun SetScrollPercent(horizontalPercent: Double, verticalPercent: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollProvider> {
    public override fun getValue() = ABI.makeIScrollProvider(pointer.getPointer(0))

    public fun setValue(value: IScrollProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollProvider {
    public val __1079149302_Ptr: Pointer?

    public val _1079149302_VtblPtr: Pointer?
      get() = __1079149302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontallyScrollable(): Boolean {
      val fnPtr = _1079149302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1079149302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_HorizontalScrollPercent(): Double {
      val fnPtr = _1079149302_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1079149302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_HorizontalViewSize(): Double {
      val fnPtr = _1079149302_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1079149302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_VerticallyScrollable(): Boolean {
      val fnPtr = _1079149302_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1079149302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_VerticalScrollPercent(): Double {
      val fnPtr = _1079149302_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1079149302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_VerticalViewSize(): Double {
      val fnPtr = _1079149302_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1079149302_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun Scroll(horizontalAmount: ScrollAmount?, verticalAmount: ScrollAmount?):
        Unit {
      val fnPtr = _1079149302_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1079149302_Ptr, marshalToNative(horizontalAmount),
          marshalToNative(verticalAmount),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun SetScrollPercent(horizontalPercent: Double, verticalPercent: Double): Unit {
      val fnPtr = _1079149302_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1079149302_Ptr, horizontalPercent, verticalPercent,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1079149302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("374bf58177164bbc82ebd997006ea999")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollProvider(ptr: Pointer?): WithDefault = IScrollProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollProvider {
      val address = segment.toRawLongValue()
      return makeIScrollProvider(Pointer(address))
    }

    public override fun toNative(obj: IScrollProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1079149302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollProvider): Array<IScrollProvider?> = (elements as
        Array<IScrollProvider?>).castToImpl<IScrollProvider,IScrollProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollProvider?> =
        arrayOfNulls<IScrollProvider_Impl>(size) as Array<IScrollProvider?>
  }
}
