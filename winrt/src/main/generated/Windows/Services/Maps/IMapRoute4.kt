package Windows.Services.Maps

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

@ABIMarker(IMapRoute4.ABI::class)
@Signature("{366c8ca5-3053-4fa1-80ff-d475f3ed1e6e}")
@Guid("366c8ca530534fa180ffd475f3ed1e6e")
@WinRTInterface("366c8ca530534fa180ffd475f3ed1e6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRoute4.ByReference::class)
public interface IMapRoute4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsScenic(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapRoute4> {
    public override fun getValue() = ABI.makeIMapRoute4(pointer.getPointer(0))

    public fun setValue(value: IMapRoute4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRoute4 {
    public val __1501242342_Ptr: Pointer?

    public val _1501242342_VtblPtr: Pointer?
      get() = __1501242342_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsScenic(): Boolean {
      val fnPtr = _1501242342_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1501242342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMapRoute4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1501242342_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRoute4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("366c8ca530534fa180ffd475f3ed1e6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRoute4(ptr: Pointer?): WithDefault = IMapRoute4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRoute4 {
      val address = segment.toRawLongValue()
      return makeIMapRoute4(Pointer(address))
    }

    public override fun toNative(obj: IMapRoute4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1501242342_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRoute4): Array<IMapRoute4?> = (elements as
        Array<IMapRoute4?>).castToImpl<IMapRoute4,IMapRoute4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRoute4?> = arrayOfNulls<IMapRoute4_Impl>(size)
        as Array<IMapRoute4?>
  }
}
