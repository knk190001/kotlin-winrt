package Windows.UI.Xaml.Controls

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

@ABIMarker(IInkToolbarCustomPenFactory.ABI::class)
@Signature("{d214d636-f1aa-4f48-bf2c-a926caae4c60}")
@Guid("d214d636f1aa4f48bf2ca926caae4c60")
@WinRTInterface("d214d636f1aa4f48bf2ca926caae4c60")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarCustomPenFactory.ByReference::class)
public interface IInkToolbarCustomPenFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      InkToolbarCustomPen?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarCustomPenFactory> {
    public override fun getValue() = ABI.makeIInkToolbarCustomPenFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarCustomPenFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarCustomPenFactory {
    public val __1306505229_Ptr: Pointer?

    public val _1306505229_VtblPtr: Pointer?
      get() = __1306505229_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        InkToolbarCustomPen? {
      val fnPtr = _1306505229_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarCustomPen>()
      val hr = fn.invokeHR(arrayOf(__1306505229_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarCustomPen>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarCustomPenFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1306505229_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarCustomPenFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d214d636f1aa4f48bf2ca926caae4c60")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarCustomPenFactory(ptr: Pointer?): WithDefault =
        IInkToolbarCustomPenFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarCustomPenFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarCustomPenFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarCustomPenFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1306505229_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarCustomPenFactory):
        Array<IInkToolbarCustomPenFactory?> = (elements as
        Array<IInkToolbarCustomPenFactory?>).castToImpl<IInkToolbarCustomPenFactory,IInkToolbarCustomPenFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarCustomPenFactory?> =
        arrayOfNulls<IInkToolbarCustomPenFactory_Impl>(size) as Array<IInkToolbarCustomPenFactory?>
  }
}
