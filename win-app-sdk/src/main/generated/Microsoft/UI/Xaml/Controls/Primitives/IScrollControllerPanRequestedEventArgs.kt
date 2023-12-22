package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Input.PointerPoint
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

@ABIMarker(IScrollControllerPanRequestedEventArgs.ABI::class)
@Signature("{beee064e-1d4d-5a1a-8781-acf1587a5d6a}")
@Guid("beee064e1d4d5a1a8781acf1587a5d6a")
@WinRTInterface("beee064e1d4d5a1a8781acf1587a5d6a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollControllerPanRequestedEventArgs.ByReference::class)
public interface IScrollControllerPanRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerPoint(): PointerPoint?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollControllerPanRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIScrollControllerPanRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScrollControllerPanRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollControllerPanRequestedEventArgs {
    public val __1879270964_Ptr: Pointer?

    public val _1879270964_VtblPtr: Pointer?
      get() = __1879270964_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerPoint(): PointerPoint? {
      val fnPtr = _1879270964_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerPoint>()
      val hr = fn.invokeHR(arrayOf(__1879270964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerPoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1879270964_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1879270964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1879270964_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1879270964_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollControllerPanRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1879270964_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollControllerPanRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("beee064e1d4d5a1a8781acf1587a5d6a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollControllerPanRequestedEventArgs(ptr: Pointer?): WithDefault =
        IScrollControllerPanRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollControllerPanRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIScrollControllerPanRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScrollControllerPanRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1879270964_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollControllerPanRequestedEventArgs):
        Array<IScrollControllerPanRequestedEventArgs?> = (elements as
        Array<IScrollControllerPanRequestedEventArgs?>).castToImpl<IScrollControllerPanRequestedEventArgs,IScrollControllerPanRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollControllerPanRequestedEventArgs?> =
        arrayOfNulls<IScrollControllerPanRequestedEventArgs_Impl>(size) as
        Array<IScrollControllerPanRequestedEventArgs?>
  }
}
