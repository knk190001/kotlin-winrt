package Windows.Media.DialProtocol

import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IDialDevice2.ABI::class)
@Signature("{bab7f3d5-5bfb-4eba-8b32-b57c5c5ee5c9}")
@Guid("bab7f3d55bfb4eba8b32b57c5c5ee5c9")
@WinRTInterface("bab7f3d55bfb4eba8b32b57c5c5ee5c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialDevice2.ByReference::class)
public interface IDialDevice2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FriendlyName(): String?

  @InterfaceMethod(1)
  public fun get_Thumbnail(): IRandomAccessStreamReference?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDialDevice2> {
    public override fun getValue() = ABI.makeIDialDevice2(pointer.getPointer(0))

    public fun setValue(value: IDialDevice2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialDevice2 {
    public val __243265248_Ptr: Pointer?

    public val _243265248_VtblPtr: Pointer?
      get() = __243265248_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FriendlyName(): String? {
      val fnPtr = _243265248_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__243265248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Thumbnail(): IRandomAccessStreamReference? {
      val fnPtr = _243265248_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__243265248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }
  }

  public class IDialDevice2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __243265248_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialDevice2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bab7f3d55bfb4eba8b32b57c5c5ee5c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialDevice2(ptr: Pointer?): WithDefault = IDialDevice2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialDevice2 {
      val address = segment.toRawLongValue()
      return makeIDialDevice2(Pointer(address))
    }

    public override fun toNative(obj: IDialDevice2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__243265248_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialDevice2): Array<IDialDevice2?> = (elements as
        Array<IDialDevice2?>).castToImpl<IDialDevice2,IDialDevice2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialDevice2?> =
        arrayOfNulls<IDialDevice2_Impl>(size) as Array<IDialDevice2?>
  }
}
