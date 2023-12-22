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

@ABIMarker(ITextCommandBarFlyoutFactory.ABI::class)
@Signature("{1b5918d8-b006-5ecd-ab72-6fdb48abc1f4}")
@Guid("1b5918d8b0065ecdab726fdb48abc1f4")
@WinRTInterface("1b5918d8b0065ecdab726fdb48abc1f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextCommandBarFlyoutFactory.ByReference::class)
public interface ITextCommandBarFlyoutFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      TextCommandBarFlyout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextCommandBarFlyoutFactory> {
    public override fun getValue() = ABI.makeITextCommandBarFlyoutFactory(pointer.getPointer(0))

    public fun setValue(value: ITextCommandBarFlyoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextCommandBarFlyoutFactory {
    public val __89856286_Ptr: Pointer?

    public val _89856286_VtblPtr: Pointer?
      get() = __89856286_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TextCommandBarFlyout? {
      val fnPtr = _89856286_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextCommandBarFlyout>()
      val hr = fn.invokeHR(arrayOf(__89856286_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextCommandBarFlyout>(result.getValue())
      return resultValue
    }
  }

  public class ITextCommandBarFlyoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __89856286_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextCommandBarFlyoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b5918d8b0065ecdab726fdb48abc1f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextCommandBarFlyoutFactory(ptr: Pointer?): WithDefault =
        ITextCommandBarFlyoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextCommandBarFlyoutFactory {
      val address = segment.toRawLongValue()
      return makeITextCommandBarFlyoutFactory(Pointer(address))
    }

    public override fun toNative(obj: ITextCommandBarFlyoutFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__89856286_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextCommandBarFlyoutFactory):
        Array<ITextCommandBarFlyoutFactory?> = (elements as
        Array<ITextCommandBarFlyoutFactory?>).castToImpl<ITextCommandBarFlyoutFactory,ITextCommandBarFlyoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextCommandBarFlyoutFactory?> =
        arrayOfNulls<ITextCommandBarFlyoutFactory_Impl>(size) as
        Array<ITextCommandBarFlyoutFactory?>
  }
}
