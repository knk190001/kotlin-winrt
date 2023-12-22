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

@ABIMarker(IGridViewFactory.ABI::class)
@Signature("{892947ea-6b86-5f17-a9b8-2121b2251271}")
@Guid("892947ea6b865f17a9b82121b2251271")
@WinRTInterface("892947ea6b865f17a9b82121b2251271")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewFactory.ByReference::class)
public interface IGridViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): GridView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewFactory> {
    public override fun getValue() = ABI.makeIGridViewFactory(pointer.getPointer(0))

    public fun setValue(value: IGridViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewFactory {
    public val __1809365720_Ptr: Pointer?

    public val _1809365720_VtblPtr: Pointer?
      get() = __1809365720_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        GridView? {
      val fnPtr = _1809365720_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GridView>()
      val hr = fn.invokeHR(arrayOf(__1809365720_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GridView>(result.getValue())
      return resultValue
    }
  }

  public class IGridViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1809365720_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("892947ea6b865f17a9b82121b2251271")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewFactory(ptr: Pointer?): WithDefault = IGridViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewFactory {
      val address = segment.toRawLongValue()
      return makeIGridViewFactory(Pointer(address))
    }

    public override fun toNative(obj: IGridViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1809365720_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewFactory): Array<IGridViewFactory?> = (elements as
        Array<IGridViewFactory?>).castToImpl<IGridViewFactory,IGridViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewFactory?> =
        arrayOfNulls<IGridViewFactory_Impl>(size) as Array<IGridViewFactory?>
  }
}
