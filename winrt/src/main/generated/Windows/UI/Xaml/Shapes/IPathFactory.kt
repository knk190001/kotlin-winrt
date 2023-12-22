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

@ABIMarker(IPathFactory.ABI::class)
@Signature("{2340a4e3-5a86-4fc6-9a50-cbb93b828766}")
@Guid("2340a4e35a864fc69a50cbb93b828766")
@WinRTInterface("2340a4e35a864fc69a50cbb93b828766")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathFactory.ByReference::class)
public interface IPathFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Path?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPathFactory> {
    public override fun getValue() = ABI.makeIPathFactory(pointer.getPointer(0))

    public fun setValue(value: IPathFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathFactory {
    public val __2128626053_Ptr: Pointer?

    public val _2128626053_VtblPtr: Pointer?
      get() = __2128626053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Path? {
      val fnPtr = _2128626053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Path>()
      val hr = fn.invokeHR(arrayOf(__2128626053_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Path>(result.getValue())
      return resultValue
    }
  }

  public class IPathFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2128626053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2340a4e35a864fc69a50cbb93b828766")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathFactory(ptr: Pointer?): WithDefault = IPathFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathFactory {
      val address = segment.toRawLongValue()
      return makeIPathFactory(Pointer(address))
    }

    public override fun toNative(obj: IPathFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2128626053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathFactory): Array<IPathFactory?> = (elements as
        Array<IPathFactory?>).castToImpl<IPathFactory,IPathFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathFactory?> =
        arrayOfNulls<IPathFactory_Impl>(size) as Array<IPathFactory?>
  }
}
