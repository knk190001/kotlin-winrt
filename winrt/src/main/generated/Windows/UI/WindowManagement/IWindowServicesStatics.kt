package Windows.UI.WindowManagement

import Windows.Foundation.Collections.IVectorView
import Windows.UI.WindowId
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

@ABIMarker(IWindowServicesStatics.ABI::class)
@Signature("{cff4d519-50a6-5c64-97f6-c2d96add7f42}")
@Guid("cff4d51950a65c6497f6c2d96add7f42")
@WinRTInterface("cff4d51950a65c6497f6c2d96add7f42")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowServicesStatics.ByReference::class)
public interface IWindowServicesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAllTopLevelWindowIds(): IVectorView<WindowId?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowServicesStatics> {
    public override fun getValue() = ABI.makeIWindowServicesStatics(pointer.getPointer(0))

    public fun setValue(value: IWindowServicesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowServicesStatics {
    public val __797792848_Ptr: Pointer?

    public val _797792848_VtblPtr: Pointer?
      get() = __797792848_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAllTopLevelWindowIds(): IVectorView<WindowId?>? {
      val fnPtr = _797792848_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WindowId?>>()
      val hr = fn.invokeHR(arrayOf(__797792848_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WindowId?>>(result.getValue())
      return resultValue
    }
  }

  public class IWindowServicesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __797792848_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowServicesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cff4d51950a65c6497f6c2d96add7f42")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowServicesStatics(ptr: Pointer?): WithDefault =
        IWindowServicesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowServicesStatics {
      val address = segment.toRawLongValue()
      return makeIWindowServicesStatics(Pointer(address))
    }

    public override fun toNative(obj: IWindowServicesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__797792848_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowServicesStatics): Array<IWindowServicesStatics?> =
        (elements as
        Array<IWindowServicesStatics?>).castToImpl<IWindowServicesStatics,IWindowServicesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowServicesStatics?> =
        arrayOfNulls<IWindowServicesStatics_Impl>(size) as Array<IWindowServicesStatics?>
  }
}
