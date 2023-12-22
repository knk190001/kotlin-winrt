package Windows.UI.Input

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

@ABIMarker(IKeyboardDeliveryInterceptorStatics.ABI::class)
@Signature("{f9f63ba2-ceba-4755-8a7e-14c0ffecd239}")
@Guid("f9f63ba2ceba47558a7e14c0ffecd239")
@WinRTInterface("f9f63ba2ceba47558a7e14c0ffecd239")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyboardDeliveryInterceptorStatics.ByReference::class)
public interface IKeyboardDeliveryInterceptorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): KeyboardDeliveryInterceptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyboardDeliveryInterceptorStatics> {
    public override fun getValue() =
        ABI.makeIKeyboardDeliveryInterceptorStatics(pointer.getPointer(0))

    public fun setValue(value: IKeyboardDeliveryInterceptorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyboardDeliveryInterceptorStatics {
    public val __617142153_Ptr: Pointer?

    public val _617142153_VtblPtr: Pointer?
      get() = __617142153_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): KeyboardDeliveryInterceptor? {
      val fnPtr = _617142153_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyboardDeliveryInterceptor>()
      val hr = fn.invokeHR(arrayOf(__617142153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyboardDeliveryInterceptor>(result.getValue())
      return resultValue
    }
  }

  public class IKeyboardDeliveryInterceptorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __617142153_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyboardDeliveryInterceptorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f9f63ba2ceba47558a7e14c0ffecd239")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyboardDeliveryInterceptorStatics(ptr: Pointer?): WithDefault =
        IKeyboardDeliveryInterceptorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyboardDeliveryInterceptorStatics {
      val address = segment.toRawLongValue()
      return makeIKeyboardDeliveryInterceptorStatics(Pointer(address))
    }

    public override fun toNative(obj: IKeyboardDeliveryInterceptorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__617142153_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyboardDeliveryInterceptorStatics):
        Array<IKeyboardDeliveryInterceptorStatics?> = (elements as
        Array<IKeyboardDeliveryInterceptorStatics?>).castToImpl<IKeyboardDeliveryInterceptorStatics,IKeyboardDeliveryInterceptorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyboardDeliveryInterceptorStatics?> =
        arrayOfNulls<IKeyboardDeliveryInterceptorStatics_Impl>(size) as
        Array<IKeyboardDeliveryInterceptorStatics?>
  }
}
