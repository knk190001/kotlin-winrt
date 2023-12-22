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

@ABIMarker(IPersonPictureFactory.ABI::class)
@Signature("{4f18330d-0416-4b92-bfd3-bf5780b46ab2}")
@Guid("4f18330d04164b92bfd3bf5780b46ab2")
@WinRTInterface("4f18330d04164b92bfd3bf5780b46ab2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPersonPictureFactory.ByReference::class)
public interface IPersonPictureFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): PersonPicture?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPersonPictureFactory> {
    public override fun getValue() = ABI.makeIPersonPictureFactory(pointer.getPointer(0))

    public fun setValue(value: IPersonPictureFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPersonPictureFactory {
    public val __1856706301_Ptr: Pointer?

    public val _1856706301_VtblPtr: Pointer?
      get() = __1856706301_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        PersonPicture? {
      val fnPtr = _1856706301_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PersonPicture>()
      val hr = fn.invokeHR(arrayOf(__1856706301_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PersonPicture>(result.getValue())
      return resultValue
    }
  }

  public class IPersonPictureFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1856706301_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPersonPictureFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f18330d04164b92bfd3bf5780b46ab2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPersonPictureFactory(ptr: Pointer?): WithDefault =
        IPersonPictureFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPersonPictureFactory {
      val address = segment.toRawLongValue()
      return makeIPersonPictureFactory(Pointer(address))
    }

    public override fun toNative(obj: IPersonPictureFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1856706301_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPersonPictureFactory): Array<IPersonPictureFactory?> =
        (elements as
        Array<IPersonPictureFactory?>).castToImpl<IPersonPictureFactory,IPersonPictureFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPersonPictureFactory?> =
        arrayOfNulls<IPersonPictureFactory_Impl>(size) as Array<IPersonPictureFactory?>
  }
}
