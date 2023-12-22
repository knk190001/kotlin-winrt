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

@ABIMarker(IFlipViewItemFactory.ABI::class)
@Signature("{f21d91fe-22a0-4412-a853-9d6a6e8f2aaf}")
@Guid("f21d91fe22a04412a8539d6a6e8f2aaf")
@WinRTInterface("f21d91fe22a04412a8539d6a6e8f2aaf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipViewItemFactory.ByReference::class)
public interface IFlipViewItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): FlipViewItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlipViewItemFactory> {
    public override fun getValue() = ABI.makeIFlipViewItemFactory(pointer.getPointer(0))

    public fun setValue(value: IFlipViewItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipViewItemFactory {
    public val __417320137_Ptr: Pointer?

    public val _417320137_VtblPtr: Pointer?
      get() = __417320137_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        FlipViewItem? {
      val fnPtr = _417320137_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlipViewItem>()
      val hr = fn.invokeHR(arrayOf(__417320137_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlipViewItem>(result.getValue())
      return resultValue
    }
  }

  public class IFlipViewItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __417320137_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipViewItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f21d91fe22a04412a8539d6a6e8f2aaf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipViewItemFactory(ptr: Pointer?): WithDefault = IFlipViewItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipViewItemFactory {
      val address = segment.toRawLongValue()
      return makeIFlipViewItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IFlipViewItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__417320137_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipViewItemFactory): Array<IFlipViewItemFactory?> =
        (elements as
        Array<IFlipViewItemFactory?>).castToImpl<IFlipViewItemFactory,IFlipViewItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipViewItemFactory?> =
        arrayOfNulls<IFlipViewItemFactory_Impl>(size) as Array<IFlipViewItemFactory?>
  }
}
