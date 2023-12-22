package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IToggleButtonOverrides.ABI::class)
@Signature("{d20e4c28-f18b-491a-9a45-f1a04a9369a4}")
@Guid("d20e4c28f18b491a9a45f1a04a9369a4")
@WinRTInterface("d20e4c28f18b491a9a45f1a04a9369a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleButtonOverrides.ByReference::class)
public interface IToggleButtonOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnToggle(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleButtonOverrides> {
    public override fun getValue() = ABI.makeIToggleButtonOverrides(pointer.getPointer(0))

    public fun setValue(value: IToggleButtonOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleButtonOverrides {
    public val __2122543163_Ptr: Pointer?

    public val _2122543163_VtblPtr: Pointer?
      get() = __2122543163_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnToggle(): Unit {
      val fnPtr = _2122543163_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2122543163_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToggleButtonOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2122543163_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleButtonOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d20e4c28f18b491a9a45f1a04a9369a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleButtonOverrides(ptr: Pointer?): WithDefault =
        IToggleButtonOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleButtonOverrides {
      val address = segment.toRawLongValue()
      return makeIToggleButtonOverrides(Pointer(address))
    }

    public override fun toNative(obj: IToggleButtonOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2122543163_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleButtonOverrides): Array<IToggleButtonOverrides?> =
        (elements as
        Array<IToggleButtonOverrides?>).castToImpl<IToggleButtonOverrides,IToggleButtonOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleButtonOverrides?> =
        arrayOfNulls<IToggleButtonOverrides_Impl>(size) as Array<IToggleButtonOverrides?>
  }
}
