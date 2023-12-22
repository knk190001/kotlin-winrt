package Windows.Media.Devices

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFlashControl2.ABI::class)
@Signature("{7d29cc9e-75e1-4af7-bd7d-4e38e1c06cd6}")
@Guid("7d29cc9e75e14af7bd7d4e38e1c06cd6")
@WinRTInterface("7d29cc9e75e14af7bd7d4e38e1c06cd6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlashControl2.ByReference::class)
public interface IFlashControl2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AssistantLightSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_AssistantLightEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_AssistantLightEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlashControl2>
      {
    public override fun getValue() = ABI.makeIFlashControl2(pointer.getPointer(0))

    public fun setValue(value: IFlashControl2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlashControl2 {
    public val __1685842172_Ptr: Pointer?

    public val _1685842172_VtblPtr: Pointer?
      get() = __1685842172_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AssistantLightSupported(): Boolean {
      val fnPtr = _1685842172_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1685842172_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AssistantLightEnabled(): Boolean {
      val fnPtr = _1685842172_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1685842172_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_AssistantLightEnabled(value: Boolean): Unit {
      val fnPtr = _1685842172_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1685842172_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlashControl2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1685842172_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlashControl2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d29cc9e75e14af7bd7d4e38e1c06cd6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlashControl2(ptr: Pointer?): WithDefault = IFlashControl2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlashControl2 {
      val address = segment.toRawLongValue()
      return makeIFlashControl2(Pointer(address))
    }

    public override fun toNative(obj: IFlashControl2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1685842172_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlashControl2): Array<IFlashControl2?> = (elements as
        Array<IFlashControl2?>).castToImpl<IFlashControl2,IFlashControl2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlashControl2?> =
        arrayOfNulls<IFlashControl2_Impl>(size) as Array<IFlashControl2?>
  }
}
