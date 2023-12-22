package Windows.UI.Xaml

import Windows.UI.Composition.Compositor
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

@ABIMarker(IWindow3.ABI::class)
@Signature("{b70bdc9d-1c35-462a-9b97-808d5af9f28e}")
@Guid("b70bdc9d1c35462a9b97808d5af9f28e")
@WinRTInterface("b70bdc9d1c35462a9b97808d5af9f28e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindow3.ByReference::class)
public interface IWindow3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Compositor(): Compositor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWindow3> {
    public override fun getValue() = ABI.makeIWindow3(pointer.getPointer(0))

    public fun setValue(value: IWindow3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindow3 {
    public val __1506182223_Ptr: Pointer?

    public val _1506182223_VtblPtr: Pointer?
      get() = __1506182223_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Compositor(): Compositor? {
      val fnPtr = _1506182223_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Compositor>()
      val hr = fn.invokeHR(arrayOf(__1506182223_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Compositor>(result.getValue())
      return resultValue
    }
  }

  public class IWindow3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1506182223_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindow3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b70bdc9d1c35462a9b97808d5af9f28e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindow3(ptr: Pointer?): WithDefault = IWindow3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindow3 {
      val address = segment.toRawLongValue()
      return makeIWindow3(Pointer(address))
    }

    public override fun toNative(obj: IWindow3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1506182223_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindow3): Array<IWindow3?> = (elements as
        Array<IWindow3?>).castToImpl<IWindow3,IWindow3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindow3?> = arrayOfNulls<IWindow3_Impl>(size) as
        Array<IWindow3?>
  }
}
