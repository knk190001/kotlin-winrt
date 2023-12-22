package Windows.ApplicationModel.Calls

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

@ABIMarker(IMuteChangeEventArgs.ABI::class)
@Signature("{8585e159-0c41-432c-814d-c5f1fdf530be}")
@Guid("8585e1590c41432c814dc5f1fdf530be")
@WinRTInterface("8585e1590c41432c814dc5f1fdf530be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMuteChangeEventArgs.ByReference::class)
public interface IMuteChangeEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Muted(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMuteChangeEventArgs> {
    public override fun getValue() = ABI.makeIMuteChangeEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMuteChangeEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMuteChangeEventArgs {
    public val __1684432432_Ptr: Pointer?

    public val _1684432432_VtblPtr: Pointer?
      get() = __1684432432_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Muted(): Boolean {
      val fnPtr = _1684432432_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1684432432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMuteChangeEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1684432432_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMuteChangeEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8585e1590c41432c814dc5f1fdf530be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMuteChangeEventArgs(ptr: Pointer?): WithDefault = IMuteChangeEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMuteChangeEventArgs {
      val address = segment.toRawLongValue()
      return makeIMuteChangeEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMuteChangeEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1684432432_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMuteChangeEventArgs): Array<IMuteChangeEventArgs?> =
        (elements as
        Array<IMuteChangeEventArgs?>).castToImpl<IMuteChangeEventArgs,IMuteChangeEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMuteChangeEventArgs?> =
        arrayOfNulls<IMuteChangeEventArgs_Impl>(size) as Array<IMuteChangeEventArgs?>
  }
}
