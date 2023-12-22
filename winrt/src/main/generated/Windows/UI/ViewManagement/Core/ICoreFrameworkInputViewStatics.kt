package Windows.UI.ViewManagement.Core

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

@ABIMarker(ICoreFrameworkInputViewStatics.ABI::class)
@Signature("{6eebd9b6-eac2-5f8b-975f-772ee3e42eeb}")
@Guid("6eebd9b6eac25f8b975f772ee3e42eeb")
@WinRTInterface("6eebd9b6eac25f8b975f772ee3e42eeb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreFrameworkInputViewStatics.ByReference::class)
public interface ICoreFrameworkInputViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUIContext(context: UIContext?): CoreFrameworkInputView?

  @InterfaceMethod(1)
  public fun GetForCurrentView(): CoreFrameworkInputView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreFrameworkInputViewStatics> {
    public override fun getValue() = ABI.makeICoreFrameworkInputViewStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreFrameworkInputViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreFrameworkInputViewStatics {
    public val __1470481090_Ptr: Pointer?

    public val _1470481090_VtblPtr: Pointer?
      get() = __1470481090_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUIContext(context: UIContext?): CoreFrameworkInputView? {
      val fnPtr = _1470481090_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreFrameworkInputView>()
      val hr = fn.invokeHR(arrayOf(__1470481090_Ptr, marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreFrameworkInputView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForCurrentView(): CoreFrameworkInputView? {
      val fnPtr = _1470481090_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreFrameworkInputView>()
      val hr = fn.invokeHR(arrayOf(__1470481090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreFrameworkInputView>(result.getValue())
      return resultValue
    }
  }

  public class ICoreFrameworkInputViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1470481090_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreFrameworkInputViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6eebd9b6eac25f8b975f772ee3e42eeb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreFrameworkInputViewStatics(ptr: Pointer?): WithDefault =
        ICoreFrameworkInputViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreFrameworkInputViewStatics {
      val address = segment.toRawLongValue()
      return makeICoreFrameworkInputViewStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreFrameworkInputViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1470481090_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreFrameworkInputViewStatics):
        Array<ICoreFrameworkInputViewStatics?> = (elements as
        Array<ICoreFrameworkInputViewStatics?>).castToImpl<ICoreFrameworkInputViewStatics,ICoreFrameworkInputViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreFrameworkInputViewStatics?> =
        arrayOfNulls<ICoreFrameworkInputViewStatics_Impl>(size) as
        Array<ICoreFrameworkInputViewStatics?>
  }
}
