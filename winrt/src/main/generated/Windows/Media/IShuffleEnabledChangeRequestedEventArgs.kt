package Windows.Media

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

@ABIMarker(IShuffleEnabledChangeRequestedEventArgs.ABI::class)
@Signature("{49b593fe-4fd0-4666-a314-c0e01940d302}")
@Guid("49b593fe4fd04666a314c0e01940d302")
@WinRTInterface("49b593fe4fd04666a314c0e01940d302")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShuffleEnabledChangeRequestedEventArgs.ByReference::class)
public interface IShuffleEnabledChangeRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestedShuffleEnabled(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShuffleEnabledChangeRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIShuffleEnabledChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IShuffleEnabledChangeRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShuffleEnabledChangeRequestedEventArgs {
    public val __1879713745_Ptr: Pointer?

    public val _1879713745_VtblPtr: Pointer?
      get() = __1879713745_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestedShuffleEnabled(): Boolean {
      val fnPtr = _1879713745_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1879713745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IShuffleEnabledChangeRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1879713745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShuffleEnabledChangeRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49b593fe4fd04666a314c0e01940d302")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShuffleEnabledChangeRequestedEventArgs(ptr: Pointer?): WithDefault =
        IShuffleEnabledChangeRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IShuffleEnabledChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIShuffleEnabledChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IShuffleEnabledChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1879713745_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShuffleEnabledChangeRequestedEventArgs):
        Array<IShuffleEnabledChangeRequestedEventArgs?> = (elements as
        Array<IShuffleEnabledChangeRequestedEventArgs?>).castToImpl<IShuffleEnabledChangeRequestedEventArgs,IShuffleEnabledChangeRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShuffleEnabledChangeRequestedEventArgs?> =
        arrayOfNulls<IShuffleEnabledChangeRequestedEventArgs_Impl>(size) as
        Array<IShuffleEnabledChangeRequestedEventArgs?>
  }
}
