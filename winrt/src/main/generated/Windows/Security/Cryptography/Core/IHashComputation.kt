package Windows.Security.Cryptography.Core

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IHashComputation.ABI::class)
@Signature("{5904d1b6-ad31-4603-a3a4-b1bda98e2562}")
@Guid("5904d1b6ad314603a3a4b1bda98e2562")
@WinRTInterface("5904d1b6ad314603a3a4b1bda98e2562")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHashComputation.ByReference::class)
public interface IHashComputation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Append(`data`: IBuffer?): Unit

  @InterfaceMethod(1)
  public fun GetValueAndReset(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHashComputation> {
    public override fun getValue() = ABI.makeIHashComputation(pointer.getPointer(0))

    public fun setValue(value: IHashComputation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHashComputation {
    public val __149737714_Ptr: Pointer?

    public val _149737714_VtblPtr: Pointer?
      get() = __149737714_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Append(`data`: IBuffer?): Unit {
      val fnPtr = _149737714_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__149737714_Ptr, marshalToNative(data),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetValueAndReset(): IBuffer? {
      val fnPtr = _149737714_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__149737714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IHashComputation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __149737714_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHashComputation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5904d1b6ad314603a3a4b1bda98e2562")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHashComputation(ptr: Pointer?): WithDefault = IHashComputation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHashComputation {
      val address = segment.toRawLongValue()
      return makeIHashComputation(Pointer(address))
    }

    public override fun toNative(obj: IHashComputation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__149737714_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHashComputation): Array<IHashComputation?> = (elements as
        Array<IHashComputation?>).castToImpl<IHashComputation,IHashComputation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHashComputation?> =
        arrayOfNulls<IHashComputation_Impl>(size) as Array<IHashComputation?>
  }
}
