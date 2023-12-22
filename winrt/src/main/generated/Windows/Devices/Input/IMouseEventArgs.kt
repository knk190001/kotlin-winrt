package Windows.Devices.Input

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

@ABIMarker(IMouseEventArgs.ABI::class)
@Signature("{f625aa5d-2354-4cc7-9230-96941c969fde}")
@Guid("f625aa5d23544cc7923096941c969fde")
@WinRTInterface("f625aa5d23544cc7923096941c969fde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMouseEventArgs.ByReference::class)
public interface IMouseEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MouseDelta(): MouseDelta?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMouseEventArgs> {
    public override fun getValue() = ABI.makeIMouseEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMouseEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMouseEventArgs {
    public val __1757668205_Ptr: Pointer?

    public val _1757668205_VtblPtr: Pointer?
      get() = __1757668205_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MouseDelta(): MouseDelta? {
      val fnPtr = _1757668205_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MouseDelta>()
      val hr = fn.invokeHR(arrayOf(__1757668205_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MouseDelta>(result.getValue())
      return resultValue
    }
  }

  public class IMouseEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1757668205_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMouseEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f625aa5d23544cc7923096941c969fde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMouseEventArgs(ptr: Pointer?): WithDefault = IMouseEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMouseEventArgs {
      val address = segment.toRawLongValue()
      return makeIMouseEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMouseEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1757668205_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMouseEventArgs): Array<IMouseEventArgs?> = (elements as
        Array<IMouseEventArgs?>).castToImpl<IMouseEventArgs,IMouseEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMouseEventArgs?> =
        arrayOfNulls<IMouseEventArgs_Impl>(size) as Array<IMouseEventArgs?>
  }
}
