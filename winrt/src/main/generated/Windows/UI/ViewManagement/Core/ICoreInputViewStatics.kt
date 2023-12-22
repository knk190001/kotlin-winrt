package Windows.UI.ViewManagement.Core

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

@ABIMarker(ICoreInputViewStatics.ABI::class)
@Signature("{7d9b97cd-edbe-49cf-a54f-337de052907f}")
@Guid("7d9b97cdedbe49cfa54f337de052907f")
@WinRTInterface("7d9b97cdedbe49cfa54f337de052907f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputViewStatics.ByReference::class)
public interface ICoreInputViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): CoreInputView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputViewStatics> {
    public override fun getValue() = ABI.makeICoreInputViewStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreInputViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputViewStatics {
    public val __138785288_Ptr: Pointer?

    public val _138785288_VtblPtr: Pointer?
      get() = __138785288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): CoreInputView? {
      val fnPtr = _138785288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreInputView>()
      val hr = fn.invokeHR(arrayOf(__138785288_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreInputView>(result.getValue())
      return resultValue
    }
  }

  public class ICoreInputViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __138785288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d9b97cdedbe49cfa54f337de052907f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputViewStatics(ptr: Pointer?): WithDefault =
        ICoreInputViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInputViewStatics {
      val address = segment.toRawLongValue()
      return makeICoreInputViewStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__138785288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputViewStatics): Array<ICoreInputViewStatics?> =
        (elements as
        Array<ICoreInputViewStatics?>).castToImpl<ICoreInputViewStatics,ICoreInputViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputViewStatics?> =
        arrayOfNulls<ICoreInputViewStatics_Impl>(size) as Array<ICoreInputViewStatics?>
  }
}
