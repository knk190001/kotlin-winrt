package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IAppBarElementContainerStatics.ABI::class)
@Signature("{ebbef840-c745-5a6f-8671-9a41eb2196e7}")
@Guid("ebbef840c7455a6f86719a41eb2196e7")
@WinRTInterface("ebbef840c7455a6f86719a41eb2196e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarElementContainerStatics.ByReference::class)
public interface IAppBarElementContainerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCompactProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsInOverflowProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DynamicOverflowOrderProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarElementContainerStatics> {
    public override fun getValue() = ABI.makeIAppBarElementContainerStatics(pointer.getPointer(0))

    public fun setValue(value: IAppBarElementContainerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarElementContainerStatics {
    public val __301698574_Ptr: Pointer?

    public val _301698574_VtblPtr: Pointer?
      get() = __301698574_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCompactProperty(): DependencyProperty? {
      val fnPtr = _301698574_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__301698574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsInOverflowProperty(): DependencyProperty? {
      val fnPtr = _301698574_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__301698574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DynamicOverflowOrderProperty(): DependencyProperty? {
      val fnPtr = _301698574_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__301698574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarElementContainerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __301698574_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarElementContainerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ebbef840c7455a6f86719a41eb2196e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarElementContainerStatics(ptr: Pointer?): WithDefault =
        IAppBarElementContainerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarElementContainerStatics {
      val address = segment.toRawLongValue()
      return makeIAppBarElementContainerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppBarElementContainerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__301698574_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarElementContainerStatics):
        Array<IAppBarElementContainerStatics?> = (elements as
        Array<IAppBarElementContainerStatics?>).castToImpl<IAppBarElementContainerStatics,IAppBarElementContainerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarElementContainerStatics?> =
        arrayOfNulls<IAppBarElementContainerStatics_Impl>(size) as
        Array<IAppBarElementContainerStatics?>
  }
}
