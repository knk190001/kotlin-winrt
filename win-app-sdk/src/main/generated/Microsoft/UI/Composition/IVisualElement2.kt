package Microsoft.UI.Composition

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

@ABIMarker(IVisualElement2.ABI::class)
@Signature("{bc950c8d-1db0-53aa-9dee-34271cd18ce6}")
@Guid("bc950c8d1db053aa9dee34271cd18ce6")
@WinRTInterface("bc950c8d1db053aa9dee34271cd18ce6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualElement2.ByReference::class)
public interface IVisualElement2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetVisualInternal(): Visual?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualElement2> {
    public override fun getValue() = ABI.makeIVisualElement2(pointer.getPointer(0))

    public fun setValue(value: IVisualElement2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualElement2 {
    public val __558208111_Ptr: Pointer?

    public val _558208111_VtblPtr: Pointer?
      get() = __558208111_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetVisualInternal(): Visual? {
      val fnPtr = _558208111_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visual>()
      val hr = fn.invokeHR(arrayOf(__558208111_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visual>(result.getValue())
      return resultValue
    }
  }

  public class IVisualElement2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __558208111_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualElement2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc950c8d1db053aa9dee34271cd18ce6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualElement2(ptr: Pointer?): WithDefault = IVisualElement2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualElement2 {
      val address = segment.toRawLongValue()
      return makeIVisualElement2(Pointer(address))
    }

    public override fun toNative(obj: IVisualElement2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__558208111_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualElement2): Array<IVisualElement2?> = (elements as
        Array<IVisualElement2?>).castToImpl<IVisualElement2,IVisualElement2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualElement2?> =
        arrayOfNulls<IVisualElement2_Impl>(size) as Array<IVisualElement2?>
  }
}
