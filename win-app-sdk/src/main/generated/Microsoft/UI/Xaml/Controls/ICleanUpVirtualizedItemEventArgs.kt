package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ICleanUpVirtualizedItemEventArgs.ABI::class)
@Signature("{76155ad9-e394-5313-832f-e21cf7b7fb0e}")
@Guid("76155ad9e3945313832fe21cf7b7fb0e")
@WinRTInterface("76155ad9e3945313832fe21cf7b7fb0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICleanUpVirtualizedItemEventArgs.ByReference::class)
public interface ICleanUpVirtualizedItemEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): IUnknown?

  @InterfaceMethod(1)
  public fun get_UIElement(): UIElement?

  @InterfaceMethod(2)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(3)
  public fun put_Cancel(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICleanUpVirtualizedItemEventArgs> {
    public override fun getValue() = ABI.makeICleanUpVirtualizedItemEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICleanUpVirtualizedItemEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICleanUpVirtualizedItemEventArgs {
    public val __1475737178_Ptr: Pointer?

    public val _1475737178_VtblPtr: Pointer?
      get() = __1475737178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): IUnknown? {
      val fnPtr = _1475737178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1475737178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UIElement(): UIElement? {
      val fnPtr = _1475737178_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1475737178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1475737178_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1475737178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1475737178_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1475737178_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICleanUpVirtualizedItemEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1475737178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICleanUpVirtualizedItemEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76155ad9e3945313832fe21cf7b7fb0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICleanUpVirtualizedItemEventArgs(ptr: Pointer?): WithDefault =
        ICleanUpVirtualizedItemEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICleanUpVirtualizedItemEventArgs {
      val address = segment.toRawLongValue()
      return makeICleanUpVirtualizedItemEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICleanUpVirtualizedItemEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1475737178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICleanUpVirtualizedItemEventArgs):
        Array<ICleanUpVirtualizedItemEventArgs?> = (elements as
        Array<ICleanUpVirtualizedItemEventArgs?>).castToImpl<ICleanUpVirtualizedItemEventArgs,ICleanUpVirtualizedItemEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICleanUpVirtualizedItemEventArgs?> =
        arrayOfNulls<ICleanUpVirtualizedItemEventArgs_Impl>(size) as
        Array<ICleanUpVirtualizedItemEventArgs?>
  }
}
