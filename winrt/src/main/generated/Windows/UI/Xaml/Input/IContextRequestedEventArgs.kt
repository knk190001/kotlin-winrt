package Windows.UI.Xaml.Input

import Windows.UI.Xaml.UIElement
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

@ABIMarker(IContextRequestedEventArgs.ABI::class)
@Signature("{42618e0a-1cb6-46fb-8374-0aec68aa5e51}")
@Guid("42618e0a1cb646fb83740aec68aa5e51")
@WinRTInterface("42618e0a1cb646fb83740aec68aa5e51")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContextRequestedEventArgs.ByReference::class)
public interface IContextRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun TryGetPosition(relativeTo: UIElement?, point: Windows.Foundation.Point.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContextRequestedEventArgs> {
    public override fun getValue() = ABI.makeIContextRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContextRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContextRequestedEventArgs {
    public val __357467966_Ptr: Pointer?

    public val _357467966_VtblPtr: Pointer?
      get() = __357467966_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _357467966_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__357467966_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _357467966_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__357467966_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun TryGetPosition(relativeTo: UIElement?,
        point: Windows.Foundation.Point.ByReference?): Boolean {
      val fnPtr = _357467966_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__357467966_Ptr, marshalToNative(relativeTo),
          marshalToNative(point), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IContextRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __357467966_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContextRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42618e0a1cb646fb83740aec68aa5e51")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContextRequestedEventArgs(ptr: Pointer?): WithDefault =
        IContextRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContextRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContextRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContextRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__357467966_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContextRequestedEventArgs):
        Array<IContextRequestedEventArgs?> = (elements as
        Array<IContextRequestedEventArgs?>).castToImpl<IContextRequestedEventArgs,IContextRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContextRequestedEventArgs?> =
        arrayOfNulls<IContextRequestedEventArgs_Impl>(size) as Array<IContextRequestedEventArgs?>
  }
}
