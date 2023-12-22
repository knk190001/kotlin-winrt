package Windows.Media.PlayTo

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

@ABIMarker(IMuteChangeRequestedEventArgs.ABI::class)
@Signature("{e4b4f5f6-af1f-4f1e-b437-7da32400e1d4}")
@Guid("e4b4f5f6af1f4f1eb4377da32400e1d4")
@WinRTInterface("e4b4f5f6af1f4f1eb4377da32400e1d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMuteChangeRequestedEventArgs.ByReference::class)
public interface IMuteChangeRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mute(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMuteChangeRequestedEventArgs> {
    public override fun getValue() = ABI.makeIMuteChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMuteChangeRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMuteChangeRequestedEventArgs {
    public val __157137207_Ptr: Pointer?

    public val _157137207_VtblPtr: Pointer?
      get() = __157137207_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mute(): Boolean {
      val fnPtr = _157137207_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__157137207_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMuteChangeRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __157137207_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMuteChangeRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e4b4f5f6af1f4f1eb4377da32400e1d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMuteChangeRequestedEventArgs(ptr: Pointer?): WithDefault =
        IMuteChangeRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMuteChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMuteChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMuteChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__157137207_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMuteChangeRequestedEventArgs):
        Array<IMuteChangeRequestedEventArgs?> = (elements as
        Array<IMuteChangeRequestedEventArgs?>).castToImpl<IMuteChangeRequestedEventArgs,IMuteChangeRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMuteChangeRequestedEventArgs?> =
        arrayOfNulls<IMuteChangeRequestedEventArgs_Impl>(size) as
        Array<IMuteChangeRequestedEventArgs?>
  }
}
