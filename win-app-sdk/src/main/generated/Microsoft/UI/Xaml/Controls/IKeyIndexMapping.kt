package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IKeyIndexMapping.ABI::class)
@Signature("{b1f3bba0-108e-560d-9681-26391b4bc30d}")
@Guid("b1f3bba0108e560d968126391b4bc30d")
@WinRTInterface("b1f3bba0108e560d968126391b4bc30d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyIndexMapping.ByReference::class)
public interface IKeyIndexMapping : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun KeyFromIndex(index: Int): String?

  @InterfaceMethod(1)
  public fun IndexFromKey(key: String?): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyIndexMapping> {
    public override fun getValue() = ABI.makeIKeyIndexMapping(pointer.getPointer(0))

    public fun setValue(value: IKeyIndexMapping_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyIndexMapping {
    public val __2119876340_Ptr: Pointer?

    public val _2119876340_VtblPtr: Pointer?
      get() = __2119876340_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun KeyFromIndex(index: Int): String? {
      val fnPtr = _2119876340_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2119876340_Ptr, index, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IndexFromKey(key: String?): Int {
      val fnPtr = _2119876340_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2119876340_Ptr, marshalToNative(key), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IKeyIndexMapping_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2119876340_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyIndexMapping, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1f3bba0108e560d968126391b4bc30d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyIndexMapping(ptr: Pointer?): WithDefault = IKeyIndexMapping_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyIndexMapping {
      val address = segment.toRawLongValue()
      return makeIKeyIndexMapping(Pointer(address))
    }

    public override fun toNative(obj: IKeyIndexMapping): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2119876340_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyIndexMapping): Array<IKeyIndexMapping?> = (elements as
        Array<IKeyIndexMapping?>).castToImpl<IKeyIndexMapping,IKeyIndexMapping_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyIndexMapping?> =
        arrayOfNulls<IKeyIndexMapping_Impl>(size) as Array<IKeyIndexMapping?>
  }
}
