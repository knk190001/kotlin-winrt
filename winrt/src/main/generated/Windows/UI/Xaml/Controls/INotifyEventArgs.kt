package Windows.UI.Xaml.Controls

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INotifyEventArgs.ABI::class)
@Signature("{af0e05f7-c4b7-44c5-b09d-5cb7052b3a97}")
@Guid("af0e05f7c4b744c5b09d5cb7052b3a97")
@WinRTInterface("af0e05f7c4b744c5b09d5cb7052b3a97")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotifyEventArgs.ByReference::class)
public interface INotifyEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotifyEventArgs> {
    public override fun getValue() = ABI.makeINotifyEventArgs(pointer.getPointer(0))

    public fun setValue(value: INotifyEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotifyEventArgs {
    public val __1002508878_Ptr: Pointer?

    public val _1002508878_VtblPtr: Pointer?
      get() = __1002508878_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): String? {
      val fnPtr = _1002508878_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1002508878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class INotifyEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1002508878_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotifyEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af0e05f7c4b744c5b09d5cb7052b3a97")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotifyEventArgs(ptr: Pointer?): WithDefault = INotifyEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotifyEventArgs {
      val address = segment.toRawLongValue()
      return makeINotifyEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INotifyEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1002508878_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotifyEventArgs): Array<INotifyEventArgs?> = (elements as
        Array<INotifyEventArgs?>).castToImpl<INotifyEventArgs,INotifyEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotifyEventArgs?> =
        arrayOfNulls<INotifyEventArgs_Impl>(size) as Array<INotifyEventArgs?>
  }
}
