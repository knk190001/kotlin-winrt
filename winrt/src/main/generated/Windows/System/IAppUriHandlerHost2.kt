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

@ABIMarker(IAppUriHandlerHost2.ABI::class)
@Signature("{3a0bee95-29e4-51bf-8095-a3c068e3c72a}")
@Guid("3a0bee9529e451bf8095a3c068e3c72a")
@WinRTInterface("3a0bee9529e451bf8095a3c068e3c72a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppUriHandlerHost2.ByReference::class)
public interface IAppUriHandlerHost2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppUriHandlerHost2> {
    public override fun getValue() = ABI.makeIAppUriHandlerHost2(pointer.getPointer(0))

    public fun setValue(value: IAppUriHandlerHost2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppUriHandlerHost2 {
    public val __1592733498_Ptr: Pointer?

    public val _1592733498_VtblPtr: Pointer?
      get() = __1592733498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1592733498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1592733498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _1592733498_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1592733498_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppUriHandlerHost2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1592733498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppUriHandlerHost2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a0bee9529e451bf8095a3c068e3c72a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppUriHandlerHost2(ptr: Pointer?): WithDefault = IAppUriHandlerHost2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppUriHandlerHost2 {
      val address = segment.toRawLongValue()
      return makeIAppUriHandlerHost2(Pointer(address))
    }

    public override fun toNative(obj: IAppUriHandlerHost2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1592733498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppUriHandlerHost2): Array<IAppUriHandlerHost2?> =
        (elements as
        Array<IAppUriHandlerHost2?>).castToImpl<IAppUriHandlerHost2,IAppUriHandlerHost2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppUriHandlerHost2?> =
        arrayOfNulls<IAppUriHandlerHost2_Impl>(size) as Array<IAppUriHandlerHost2?>
  }
}
