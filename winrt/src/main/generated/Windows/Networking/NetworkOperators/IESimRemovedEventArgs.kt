package Windows.Networking.NetworkOperators

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

@ABIMarker(IESimRemovedEventArgs.ABI::class)
@Signature("{dec5277b-2fd9-4ed9-8376-d9b5e41278a3}")
@Guid("dec5277b2fd94ed98376d9b5e41278a3")
@WinRTInterface("dec5277b2fd94ed98376d9b5e41278a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESimRemovedEventArgs.ByReference::class)
public interface IESimRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ESim(): ESim?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IESimRemovedEventArgs> {
    public override fun getValue() = ABI.makeIESimRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IESimRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESimRemovedEventArgs {
    public val __1419421726_Ptr: Pointer?

    public val _1419421726_VtblPtr: Pointer?
      get() = __1419421726_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ESim(): ESim? {
      val fnPtr = _1419421726_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESim>()
      val hr = fn.invokeHR(arrayOf(__1419421726_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESim>(result.getValue())
      return resultValue
    }
  }

  public class IESimRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1419421726_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESimRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dec5277b2fd94ed98376d9b5e41278a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESimRemovedEventArgs(ptr: Pointer?): WithDefault =
        IESimRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESimRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIESimRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IESimRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1419421726_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESimRemovedEventArgs): Array<IESimRemovedEventArgs?> =
        (elements as
        Array<IESimRemovedEventArgs?>).castToImpl<IESimRemovedEventArgs,IESimRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESimRemovedEventArgs?> =
        arrayOfNulls<IESimRemovedEventArgs_Impl>(size) as Array<IESimRemovedEventArgs?>
  }
}
