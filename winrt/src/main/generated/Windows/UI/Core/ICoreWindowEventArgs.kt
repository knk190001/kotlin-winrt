package Windows.UI.Core

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

@ABIMarker(ICoreWindowEventArgs.ABI::class)
@Signature("{272b1ef3-c633-4da5-a26c-c6d0f56b29da}")
@Guid("272b1ef3c6334da5a26cc6d0f56b29da")
@WinRTInterface("272b1ef3c6334da5a26cc6d0f56b29da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindowEventArgs.ByReference::class)
public interface ICoreWindowEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWindowEventArgs> {
    public override fun getValue() = ABI.makeICoreWindowEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWindowEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindowEventArgs {
    public val __407060269_Ptr: Pointer?

    public val _407060269_VtblPtr: Pointer?
      get() = __407060269_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _407060269_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__407060269_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _407060269_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407060269_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWindowEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __407060269_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindowEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("272b1ef3c6334da5a26cc6d0f56b29da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindowEventArgs(ptr: Pointer?): WithDefault = ICoreWindowEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindowEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWindowEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindowEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__407060269_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindowEventArgs): Array<ICoreWindowEventArgs?> =
        (elements as
        Array<ICoreWindowEventArgs?>).castToImpl<ICoreWindowEventArgs,ICoreWindowEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindowEventArgs?> =
        arrayOfNulls<ICoreWindowEventArgs_Impl>(size) as Array<ICoreWindowEventArgs?>
  }
}
