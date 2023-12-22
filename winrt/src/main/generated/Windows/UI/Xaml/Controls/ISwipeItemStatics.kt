package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(ISwipeItemStatics.ABI::class)
@Signature("{d0b44e96-2766-4d93-b5db-f5e1be832c2d}")
@Guid("d0b44e9627664d93b5dbf5e1be832c2d")
@WinRTInterface("d0b44e9627664d93b5dbf5e1be832c2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeItemStatics.ByReference::class)
public interface ISwipeItemStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IconSourceProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TextProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_BackgroundProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ForegroundProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_CommandProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_CommandParameterProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_BehaviorOnInvokedProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwipeItemStatics> {
    public override fun getValue() = ABI.makeISwipeItemStatics(pointer.getPointer(0))

    public fun setValue(value: ISwipeItemStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeItemStatics {
    public val __2042415692_Ptr: Pointer?

    public val _2042415692_VtblPtr: Pointer?
      get() = __2042415692_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IconSourceProperty(): DependencyProperty? {
      val fnPtr = _2042415692_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042415692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TextProperty(): DependencyProperty? {
      val fnPtr = _2042415692_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042415692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BackgroundProperty(): DependencyProperty? {
      val fnPtr = _2042415692_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042415692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ForegroundProperty(): DependencyProperty? {
      val fnPtr = _2042415692_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042415692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CommandProperty(): DependencyProperty? {
      val fnPtr = _2042415692_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042415692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CommandParameterProperty(): DependencyProperty? {
      val fnPtr = _2042415692_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042415692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_BehaviorOnInvokedProperty(): DependencyProperty? {
      val fnPtr = _2042415692_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2042415692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISwipeItemStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2042415692_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeItemStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0b44e9627664d93b5dbf5e1be832c2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeItemStatics(ptr: Pointer?): WithDefault = ISwipeItemStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeItemStatics {
      val address = segment.toRawLongValue()
      return makeISwipeItemStatics(Pointer(address))
    }

    public override fun toNative(obj: ISwipeItemStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2042415692_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeItemStatics): Array<ISwipeItemStatics?> = (elements
        as Array<ISwipeItemStatics?>).castToImpl<ISwipeItemStatics,ISwipeItemStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeItemStatics?> =
        arrayOfNulls<ISwipeItemStatics_Impl>(size) as Array<ISwipeItemStatics?>
  }
}
