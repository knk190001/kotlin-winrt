package Windows.Media.Casting

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

@ABIMarker(ICastingDeviceSelectedEventArgs.ABI::class)
@Signature("{dc439e86-dd57-4d0d-9400-af45e4fb3663}")
@Guid("dc439e86dd574d0d9400af45e4fb3663")
@WinRTInterface("dc439e86dd574d0d9400af45e4fb3663")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICastingDeviceSelectedEventArgs.ByReference::class)
public interface ICastingDeviceSelectedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedCastingDevice(): CastingDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICastingDeviceSelectedEventArgs> {
    public override fun getValue() = ABI.makeICastingDeviceSelectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICastingDeviceSelectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICastingDeviceSelectedEventArgs {
    public val __1149246462_Ptr: Pointer?

    public val _1149246462_VtblPtr: Pointer?
      get() = __1149246462_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedCastingDevice(): CastingDevice? {
      val fnPtr = _1149246462_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CastingDevice>()
      val hr = fn.invokeHR(arrayOf(__1149246462_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CastingDevice>(result.getValue())
      return resultValue
    }
  }

  public class ICastingDeviceSelectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1149246462_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICastingDeviceSelectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc439e86dd574d0d9400af45e4fb3663")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICastingDeviceSelectedEventArgs(ptr: Pointer?): WithDefault =
        ICastingDeviceSelectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICastingDeviceSelectedEventArgs {
      val address = segment.toRawLongValue()
      return makeICastingDeviceSelectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICastingDeviceSelectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1149246462_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICastingDeviceSelectedEventArgs):
        Array<ICastingDeviceSelectedEventArgs?> = (elements as
        Array<ICastingDeviceSelectedEventArgs?>).castToImpl<ICastingDeviceSelectedEventArgs,ICastingDeviceSelectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICastingDeviceSelectedEventArgs?> =
        arrayOfNulls<ICastingDeviceSelectedEventArgs_Impl>(size) as
        Array<ICastingDeviceSelectedEventArgs?>
  }
}
