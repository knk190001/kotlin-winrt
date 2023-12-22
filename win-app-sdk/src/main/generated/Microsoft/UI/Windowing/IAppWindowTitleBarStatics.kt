package Microsoft.UI.Windowing

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

@ABIMarker(IAppWindowTitleBarStatics.ABI::class)
@Signature("{9e1da52e-8b15-54d6-a886-f7b9f9d930b2}")
@Guid("9e1da52e8b1554d6a886f7b9f9d930b2")
@WinRTInterface("9e1da52e8b1554d6a886f7b9f9d930b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowTitleBarStatics.ByReference::class)
public interface IAppWindowTitleBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsCustomizationSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowTitleBarStatics> {
    public override fun getValue() = ABI.makeIAppWindowTitleBarStatics(pointer.getPointer(0))

    public fun setValue(value: IAppWindowTitleBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowTitleBarStatics {
    public val __1400077494_Ptr: Pointer?

    public val _1400077494_VtblPtr: Pointer?
      get() = __1400077494_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsCustomizationSupported(): Boolean {
      val fnPtr = _1400077494_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1400077494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppWindowTitleBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1400077494_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowTitleBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e1da52e8b1554d6a886f7b9f9d930b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowTitleBarStatics(ptr: Pointer?): WithDefault =
        IAppWindowTitleBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowTitleBarStatics {
      val address = segment.toRawLongValue()
      return makeIAppWindowTitleBarStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowTitleBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1400077494_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowTitleBarStatics):
        Array<IAppWindowTitleBarStatics?> = (elements as
        Array<IAppWindowTitleBarStatics?>).castToImpl<IAppWindowTitleBarStatics,IAppWindowTitleBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowTitleBarStatics?> =
        arrayOfNulls<IAppWindowTitleBarStatics_Impl>(size) as Array<IAppWindowTitleBarStatics?>
  }
}
