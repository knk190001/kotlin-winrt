package Windows.System

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMemoryManagerStatics4.ABI::class)
@Signature("{c5a94828-e84e-4886-8a0d-44b3190e3b72}")
@Guid("c5a94828e84e48868a0d44b3190e3b72")
@WinRTInterface("c5a94828e84e48868a0d44b3190e3b72")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMemoryManagerStatics4.ByReference::class)
public interface IMemoryManagerStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExpectedAppMemoryUsageLimit(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMemoryManagerStatics4> {
    public override fun getValue() = ABI.makeIMemoryManagerStatics4(pointer.getPointer(0))

    public fun setValue(value: IMemoryManagerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMemoryManagerStatics4 {
    public val __144428172_Ptr: Pointer?

    public val _144428172_VtblPtr: Pointer?
      get() = __144428172_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExpectedAppMemoryUsageLimit(): WinDef.ULONG {
      val fnPtr = _144428172_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__144428172_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IMemoryManagerStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __144428172_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMemoryManagerStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5a94828e84e48868a0d44b3190e3b72")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMemoryManagerStatics4(ptr: Pointer?): WithDefault =
        IMemoryManagerStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMemoryManagerStatics4 {
      val address = segment.toRawLongValue()
      return makeIMemoryManagerStatics4(Pointer(address))
    }

    public override fun toNative(obj: IMemoryManagerStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__144428172_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMemoryManagerStatics4): Array<IMemoryManagerStatics4?> =
        (elements as
        Array<IMemoryManagerStatics4?>).castToImpl<IMemoryManagerStatics4,IMemoryManagerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMemoryManagerStatics4?> =
        arrayOfNulls<IMemoryManagerStatics4_Impl>(size) as Array<IMemoryManagerStatics4?>
  }
}
