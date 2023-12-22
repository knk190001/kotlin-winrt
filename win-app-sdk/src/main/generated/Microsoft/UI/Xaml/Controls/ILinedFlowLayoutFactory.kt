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

@ABIMarker(ILinedFlowLayoutFactory.ABI::class)
@Signature("{507b841e-fcdf-5cea-b271-94d7a6af355f}")
@Guid("507b841efcdf5ceab27194d7a6af355f")
@WinRTInterface("507b841efcdf5ceab27194d7a6af355f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILinedFlowLayoutFactory.ByReference::class)
public interface ILinedFlowLayoutFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): LinedFlowLayout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILinedFlowLayoutFactory> {
    public override fun getValue() = ABI.makeILinedFlowLayoutFactory(pointer.getPointer(0))

    public fun setValue(value: ILinedFlowLayoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILinedFlowLayoutFactory {
    public val __1158001001_Ptr: Pointer?

    public val _1158001001_VtblPtr: Pointer?
      get() = __1158001001_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        LinedFlowLayout? {
      val fnPtr = _1158001001_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LinedFlowLayout>()
      val hr = fn.invokeHR(arrayOf(__1158001001_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LinedFlowLayout>(result.getValue())
      return resultValue
    }
  }

  public class ILinedFlowLayoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1158001001_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILinedFlowLayoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("507b841efcdf5ceab27194d7a6af355f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILinedFlowLayoutFactory(ptr: Pointer?): WithDefault =
        ILinedFlowLayoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILinedFlowLayoutFactory {
      val address = segment.toRawLongValue()
      return makeILinedFlowLayoutFactory(Pointer(address))
    }

    public override fun toNative(obj: ILinedFlowLayoutFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1158001001_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILinedFlowLayoutFactory): Array<ILinedFlowLayoutFactory?>
        = (elements as
        Array<ILinedFlowLayoutFactory?>).castToImpl<ILinedFlowLayoutFactory,ILinedFlowLayoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILinedFlowLayoutFactory?> =
        arrayOfNulls<ILinedFlowLayoutFactory_Impl>(size) as Array<ILinedFlowLayoutFactory?>
  }
}
