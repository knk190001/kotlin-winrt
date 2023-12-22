package Windows.Phone.UI.Input

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

@ABIMarker(IBackPressedEventArgs.ABI::class)
@Signature("{f6f555ff-64ec-42a2-b93b-2fbc0c36a121}")
@Guid("f6f555ff64ec42a2b93b2fbc0c36a121")
@WinRTInterface("f6f555ff64ec42a2b93b2fbc0c36a121")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackPressedEventArgs.ByReference::class)
public interface IBackPressedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackPressedEventArgs> {
    public override fun getValue() = ABI.makeIBackPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBackPressedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackPressedEventArgs {
    public val __453700342_Ptr: Pointer?

    public val _453700342_VtblPtr: Pointer?
      get() = __453700342_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _453700342_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__453700342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _453700342_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__453700342_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackPressedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __453700342_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackPressedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6f555ff64ec42a2b93b2fbc0c36a121")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackPressedEventArgs(ptr: Pointer?): WithDefault =
        IBackPressedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackPressedEventArgs {
      val address = segment.toRawLongValue()
      return makeIBackPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBackPressedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__453700342_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackPressedEventArgs): Array<IBackPressedEventArgs?> =
        (elements as
        Array<IBackPressedEventArgs?>).castToImpl<IBackPressedEventArgs,IBackPressedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackPressedEventArgs?> =
        arrayOfNulls<IBackPressedEventArgs_Impl>(size) as Array<IBackPressedEventArgs?>
  }
}
