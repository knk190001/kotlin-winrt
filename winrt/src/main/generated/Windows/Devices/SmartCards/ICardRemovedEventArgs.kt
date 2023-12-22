package Windows.Devices.SmartCards

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

@ABIMarker(ICardRemovedEventArgs.ABI::class)
@Signature("{15331aaf-22d7-4945-afc9-03b46f42a6cd}")
@Guid("15331aaf22d74945afc903b46f42a6cd")
@WinRTInterface("15331aaf22d74945afc903b46f42a6cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICardRemovedEventArgs.ByReference::class)
public interface ICardRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SmartCard(): SmartCard?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICardRemovedEventArgs> {
    public override fun getValue() = ABI.makeICardRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICardRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICardRemovedEventArgs {
    public val __1990821498_Ptr: Pointer?

    public val _1990821498_VtblPtr: Pointer?
      get() = __1990821498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SmartCard(): SmartCard? {
      val fnPtr = _1990821498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCard>()
      val hr = fn.invokeHR(arrayOf(__1990821498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCard>(result.getValue())
      return resultValue
    }
  }

  public class ICardRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1990821498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICardRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("15331aaf22d74945afc903b46f42a6cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICardRemovedEventArgs(ptr: Pointer?): WithDefault =
        ICardRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICardRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeICardRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICardRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1990821498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICardRemovedEventArgs): Array<ICardRemovedEventArgs?> =
        (elements as
        Array<ICardRemovedEventArgs?>).castToImpl<ICardRemovedEventArgs,ICardRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICardRemovedEventArgs?> =
        arrayOfNulls<ICardRemovedEventArgs_Impl>(size) as Array<ICardRemovedEventArgs?>
  }
}
