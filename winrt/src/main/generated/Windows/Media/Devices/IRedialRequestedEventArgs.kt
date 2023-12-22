package Windows.Media.Devices

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

@ABIMarker(IRedialRequestedEventArgs.ABI::class)
@Signature("{7eb55209-76ab-4c31-b40e-4b58379d580c}")
@Guid("7eb5520976ab4c31b40e4b58379d580c")
@WinRTInterface("7eb5520976ab4c31b40e4b58379d580c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRedialRequestedEventArgs.ByReference::class)
public interface IRedialRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Handled(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRedialRequestedEventArgs> {
    public override fun getValue() = ABI.makeIRedialRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRedialRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRedialRequestedEventArgs {
    public val __116203923_Ptr: Pointer?

    public val _116203923_VtblPtr: Pointer?
      get() = __116203923_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Handled(): Unit {
      val fnPtr = _116203923_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__116203923_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRedialRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __116203923_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRedialRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7eb5520976ab4c31b40e4b58379d580c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRedialRequestedEventArgs(ptr: Pointer?): WithDefault =
        IRedialRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRedialRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRedialRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRedialRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__116203923_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRedialRequestedEventArgs):
        Array<IRedialRequestedEventArgs?> = (elements as
        Array<IRedialRequestedEventArgs?>).castToImpl<IRedialRequestedEventArgs,IRedialRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRedialRequestedEventArgs?> =
        arrayOfNulls<IRedialRequestedEventArgs_Impl>(size) as Array<IRedialRequestedEventArgs?>
  }
}
