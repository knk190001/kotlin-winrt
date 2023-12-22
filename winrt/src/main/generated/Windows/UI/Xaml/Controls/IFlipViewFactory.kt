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

@ABIMarker(IFlipViewFactory.ABI::class)
@Signature("{f1dea9be-9ae8-4d4b-ab43-16d31e05f4f3}")
@Guid("f1dea9be9ae84d4bab4316d31e05f4f3")
@WinRTInterface("f1dea9be9ae84d4bab4316d31e05f4f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipViewFactory.ByReference::class)
public interface IFlipViewFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): FlipView?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlipViewFactory> {
    public override fun getValue() = ABI.makeIFlipViewFactory(pointer.getPointer(0))

    public fun setValue(value: IFlipViewFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipViewFactory {
    public val __615035996_Ptr: Pointer?

    public val _615035996_VtblPtr: Pointer?
      get() = __615035996_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        FlipView? {
      val fnPtr = _615035996_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlipView>()
      val hr = fn.invokeHR(arrayOf(__615035996_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlipView>(result.getValue())
      return resultValue
    }
  }

  public class IFlipViewFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __615035996_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipViewFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f1dea9be9ae84d4bab4316d31e05f4f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipViewFactory(ptr: Pointer?): WithDefault = IFlipViewFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipViewFactory {
      val address = segment.toRawLongValue()
      return makeIFlipViewFactory(Pointer(address))
    }

    public override fun toNative(obj: IFlipViewFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__615035996_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipViewFactory): Array<IFlipViewFactory?> = (elements as
        Array<IFlipViewFactory?>).castToImpl<IFlipViewFactory,IFlipViewFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipViewFactory?> =
        arrayOfNulls<IFlipViewFactory_Impl>(size) as Array<IFlipViewFactory?>
  }
}
