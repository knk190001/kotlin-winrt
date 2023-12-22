package Windows.UI.Core

import Windows.UI.UIContext
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

@ABIMarker(ICoreWindowWithContext.ABI::class)
@Signature("{9ac40241-3575-4c3b-af66-e8c529d4d06c}")
@Guid("9ac4024135754c3baf66e8c529d4d06c")
@WinRTInterface("9ac4024135754c3baf66e8c529d4d06c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindowWithContext.ByReference::class)
public interface ICoreWindowWithContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UIContext(): UIContext?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWindowWithContext> {
    public override fun getValue() = ABI.makeICoreWindowWithContext(pointer.getPointer(0))

    public fun setValue(value: ICoreWindowWithContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindowWithContext {
    public val __1816106721_Ptr: Pointer?

    public val _1816106721_VtblPtr: Pointer?
      get() = __1816106721_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UIContext(): UIContext? {
      val fnPtr = _1816106721_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIContext>()
      val hr = fn.invokeHR(arrayOf(__1816106721_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIContext>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWindowWithContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1816106721_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindowWithContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ac4024135754c3baf66e8c529d4d06c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindowWithContext(ptr: Pointer?): WithDefault =
        ICoreWindowWithContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindowWithContext {
      val address = segment.toRawLongValue()
      return makeICoreWindowWithContext(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindowWithContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1816106721_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindowWithContext): Array<ICoreWindowWithContext?> =
        (elements as
        Array<ICoreWindowWithContext?>).castToImpl<ICoreWindowWithContext,ICoreWindowWithContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindowWithContext?> =
        arrayOfNulls<ICoreWindowWithContext_Impl>(size) as Array<ICoreWindowWithContext?>
  }
}
