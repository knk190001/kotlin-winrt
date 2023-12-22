package Windows.UI.Xaml.Input

import Windows.Foundation.Rect
import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(IFindNextElementOptions.ABI::class)
@Signature("{d88ae22b-46c2-41fc-897e-b5961977b89d}")
@Guid("d88ae22b46c241fc897eb5961977b89d")
@WinRTInterface("d88ae22b46c241fc897eb5961977b89d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFindNextElementOptions.ByReference::class)
public interface IFindNextElementOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SearchRoot(): DependencyObject?

  @InterfaceMethod(1)
  public fun put_SearchRoot(value: DependencyObject?): Unit

  @InterfaceMethod(2)
  public fun get_ExclusionRect(): Rect?

  @InterfaceMethod(3)
  public fun put_ExclusionRect(value: Rect?): Unit

  @InterfaceMethod(4)
  public fun get_HintRect(): Rect?

  @InterfaceMethod(5)
  public fun put_HintRect(value: Rect?): Unit

  @InterfaceMethod(6)
  public fun get_XYFocusNavigationStrategyOverride(): XYFocusNavigationStrategyOverride?

  @InterfaceMethod(7)
  public fun put_XYFocusNavigationStrategyOverride(value: XYFocusNavigationStrategyOverride?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFindNextElementOptions> {
    public override fun getValue() = ABI.makeIFindNextElementOptions(pointer.getPointer(0))

    public fun setValue(value: IFindNextElementOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFindNextElementOptions {
    public val __1140454852_Ptr: Pointer?

    public val _1140454852_VtblPtr: Pointer?
      get() = __1140454852_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SearchRoot(): DependencyObject? {
      val fnPtr = _1140454852_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1140454852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SearchRoot(value: DependencyObject?): Unit {
      val fnPtr = _1140454852_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1140454852_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ExclusionRect(): Rect? {
      val fnPtr = _1140454852_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1140454852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ExclusionRect(value: Rect?): Unit {
      val fnPtr = _1140454852_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1140454852_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HintRect(): Rect? {
      val fnPtr = _1140454852_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1140454852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_HintRect(value: Rect?): Unit {
      val fnPtr = _1140454852_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1140454852_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_XYFocusNavigationStrategyOverride():
        XYFocusNavigationStrategyOverride? {
      val fnPtr = _1140454852_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategyOverride>()
      val hr = fn.invokeHR(arrayOf(__1140454852_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategyOverride>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override
        fun put_XYFocusNavigationStrategyOverride(value: XYFocusNavigationStrategyOverride?): Unit {
      val fnPtr = _1140454852_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1140454852_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFindNextElementOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1140454852_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFindNextElementOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d88ae22b46c241fc897eb5961977b89d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFindNextElementOptions(ptr: Pointer?): WithDefault =
        IFindNextElementOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFindNextElementOptions {
      val address = segment.toRawLongValue()
      return makeIFindNextElementOptions(Pointer(address))
    }

    public override fun toNative(obj: IFindNextElementOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1140454852_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFindNextElementOptions): Array<IFindNextElementOptions?>
        = (elements as
        Array<IFindNextElementOptions?>).castToImpl<IFindNextElementOptions,IFindNextElementOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFindNextElementOptions?> =
        arrayOfNulls<IFindNextElementOptions_Impl>(size) as Array<IFindNextElementOptions?>
  }
}
