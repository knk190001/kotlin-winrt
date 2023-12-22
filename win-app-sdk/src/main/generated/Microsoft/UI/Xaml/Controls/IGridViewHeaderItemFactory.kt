package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IGridViewHeaderItemFactory.ABI::class)
@Signature("{2518f012-54df-587e-92b3-bd86075b71cf}")
@Guid("2518f01254df587e92b3bd86075b71cf")
@WinRTInterface("2518f01254df587e92b3bd86075b71cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewHeaderItemFactory.ByReference::class)
public interface IGridViewHeaderItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      GridViewHeaderItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewHeaderItemFactory> {
    public override fun getValue() = ABI.makeIGridViewHeaderItemFactory(pointer.getPointer(0))

    public fun setValue(value: IGridViewHeaderItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewHeaderItemFactory {
    public val __268304904_Ptr: Pointer?

    public val _268304904_VtblPtr: Pointer?
      get() = __268304904_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        GridViewHeaderItem? {
      val fnPtr = _268304904_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridViewHeaderItem>()
      val hr = fn.invokeHR(arrayOf(__268304904_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridViewHeaderItem>(result.getValue())
      return resultValue
    }
  }

  public class IGridViewHeaderItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __268304904_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewHeaderItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2518f01254df587e92b3bd86075b71cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewHeaderItemFactory(ptr: Pointer?): WithDefault =
        IGridViewHeaderItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewHeaderItemFactory {
      val address = segment.toRawLongValue()
      return makeIGridViewHeaderItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IGridViewHeaderItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__268304904_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewHeaderItemFactory):
        Array<IGridViewHeaderItemFactory?> = (elements as
        Array<IGridViewHeaderItemFactory?>).castToImpl<IGridViewHeaderItemFactory,IGridViewHeaderItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewHeaderItemFactory?> =
        arrayOfNulls<IGridViewHeaderItemFactory_Impl>(size) as Array<IGridViewHeaderItemFactory?>
  }
}
