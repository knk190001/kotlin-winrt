package Windows.UI.ViewManagement

import Windows.Foundation.Size
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

@ABIMarker(IViewModePreferences.ABI::class)
@Signature("{878fcd3a-0b99-42c9-84d0-d3f1d403554b}")
@Guid("878fcd3a0b9942c984d0d3f1d403554b")
@WinRTInterface("878fcd3a0b9942c984d0d3f1d403554b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IViewModePreferences.ByReference::class)
public interface IViewModePreferences : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ViewSizePreference(): ViewSizePreference?

  @InterfaceMethod(1)
  public fun put_ViewSizePreference(value: ViewSizePreference?): Unit

  @InterfaceMethod(2)
  public fun get_CustomSize(): Size?

  @InterfaceMethod(3)
  public fun put_CustomSize(value: Size?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IViewModePreferences> {
    public override fun getValue() = ABI.makeIViewModePreferences(pointer.getPointer(0))

    public fun setValue(value: IViewModePreferences_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IViewModePreferences {
    public val __1689840670_Ptr: Pointer?

    public val _1689840670_VtblPtr: Pointer?
      get() = __1689840670_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ViewSizePreference(): ViewSizePreference? {
      val fnPtr = _1689840670_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ViewSizePreference>()
      val hr = fn.invokeHR(arrayOf(__1689840670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ViewSizePreference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ViewSizePreference(value: ViewSizePreference?): Unit {
      val fnPtr = _1689840670_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1689840670_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CustomSize(): Size? {
      val fnPtr = _1689840670_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1689840670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CustomSize(value: Size?): Unit {
      val fnPtr = _1689840670_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1689840670_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IViewModePreferences_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1689840670_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IViewModePreferences, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("878fcd3a0b9942c984d0d3f1d403554b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIViewModePreferences(ptr: Pointer?): WithDefault = IViewModePreferences_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IViewModePreferences {
      val address = segment.toRawLongValue()
      return makeIViewModePreferences(Pointer(address))
    }

    public override fun toNative(obj: IViewModePreferences): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1689840670_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IViewModePreferences): Array<IViewModePreferences?> =
        (elements as
        Array<IViewModePreferences?>).castToImpl<IViewModePreferences,IViewModePreferences_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IViewModePreferences?> =
        arrayOfNulls<IViewModePreferences_Impl>(size) as Array<IViewModePreferences?>
  }
}
