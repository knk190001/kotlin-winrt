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

@ABIMarker(IKeypadPressedEventArgs.ABI::class)
@Signature("{d3a43900-b4fa-49cd-9442-89af6568f601}")
@Guid("d3a43900b4fa49cd944289af6568f601")
@WinRTInterface("d3a43900b4fa49cd944289af6568f601")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeypadPressedEventArgs.ByReference::class)
public interface IKeypadPressedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TelephonyKey(): TelephonyKey?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeypadPressedEventArgs> {
    public override fun getValue() = ABI.makeIKeypadPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IKeypadPressedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeypadPressedEventArgs {
    public val __624796906_Ptr: Pointer?

    public val _624796906_VtblPtr: Pointer?
      get() = __624796906_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TelephonyKey(): TelephonyKey? {
      val fnPtr = _624796906_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TelephonyKey>()
      val hr = fn.invokeHR(arrayOf(__624796906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TelephonyKey>(result.getValue())
      return resultValue
    }
  }

  public class IKeypadPressedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __624796906_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeypadPressedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d3a43900b4fa49cd944289af6568f601")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeypadPressedEventArgs(ptr: Pointer?): WithDefault =
        IKeypadPressedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeypadPressedEventArgs {
      val address = segment.toRawLongValue()
      return makeIKeypadPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IKeypadPressedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__624796906_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeypadPressedEventArgs): Array<IKeypadPressedEventArgs?>
        = (elements as
        Array<IKeypadPressedEventArgs?>).castToImpl<IKeypadPressedEventArgs,IKeypadPressedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeypadPressedEventArgs?> =
        arrayOfNulls<IKeypadPressedEventArgs_Impl>(size) as Array<IKeypadPressedEventArgs?>
  }
}
