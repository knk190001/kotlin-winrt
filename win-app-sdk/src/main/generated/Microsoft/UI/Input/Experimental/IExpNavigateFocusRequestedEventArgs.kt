package Microsoft.UI.Input.Experimental

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

@ABIMarker(IExpNavigateFocusRequestedEventArgs.ABI::class)
@Signature("{563b3f71-eca0-5652-b748-13c6d6794cee}")
@Guid("563b3f71eca05652b74813c6d6794cee")
@WinRTInterface("563b3f71eca05652b74813c6d6794cee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpNavigateFocusRequestedEventArgs.ByReference::class)
public interface IExpNavigateFocusRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): ExpFocusNavigationRequest?

  @InterfaceMethod(1)
  public fun get_WasMoved(): Boolean

  @InterfaceMethod(2)
  public fun put_WasMoved(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpNavigateFocusRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIExpNavigateFocusRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IExpNavigateFocusRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpNavigateFocusRequestedEventArgs {
    public val __105050710_Ptr: Pointer?

    public val _105050710_VtblPtr: Pointer?
      get() = __105050710_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): ExpFocusNavigationRequest? {
      val fnPtr = _105050710_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpFocusNavigationRequest>()
      val hr = fn.invokeHR(arrayOf(__105050710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpFocusNavigationRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_WasMoved(): Boolean {
      val fnPtr = _105050710_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__105050710_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_WasMoved(value: Boolean): Unit {
      val fnPtr = _105050710_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__105050710_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IExpNavigateFocusRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __105050710_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpNavigateFocusRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("563b3f71eca05652b74813c6d6794cee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpNavigateFocusRequestedEventArgs(ptr: Pointer?): WithDefault =
        IExpNavigateFocusRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpNavigateFocusRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIExpNavigateFocusRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IExpNavigateFocusRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__105050710_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpNavigateFocusRequestedEventArgs):
        Array<IExpNavigateFocusRequestedEventArgs?> = (elements as
        Array<IExpNavigateFocusRequestedEventArgs?>).castToImpl<IExpNavigateFocusRequestedEventArgs,IExpNavigateFocusRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpNavigateFocusRequestedEventArgs?> =
        arrayOfNulls<IExpNavigateFocusRequestedEventArgs_Impl>(size) as
        Array<IExpNavigateFocusRequestedEventArgs?>
  }
}
