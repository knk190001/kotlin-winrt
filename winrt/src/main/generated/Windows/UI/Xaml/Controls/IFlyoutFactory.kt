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

@ABIMarker(IFlyoutFactory.ABI::class)
@Signature("{4bed4933-008e-4b03-a385-79fe5266ddba}")
@Guid("4bed4933008e4b03a38579fe5266ddba")
@WinRTInterface("4bed4933008e4b03a38579fe5266ddba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutFactory.ByReference::class)
public interface IFlyoutFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Flyout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlyoutFactory>
      {
    public override fun getValue() = ABI.makeIFlyoutFactory(pointer.getPointer(0))

    public fun setValue(value: IFlyoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutFactory {
    public val __1585639411_Ptr: Pointer?

    public val _1585639411_VtblPtr: Pointer?
      get() = __1585639411_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Flyout? {
      val fnPtr = _1585639411_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Flyout>()
      val hr = fn.invokeHR(arrayOf(__1585639411_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Flyout>(result.getValue())
      return resultValue
    }
  }

  public class IFlyoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1585639411_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4bed4933008e4b03a38579fe5266ddba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutFactory(ptr: Pointer?): WithDefault = IFlyoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutFactory {
      val address = segment.toRawLongValue()
      return makeIFlyoutFactory(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1585639411_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutFactory): Array<IFlyoutFactory?> = (elements as
        Array<IFlyoutFactory?>).castToImpl<IFlyoutFactory,IFlyoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutFactory?> =
        arrayOfNulls<IFlyoutFactory_Impl>(size) as Array<IFlyoutFactory?>
  }
}
