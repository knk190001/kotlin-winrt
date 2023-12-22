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

@ABIMarker(IContentDialogFactory.ABI::class)
@Signature("{05557178-9d8e-4315-b37d-680c14012c35}")
@Guid("055571789d8e4315b37d680c14012c35")
@WinRTInterface("055571789d8e4315b37d680c14012c35")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentDialogFactory.ByReference::class)
public interface IContentDialogFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ContentDialog?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentDialogFactory> {
    public override fun getValue() = ABI.makeIContentDialogFactory(pointer.getPointer(0))

    public fun setValue(value: IContentDialogFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialogFactory {
    public val __177981637_Ptr: Pointer?

    public val _177981637_VtblPtr: Pointer?
      get() = __177981637_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ContentDialog? {
      val fnPtr = _177981637_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentDialog>()
      val hr = fn.invokeHR(arrayOf(__177981637_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentDialog>(result.getValue())
      return resultValue
    }
  }

  public class IContentDialogFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __177981637_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialogFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("055571789d8e4315b37d680c14012c35")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialogFactory(ptr: Pointer?): WithDefault =
        IContentDialogFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialogFactory {
      val address = segment.toRawLongValue()
      return makeIContentDialogFactory(Pointer(address))
    }

    public override fun toNative(obj: IContentDialogFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__177981637_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialogFactory): Array<IContentDialogFactory?> =
        (elements as
        Array<IContentDialogFactory?>).castToImpl<IContentDialogFactory,IContentDialogFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialogFactory?> =
        arrayOfNulls<IContentDialogFactory_Impl>(size) as Array<IContentDialogFactory?>
  }
}
