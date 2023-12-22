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

@ABIMarker(ICoreInputViewStatics2.ABI::class)
@Signature("{7ebc0862-d049-4e52-87b0-1e90e98c49ed}")
@Guid("7ebc0862d0494e5287b01e90e98c49ed")
@WinRTInterface("7ebc0862d0494e5287b01e90e98c49ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputViewStatics2.ByReference::class)
public interface ICoreInputViewStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUIContext(context: UIContext?): CoreInputView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputViewStatics2> {
    public override fun getValue() = ABI.makeICoreInputViewStatics2(pointer.getPointer(0))

    public fun setValue(value: ICoreInputViewStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputViewStatics2 {
    public val __7376682_Ptr: Pointer?

    public val _7376682_VtblPtr: Pointer?
      get() = __7376682_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUIContext(context: UIContext?): CoreInputView? {
      val fnPtr = _7376682_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreInputView>()
      val hr = fn.invokeHR(arrayOf(__7376682_Ptr, marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreInputView>(result.getValue())
      return resultValue
    }
  }

  public class ICoreInputViewStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __7376682_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputViewStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ebc0862d0494e5287b01e90e98c49ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputViewStatics2(ptr: Pointer?): WithDefault =
        ICoreInputViewStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInputViewStatics2 {
      val address = segment.toRawLongValue()
      return makeICoreInputViewStatics2(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputViewStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__7376682_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputViewStatics2): Array<ICoreInputViewStatics2?> =
        (elements as
        Array<ICoreInputViewStatics2?>).castToImpl<ICoreInputViewStatics2,ICoreInputViewStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputViewStatics2?> =
        arrayOfNulls<ICoreInputViewStatics2_Impl>(size) as Array<ICoreInputViewStatics2?>
  }
}
