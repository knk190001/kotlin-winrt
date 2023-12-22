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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUriEscapeStatics.ABI::class)
@Signature("{c1d432ba-c824-4452-a7fd-512bc3bbe9a1}")
@Guid("c1d432bac8244452a7fd512bc3bbe9a1")
@WinRTInterface("c1d432bac8244452a7fd512bc3bbe9a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUriEscapeStatics.ByReference::class)
public interface IUriEscapeStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun UnescapeComponent(toUnescape: String?): String?

  @InterfaceMethod(1)
  public fun EscapeComponent(toEscape: String?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUriEscapeStatics> {
    public override fun getValue() = ABI.makeIUriEscapeStatics(pointer.getPointer(0))

    public fun setValue(value: IUriEscapeStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUriEscapeStatics {
    public val __925649635_Ptr: Pointer?

    public val _925649635_VtblPtr: Pointer?
      get() = __925649635_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun UnescapeComponent(toUnescape: String?): String? {
      val fnPtr = _925649635_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__925649635_Ptr, marshalToNative(toUnescape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun EscapeComponent(toEscape: String?): String? {
      val fnPtr = _925649635_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__925649635_Ptr, marshalToNative(toEscape), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IUriEscapeStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __925649635_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUriEscapeStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1d432bac8244452a7fd512bc3bbe9a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUriEscapeStatics(ptr: Pointer?): WithDefault = IUriEscapeStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUriEscapeStatics {
      val address = segment.toRawLongValue()
      return makeIUriEscapeStatics(Pointer(address))
    }

    public override fun toNative(obj: IUriEscapeStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__925649635_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUriEscapeStatics): Array<IUriEscapeStatics?> = (elements
        as Array<IUriEscapeStatics?>).castToImpl<IUriEscapeStatics,IUriEscapeStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUriEscapeStatics?> =
        arrayOfNulls<IUriEscapeStatics_Impl>(size) as Array<IUriEscapeStatics?>
  }
}
