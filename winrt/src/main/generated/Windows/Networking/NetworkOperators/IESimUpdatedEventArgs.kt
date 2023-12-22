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

@ABIMarker(IESimUpdatedEventArgs.ABI::class)
@Signature("{4c125cec-508d-4b88-83cb-68bef8168d12}")
@Guid("4c125cec508d4b8883cb68bef8168d12")
@WinRTInterface("4c125cec508d4b8883cb68bef8168d12")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESimUpdatedEventArgs.ByReference::class)
public interface IESimUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ESim(): ESim?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IESimUpdatedEventArgs> {
    public override fun getValue() = ABI.makeIESimUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IESimUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESimUpdatedEventArgs {
    public val __556713447_Ptr: Pointer?

    public val _556713447_VtblPtr: Pointer?
      get() = __556713447_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ESim(): ESim? {
      val fnPtr = _556713447_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ESim>()
      val hr = fn.invokeHR(arrayOf(__556713447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ESim>(result.getValue())
      return resultValue
    }
  }

  public class IESimUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __556713447_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESimUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c125cec508d4b8883cb68bef8168d12")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESimUpdatedEventArgs(ptr: Pointer?): WithDefault =
        IESimUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESimUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIESimUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IESimUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__556713447_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESimUpdatedEventArgs): Array<IESimUpdatedEventArgs?> =
        (elements as
        Array<IESimUpdatedEventArgs?>).castToImpl<IESimUpdatedEventArgs,IESimUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESimUpdatedEventArgs?> =
        arrayOfNulls<IESimUpdatedEventArgs_Impl>(size) as Array<IESimUpdatedEventArgs?>
  }
}
