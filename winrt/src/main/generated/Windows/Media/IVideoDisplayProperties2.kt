package Windows.Media

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IVideoDisplayProperties2.ABI::class)
@Signature("{b410e1ce-ab52-41ab-a486-cc10fab152f9}")
@Guid("b410e1ceab5241aba486cc10fab152f9")
@WinRTInterface("b410e1ceab5241aba486cc10fab152f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoDisplayProperties2.ByReference::class)
public interface IVideoDisplayProperties2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Genres(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoDisplayProperties2> {
    public override fun getValue() = ABI.makeIVideoDisplayProperties2(pointer.getPointer(0))

    public fun setValue(value: IVideoDisplayProperties2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoDisplayProperties2 {
    public val __561459704_Ptr: Pointer?

    public val _561459704_VtblPtr: Pointer?
      get() = __561459704_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Genres(): IVector<String?>? {
      val fnPtr = _561459704_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__561459704_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IVideoDisplayProperties2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __561459704_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoDisplayProperties2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b410e1ceab5241aba486cc10fab152f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoDisplayProperties2(ptr: Pointer?): WithDefault =
        IVideoDisplayProperties2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoDisplayProperties2 {
      val address = segment.toRawLongValue()
      return makeIVideoDisplayProperties2(Pointer(address))
    }

    public override fun toNative(obj: IVideoDisplayProperties2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__561459704_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoDisplayProperties2):
        Array<IVideoDisplayProperties2?> = (elements as
        Array<IVideoDisplayProperties2?>).castToImpl<IVideoDisplayProperties2,IVideoDisplayProperties2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoDisplayProperties2?> =
        arrayOfNulls<IVideoDisplayProperties2_Impl>(size) as Array<IVideoDisplayProperties2?>
  }
}
