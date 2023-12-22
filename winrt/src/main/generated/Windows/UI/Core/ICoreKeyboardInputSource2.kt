package Windows.UI.Core

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

@ABIMarker(ICoreKeyboardInputSource2.ABI::class)
@Signature("{fa24cb94-f963-47a5-8778-207c482b0afd}")
@Guid("fa24cb94f96347a58778207c482b0afd")
@WinRTInterface("fa24cb94f96347a58778207c482b0afd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreKeyboardInputSource2.ByReference::class)
public interface ICoreKeyboardInputSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentKeyEventDeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreKeyboardInputSource2> {
    public override fun getValue() = ABI.makeICoreKeyboardInputSource2(pointer.getPointer(0))

    public fun setValue(value: ICoreKeyboardInputSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreKeyboardInputSource2 {
    public val __2134740718_Ptr: Pointer?

    public val _2134740718_VtblPtr: Pointer?
      get() = __2134740718_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentKeyEventDeviceId(): String? {
      val fnPtr = _2134740718_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2134740718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICoreKeyboardInputSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2134740718_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreKeyboardInputSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa24cb94f96347a58778207c482b0afd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreKeyboardInputSource2(ptr: Pointer?): WithDefault =
        ICoreKeyboardInputSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreKeyboardInputSource2 {
      val address = segment.toRawLongValue()
      return makeICoreKeyboardInputSource2(Pointer(address))
    }

    public override fun toNative(obj: ICoreKeyboardInputSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2134740718_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreKeyboardInputSource2):
        Array<ICoreKeyboardInputSource2?> = (elements as
        Array<ICoreKeyboardInputSource2?>).castToImpl<ICoreKeyboardInputSource2,ICoreKeyboardInputSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreKeyboardInputSource2?> =
        arrayOfNulls<ICoreKeyboardInputSource2_Impl>(size) as Array<ICoreKeyboardInputSource2?>
  }
}
