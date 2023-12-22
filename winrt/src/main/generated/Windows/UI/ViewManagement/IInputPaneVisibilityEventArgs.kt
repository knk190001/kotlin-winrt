package Windows.UI.ViewManagement

import Windows.Foundation.Rect
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInputPaneVisibilityEventArgs.ABI::class)
@Signature("{d243e016-d907-4fcc-bb8d-f77baa5028f1}")
@Guid("d243e016d9074fccbb8df77baa5028f1")
@WinRTInterface("d243e016d9074fccbb8df77baa5028f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputPaneVisibilityEventArgs.ByReference::class)
public interface IInputPaneVisibilityEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OccludedRect(): Rect?

  @InterfaceMethod(1)
  public fun put_EnsuredFocusedElementInView(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_EnsuredFocusedElementInView(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputPaneVisibilityEventArgs> {
    public override fun getValue() = ABI.makeIInputPaneVisibilityEventArgs(pointer.getPointer(0))

    public fun setValue(value: IInputPaneVisibilityEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputPaneVisibilityEventArgs {
    public val __1329857413_Ptr: Pointer?

    public val _1329857413_VtblPtr: Pointer?
      get() = __1329857413_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OccludedRect(): Rect? {
      val fnPtr = _1329857413_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1329857413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EnsuredFocusedElementInView(value: Boolean): Unit {
      val fnPtr = _1329857413_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1329857413_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_EnsuredFocusedElementInView(): Boolean {
      val fnPtr = _1329857413_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1329857413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IInputPaneVisibilityEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1329857413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputPaneVisibilityEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d243e016d9074fccbb8df77baa5028f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputPaneVisibilityEventArgs(ptr: Pointer?): WithDefault =
        IInputPaneVisibilityEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputPaneVisibilityEventArgs {
      val address = segment.toRawLongValue()
      return makeIInputPaneVisibilityEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IInputPaneVisibilityEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1329857413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputPaneVisibilityEventArgs):
        Array<IInputPaneVisibilityEventArgs?> = (elements as
        Array<IInputPaneVisibilityEventArgs?>).castToImpl<IInputPaneVisibilityEventArgs,IInputPaneVisibilityEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputPaneVisibilityEventArgs?> =
        arrayOfNulls<IInputPaneVisibilityEventArgs_Impl>(size) as
        Array<IInputPaneVisibilityEventArgs?>
  }
}
