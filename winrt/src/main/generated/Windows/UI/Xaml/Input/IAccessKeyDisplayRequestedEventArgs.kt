package Windows.UI.Xaml.Input

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAccessKeyDisplayRequestedEventArgs.ABI::class)
@Signature("{0c079e55-13fe-4d03-a61d-e12f06567286}")
@Guid("0c079e5513fe4d03a61de12f06567286")
@WinRTInterface("0c079e5513fe4d03a61de12f06567286")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccessKeyDisplayRequestedEventArgs.ByReference::class)
public interface IAccessKeyDisplayRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PressedKeys(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccessKeyDisplayRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIAccessKeyDisplayRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAccessKeyDisplayRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccessKeyDisplayRequestedEventArgs {
    public val __248880742_Ptr: Pointer?

    public val _248880742_VtblPtr: Pointer?
      get() = __248880742_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PressedKeys(): String? {
      val fnPtr = _248880742_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__248880742_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAccessKeyDisplayRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __248880742_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccessKeyDisplayRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c079e5513fe4d03a61de12f06567286")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccessKeyDisplayRequestedEventArgs(ptr: Pointer?): WithDefault =
        IAccessKeyDisplayRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccessKeyDisplayRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAccessKeyDisplayRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAccessKeyDisplayRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__248880742_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccessKeyDisplayRequestedEventArgs):
        Array<IAccessKeyDisplayRequestedEventArgs?> = (elements as
        Array<IAccessKeyDisplayRequestedEventArgs?>).castToImpl<IAccessKeyDisplayRequestedEventArgs,IAccessKeyDisplayRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccessKeyDisplayRequestedEventArgs?> =
        arrayOfNulls<IAccessKeyDisplayRequestedEventArgs_Impl>(size) as
        Array<IAccessKeyDisplayRequestedEventArgs?>
  }
}
