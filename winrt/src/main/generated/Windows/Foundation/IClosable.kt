package Windows.Foundation

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

@ABIMarker(IClosable.ABI::class)
@Signature("{30d5a829-7fa4-4026-83bb-d75bae4ea99e}")
@Guid("30d5a8297fa4402683bbd75bae4ea99e")
@WinRTInterface("30d5a8297fa4402683bbd75bae4ea99e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClosable.ByReference::class)
public interface IClosable : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Close(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IClosable> {
    public override fun getValue() = ABI.makeIClosable(pointer.getPointer(0))

    public fun setValue(value: IClosable_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClosable {
    public val __1260617006_Ptr: Pointer?

    public val _1260617006_VtblPtr: Pointer?
      get() = __1260617006_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Close(): Unit {
      val fnPtr = _1260617006_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1260617006_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IClosable_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1260617006_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClosable, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30d5a8297fa4402683bbd75bae4ea99e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClosable(ptr: Pointer?): WithDefault = IClosable_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClosable {
      val address = segment.toRawLongValue()
      return makeIClosable(Pointer(address))
    }

    public override fun toNative(obj: IClosable): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1260617006_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClosable): Array<IClosable?> = (elements as
        Array<IClosable?>).castToImpl<IClosable,IClosable_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClosable?> = arrayOfNulls<IClosable_Impl>(size)
        as Array<IClosable?>
  }
}
