package Windows.Devices.Input

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPenUndockedEventArgs.ABI::class)
@Signature("{ccd09150-261b-59e6-a5d4-c1964cd03feb}")
@Guid("ccd09150261b59e6a5d4c1964cd03feb")
@WinRTInterface("ccd09150261b59e6a5d4c1964cd03feb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenUndockedEventArgs.ByReference::class)
public interface IPenUndockedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPenUndockedEventArgs> {
    public override fun getValue() = ABI.makeIPenUndockedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPenUndockedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenUndockedEventArgs {
    public val __1348625550_Ptr: Pointer?

    public val _1348625550_VtblPtr: Pointer?
      get() = __1348625550_Ptr?.getPointer(0)
  }

  public class IPenUndockedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1348625550_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenUndockedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ccd09150261b59e6a5d4c1964cd03feb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenUndockedEventArgs(ptr: Pointer?): WithDefault =
        IPenUndockedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenUndockedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPenUndockedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPenUndockedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1348625550_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenUndockedEventArgs): Array<IPenUndockedEventArgs?> =
        (elements as
        Array<IPenUndockedEventArgs?>).castToImpl<IPenUndockedEventArgs,IPenUndockedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenUndockedEventArgs?> =
        arrayOfNulls<IPenUndockedEventArgs_Impl>(size) as Array<IPenUndockedEventArgs?>
  }
}
