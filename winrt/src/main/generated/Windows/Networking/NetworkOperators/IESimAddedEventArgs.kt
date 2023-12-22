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

@ABIMarker(IESimAddedEventArgs.ABI::class)
@Signature("{38bd0a58-4d5a-4d08-8da7-e73eff369ddd}")
@Guid("38bd0a584d5a4d088da7e73eff369ddd")
@WinRTInterface("38bd0a584d5a4d088da7e73eff369ddd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESimAddedEventArgs.ByReference::class)
public interface IESimAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ESim(): ESim?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IESimAddedEventArgs> {
    public override fun getValue() = ABI.makeIESimAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IESimAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESimAddedEventArgs {
    public val __1922644482_Ptr: Pointer?

    public val _1922644482_VtblPtr: Pointer?
      get() = __1922644482_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ESim(): ESim? {
      val fnPtr = _1922644482_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESim>()
      val hr = fn.invokeHR(arrayOf(__1922644482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESim>(result.getValue())
      return resultValue
    }
  }

  public class IESimAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1922644482_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESimAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38bd0a584d5a4d088da7e73eff369ddd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESimAddedEventArgs(ptr: Pointer?): WithDefault = IESimAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESimAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeIESimAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IESimAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1922644482_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESimAddedEventArgs): Array<IESimAddedEventArgs?> =
        (elements as
        Array<IESimAddedEventArgs?>).castToImpl<IESimAddedEventArgs,IESimAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESimAddedEventArgs?> =
        arrayOfNulls<IESimAddedEventArgs_Impl>(size) as Array<IESimAddedEventArgs?>
  }
}
