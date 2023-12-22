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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IColumnMajorUniformToLargestGridLayoutFactory.ABI::class)
@Signature("{2f21af59-1585-5325-8412-2b83bf05d345}")
@Guid("2f21af591585532584122b83bf05d345")
@WinRTInterface("2f21af591585532584122b83bf05d345")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColumnMajorUniformToLargestGridLayoutFactory.ByReference::class)
public interface IColumnMajorUniformToLargestGridLayoutFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      ColumnMajorUniformToLargestGridLayout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColumnMajorUniformToLargestGridLayoutFactory> {
    public override fun getValue() =
        ABI.makeIColumnMajorUniformToLargestGridLayoutFactory(pointer.getPointer(0))

    public fun setValue(value: IColumnMajorUniformToLargestGridLayoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColumnMajorUniformToLargestGridLayoutFactory {
    public val __435747547_Ptr: Pointer?

    public val _435747547_VtblPtr: Pointer?
      get() = __435747547_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ColumnMajorUniformToLargestGridLayout? {
      val fnPtr = _435747547_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColumnMajorUniformToLargestGridLayout>()
      val hr = fn.invokeHR(arrayOf(__435747547_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColumnMajorUniformToLargestGridLayout>(result.getValue())
      return resultValue
    }
  }

  public class IColumnMajorUniformToLargestGridLayoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __435747547_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColumnMajorUniformToLargestGridLayoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f21af591585532584122b83bf05d345")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColumnMajorUniformToLargestGridLayoutFactory(ptr: Pointer?): WithDefault =
        IColumnMajorUniformToLargestGridLayoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IColumnMajorUniformToLargestGridLayoutFactory {
      val address = segment.toRawLongValue()
      return makeIColumnMajorUniformToLargestGridLayoutFactory(Pointer(address))
    }

    public override fun toNative(obj: IColumnMajorUniformToLargestGridLayoutFactory): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__435747547_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColumnMajorUniformToLargestGridLayoutFactory):
        Array<IColumnMajorUniformToLargestGridLayoutFactory?> = (elements as
        Array<IColumnMajorUniformToLargestGridLayoutFactory?>).castToImpl<IColumnMajorUniformToLargestGridLayoutFactory,IColumnMajorUniformToLargestGridLayoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColumnMajorUniformToLargestGridLayoutFactory?> =
        arrayOfNulls<IColumnMajorUniformToLargestGridLayoutFactory_Impl>(size) as
        Array<IColumnMajorUniformToLargestGridLayoutFactory?>
  }
}
