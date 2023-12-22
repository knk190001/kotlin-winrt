package Windows.Media.Control

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

@ABIMarker(ISessionsChangedEventArgs.ABI::class)
@Signature("{bbf0cd32-42c4-5a58-b317-f34bbfbd26e0}")
@Guid("bbf0cd3242c45a58b317f34bbfbd26e0")
@WinRTInterface("bbf0cd3242c45a58b317f34bbfbd26e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISessionsChangedEventArgs.ByReference::class)
public interface ISessionsChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISessionsChangedEventArgs> {
    public override fun getValue() = ABI.makeISessionsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISessionsChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISessionsChangedEventArgs {
    public val __1909157215_Ptr: Pointer?

    public val _1909157215_VtblPtr: Pointer?
      get() = __1909157215_Ptr?.getPointer(0)
  }

  public class ISessionsChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1909157215_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISessionsChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbf0cd3242c45a58b317f34bbfbd26e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISessionsChangedEventArgs(ptr: Pointer?): WithDefault =
        ISessionsChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISessionsChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISessionsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISessionsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1909157215_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISessionsChangedEventArgs):
        Array<ISessionsChangedEventArgs?> = (elements as
        Array<ISessionsChangedEventArgs?>).castToImpl<ISessionsChangedEventArgs,ISessionsChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISessionsChangedEventArgs?> =
        arrayOfNulls<ISessionsChangedEventArgs_Impl>(size) as Array<ISessionsChangedEventArgs?>
  }
}
