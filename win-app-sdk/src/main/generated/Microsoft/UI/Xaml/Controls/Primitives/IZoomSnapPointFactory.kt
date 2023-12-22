package Microsoft.UI.Xaml.Controls.Primitives

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IZoomSnapPointFactory.ABI::class)
@Signature("{0b3b5418-bff6-5a9e-b734-b68adf49f775}")
@Guid("0b3b5418bff65a9eb734b68adf49f775")
@WinRTInterface("0b3b5418bff65a9eb734b68adf49f775")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IZoomSnapPointFactory.ByReference::class)
public interface IZoomSnapPointFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    snapPointValue: Double,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): ZoomSnapPoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IZoomSnapPointFactory> {
    public override fun getValue() = ABI.makeIZoomSnapPointFactory(pointer.getPointer(0))

    public fun setValue(value: IZoomSnapPointFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IZoomSnapPointFactory {
    public val __1005111800_Ptr: Pointer?

    public val _1005111800_VtblPtr: Pointer?
      get() = __1005111800_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      snapPointValue: Double,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): ZoomSnapPoint? {
      val fnPtr = _1005111800_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ZoomSnapPoint>()
      val hr = fn.invokeHR(arrayOf(__1005111800_Ptr, snapPointValue, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ZoomSnapPoint>(result.getValue())
      return resultValue
    }
  }

  public class IZoomSnapPointFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1005111800_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IZoomSnapPointFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b3b5418bff65a9eb734b68adf49f775")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIZoomSnapPointFactory(ptr: Pointer?): WithDefault =
        IZoomSnapPointFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IZoomSnapPointFactory {
      val address = segment.toRawLongValue()
      return makeIZoomSnapPointFactory(Pointer(address))
    }

    public override fun toNative(obj: IZoomSnapPointFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1005111800_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IZoomSnapPointFactory): Array<IZoomSnapPointFactory?> =
        (elements as
        Array<IZoomSnapPointFactory?>).castToImpl<IZoomSnapPointFactory,IZoomSnapPointFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IZoomSnapPointFactory?> =
        arrayOfNulls<IZoomSnapPointFactory_Impl>(size) as Array<IZoomSnapPointFactory?>
  }
}
