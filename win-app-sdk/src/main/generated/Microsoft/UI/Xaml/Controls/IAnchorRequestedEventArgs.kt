package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.Collections.IVector
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

@ABIMarker(IAnchorRequestedEventArgs.ABI::class)
@Signature("{d5645e80-d4d3-5df8-a3ac-1f9beeb2bcef}")
@Guid("d5645e80d4d35df8a3ac1f9beeb2bcef")
@WinRTInterface("d5645e80d4d35df8a3ac1f9beeb2bcef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnchorRequestedEventArgs.ByReference::class)
public interface IAnchorRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Anchor(): UIElement?

  @InterfaceMethod(1)
  public fun put_Anchor(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_AnchorCandidates(): IVector<UIElement?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnchorRequestedEventArgs> {
    public override fun getValue() = ABI.makeIAnchorRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAnchorRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnchorRequestedEventArgs {
    public val __918725413_Ptr: Pointer?

    public val _918725413_VtblPtr: Pointer?
      get() = __918725413_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Anchor(): UIElement? {
      val fnPtr = _918725413_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__918725413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Anchor(value: UIElement?): Unit {
      val fnPtr = _918725413_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__918725413_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AnchorCandidates(): IVector<UIElement?>? {
      val fnPtr = _918725413_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<UIElement?>>()
      val hr = fn.invokeHR(arrayOf(__918725413_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<UIElement?>>(result.getValue())
      return resultValue
    }
  }

  public class IAnchorRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __918725413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnchorRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5645e80d4d35df8a3ac1f9beeb2bcef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnchorRequestedEventArgs(ptr: Pointer?): WithDefault =
        IAnchorRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnchorRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAnchorRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAnchorRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__918725413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnchorRequestedEventArgs):
        Array<IAnchorRequestedEventArgs?> = (elements as
        Array<IAnchorRequestedEventArgs?>).castToImpl<IAnchorRequestedEventArgs,IAnchorRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnchorRequestedEventArgs?> =
        arrayOfNulls<IAnchorRequestedEventArgs_Impl>(size) as Array<IAnchorRequestedEventArgs?>
  }
}
