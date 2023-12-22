package Windows.UI.Xaml.Shapes

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IShapeFactory.ABI::class)
@Signature("{4b717613-f6aa-48d5-9588-e1d188eacbc9}")
@Guid("4b717613f6aa48d59588e1d188eacbc9")
@WinRTInterface("4b717613f6aa48d59588e1d188eacbc9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShapeFactory.ByReference::class)
public interface IShapeFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Shape?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IShapeFactory>
      {
    public override fun getValue() = ABI.makeIShapeFactory(pointer.getPointer(0))

    public fun setValue(value: IShapeFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShapeFactory {
    public val __47381961_Ptr: Pointer?

    public val _47381961_VtblPtr: Pointer?
      get() = __47381961_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Shape? {
      val fnPtr = _47381961_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Shape>()
      val hr = fn.invokeHR(arrayOf(__47381961_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Shape>(result.getValue())
      return resultValue
    }
  }

  public class IShapeFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __47381961_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShapeFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b717613f6aa48d59588e1d188eacbc9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShapeFactory(ptr: Pointer?): WithDefault = IShapeFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShapeFactory {
      val address = segment.toRawLongValue()
      return makeIShapeFactory(Pointer(address))
    }

    public override fun toNative(obj: IShapeFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__47381961_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShapeFactory): Array<IShapeFactory?> = (elements as
        Array<IShapeFactory?>).castToImpl<IShapeFactory,IShapeFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShapeFactory?> =
        arrayOfNulls<IShapeFactory_Impl>(size) as Array<IShapeFactory?>
  }
}
